import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        int L = sc.nextInt();
        
        int finish = 0; // 지나간 트럭수
        int currentWeigth = 0; //다리에 걸려있는 하중
        int time = 0; //지나간 시간
        int idx = 0; // 올릴 트럭 인덱스 
        List<Integer> trucks = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            trucks.add(sc.nextInt());
        }
        
        Queue<Integer> bridge = new ArrayDeque<>();
        for(int i = 0; i < W; i ++) {
            bridge.offer(0);
        }
        
        while(finish != N) { 
            int poll = bridge.poll();
            time++;
            if(poll != 0) {
                finish++;
                currentWeigth -= poll;
            }    
            if(idx < N && currentWeigth + trucks.get(idx) <= L) {
                bridge.offer(trucks.get(idx));
                currentWeigth += trucks.get(idx);
                idx++;
            } else {
                bridge.offer(0);
            }
        } //while
        
        System.out.println(time);
    }
}
