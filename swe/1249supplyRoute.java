import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        int[] dr = new int[] {1,-1,0,0};
        int[] dc = new int[] {0,0,-1,1};        
        

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = sc.nextInt();
            int[][] board = new int[N][N];
            for(int i = 0; i < N; i ++) {
            	String line = sc.next();
                for(int j = 0; j < N; j++) {
                    	board[i][j] = line.charAt(j) - '0';
                } //forj
            } //fori 
            // 입력 값 받기
            
            int[][] dist = new int[N][N]; // 최단거리 배열
            for(int i =0; i < N; i++) {
                for(int j = 0; j < N; j++){
                	dist[i][j] = Integer.MAX_VALUE;
                }
            }
            dist[0][0] = 0; // 처음시작점은 0
            PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[2] - b[2]);
            pq.add(new int[] {0,0,0}); // 행,열,누적거리
            
            while(!pq.isEmpty()) {
            	int[] now = pq.poll();
                if(now[2] > dist[now[0]][now[1]]) continue; // 이미 더 작은값으로 최신화 되어있으면 볼것도 없음
                
                for(int i = 0; i < 4; i++) {
                    int nr = now[0] + dr[i];
                    int nc = now[1] + dc[i];
                    if(nr < 0 || nr >= N || nc < 0 || nc >= N) continue; // board 범위를 벗어나면 건너뛴다
                    
					if(dist[nr][nc] > now[2] + board[nr][nc]) {
                        dist[nr][nc] = now[2] + board[nr][nc];
                        pq.add(new int[] {nr , nc, now[2] + board[nr][nc]});  
                    }  
                } //fori
            }
            
            System.out.println("#" + test_case + " " + dist[N-1][N-1]);

		} // for
	} // main
} //class
