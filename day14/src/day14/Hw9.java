package day14;

import java.util.Scanner;

public class Hw9 {

	public static void main(String[] args) {
		
		Hw hw = new Hw();
		
		
		// 7-9
		
		int user = 1;
		// 유저의 응답이 0이 될때까지 계속 메서드 수행
		while (user != 0) {
			int result = hw.readPlusInt();
			System.out.println("반대로 읽으면 " + result + "입니다");
			System.out.println("다시 한번? < Yes,,, 1 / No,,, 0 > : ");
			Scanner sc = new Scanner(System.in);
			user = sc.nextInt();
		}
	
		// 7-10
		/*
		 1. 랜덤으로 세자리수 숫자 3개 만들기 -> 배열로 반환 
		 2. 랜덤으로 숫자 1개 만들기(0<= x < 4) -> 문자 선택용
		 3. 숫자와 배열을 넣어주면 정해진 수식대로 계산하고 결과값 반환하기 
		 
		 
		 */
		
		System.out.println("암산 훈련!!");
		int n = 1;
		int result = 1;
		while(result != 0) {
			int [] arr = hw.makeNum();
			int e = (int)(Math.random()*3);
			// 다시 진행할건지 물어본 결과값을 result 변수에 저장 
			result = hw.randomMath(arr, e);

		}

		
		// 7-15
		int[] a = hw.makeArr();
		int sum = hw.sumOf(a);
		System.out.println("모든 요소의 합은 " + sum + "입니다");
		
		// 7-16
		System.out.println("사람 수는 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] h = new int[num];
		int[] w = new int[num];
		for (int i = 0; i < num; i++) {
			System.out.println(i+1 + "번의 신장:");
			int height = sc.nextInt();
			h[i] = height;
			System.out.println(i+1 + "번의 체중:");
			int weight = sc.nextInt();
			w[i] = weight;
		}
		int result1 = hw.minOf(h);
		int result2 = hw.minOf(w);
		
		System.out.println("가장 키가 작은 사람의 신장: " + result1+ "cm");
		System.out.println("가장 마른 사람의 체중: " + result2 + "kg");
		
		
		// 7-17
		System.out.println("요소 수: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[]x = new int[num];
		for (int i = 0; i<x.length; i++) {
			System.out.printf("x[%s]:", i);
			int n = sc.nextInt();
			x[i] = n;
		}
		
		System.out.println("찾는 값: ");
		int key = sc.nextInt();
		int result1 = hw.linearSearch(x, key);
		int result2 = hw.linearSearchR(x, key);
		System.out.println("가장 앞에 위치한 값은" + "x[" + result1 + "]에 있습니다.");
		System.out.println("가장 뒤에 위치한 값은" + "x[" + result2 + "]에 있습니다.");
		
	}

}


class Hw {
	Hw() {}
	
	int readPlusInt() {
		
		// 양의 정숫값을 입력할때 까지 계속 입력받기
		int n = 0;
		do {
		System.out.println("양의 정숫값: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		} while(n == 0 || n < 0);
		
		// int n을 String으로 형변환 
		String num = n + "";
		// 거꾸로 변환한 문자를 넣어줄 빈 문자열 생성 
		String result = "";
		
		
		// charAt을 이용하여 숫자를 거꾸로 붙여서 문자열 만들기
		for (int i = num.length() -1 ; i >= 0; i--) {
			result += (num.charAt(i) + "");
		}
		
		// 문자열 result를 int로 형변환하여 반환
		return Integer.parseInt(result);
	
	}
	// 랜덤으로 세자리수 3개 만들기 
	 int[] makeNum() {
		int a = (int)((Math.random()*899)+100);
		int b = (int)((Math.random()*899)+100);
		int c = (int)((Math.random()*899)+100);
		// 배열을 이용하여 반환하기
		int[] arr = {a,b,c};
		return arr;
	}
	 
	 // 배열과 정수 1개를 입력받아 문제 선택 후 정답 판단하기
	 int randomMath(int[] arr, int a) {
		 int result = 0;
		 String check = "";
		 if ( a == 0) {
			 result = arr[0] + arr[1] + arr[2];
			 check = arr[0] + " + " + arr[1]  + " + " + arr[2] + " = ";
		 }
		 else if( a == 1) {
			 result = arr[0] + arr[1] - arr[2];
			 check = arr[0] + " + " + arr[1]  + " - " + arr[2] + " = ";
		 }
		 else if( a == 2) {
			 result = arr[0] - arr[1] + arr[2];
			 check = arr[0] + " - " + arr[1]  + " + " + arr[2] + " = ";
		 }
		 else {
			 result = arr[0] - arr[1] - arr[2];
			 check = arr[0] + " - " + arr[1]  + " - " + arr[2] + " = ";
		 }
		 
		 int user = 0;
		 Scanner sc = new Scanner(System.in);

		 while( user != result) {
			 System.out.println(check);
			 user = sc.nextInt();
			 if (user != result) {
				 System.out.println("틀렸습니다!");
			 }
		 }
		 
		 // 다시 할건지 물어보고 그 결과값을 정수로 반환하기 
		 System.out.println("다시 한번? < Yes,,, 1/ No,,, 0>: ");
		 result = sc.nextInt();
		 
		 return result;
	 }
	 
	 int sumOf(int[] a) {
		 int sum = 0;
		 for (int i = 0; i < a.length; i++) {
			 sum += a[i];
		 }
		 return sum;
	 }
	 
	 int[] makeArr() {
		 System.out.println("요소 수: ");
		 Scanner sc = new Scanner(System.in);
		 int a = sc.nextInt();
		 int[] arr = new int[a];
		 for (int i = 0; i < arr.length; i++) {
			 System.out.printf("a[%s] :", i);
			 arr[i] = sc.nextInt();
		 }
		 return arr;
	 }
	 
	 int minOf(int[]a) {
		 int min = a[0];
		 for (int i = 0; i < a.length; i++) {
			 if(a[i] <= min) {
				 min = a[i];
			 }	 
		 }
		 
		 return min;
		 
	 }
	 
	 int linearSearch(int[]a, int key) {
		 int result = 0;
		 for (int i = 0; i < a.length; i++) {
			 if(a[i] == key) {
				result = i;
				break;
			 }
		 }
		 return result;
	 }
	 
	 int linearSearchR(int[]a, int key) {
		 int result = 0;
		 for (int i = a.length-1; i >= 0; i--) {
			 if(a[i] == key) {
				 result = i;
				 break;
			 }
		 }
		 return result;
	 }
	 
	
}