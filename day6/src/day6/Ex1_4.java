package day6;

public class Ex1_4 {

	public static void main(String[] args) {

		//		Method Overloading
		
		print(); //인수가 없을때 
		
		print(3); //인수가 1개인데 int 형 
		
		print(5.8); //인수가 1개인데 double 
		
		print(2,5); //인수가 2개일때 
	
	}

	public static void print() {
		System.out.println("데이터가 없습니다");
	}
	
	public static void print(int a) {
		System.out.println(a);
	}
	
	public static void print(int b, int c) {
		System.out.println(b);
		System.out.println(c);
	}
	
	public static void print(double d) {
		System.out.println(d);
	}
}

