package day9;

public class Ex2 {

	public static void main(String[] args) {
/* 
	final -> 필드, 매서드, 클래스 앞에 위치
  	final 변수 : 변수를 상수로 사용
  	final 매서드 : 자식 클래스에서 해당 매서드를 오버라이딩 할 수 없음  
  	final 클래스 : 상속 받을수 없음 
  	
*/			
		
		A1 a1 = new A1();
		a1.a = 7;
//		a1.b = 9; -> 에러발생 
	}

}

class A1 {
	int a = 3;
	final int b = 5;
	A1() {
		
	}
}

class A2 {
	int a = 5;
	final int b = 9;
	A2() {
		a = 10;
//		b = 11; 에러발생 
	}
}