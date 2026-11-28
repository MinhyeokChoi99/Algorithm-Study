import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 커맨드 길이
        String s = sc.nextLine();
        List<char[]> list = new ArrayList<>();
        for(int i = 0; i < N; i ++) {
            list.add(s.charAt(0));
        }
    }//main
}//class
