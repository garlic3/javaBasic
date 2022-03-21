package day13;

import java.util.Scanner;

public class Hw8 {

	public static void main(String[] args) {
		
		Hw hw = new Hw();
		Scanner sc = new Scanner(System.in);
		
		// 7-3
		System.out.println("정수 a: ");
		int a = sc.nextInt();
		System.out.println("정수 b: ");
		int b = sc.nextInt();
		System.out.println("정수 c: ");
		int c = sc.nextInt();
		System.out.println("중간값은" + hw.med(a, b, c) + "입니다.");

		// 7-4
		System.out.println("1부터 x까지의 합을 구하자.");
		System.out.println("x의 값: ");
		int n = sc.nextInt();
		System.out.println("1부터" + n + "까지의 합은 " + hw.sumUp(n) + "입니다");
		
		// 7-6
		System.out.println("몇 월입니까(1~12): ");
		int m = sc.nextInt();
		hw.printSeason(m);
		
		// 7-7
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다");
		System.out.println("단수는: ");
		int i = sc.nextInt();
		hw.putStart(i);
		
		//7-8
		System.out.println("난수를 생성합니다.");
		System.out.println("하한값: ");
		int l = sc.nextInt();
		System.out.println("상한값: ");
		int h = sc.nextInt();
		System.out.println("생성한 난수는 " + hw.random(l, h) + "입니다");
		
		
		
	}
}

// 7-3
class Hw {
	int med(int a, int b, int c) {
		int mid = 0;
		if (a > b) {
			// a > b > c  mid = b
			// a > b, b < c, a > c  mid = c
			// a > b, b < c, a < c  mid = a
			return mid = (b > c) ? b : ( a > c) ? c : a;
		}
		
		else {
			// a < b 
			// a < b , a > c  mid = a
			// a < b, a < c, b > c  mid = c
			// a < b, a < c, b < c  mid = b
			return mid = (a > c) ? a : (b > c) ? c : b;
		}
	}
// 7-4	
	int sumUp(int n) {
		int sum = 0;
		for (int i = 1; i <n+1; i++) {
			sum += i;
		}
		return sum;
	}
	
// 7-6	
	void printSeason(int m) {
		String season = "";
		switch(m) {
		case 12: case 1: case 2:
			season = "겨울";
			break;
		case 3: case 4: case 5:
			season = "봄";
			break;
		case 6: case 7: case 8: 
			season = "여름";
			break;
		case 9: case 10: case 11:
			season = "가을";
			break;
		}
	
		if ( m < 13 && m > 0) {
			System.out.println("해당 월의 계절은 " + season + "입니다");
		}
	}
	
// 7-7
	void putChar(char c, int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(c);
		}
	}
	
	void putStart(int m) {
		for (int j = 0; j < m+1; j++) {
			putChar('*', j);
			System.out.println();
		}
	}
	
	int random(int a, int b) {
		int num = (int)(Math.random()*(b-a+1))+a;
		return num;
	}
	
	
}
