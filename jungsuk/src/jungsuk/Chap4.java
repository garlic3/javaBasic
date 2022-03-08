package jungsuk;

import java.util.Arrays;

public class Chap4 {

	public static void main(String[] args) {
		int[] arr = {100,95,80,70,60};
		char[] cArr = {'a','b','c','d','e'};
		
		System.out.println(arr.length);
		
		int sum = 0;
		for (int i=0; i < arr.length; i++) {
			System.out.println(arr[i]);
			sum += arr[i];
			
		}
		
		double avg = sum / arr.length;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(cArr);
		//char arr은 각 요소가 구분자 없이 그대로 출력됨
		
		
		System.out.println("총합:"+sum);
		System.out.println("평균:"+avg);
		

		int min = arr[0];
		int max = arr[0];
		
		for (int j= 1; j < arr.length; j++) {
			if (arr[j] < min) {
				min = arr[j];
			}
			if(arr[j] > min) {
				max = arr[j];
			}
		}
		System.out.println("min:"+min);
		System.out.println("max:"+max);
		
		int [] numArr = {0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(numArr));
		for(int k = 0; k < numArr.length; k++ ) {
			int n = (int)(Math.random()*10);
			int tnum = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tnum;
		}
		System.out.println(Arrays.toString(numArr));
	
		int [] loTto = new int[45];
		for (int l = 1; l < 46; l++) {
			loTto[l-1] = l; 
		}
		System.out.println(Arrays.toString(loTto));
		
		for (int s = 0; s < 6; s++) {
			int r = (int)((Math.random()*45)+1);
			int tm = loTto[s];
			loTto[s] = loTto[r];
			loTto[r] = tm;
			System.out.println(loTto[s]);
		}

		int [][] twoArr = {
				{1,2,3},
				{4,5,6}
		};
		
		System.out.println(twoArr);
		
		
		
		
	}

}
