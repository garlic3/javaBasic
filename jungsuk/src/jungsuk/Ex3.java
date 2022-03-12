package jungsuk;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		//4-1
		int x = 12;
		if( x > 10 && x < 20) {
			System.out.println(true + "1");
		}
		
		char ch = 'x';
		if(ch != 0 || ch != 9) {
			System.out.println(true + "2");
		}
		
		if(ch == 'x' || ch == 'X') {
			System.out.println(true + "3");
		}
		
		if(ch - '0' >= 0 && ch - '0' <= 9) {
			System.out.println(true + "4");
		}
		
		if((ch >= 65 && ch <= 90 )||(ch >= 97 && ch <= 122)) {
			System.out.println(true + "5");
		}
		
		int year = 400;
		if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println(true + "6");
		}
		
		boolean powerOf = false;
		if(powerOf == false) {
			System.out.println(true + "7");
			
		String str = "yes";
		if(str.equals("yes")) {
			System.out.println(true + "8");
		}
		}
		
		
		//4-2
		int sum = 0;
		for (int i = 1; i < 21; i++) {
			if(i % 2 == 0 || i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println("합계:"+sum);
		
		//4-3
		sum = 0;
		for (int j = 1; j < 11; j++) {
			for(int k = 1; k < 11; k++) {
				sum += k;
			}
		}
		System.out.println("합계:"+sum);
		
		
		//4-4

		sum = 0;
		int n;
		int m;
		for (n = 1, m = -2; ; n += 2, m -= -2) {
			sum = n + m;
			if(sum >= 100) {
				System.out.println("n:"+ n);
				System.out.println("m:"+ m);
				System.out.println("합계:" + sum);
				break;
			}
		}
		
		//4-5
		int a = 0;
		while(a <= 10) {
			int b = 0;
			while(b < a) {
				System.out.print("*");
				b ++;
			}
			System.out.println();
			a ++;
		}
		
		//4-6
		for (int c = 1; c < 7; c++) {
			for (int d = 1; d < 7; d++) {
				if (c + d == 6){
					System.out.println("c:"+c+" d:"+d);
				}
			}
		}
		
		//4-7
		String str2 = "12345";
		int sum2 = 0;
		for (int e = 0; e < str2.length(); e++) {
			char ch2 = str2.charAt(e);
			sum += (ch-'0');
		}
		System.out.println("sum=" + sum2);		
		

		//4-8
		int value = (int)(Math.random()*6)+1;
		System.out.println("value:"+value);
	

		// **4-9
		int num = 12345;
		int sum3 = 0;
		while (num > 0) {
			sum3 += num % 10;
			num /= 10;
		}
		System.out.println("sum=" + sum3);

		
		
		// 4-10
		int answer = (int)(Math.random()*100)+1;
		int input = 0;
		int count = 0;
		
		do {
		count++;
		System.out.println("1~100 사이의 숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
		if(input > answer) {
			System.out.println("더 작은 숫자입니다");	
		}
		else if(input < answer) {
			System.out.println("더 큰 숫자 입니다");
		}
		else {
			break;
		}
		}while(true);
		
		System.out.println("정답입니다");
		System.out.printf("시도횟수는 %s번입니다", count);
	}

}
