package day10;

import java.io.InputStreamReader;

public class Ex3 {

	public static void main(String[] args) {
/*
 예외 처리 문법
 try {
 	일반 예외, 실행 예외 발생 가능 코드 
 } catch (예외명) {
 	예외 발생했을 때 처리 코드 
 }
 finally {
 	예외 발생 여부와 상관없이 무조건 실행 코드 
 }
 
 */
		
		try {
			System.out.println(3/0);
		} catch (ArithmeticException e) {
			System.out.println("숫자는 0으로 나눌 수 없습니다");
		} finally {
			System.out.println("프로그램 종료");
		}
		
		
/*
 
 예외 처리 과정
 catch() 블록도 예외 타입에 따라 여러개를 포함할 수 있음
 
 */
		
		try {
			System.out.println(3/0);
			int num = Integer.parseInt("10A");
		} catch (ArithmeticException e) {
			System.out.println("숫자는 0으로 나눌수 없음");
		} catch (NumberFormatException e) {
			System.out.println("숫자로 바꿀 수 없음");
		} finally {
			System.out.println("종료");
		}
		 
//		1개의 catch()블록으로 2개의 예외를 동시에 처리
		

		try {
			System.out.println(3/1);
			int num = Integer.parseInt("10A");
		} catch (ArithmeticException | NumberFormatException e) {
			System.out.println("에러 발생 ");
		} finally {
			System.out.println("종료");
		}
		 
//		finally 의 또다른 기능: 리소스 해제 -> 더이상 사용하지 않는 자원 반납 

		
	}

}
