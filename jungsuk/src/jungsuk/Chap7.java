package jungsuk;

public class Chap7 {

	public static void main(String[] args) {

		
//		상속
//		Circle c = new Circle();
//		c.x = 1;
//		c.y = 2;
//		c.r = 3;
//		
//		System.out.println("c.x = " + c.x);
//		System.out.println("c.y = " + c.y);
//		System.out.println("c.r = " + c.r);
		
		
		Circle c = new Circle();
		c.p.x = 1;
		c.p.y = 2;
		c.r = 3;
		
		System.out.println("c.p.x = " + c.p.x);
		System.out.println("c.p.y = " + c.p.y);
		System.out.println("c.r = " + c.r);
		
		Mypoint3 p = new Mypoint3(3,5);
//		p.x = 3;
//		p.y = 5;
		System.out.println(p);
//		System.out.println(p.toString());
		
		
	}

}


class Point {
	int x;
	int y;
}

// 상속 
//class Circle extends Point{
//	int r;
//}

// 포함
class Circle {
	Point p = new Point();
	int r; 
}

class Mypoint3 extends Object {
	int x;
	int y;
	
	Mypoint3(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
	return "x:" + x + " y:" + y;
	}
}