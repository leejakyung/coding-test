package com.jklee;

// 문자열 str1, str2가 매개변수로 주어집니다. 
// str1 안에 str2가 있다면 1을 없다면 2를 return하도록 solution 함수를 완성해주세요.

// 문자열은 알파벳 대문자, 소문자, 숫자로 구성되어 있습니다.
public class Test07 {
	
	// 문자열 안에 문자열
	public static void main(String[] args) {
		String str1 = "AbcAbcA";
		String str2 = "AAA";
		
		int answer = 0;
		
		// split으로 자르기
//		String[] str1Arr = str1.split("");
//		
//		for (int i = 0; i < str1Arr.length; i++) {
//			if(str1.contains(str2)) {
//				answer = 1;
//			} else {
//				answer = 2;
//			}
//		}
		
		for (int i = 0; i < str1.length(); i++) {
			if(str1.contains(str2)) {
				answer = 1;
			} else {
				answer = 2;
			}
		}
		System.out.println(answer);
	}
}
