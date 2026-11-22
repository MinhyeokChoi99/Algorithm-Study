import java.util.*;

class Main {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int vote = sc.nextInt();
        int[] voted = new int[vote];
        for(int i = 0; i < vote; i++){
            voted[i] = sc.nextInt();
        }//for
        
        Map<Integer,int[]> candi = new HashMap<>(); // <학번, {투표 수, 게시일자}>
        
        for(int i = 0; i < vote; i ++) {
            int curNumber = voted[i];
            int[] curState = candi.getOrDefault(curNumber,new int[]{0,i});
            
            if(candi.containsKey(curNumber)) {
                candi.get(curNumber)[0]++;
                continue;
            }
            // if후보 수가 N보다 작으면 정상흐름 else 기존후보를 하나 빼고 현재 후보를 추가
            if(candi.size() < N) {
                candi.put(curNumber,new int[]{curState[0] + 1, curState[1]});    
            } else {
                List<Map.Entry<Integer, int[]>> list = new ArrayList<>(candi.entrySet());
                int key = 0;
                int minVote = Integer.MAX_VALUE;
                int oldest = Integer.MAX_VALUE;
                for(Map.Entry<Integer, int[]> e : list) {
                    int num = e.getKey();
                    int[] values =  e.getValue();
                    int voteCount = values[0];
                    int release = values[1];
                    if(voteCount < minVote || ((voteCount == minVote) && release < oldest)) {
                        minVote = voteCount;
                        oldest = release;
                        key = num;
                    }
                }
                candi.remove(key);
                candi.put(curNumber,new int[]{curState[0] + 1, curState[1]});                    
            }
        }//for
        
        List<Integer> answer = new ArrayList<>(candi.keySet());
        answer.sort( (a,b) -> a - b);
        StringBuilder sb = new StringBuilder();
        for(int a : answer) {
            sb.append(a);
            sb.append(" ");
        }
        System.out.println(sb);
        
        // 학생 번호를 ASC로 출력
    }//main
}//solution
