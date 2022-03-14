package day8;

import java.util.Scanner;

public class Hw4 {

	public static void main(String[] args) {
//		
//		// 4-22
//		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
//		System.out.println("단수는? :");
//		Scanner sc = new Scanner(System.in);
//		int dan = sc.nextInt();
//		
//		for ( int i = 1; i < dan+1; i++) {
//			for (int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		System.out.println();
//		
//		for (int a = 1; a <= dan; a++) {
//			for (int b = 5; b >= a; b--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		// 4-25
//		System.out.println("2 이상의 정숫값 : ");
//		Scanner sc = new Scanner(System.in);
//		int pnum = sc.nextInt();
//		
//		int prime = 0;
//		String result = "";
//		for (int c = 2; c < pnum; c++) {
//			if (pnum % 2 == 0) {
//				prime ++;
//			}
//		}	
//		result = (prime == 0) ? "소수입니다" : "소수가 아닙니다";
//		System.out.println(result);
//		
//		// 4-26
//		
//		System.out.println("정수를 더합니다.");
//		System.out.println("몇 개를 더할까요? : ");
//		Scanner sc = new Scanner(System.in);
//		int numCount = sc.nextInt();
//		int count = 0;
//		int sum = 0;
//		
//		do{
//			System.out.println("정수(0으로 종료):");
//			int num = sc.nextInt();
//			sum += num;
//			if (num == 0) {
//				break;
//			}
//			count++;
//			
//		}while(count != numCount);
//		
//		double avg = sum / (double)count;
//		
//		System.out.printf("합계는 %s 입니다 %n", sum);
//		System.out.printf("평균은 %s 입니다 %n", avg);
		

		// 4-27
		System.out.println("정수를 더합니다.");
		System.out.println("몇개를 더할까요?:");
		Scanner sc = new Scanner(System.in);
		int numCount = sc.nextInt();
		int sum = 0;
		int count = 0;
		do {
			System.out.println("정수:");
			int num = sc.nextInt();
			sum += num;
			count++;
		}while(sum < 1000);
		
		double avg = sum / (double)count;
		
		System.out.printf("합계는 %s 입니다", sum);
		System.out.println("평균은 %s 입니다", avg);
	}
	

}

