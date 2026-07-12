class Solution {
    
    class pointer {
        int value;
        int idx;
        int count;
        
        public Pointer(int value, int idx, int count) {
            this.value = value;
            this.idx = idx;
            this.count = count;
        }
    }
    public int solution(int[] queue1, int[] queue2) {
       
        // 두 배열 합치기
        int[] array = new int[queue1.length + queue2.length];
        for(int i = 0; i < queue1.length; i ++) {
            array[i] = queue1[i];
        }
        for(int i = queue1.length; i < array.length; i ++) {
            array[i] = queue2[i - queue1.length];
        }
        
        // target 설정
        long sum = 0;
        for(int i = 0; i < array.length; i ++) {
            sum += (long) array[i];
        }
        long target = sum / 2;
        
        // pointer 생성
        Pointer fp = new Pointer(array[0], 0, 0);
        Pointer bp = new Pointer(array[array.length - 1], array.length - 1, 0);
        
        while(fp.idx < bp.idx) {
            if(sum > target) {
                if(fp.value < bp.value) {
                    sum -= (long) fp.value;
                    fp.idx++;
                    fp.count++;
                    fp.value = array[fp.idx];
                    
                } else {
                    sum -= (long) bp.value;
                    bp.idx--;
                    bp.count++;
                    bp.value = array[bp.idx];
                } //else
            } else if (sum == target) {
                return fp.count + bp.count;
            } else {
                return -1;
            }
        }
        
        
        
        
    }
}

/* 
포인터 2개
양쪽끝에서 출발
[sum p1 p2 ] > target -> 포인터조정(더 작은 값을 버림)
[sum p1 p2 ] = target -> break 이동한 횟수 return
p1 idx > p2 idx return -1 
*/

    
