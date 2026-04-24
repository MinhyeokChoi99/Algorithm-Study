package f;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class Solution6 {
	static int N;
	
	static List<Character> result;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String origin = br.readLine(); // 원본 스트링
		char[] originChar = origin.toCharArray();
		List<Character> originList = new LinkedList<>();
		for (Character c : originChar) {
			originList.add(c);
		}
		ListIterator<Character> iter = originList.listIterator(originList.size());
		N = Integer.parseInt(br.readLine()); // 명령어 갯수
		
		for(int i = 0; i < N; i ++) {
			String line = br.readLine();
			if(line.charAt(0) == 'P') {
				enter(line.charAt(2),iter);
			}
			if(line.charAt(0) == 'L') {
				enter('L',iter);
			}
			if(line.charAt(0) == 'B') {
				enter('B',iter);
			}
			if(line.charAt(0) == 'D') {
				enter('D',iter);
			}
			
		}
		StringBuilder sb = new StringBuilder();
		for (Character character : originList) {
			sb.append(character);
		}
		System.out.println(sb.toString());
		
		
			
		
		
	
	}

	private static void enter(char c,ListIterator<Character> iter) {
		
		if(c == 'L') {
			if(iter.hasPrevious()) {
				iter.previous();
			}
			
		} else if(c == 'D') {
			if(iter.hasNext()) {
				iter.next();
			}
		} else if(c == 'B') {
			if(iter.hasPrevious()) {
				iter.previous();
				iter.remove();
			}
		} else {
			iter.add(c);
		}
		
	}

	
	
}
