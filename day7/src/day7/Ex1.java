package day7;

public class Ex1 {

	public static void main(String[] args) {
	
		
		A a1 = new A();
		A a2 = new A(10);
		A a3 = new A(10,20);
		
		a1.print();
		a2.print();
		a3.print();
	}

}

class A {
	int m1, m2, m3, m4;
	A() {
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	
	A(int a){
		m1 = a;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	
	A(int a, int b){
		this();
		m1 = a;
		m2 = b;
	}
	
	void print() {
		System.out.println("m1:" + m1);
		System.out.println("m2:" + m2);
		System.out.println("m3:" + m3);
		System.out.println("m4:" + m4);
		System.out.println();
		
	}
}
