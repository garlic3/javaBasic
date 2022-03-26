package day17;

public class Ex5 {

	public static void main(String[] args) {
		D d = new D();
		
		d.print();
		d.print(3);
		d.print(5.8);
		d.print("안녕");
		
		
		System.out.println(H.a);
	}

}

// q1

class D {
	D() {}
	
	void print() {
		System.out.println("입력값이 없습니다");
	}
	
	void print(int a) {
		System.out.println("정수 입력값: " + a);
	}
	
	void print(double a) {
		System.out.println("실수 입력값: " + a);
	}
	
	void print(String a) {
		System.out.println("문자열 입력값: " + a);
	}
}

class F {
	int arraySum(int[] a) {
		int sum = 0;
		for (int i= 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
}

class H {
	static int a;
	
	H(){
		this.a = 8;
	}
	
	
}