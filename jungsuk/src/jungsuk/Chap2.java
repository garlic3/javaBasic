package jungsuk;

public class Chap2 {

	public static void main(String[] args) {

/*		
	문자와 숫자간의 변환
	'0'을 빼거나 더해주기 
	3 + '0' = '3'
	'3' - '0' = 3
	
	문자열로의 변환
	빈 문자열 ("")을 더해주기
	3 + "" = "3"
	'3' + "" = "3"
		
	문자열을 숫자로 변환
	"3" / Integer.parseInt("3") = 3
	"3.4" / Double. parseDouble("3.4") = 3.4 
	
	문자열을 문자로 변환
	"3" / "3".charAt(0) = '3'
	
	변수 확인 방법
	변수명.getClass().getName()
*/
		String str = "3";
		System.out.println(str.charAt(0)-'0');
		System.out.println('3'-'0'+1);
		System.out.println(Integer.parseInt("3")+1);
		System.out.println("3"+1);
		System.out.println(3+'0');
		
		
/*

 모든 연산자는 연산결과를 반환한다 
 산술 연산자
 비교 연산자(>,<,>=,<=,==,!=)
 논리 연산자(and && or || not !)
 대입 연산자
 기타 연산자(형변환, 삼항 연산자, instanceof 연산자)
 
 산술 > 비교 > 논리 > 대입
 대입, 단항 연산자는 오른쪽에서 왼쪽으로 결합
 
 증감 연산자(++)
 값이 참조되기전에  증가시킴 j = ++j;
 감소 연산자(--)
 값이 참조된 후에 증가시킴 j = j++;
 
 증감 연산자가 독립적으로 사용되면 전위형과 후위형의 차이가 없음
 ++i; i++;
 
 부호 연산자
 
 형변환 연산자
 범위가 큰 타입을 범위가 작은 타입으로 변환하면 값손실이 일어날수도 있으며 자동형변화가 발생되지 않음
 byte -> short -> int -> long -> float -> double (자동형변화 발생) 
 
 사칙 연산자
 같은 타입끼리만 계산 가능
 
 산술변환
 연산 전에 피연산자의 타입을 일치시는것
 1.큰타입으로 두 피연산자의 타입을 일치 시킨다 
 2.피연산자의 타입이 int보다 작은 타입이면 int로 변환됨(오버플로우를 방지하기위해)
 '2' - '0' = 2 (char - char = int - int = 유니코드 50-48 = 2 이므로)
 
 
*/
	
//	byte b = 100; // int(큰값) 에서 byte(작은값)변환하려고 했지만
//				  // 리터럴 값이 byte 범위(-128~127)사이에 있으므로 자동형변화가 발생됨
//	
//	int i = 100;
//	byte a = i; // 리터럴이 아닌 변수를 사용해서 변환하려고 하면 값의 손실이 발생될수 있으므로 
//				// 자동형변환이 일어나지 않고 에러가 발생

		
		int a = 1_000_000;
		int b = 2_000_000;
		
		long aa = 1_000_000;
		long bb = 2_000_000;
		
		long c = a*b; // 결과값에서 int의 범위를 벗어나서 오버플로우 발생 
		long d = (long)a * b;
		
		System.out.println(c);
		System.out.println(d);
	
		
		
/*
 Math.round() 
 실수를 소수점 첫째자리에서 반올림한 정수를 반환 
 
 나머지 연산자 %
 오른쪽 피연산자로 나누고 남은 나머지를 반환(부호는 무시됨)

		 
*/
		double pi = 3.141592;
		double shortPi = Math.round(pi*1000)/ 1000.0; 
		// round는 소수점 첫째짜리에서 반올림해주므로 원하는 위치까지 10을 곱해서 만들어주고 다시 돌려놓기 
		System.out.println(shortPi);
		
		double npi = pi * 1000.0;
		int ipi = (int)npi;
		double fpi = ipi / 1000.0;
		System.out.println(fpi);
		
		System.out.println(10%8);
		System.out.println(10%-8);
/*
 문자열 비교(== 대신 equlas() 사용)
 
 논리 연산자
 식에 and와 or을 같이 사용해야되면 괄호사용할것
 a < x < b 로 사용하지 말고 x > a and x < b로 사용할것 
 
 논리 부정연산자 
 true 를 false로 false는 true로 바꿈
 boolean b = true !x = false 
 
 조건 연산자 
 조건식? 식1(true):식2(false)
 
 대입 연산자
 오른쪽 피연산자를 왼쪽 피연산자에 저장후 저장된 값을 반환
 left value(저장공간) = right value
 final int a = 3; (값을 한번 저장하면 변경할수 없는 상수로 저장됨)
 
 
 
 
 */
		
	}
}
