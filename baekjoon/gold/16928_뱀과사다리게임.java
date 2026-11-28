import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();        
        
        int[] board = new int[101];
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
            
            if(cur[0] == 100) return cur[1];
            
            
        }
        
        
    }
}
