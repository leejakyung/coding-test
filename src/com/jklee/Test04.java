package com.jklee;

// 숫자 찾기
public class Test04 {	
	// 정수 num과 k가 매개변수로 주어질 때, num을 이루는 숫자 중에 k가 있으면 num의 그 숫자가 있는 자리 수를 return하고 
	// 없으면 -1을 return 하도록 solution 함수를 완성해보세요.
	// 단, num에 k가 여러 개 있으면 가장 처음 나타나는 자리를 return 합니다.

	public static void main(String[] args) {
		int num = 29183;
		int k = 1;

		int answer = -1;

		// 정수를 문자열로 변환
		String number = String.valueOf(num);

		// 문자열을 배열로 변환
		char[] n = number.toCharArray();


		for(int i = 0; i < n.length; i++) {		

			// 아스키코드 0을 빼서 int와 비교
			if(n[i] - '0' == k) {
				answer = i + 1;
				// return answer;
			} 


		}
		
		System.out.println(k +"(이)가 있는 자리는: "+answer);

	}
}
