// 최소공배수 최대공약수 구하기

class Solution {
    public int solution(int[][] signals) {
        int n = signals.length;

        // 1. 각 신호등 주기 길이 구하기
        int[] sums = new int[n];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += signals[i][j];
            }
            sums[i] = sum;
        }

        // 2. 전체 주기의 최소공배수 구하기
        int lcmValue = 1;
        for (int i = 0; i < n; i++) {
            lcmValue = lcm(lcmValue, sums[i]);
        }

        // 3. 각 신호등의 색 패턴 문자열 생성
        String[] patterns = new String[n];
        for (int i = 0; i < n; i++) {
            int g = signals[i][0];
            int y = signals[i][1];
            int r = signals[i][2];

            String oneCycle = "G".repeat(g) + "Y".repeat(y) + "R".repeat(r);
            patterns[i] = oneCycle.repeat(lcmValue / sums[i]);
        }

        // 4. 최소공배수 길이만큼 탐색하며 동시에 노란불인지 확인
        for (int t = 0; t < lcmValue; t++) {
            int yellowCount = 0;

            for (int i = 0; i < n; i++) {
                if (patterns[i].charAt(t) == 'Y') {
                    yellowCount++;
                }
            }

            if (yellowCount == n) {
                return t + 1;
            }
        }

        return -1;
    }

    public static int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
