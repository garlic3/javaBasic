package jungsuk;

import java.util.Scanner;

public class Chap3 {

	public static void main(String[] args) {
/*
 제어문 (조건문, 반복문)
 'A' <= ch && ch <= 'Z' 문자 ch가 대문자일 때
 'a' <= ch && ch <= 'z' 문자 ch가 소문자일 때
 '0' <= ch && ch <= '9' 문자 ch가 숫자일때
 
 str.equlasIgnoreCase("yes") -> 대소문자 구별없이 문자 str의 내용이 "yes"일때 
 조건문: 조건을 만족할때만 {}를 수행 (if-else, switch)
 반복문: 조건을 만족하는 동안 {}를 수행 
 
 */

		if (true)
			System.out.println("축하합니다"); //실행구문이 한문장일때 괄호 생략가능 -> 헷갈리니까 생략하지 말것 
		

/*
 switch(조건식) {
 	case 값1:
 	case 값2:
 }		
 제약조건: 1. 조건식 결과는 정수 또는 문자열 2. case문 값은 정수,상수(문자포함), 문자열만 가능, 중복 불가
 break가 없으면 해당되는 값의 실행구문부터 break를 만나기전까지 모두 실행되고 빠져나옴
 */
		
/*
 
 임의의 정수 만들기
 Math.random() -> 0.0과 1.0사이의 임의의 double값 반환 / 0.0 <= Math.random() < 1.0
		1~3 중에서 임의의 정수 만들기 
		0.0 *3 < = Math.random()*3 -> 내가 원하는 개별값의 갯수 < 1.0 *3
		0.0 <= Math.random()*3 <3.0
		(int)0.0 <= (int)(Math.random()*3) <(int)3.0
		0 <= (int)(Math.random()*3) < 3
		1 <= (int)(Math.random()*3)+1 < 4
	
 */
		
//		1부터 10사이의 난수 20개 출력
		
	for (int i = 1; i <= 20; i++) {
//		System.out.println(Math.random());  0.0 <= x < 1.0
//		System.out.println((int)(Math.random()*10); 0 <= x < 10
 		
	}
		
//		-5~5사이의 난수 20개 출력
	for (int i = 1; i <= 20; i++) {
		System.out.println((int)(Math.random()*11)-5);
	}
		
/*
 
 for(초기화; 조건식; 증감식){
 	실행구문
 }
 초기화에서 변수 2개 사용 가능(단 같은 타입이어야함)		
 for(;;) ->  조건식을 생략하면 true로 간주되어 무한반복문이 됨
 
 */
		
//	별찍기
		
	for(int i = 1; i <= 5; i++) {
		for(int j = 1; j <= 10; j++) {
			System.out.printf("*");
		}
		System.out.println();
	}
	
	for(int a = 1; a <= 5; a++) {
		for(int b = 1; b <= a; b++) {
			System.out.print("*");
			
		}
		System.out.println();
	}
		
	for(int c = 1; c <= 5; c++) {
		for(int d = 5; d >= c; d--) {
			System.out.print("*");
		}
		System.out.println();
	}
		   

	
/*
  while (조건식) {
  	실행구문
  }	
 */
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		int num = 0, sum = 0;
		num = Integer.parseInt(tmp);
		while(num!=0) {
			sum += num%10;
			// 나머지 연산자로 마지막 자리값 얻기
			System.out.printf("sum=%3d num=%dn", sum, num);
			num  /= 10;
			
		}
		System.out.println(sum);
		
		
		
		for(num = 12345; num>=0; num /= 10) {
			sum += num %10;
			
		}
/*
 * 
do while
do { 
	실행구문
	} while (조건식);
	
-> 사용자 입력 받을때 유용 

 */
		System.out.println("1~100사이의 정수를 입력하세요");
		int answer = (int)((Math.random()*100)+1);
		System.out.println(answer);
		int user = 0;
		
		do {
			Scanner sc = new Scanner(System.in);
			user = sc.nextInt();
			if (user > answer) {
				System.out.println("더 작은 숫자입니다");
			}
			if (user < answer) {
				System.out.println("더 큰 숫자입니다");
			}
		} while(answer != user);
		System.out.println("정답입니다");
		
/*
 반복문에 이름 붙여서 하나 이상의 반복문 벗어나기	
 반복문 앞에 루프이름 : for~ / while ~ 써주고
 break 루프이름; 으로 사용 	
 */

		 
		 
		 
		 
	}

}
