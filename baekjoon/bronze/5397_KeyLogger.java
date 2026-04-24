package f;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class Solution5 {
	static int N;
	static int cursor;
	static List<Character> result;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		//cursor를 만들고 어디에 값을 넣어야할지 추적 (0에서 시작)
		// <가 들어오는 경우 커서 위치를 -1만큼 이동(0이 최소)
		// >가 들어오는 경우 커서 위치를 +1만큼 이동(list size가 최대)
		
		for(int i = 0; i < N; i++) { //N만큼
			//입력받고
			String input = br.readLine();
			cursor = 0;
			result = new LinkedList<>();
			ListIterator<Character> iter = result.listIterator();
			for (char c : input.toCharArray()) {
				enter(c,iter);
			}
			//출력
			StringBuilder sb = new StringBuilder();
			for (Character s : result) {
				sb.append(s);
			}
			
			System.out.println(sb.toString());
			
		}
		
	
	}

	private static void enter(char c,ListIterator<Character> iter) {
		
		if(c == '<') {
			if(iter.hasPrevious()) {
				iter.previous();
			}
			
		} else if(c == '>') {
			if(iter.hasNext()) {
				iter.next();
			}
		} else if(c == '-') {
			if(iter.hasPrevious()) {
				iter.previous();
				iter.remove();
			}
		} else {
			iter.add(c);
		}
		
	}

	
	
}
