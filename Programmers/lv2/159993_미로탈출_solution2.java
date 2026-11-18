import java.util.*;

class Solution {
    
    static int[] dr = new int[] {1,-1,0,0};
    static int[] dc = new int[] {0,0,-1,1};
    
    public int solution(String[] maps) {
        int N = maps.length;
        int M = maps[0].length();
        int[] S = null;
        int[] E = null;
        int[] L = null;
        
        for(int i = 0; i < N; i ++) {
            for(int j = 0; j < M; j++) {
                if(maps[i].charAt(j) == 'S') S = new int[] {i,j};
                if(maps[i].charAt(j) == 'E') E = new int[] {i,j};
                if(maps[i].charAt(j) == 'L') L = new int[] {i,j};
            }
        }
        
        int sum = 0;
        
        int first = bfs(maps,S, L);
        if(first == -1) return -1;
        int second = bfs(maps,L, E);
        if(second == -1) return -1;
        return first + second;
    }
    
    public int bfs(String[] maps,int[] from, int[] to) {
        
        int N = maps.length;
        int M = maps[0].length();
        boolean[][] visited = new boolean[N][M];
        
        Queue<int[]> q = new ArrayDeque<>();
        q.add(new int[] {from[0],from[1],0});
        visited[from[0]][from[1]] = true;
        
        while(!q.isEmpty()) {
            int[] cur = q.poll();
            if(cur[0] == to[0] && cur[1] == to[1]) return cur[2]; 
            
            for(int i = 0; i < 4; i ++) {
                int nr = cur[0] + dr[i];
                int nc = cur[1] + dc[i];
                int dist = cur[2];
            
                if(nr < 0 || nr >= N || nc < 0 || nc >= M || maps[nr].charAt(nc) == 'X') continue;
                if(!visited[nr][nc]) {
                    visited[nr][nc] = true;
                    q.add(new int[] {nr,nc,dist + 1});    
                }
            } //for
        } //while
        
        return -1;
        
    }
}

/*
시간복잡도 O(V+E) -> O(N * M)
*/
