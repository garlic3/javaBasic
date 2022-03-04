package jungsuk;
import java.util.Scanner;

public class chap1 {

	public static void main(String[] args) {
//		문자열 + 어떤 타입 = 문자열 
//		어떤 타입 + 문자열 = 문자
		System.out.println(""+7+7);
		System.out.println(7+7+"");
		
		char ch = 'A';
		int i = 'A';
		System.out.println(i);
		
		
//		변수값 변환 
		int x = 10;
		int y = 20;
		int b = x;
		y = b;
		x = 20;
		System.out.println(y);
		System.out.println(x);
				
//		printf() 지시자 
		System.out.printf("%d%n",15);
		System.out.printf("%s%n",Integer.toBinaryString(15));
		System.out.printf("[%05d]%n", 10); // ->5자리까지 출력. 빈자리에 0넣어서 출력 
		System.out.printf("[%5d]%n",1234567); // 지정한 범위보다 입력값의 범위가 더 크면 입력값 전부 출
		System.out.printf("[%.10s]%n", "가나다라마바사아자카타파하"); // 입력한 범위까지만 출력 
		
		
//		double 과 float의 정밀도 차이
		float f = 123.456789f;
		double c = 123.456789;
		System.out.printf("%f%n",f);
		System.out.printf("%f%n",c);
		System.out.printf("%20.10f",c); //정수부분 빈자리는 공백, 소수점 아래는 0으로채워짐 
		
		
	}

}
