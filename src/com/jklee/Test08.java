package com.jklee;

// 어떤 자연수를 제곱했을 때 나오는 정수를 제곱수라고 합니다. 
// 정수 n이 매개변수로 주어질 때, n이 제곱수라면 1을 아니라면 2를 return하도록 solution 함수를 완성해주세요.
public class Test08 {
	
	// 제곱수 판별하기 
	public static void main(String[] args) {
		int answer = 0;
		int n = 144;
		
		for (int i = 1; i < n/2; i++) {
			if(i*i==n) {
				answer = 1;
			}
		}
		answer = 2;
		
		System.out.println(answer);
	}
}
