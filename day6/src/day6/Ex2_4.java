package day6;

public class Ex2_4 {

	public static void main(String[] args) {
		// this() 매서드
		// this() 매서드는 자신이 속한 클래스 내부의 다른 생성자를 호출할 때 사용
		// 1. 생성자의 내부에서만 사용
		// 2. 생성자의 첫줄에 위치
		
		T t1 = new T();
		System.out.println();
		
		T t2 = new T(3);
		System.out.println();
		
		T t3 = new T(3,2);
		System.out.println();
		
		
	}

}


class T {
	T() {
		System.out.println("첫번째 생성자");
	}
	
	T(int a){
		this(); // 
		System.out.println("두번째 생성자");
	}
	
	T(int a, int b){
		this(a);
		System.out.println("세번째 생성자");
	}
	
}