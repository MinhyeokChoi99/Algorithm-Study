import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 커맨드 길이
        sc.nextLine();
        String s = sc.nextLine();
        boolean[][] visited = new boolean[101][101];
        int[] dr = {1,0,-1,0};
        int[] dc = {0,-1,0,1};
        
        int curDir = 0;
        int curR = 50;
        int curC = 50;
        
        int minR = 50;
        int maxR = 50;
        int minC = 50;
        int maxC = 50;
        visited[50][50] = true;
        
        for(int i = 0; i < N; i ++) {
            if(s.charAt(i) == 'R') {
                curDir = (curDir + 1) % 4;
            } else if(s.charAt(i) == 'L') {
                curDir = (curDir + 3) % 4;
            } else if(s.charAt(i) == 'F') {
                curR = curR + dr[curDir];
                curC = curC + dc[curDir];
                visited[curR][curC] = true;
                minR = Math.min(minR, curR);
                minC = Math.min(minC, curC);
                maxR = Math.max(maxR, curR);
                maxC = Math.max(maxC, curC);                
            }
        }
        
        StringBuilder sb = new StringBuilder();

        int[][] board = new int[maxR - minR][maxC - minC];
        for(int i = minR; i <= maxR; i ++) {
            for(int j = minC; j <= maxC; j++) {
                if(visited[i][j]) {
                    sb.append(".");
                } else {
                    sb.append("#");
                }
            }
            sb.append("\n");
        }
        
        System.out.print(sb);
        
    }//main
}//class
