import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 커맨드 길이
        String s = sc.nextLine();
        List<char> list = new ArrayList<>();
        for(int i = 0; i < N; i ++) {
            list.add(s.charAt(0));
        }
        boolean[][] visited = new boolean[101][101];
        int[] dir = new int[] {1,2,3,4} // 남 서 북 동 
        curDir = 1;
        
        minR = 51;
        maxR = 51;
        minC = 51;
        maxC = 51;
        visited[51][51] = true;
        
        for(int i = 0; i < N; i ++) {
            if(list.get(i) == 'R') {
                
            } else if(list.get(i) == 'C') {
                
            } else if(list.get(i) == 'F') {
                
            }
        }
        
    }//main
}//class
