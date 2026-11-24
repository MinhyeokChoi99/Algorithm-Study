import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        int[][] cog = new int[4][8];
        for(int i = 0; i < 4; i ++) {
            String line = sc.nextLine();
            for(int j = 0; j < 8; j++) {
                cog[i][j] =line.charAt(j) - '0';
            }
        }
        int K = sc.nextInt();
        
        for(int i = 0; i < K; i ++) {
            int target = sc.nextInt() - 1;
            int direction = sc.nextInt();
            
            int[] clock = new int[4];
            clock[target] = direction;
            
            for(int j = target; j < 3; j ++) {
                if(cog[j][2] == cog[j+1][6]) {
                    break;
                }
                clock[j + 1] = -clock[j]; 
            }
            for(int j = target; j > 0; j --) {
                if(cog[j][6] == cog[j-1][2]) {
                    break;
                }
                clock[j - 1] = -clock[j];               
            }
            for(int j = 0; j < 4; j ++) rotate(cog[j], clock[j]);
        }
        int total = cog[0][0] + cog[1][0] * 2 + cog[2][0] * 4 + cog[3][0] * 8;
        System.out.println(total);
        
    }//main
    
    public static int[] rotate(int[] a, int direction) {
        if(direction == 1) {
            int temp = a[a.length - 1];
            for(int i = a.length - 1; i > 0 ; i--) {
                a[i] = a[i - 1];
            }
            a[0] = temp;
        } else if(direction == -1) {
            int temp = a[0];
            for(int i = 0; i < a.length - 1; i++) {
              a[i] = a[i+1];
            }
            a[a.length-1] = temp;
        }
        return a;
    }
}//Class
