package f;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        
        // answer[0] answer[1] ... answer[answer.length() -1] 비교
        // 각각의 패턴 만들기
        int[] p1 = {1,2,3,4,5}; //총길이 5
        int[] p2 = {2,1,2,3,2,4,2,5}; //총길이8
        int[] p3 = {3,3,1,1,2,2,4,4,5,5}; //총 길이 10
        int p1Score = 0;
        int p2Score = 0;
        int p3Score = 0;
        for(int i = 0; i < answers.length; i++) {
        	if(answers[i] == p1[i%5]) {
        		p1Score++;
        	}
        	if(answers[i] == p2[i%8]) {
        		p2Score++;
        	}
        	
        	if(answers[i] == p3[i%10]) {
        		p3Score++;
        	}
        }
        
        List<Integer>scoreList = new ArrayList<>();
        
        int max = Math.max(p1Score, Math.max(p2Score, p3Score));
        if(p1Score == max) {
        	scoreList.add(1);
        }
        if(p2Score == max) {
        	scoreList.add(2);
        }
        if(p3Score == max) {
        	scoreList.add(3);
        }
        answer = new int[scoreList.size()];
        
        for(int i = 0; i < scoreList.size(); i++) {
        	answer[i] = scoreList.get(i);
        }
        
        
        
        
        
        return answer;
    }
}
