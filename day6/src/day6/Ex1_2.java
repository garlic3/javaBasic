package day6;

public class Ex1_2 {
	public static void main(String[] args) {
 /*
  매서드 -> 클래스의 기능에 해당
  매서드 명은 소문자로만!
  
  제어자 반환타입 매서드명 (인수) {
  }
  -> public static int sum(int a, int b){
  }
   입력값으로 int형 변수 a, b 2개를 입력받아서 처리 
  */
	
//		1. input x return x
//		void print(){
//		System.out.println("HI");
//		리턴타입이 void(리턴이 없음 -> 인수도 없음)
		
//		2. input x return o
//		int print() {
//			return 0;
//		}
//		리턴타입이 int  0이 return 됨 
		
//		3. input o return x
//		void print(String name){
//			System.out.println(name);
//		}
//		리턴 타입이 void(리턴이 없음) / 인수는 String
		
//		4. input o return o
//		String print(String name) {
//			return name
//		}
		
		C c = new C();
		c.print();
		int k = c.data();
		System.out.println(k);
		double result = c.sum(3, 5.2);
		System.out.println(result);
		c.printMonth(12);
		
		}
}

class C {
	void print() {
		System.out.println("안녕");
	} // input x output x 

	int data() {
		return 3;
	} // input x output o
	
	double sum(int a, double b) {
		return a + b;
	} //input o output o
	
	
	void printMonth(int c) {
		if(c > 0 && c < 13) {
		System.out.println(c+ "월입니다");
		}
	} //input o output x
	
	
 }

