package day6;

public class Ex1_1 {

	public static void main(String[] args) {
		B b = new B();
		b.printFieldValue();
	}

}

class B{
	boolean m1;
	int m2;
	double m3;
	String m4;
	
	void printFieldValue() {
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
	}
	
	void printLocalValue() {
		int p;
		System.out.println(p); //에러 발생
	}
}
