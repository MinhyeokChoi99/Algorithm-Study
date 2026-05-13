import java.util.*;
import java.util.stream.*;

class Solution {
    static List<Integer> list = new ArrayList<>();
    public int[] solution(int n) {
        list.add(n);
        collatz(n);
        return list.stream().mapToInt(i -> i).toArray();
    }

    static void collatz(int n) {
        if(n == 1) {
            return;
        }

        if(n % 2 == 0) {
            list.add(n / 2);
            collatz(n / 2);
        } else {
            list.add(3 * n + 1);
            collatz(3 * n + 1);
        }
    }
}
