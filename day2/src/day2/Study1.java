package day2;

import java.util.Scanner;
import java.util.Calendar;


public class Study1 {

	public static void main(String[] args) {
//		변수 
		int number = 3;
		System.out.println(number);
		
//		상수
		int radius = 5;
		final double PI = 3.14159;
		double result = radius * 2 * PI;
		System.out.println(result);
		
//		기본형 
		boolean isFun = false;
		char charValue = 'a';
		int intValue = 20;
		long longValue = 2147483648L;
		
		System.out.println(isFun);
		System.out.println(charValue);
		System.out.println(intValue);
		System.out.println(longValue);
		
//		산술 연산자
		int a = 7;
		int b = 3;
		
		int c = a + b;
		int d = a - b;
		int e = a * b;
		int f = a % b;
		
		System.out.println("a와 b의 합 : "+ c);
	    System.out.println("a와 b의 차 : "+ d);
	    System.out.println("a와 b의 곱 : "+ e);
	    System.out.println("a를 b로 나눈 나머지 : "+ f);	
	
//		비교 연산자
	    
	    int A = (int)(Math.random()*10);
	    int B = (int)(Math.random()*10);
	    boolean C = A > B;
	    boolean D = A == B;
	    boolean E = A != B;
	 
	    System.out.println("A:"+A);
	    System.out.println("B:"+B);
	    System.out.println(C);
	    System.out.println(D);
	    System.out.println(E);
	 
//	 	if 문
	    int value = 6;
	    if(value % 3 == 0) {
	    	System.out.println(value+"는 3의 배수입니다");
	    }
	    
//	    논리 연산자
	    boolean isDiscount = false;
	    int age = 30;
	    if(19>=age || age >= 60) {
	    	isDiscount = true;
	    }
	    else {
	    	isDiscount = false;
	    }
	    System.out.println(isDiscount);
	    
//		for 문
	    for(int i =1; i<101; i++) {
	    	if (i%2 == 0) {
	    		System.out.print(i+" ");
	    	}
	    }
	    
	    
	}
}
