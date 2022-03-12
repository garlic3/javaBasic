package jungsuk;

import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args){
		//5-3
		int[] arr = {10,20,30,40,50};
		int sum = 0;
		
		for ( int each:arr) {
			sum += each;
		}
		
		System.out.println("sum=" + sum);
		
		
		//5-4
		
		int [][] arr2 = {
				{5,5,5,5,5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
		};
		
		int total = 0;
		float average = 0;
		float x = 0;
		
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j:arr2[i]) {
				total += j;	
			}
			x = x + arr2[i].length;
			average = total/x;
		}
		
		System.out.println("total=" + total);
		System.out.println("average=" + average);
		
		
		//5-5 **
		
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		
		for (int a = 0; a < ballArr.length; a++) {
			int b = (int)(Math.random()*ballArr.length);
			int tmp = 0;
		
			tmp = ballArr[a];
			ballArr[a] = ballArr[b];
			ballArr[b] = tmp;
			
		}

		ball3 = Arrays.copyOf(ballArr, 3);
		for(int c = 0; c< ball3.length; c++) {
			System.out.println(ball3[c]);
		}
		
		//5-6 **
		
		String[] words = {"television", "computer", "mouse", "phone"};
		Scanner sc = new Scanner(System.in);
		
		for (int e = 0; e < words.length; e++) {
			char[] question = words[e].toCharArray();
			char tmch = 'a';
			for (int f = 0; f < question.length; f++) {
				int d = (int)(Math.random()*question.length);
				tmch = question[f];
				question[f] = question[d];
				question[d] = tmch;
			}
			System.out.println(question);
		}
		
		
		
	}
}
