import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 커맨드 길이
        sc.nextLine();
        String s = sc.nextLine();
        boolean[][] visited = new boolean[101][101];
        int[] dir = new int[] {1,2,3,4}; // 남 서 북 동 
        int curDir = 1;
        
        int minR = 50;
        int maxR = 50;
        int minC = 50;
        int maxC = 50;
        visited[50][50] = true;
        
        for(int i = 0; i < N; i ++) {
            if(s.charAt(i) == 'R') {
                
            } else if(s.charAt(i) == 'L') {
                
            } else if(s.charAt(i) == 'F') {
                
            }
        }
        
    }//main
}//class
