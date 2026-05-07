import java.util.*;
class Solution {
    
    
    public String[] solution(String[] orders, int[] course) {List<String> result = new ArrayList<>();
		// 보충해야 할 부분
    // 조합 구하는 logic 잡기
    // 정렬 관련 (배열, String, List 등 오름차순 내림차순 정렬 + List<int[]> 가 있을 때도 int[]값 기준으로 정렬하는 법
    // Stream 사용법 보충하기 sort, mapToInt 등 배열 -> List -> 배열 등등
    // Map(HashMap)은 많이 사용하는만큼 사용법 익혀놓기
    // 조합, 순열, 부분집합은 기본으로 깔고가야함
                                                             
		
		// 1. 스카피가 원하는 course 만큼 반복
		// 2. 각각의 orders에서 comb로 메뉴 뽑기
		// 3. 뽑은 메뉴 hashMap에 key : value 로 넣기
		// 3-1 hashMap 정렬 내림차순?
		// 4. 가장 많이 나온 메뉴가 2 이상일 경우 코스에 추가
		// 4-1. 동점일 경우 모두 추가
		
		
		for(int i = 0; i < course.length; i ++) { //3
			int courseNum = course[i]; // 찾아야할 코스의 가지수
			Map<String,Integer> map = new HashMap<>();
			for(int j = 0; j < orders.length; j ++) { 
				// courseNum 만큼 메뉴 수 뽑기
				String order = orders[j]; // 현재 메뉴
				// 메뉴를 오름차순 정렬
				char[] arr = order.toCharArray();
				Arrays.sort(arr);
				order =String.valueOf(arr);
				
				
				comb(0,0,courseNum,order,new StringBuilder() ,map); // order에서 2개 메뉴 뽑고 hashMap에 넣기
            } //j
            int max = 0;
				for (Map.Entry<String, Integer> entry : map.entrySet()) {
					String key = entry.getKey();
					int value = entry.getValue();
					if(value > max) {
						max = value;
					}
				}
				for (Map.Entry<String, Integer> entry : map.entrySet()) {
				    String key = entry.getKey();
				    int count = entry.getValue();

				    if (count == max && count >= 2) {
				        result.add(key);
				    }
				}
		} //i
		
		// result를 오름차순으로 정렬하고 배열로 변환
		String[] rresult = result.stream().sorted().toArray(String[]::new);
		return rresult;
		
    }
    
    private static void comb(int start, int depth, int r, String order,StringBuilder output,Map<String,Integer> map) {
		
		
		if(depth == r) {
			String key = output.toString();
			map.put(key, map.getOrDefault(key, 0) + 1);
			return;
		}
		for(int i = start; i < order.length(); i ++) {
			output.append(order.charAt(i));
			comb(i + 1, depth + 1, r, order,output,map);
			output.deleteCharAt(output.length() - 1);
		}
		
		
	}
}

