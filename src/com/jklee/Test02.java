package com.jklee;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test02 {
	public static class SumClass {

	    private int sum = 0;

	    public int sum(int... arr){
	        for(int num : arr){
	            sum += num;
	        }
	        return sum;
	    }

	}
	
	public static void main(String[] args) {
		List<int[]> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int[] ints = new int[random.nextInt(10)];
            for (int j = 0; j < ints.length ; j++) {
                ints[j] = random.nextInt(10);
            }

            list.add(ints);
        }

        for (int[] arr : list) {
            SumClass sum = new SumClass();
            int result = sum.sum(arr);
            System.out.println(result);
        }

        SumClass sumOnce = new SumClass();
        for (int[] arr : list) {
            int result = sumOnce.sum(arr);
            System.out.println(result);
        }
	}

	
}
