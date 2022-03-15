package day9;

public class Ex3 {

	public static void main(String[] args) {
/*	
 	abstract 추상 - 구체적이지 않음
	abstract method - 중괄호가 없는 매서드, 매서드의 기능이 정의되지 않음
	abstract 리턴타입 매서드명();
	
*/
		
	Animal animal1 = new Cat();
	animal1.cry();
	Animal animal2 = new Dog();
	animal2.cry();
	}

}

/*
 class Animal {
	void cry() {
	}
	추상 매서드로 정의하는것이 효율적	추상 매서드를 포함하는 클래스는 반드시 추상 클래스로 정의해야함 
	추상 클래스 = 상속가능, 객체생성 X	
	추상 매서드 사용 장점: 추상 매서드를 포함하고 있는 추상 클래스를 상속한 자식 클래스들 내부에는
	추상 매서드를 구체화한 클래스가 있어야함. -> 이때 구체화한 클래스의 이름에서 오타 발생시 문법오류 발생
	만약 추상클래스가 아닌 클래스를 상속할 경우에는 오버라이딩이 아닌 새로운 매서드 생성으로 오타를 잡기 어려움
	
}
 */

abstract class Animal {  // 추상 클래스 선언 
	abstract void cry(); // 추상 매서드 선언
}

class Cat extends Animal{
	void cry() {
		System.out.println("야옹");
	}
}

class Dog extends Animal{
	void cry() {
		System.out.println("멍멍");
	}
}