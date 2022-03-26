package day16;

import java.util.HashSet;

public class Ex4 {

	public static void main(String[] args) {

		HashSet hSet1 = new HashSet();
				
		C c1 = new C("안녕");
		C c2 = new C("안녕");
		
		System.out.println(c1.x == c2.x);
		System.out.println(c1.x.equals(c2.x));

		
		System.out.println("c1.hashCode(): " + c1.hashCode());
		System.out.println("c2.hashCode(): " + c2.hashCode());
		System.out.println("c1.x.hashCode(): " + c1.x.hashCode());
		System.out.println("c2.x.hashCode(): " + c2.x.hashCode());

//		hSet1.add(c1.x);
//		hSet1.add(c2.x);
//		System.out.println(hSet1);
		
		
		String s1 = new String("hi");
		String s2 = new String("hi");
		hSet1.add(s1);
		hSet1.add(s2);
		System.out.println(hSet1);
		System.out.println("s1.hashCode(): " + s1.hashCode());
		System.out.println("s2.hashCode(): " + s2.hashCode());
		
	}

}


class C {
	String x;
	public C(String x) {
		this.x = x;
	}
}
