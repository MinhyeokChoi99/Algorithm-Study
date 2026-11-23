import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int[] numbs = new int[] {0,1,2,3,4,5,6,7,8,9};
        
        if(N >= 1023) {
            System.out.println(-1);
            return;
        } 

        List<List<Integer>> total = new ArrayList<>();        

        for(int i = 0; i < (1 << 10); i++) {
            List<Integer> list = new ArrayList<>();
            for(int j = 0; j < 10; j ++) {
                int check = (i & (1 << j));
                if(check != 0) {
                    list.add(numbs[j]);
                }
            }//for
            
            if(!list.isEmpty()) {
                list.sort( (a,b) -> b - a );
                total.add(list);                
            }
        }//for
        
        total.sort( (a,b) -> {
            if(a.size() != b.size()) return a.size() - b.size();
            
            for(int i = 0; i < a.size(); i ++) {
                int com = a.get(i);
                int pare = b.get(i);
                
                if(com != pare) return com - pare;
            }
            return 0;
        });
        
        List<Integer> answer = total.get(N);
        StringBuilder sb = new StringBuilder();
        for(int n : answer) {
            sb.append(n);
        }
        System.out.println(sb);
        
    }//main
}//Main

/*
시간복잡도 계산 상수값으로 나옴 반복문 2^10 * 10 * 10 * log(10)
*/
