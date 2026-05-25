import java.util.*;
import java.util.stream.*;
import java.util.Map.Entry;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // map에 저장 -> value를 기준으로 정렬 -> k번째까지에 해당하는 key를 가져오기

        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < nums.length; i ++) {
            map.put(nums[i],map.getOrDefault(nums[i],0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Entry.<Integer,Integer>comparingByValue().reversed());

        for(int i = 0; i < k; i ++) {
            Entry<Integer,Integer> entry = list.get(i);
            result.add(entry.getKey());
        }


        return result.stream().mapToInt(i -> i).toArray();



    }
}
