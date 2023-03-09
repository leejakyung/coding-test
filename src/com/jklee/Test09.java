package com.jklee;

// 문자열 my_str과 n이 매개변수로 주어질 때, my_str을 길이 n씩 잘라서 
// 저장한 배열을 return하도록 solution 함수를 완성해주세요.
public class Test09 {
	
	// 잘라서 배열로 저장하기
	public static void main(String[] args) {
		String my_str = "abc1Addfggg4556b";
		int n = 6;
		
		String[] arr = my_str.split("", n);
		
		
	}
}
