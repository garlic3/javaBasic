package day6;

public class Ex2_3 {

	public static void main(String[] args) {
		// 명시적으로 this를 붙여야 하는 경우
		
		X x = new X();
		x.init(2, 3);
		
		System.out.println(x.m);
		System.out.println(x.n);
		
		Y y = new Y();
		y.init(2, 3);
		System.out.println(y.m);
		System.out.println(y.n);
	}
}


class X {
	int m; // 자동으로 초기값이 0으로 설정(필드)
	int n; // 자동으로 초기값이 0으로 설정(필드) 
	void init(int m, int n) {
		m = m; // 지역변수 
		n = n; // 지역변수 
	}
}

class Y {
	int m;
	int n;
	void init(int m, int n) {
		this.m = m; // y.m = 2
		this.n = n; // y.n = 3
	}
}