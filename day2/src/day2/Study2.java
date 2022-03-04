package day2;

public class Study2 {

	public static void main(String[] args) {

//		문자열 내장 메소드
		
		String a = "hello";
		String b = "HELLO";
		String c = "good";
		String d = "hello";
		String e = new String("hello");
		
//		equals 두 문자열이 같은지 비교 
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.equals(d));
		
		System.out.println(a == e); // a와 e는 서로 다른 객체이기때문에 false가 나옴
		System.out.println(a.equals(e)); //서로 다른 객체여도 값을 비교하기 때문에 true가 나옴
		
//		indexOf 문자열에서 특정 문자가 시작되는 인덱스를 리턴 
		System.out.println(a.indexOf("ll"));
		
//		contains 문자열에서 특정 문자열이 포함되어 있는지 여부 확인
		System.out.println(a.contains("el"));
		
//		charAt 문자열에서 입력한 인덱스 위치의 문자(char)를 리턴 
		System.out.println(a.charAt(3));
		
//		replaceAll 문자열에서 특정 문자열을 다른 문자열로 변경 
		System.out.println(a.replaceAll("el","good"));
		
//		substring 문자열에서 특정 부분 출력 
		System.out.println(a.substring(0,4)); //끝위치는 미포함
		
//		toUpperCase 대문자로 변환
		System.out.println(a.toUpperCase());
		
//		split 문자열을 특정 구분자로 분리
		String text = "a:b:c:d";
		String [] result = text.split(":");
		
//		문자열 포매팅
		System.out.println(String.format("I eat %s apples and %s bananas",3,"seven"));
		System.out.println(String.format("Error is %s%%",100 )); //%는 %%로 표현 
		
		System.out.println(String.format("%10s",3.1334));
		System.out.println(String.format("%-10s",3.1334));
		System.out.println(String.format("%.2f", 3.1334));
		System.out.println(String.format("%10.4f", 3.1334));
		
		System.out.printf("%10.4f", 3.1334);
//		String.format -> 포매팅된 문자열을 리턴 printf -> 문자열을 출력 
		
//		
		
		
		
		
		
		
	}

}
