package com.jklee;

import java.util.ArrayList;
import java.util.List;

// 정수 n과 정수 배열 numlist가 매개변수로 주어질 때,
// numlist에서 n의 배수가 아닌 수들을 제거한 배열을 return하도록 solution 함수를 완성해주세요.
public class Test05 {
	
	// n의 배수 고르기
	public static void main(String[] args) {
		
		int n = 3;
		int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
		int[] answer = {};
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i < numlist.length; i++) {
			int num = numlist[i];

			if(num % n == 0) {
				list.add(num);
			}
			
		}
		
		answer = new int[list.size()];
		
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		
		
		System.out.println(answer);
		
	}
}
