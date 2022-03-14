package jungsuk;

public class Chap6 {

	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		t1.channel = 7;
		
		System.out.println("t1.channel: " + t1.channel);
		System.out.println("t2.channel: " + t2.channel);
		
		Tv[] tvArr = new Tv[3];
		tvArr[0] = new Tv();
		tvArr[1] = new Tv();
		tvArr[2] = new Tv();
	
		
		// 비 객체지향적 코드
		
		int hour2 = 10;
		int minute2 = 10;
		float second2 = 10;
		
		// 객체지향적 코드
		
		Time t3 = new Time();
		t3.hour = 10;
		t3.minute = 10;
		t3.second = 10; 
		
		
		// cv는 객체 생성없이 사용 가능
		System.out.println("카드규격: width " + Card.width + " height " + Card.height);
		Card c1 = new Card();
		Card c2 = new Card();
		
		// iv 인스턴스 변수 
		c1.kind = "heart";
		c1.number = 5;
		
		c2.kind = "spade";
		c2.number = 7;
		
		// cv 클래스 변수
		Card.width = 200;
		Card.height = 300;
		
		System.out.println("c1 width: " + Card.width + " kind: " + c1.kind);
		System.out.println("c2 width: " + Card.width + " kind: " + c2.kind);
		
		// 매서드
		MyMath mm = new MyMath();
		long result1 = mm.add(5L, 3L);
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		long result5 = mm.max(5L, 3L);
		long result6 = mm.min(5L, 3L);
		
		System.out.println("add(5L, 3L):" + result1);
		System.out.println("subract(5L, 3L):" + result2);
		System.out.println("multiply(5L, 3L):" + result3);
		System.out.println("divide(5L, 3L):" + result4);
		System.out.println("max(5L, 3L):" + result5);
		System.out.println("min(5L, 3L):" + result6);
		
		
		// 클래스(static) 매서드
		System.out.println(MyMath2.add3(10L, 5L));
		
		// 인스턴스 매서드 
		MyMath2 mm2 = new MyMath2();
		mm2.a = 10L;
		mm2.b = 5L;
		System.out.println(mm2.add2());
	}
	
	
	

}

class Tv {
	String color;
	boolean power;
	int channel;
	
	void power() {
		power = !power;
	}
	
	void channelUp() {
		++channel;
	}
	
	void channelDown() {
		--channel;
	}
}

class Time {
	int hour;
	int minute;
	float second;
}

class Card {
	String kind;
	int number;
	
	static int width = 100;
	static int height = 250;
}

class MyMath {
	long add(long a, long b) {
		long result = a + b;
		return result;
	}
	
	long subtract(long a, long b) {
		long result = a - b;
		return result;
	}
	
	long multiply(long a, long b) {
		long result = a * b;
		return result;
	}
	
	double divide(double a, double b) {
		double result = a / b;
		return result;
	}
	
	long max(long a, long b) {
		long result = b;
		if(a > b) {
			result = a;
		}
		return result;
		// return a > b ? a : b;	
	}
	
	long min(long a, long b) {
		return a > b ? b : a;
	}
	
}


class MyMath2 {
	long a, b;
	
	long add2() {
		return a + b;
	}
	
	static long add3(long a, long b) {
		return a + b;
	}
}