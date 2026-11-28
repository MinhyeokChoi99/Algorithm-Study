import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();        
        
        boolean[] visited = new boolean[101];
        Deque<int[]> q = new ArrayDeque<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < N + M; i ++) {
            map.put(sc.nextInt(), sc.nextInt());
        }
        q.add(new int[] {1,0});
        visited[1] = true;
        while(!q.isEmpty()) {
            int[] cur = q.poll();
            
            if(cur[0] == 100) {
                System.out.println(cur[1]);
                return;
            }
            
            for(int i = 1; i <= 6; i ++) {
                int next = cur[0] + i;
                if(map.get(next) != null) {
                    next = map.get(next);
                }
                if(next <= 100 && !visited[next]) {
                    visited[next] = true;
                    q.add(new int[] {next,cur[1] + 1});
                }
            }
        }//while
        
        
    }//main
}//class
