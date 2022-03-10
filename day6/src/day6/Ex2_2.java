package day6;

public class Ex2_2 {

	public static void main(String[] args) {
		// this 키워드(파이썬 self)
		// 모든 매서드에는 자신이 포함된 클래스의 객체를 가리키는 this가 있음
		
		Z z = new Z();		
	}

}


class Z {
	int m;
	int n;
	void init(int a, int b) {
		int c;
		c = 3;
		this.m = a; // this 키워드를 생략
		this.n = b;
	}
	
	void work() {
		this.init(2, 3);
	}
}