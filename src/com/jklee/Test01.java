package com.jklee;

// 문자열 계산하기
public class Test01 {
	public static void main(String[] args) {
		// my_string은 "3 + 5"처럼 문자열로 된 수식입니다. 문자열 my_string이 매개변수로 주어질 때, 
		// 수식을 계산한 값을 return 하는 solution 함수를 완성해주세요.
		
		 String my_string = "3 + 4 + 6";
		 String[] arrString = my_string.split(" ");
		 
		 int sum = Integer.parseInt(arrString[0]);

		 
//		 for(String s : arrString) {
//			 if(s == "+") {
//				 
//			 } else if (s == "-"){
//				
//			 }
//		 }
		 
		 for(int i = 1; i < arrString.length; i++){
			 if(i%2!=0){
				 if(arrString[i].equals("+")){
					 sum += Integer.parseInt(arrString[i+1]);
				 } else {
					 sum -= Integer.parseInt(arrString[i+1]);
				 }    
			 }
		 }

		 
 		 System.out.println(sum);
		 
 		 
	}
}
