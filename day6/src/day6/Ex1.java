package day6;

public class Ex1 {

	public static void main(String[] args) {
/*

 객체 생성 : 클래스명 개체명 = new 생성자();
 필드 field: 클래스에 포함된 변수, 객체의 속성값을 지정할 수 있음
 필드는 지역변수와는 다른 개념.
 지역변수 -> 메서드에 포함된 변수 / 필드 -> 클래스에 포함된 변수 
 필드는 직접 초기화 하지 않아도 강제로 초기화됨
 지역변수는 직접 초기화 하지 않고 그냥 출력하면 오류가 발생
*/
		
		
		A a = new A();
		
		a.m = 5;
		System.out.println(a.m);
		a.print();
		
	}

}

class A{
	int m = 3; // 필드
	void print() {
		System.out.println("객체생성");
		int k = 5; // 지역변수
	}
}

