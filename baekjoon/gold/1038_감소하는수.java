import java.util.*;

class Main {
    public static void main(String[args]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int[] numbs = new int[] {0,1,2,3,4,5,6,7,8,9};
        
        if(N >= 1024) return -1;

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
                list.sort();
                total.add(list);                
            }
        }//for
        
    }//main
}//Main
