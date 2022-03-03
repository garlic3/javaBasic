package day1;

public class Ex2 {

	public static void main(String[] args) {
/*
 변수명 짓기 (영문 대소문자, _, $ 사용, 카멜케이스 사용, 숫자 첫글자 사용 불가)
 변수가 사라지는 시점을 이해하는것이 중요
 */
		
		
	int a = 1;
	{
		int b = 2;
		System.out.println(a);
		System.out.println(b);
	}
	System.out.println(a);
//	System.out.println(b); 변수 b가 설정되는 시점을 벗어낫기 때문에 오류발
	
	boolean bool1 = true;
	boolean bool2 = false;
	byte byteValue = 10;
	short shortValue = -10;
	int intValue = 100;
	long longValue = -100L;
	float floatValue = 1.3F;
	double doubleValue = -1.5;
	char charValue = 'a';
	String stringValue = "apple";
	
	char ex_1 = 'A';
	char ex_2 = 65; //아스키코드로 문자를 인식
	char ex_3 = '\u0041'; //유니코드로 문자를 인식 
	
	
	}
	
}
