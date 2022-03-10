package day6;

public class Ex1_5 {

	public static void main(String[] args) {
		// 가변길이 매서드 
		method1(1,2);
		method1(1,2,3);
		method1();
	
		
		method2("안녕");
		method2("안녕","방가");
		method2("안녕","잘가","방가");
	}
	public static void method1(int...values ) {
		System.out.println("길이:" + values.length);
		
		for (int each: values) {
			System.out.print(each + " " );
		}
		System.out.println();
	}

	public static void method2(String...values ) {
		System.out.println("길이:" + values.length);
		
		for (String each: values) {
			System.out.print(each + " " );
		}
		System.out.println();
	}

}
