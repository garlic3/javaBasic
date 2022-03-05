package jungsuk;

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
			System.out.println("축하합니다"); //실행구문이 한문장일때 괄호 생략가능 -> 헷갈리니까 생략하지 말
		

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
//	for(int i = 1; i <= 5; i++) {
//		for(int j = 1; j <= 10; j++) {
//			System.out.printf("*");
//		}
//		System.out.println();
//	}
	
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
		
	
/*     *
	  ***
	 *****
	*******
   **********
   
 정삼각형 만들기 
 
 i = 1 j = 1 / 5번째 
 i = 2 j = 3 / 4,5,6번째 
 i = 3 j = 5 / 3,4,5,6,7
 i = 4 j = 7 / 2,3,4,5,6,7,8
 i = 5 j = 9 
 
*/   
	
	for(int i = 1; i <= 5; i++) {
		for(int j = 1; j <=10; j++) {
			if (j == 5) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
   
	}

}
