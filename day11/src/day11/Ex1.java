package day11;

public class Ex1 {

	public static void main(String[] args) {
/*
 예외 던지기
 예외가 발생했을 때 그 위치에서 바로 예외 처리를 할 수도 있고 호출한 지점으로 예외를 던질수도 있음
 throws
 리턴타입 메서드명(변수) throws 예외 클래스명 {
 
 throw 
 예외 강제로 발생시키
 }
 
 */
		A a = new A();
		a.abc();
		
	}

}

class A {
	void abc() {
		try {
			bcd();
		}catch(InterruptedException e) {
			
		}
	}
	
	void bcd() {
			System.out.println("start");
			Thread.sleep(1000);
			System.out.println("stop");
	
	}
}

class MyException extends Exception {
	MyException() {
		
}
	MyException(String s){
		super(s);
	}
}

class MyRTException extends RuntimeException {
	MyRTException() {
		
	}
	MyRTException(String s){
		super(s);
	}
}