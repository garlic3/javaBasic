package day6;

public class Ex2 {

	public static void main(String[] args) {
		// constructor 생성자 
		// 객체를 최초 생성할 때 자동으로 호출되어 실행
		// 1. 생성자는 반드시 클래스명과 동일한 이름 
		// 2. 생성자는 리턴타입도 없고 리턴도 없음 
		
		// 개발자가 생성자를 직접 만들지 않으면 기본 생성자 default constructor를 자동으로 생성
		// 생성자가 하나라도 있으면 자바는 기본 생성자를 추가로 만들지는 않음 
		
			H h = new H();
			I i = new I();
			J j = new J(3);
			
			h.work();
			i.work();
			j.work();
	}

}

class H {
	int m;
	void work() {
		System.out.println(m);
	}
}

class I {
	I () {
	}	   
	
	int m;
	void work() {
		System.out.println(m);
	}
}

class J {
	J(int a) {
		m = a;
	}
	int m;
	void work() {
		System.out.println(m);
	}
}