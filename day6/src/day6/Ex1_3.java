package day6;

public class Ex1_3 {

	public static void main(String[] args) {
//		클래스 내부에서 매서드 호출하기
//		클래스 내부에 있는 매서드 끼리는 객체를 생성하지 않고도 서로를 호출 할수 있음
//		필드 역시 클래스 내부의 모든 매서드 안에서 객체를 생성하지 않고도 사용
		
		print();
		
		int a = twice(3);
		System.out.println(a);
		
		double b = sum(a, 5.8);
		System.out.println(b);
		}

	public static void print() {
		System.out.println("안녕");
	}
	
	public static int twice(int k) {
		return k*2;
	}
	
	public static double sum(int m, double n) {
		return m + n;
		
	}

	
}