package com.jklee;

// 가장 큰 수 찾기
public class Test03 {
	public static void main(String[] args) {
		//정수 배열 array가 매개변수로 주어질 때, 가장 큰 수와 그 수의 인덱스를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
		
		int[] array = {1, 8, 3};
		
		
		// 배열을 첫번째 값이 제일 큰 수라고 가정
		// Math.max() 
		int maxNum = array[0];
		int maxIndex = 0;
		
//		for(int i : array) {
//			if(i > maxNum) {
//				maxNum = i;
//				
//			}
//		}
		
		// maxNum = 8 이 array의 어느 인덱스에 있는지 ..
		
		for (int i = 0; i < array.length; i++) {
			if(array[i] > array[maxIndex]) {
				maxIndex = i;
			}
		}
		
		System.out.println(array[maxIndex]+" "+maxIndex);
		
	}	
	
}
