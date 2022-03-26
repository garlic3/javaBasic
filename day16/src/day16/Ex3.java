package day16;

import java.util.HashSet;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 Set 컬렉션
		 동일한 타입의 묶음이라는 특징은 그대로 갖고 있지만 인덱스 정보를 포함하지 않는
		 집합의 개념과 같은 컬렉션. 인덱스가 없으므로 데이터를 중복해서 저장하면 중복된 데이터 중
		 특정 데이터 중 특정 데이터를 꺼낼 방법이 없음. 동일한 데이터의 중복을 허용하지 않음
		 
		 */
		
		// HashSet 구현 클래스
		
		HashSet hSet1 = new HashSet();
		
		hSet1.add("가");
		hSet1.add("나");
		hSet1.add("다");
		
		System.out.println(hSet1);
		
		HashSet hSet2 = new HashSet();
		hSet2.add("나");
		hSet2.add("다");
		
		System.out.println(hSet2);
		
		hSet2.addAll(hSet1);
		System.out.println(hSet2);
		
		// remove, clear 메서드 사용 가능
		
		// '데이터가 값다' 또는 '데이터가 다르다'의 기준은?
		// A a1 = new A(3) 과 A a2 = new A(3) 일경우 Set 관점에서는 다른 객체임

		A a1 = new A(3);
		A a2 = new A(3);
		System.out.println(a1 == a2); // 두 객체의 해시코드가 동일한지를 비교
		System.out.println(a1.equals(a2)); // 두 객체를 비교
		
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		
		String c = "하이";
		String d = new String("하이");
		System.out.println(c == d);
		System.out.println(c.equals(d));
		
		// 해시코드의 개념 - 객체의 해시코드는 객체가 저장된 주소와 관련된 값으로
		// 실제로 번지값은 아님. 객체가 저장된 번지를 기준으로 생성된 정수형 고유값

	}

}

class A {
	int x;
	public A(int x) {
		this.x = x;
	}
}


