package day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Ex1 {

	public static void main(String[] args) {
/*
 컬렉선 프레임워크

 컬렉션 - 여러 데이터를 수집해 놓은 자료구조( 데이터 저장 공간의 크기가 동적으로 변화)
 
 컬렉션의 개념과 구조
 - List<E> 컬렉션 인터페이스
 - Set<E> 컬렉션 인터페이스
 - Map<K,V> 컬렉션 인터페이스
 - Stack<E> 컬렉션 인터페이스 (last in, first out)
 - Queue<E> 컬렉션 인터페이스 (first in, first out)
 
컬렉션은 collection 은 동일한 타입을 묶어 관리하는 자료구조
우표 수집 컬렉션에는 우표만 넣듯이 한 컬렉션에는 동일한 타입의 데이터만 모아둘 수 있음
그리고 메모리가 허용하는 한 저장 데이터의 개수에 제약이 없음 

배열은 데이터 저장 공간의 크기가 동적으로 변화하지 않으므로 컬렉션이 아님

컬렉션 프레임워크: 컬렉션과 프레임워크가 조합된 개념 
리스트 스택 큐 트리 등 자료구조에 정렬 탐색 등의 알고리즘을 구조화 해놓은 프레임워크.
여러 데이터 묶음 자료를 효과적으로 처리하기 위해 구조화된 클래스 또는 인터페이스의 모음
프레임워크 framework 일반적으로 단순히 연관된 클래스와 인터페이스들의 묶음을 라이브러리하고 함
프레임워크는 클래스 또는 인터페이스를 생성하는 과정에서 설계의 원칙 또는 구조에 따라 클래스 또는 인터페이스를
설계하고 이렇게 설계된 클래스와 인터페이스를 묶어놓은 개념

컬렉션(동일한 타입을 묶어 관리하는 자료구조, 저장 용량을 동적으로 관리)
  +
프레임워크(클래스와 인터페이스의 모음, 클래스의 정의에 설계 원칙 또는 구조)
= 컬렉션 프레임워크(자료구조에 정렬 탐색 등의 알고리즘을 구조화 해놓은 프레임워크)

- list<E> 컬렉션 인터페이스
배열과 가장 비슷한 구조를 가지고 있는 자료구조 
List<E>는 인터페이스이기 때문에 객체를 스스로 생성할 수 없음
객체를 생성하기 위해서는 List<E>를 구현받아서 자손 클래스를 생성하고 그 생성한 자손클래스를
이용해서 객체를 생성해야함 -> 하지만 컬렉션 프레임워크를 이용할때는 직접 인터페이스를 구현하지
않아도 됨. 이미 컬렉션 프레임워크 안에 각각의 특성 및 목적에 맞는 클래스가 구현되어 있음

List<E>
ArrayList<E>
Vector<E>
LinkedList<E>

List<E> 자체가 제네릭 인터페이스이므로 이를 구현한 클래스들도 제네릭 클래스
즉 객체를 생성할때 타입을 지정해야함 



 */
		// list
		// 데이터 저장 공간의 크기가 동적으로 변화
		
		List<String> aList = new ArrayList<>();
		aList.add("a");
		aList.add("b");
		aList.add("c");
		aList.add("d");
		aList.add("e");
		System.out.println(aList.size());
		aList.remove("c");
		aList.remove("d");
		System.out.println(aList.size());
		
		
		/* Arrays.asList() 메서드를 사용한 정적 컬렉션 객체 생성
		 내부적으로 배열을 먼저 생성하고 이것을 List<E>로 래핑 wrapping 만 해놓음
		 따라서 내부구조는 배열과 동일하므로 컬렉션 객체인데도 크기 변경이 불가능
		 구현 클래스로 객체를 생성했을 때와 달리 데이터의 추가 삭제가 불가능
		 크기를 변경하지 않는 데이터의 변경은 가능 -> 고정된 개수의 데이터를 저장하거나 활용할때 사용 
		*/
		
		List<Integer> aList1 = Arrays.asList(1,2,3,4);
		aList1.set(1, 7);
		System.out.println(aList1);
		// aList1.add(5); 오류 
		// aList1.remove(0); 오류
		System.out.println(aList1);
		
		List<Integer> aList2 = new ArrayList<>();
		List<Integer> aList3 = new ArrayList<>(30); //기본 크기
		List<Integer> aList4 = new Vector<>();
		List<Integer> aList5 = new Vector<>(30);
		List<Integer> aList6 = new LinkedList<>();
		//List<Integer> aList7 = new LinkedList<>(30); 저장 용량 지정 불가
	
		//ArrayList<E> 클래스의 주요 메서드 활용 방법
		// 1. add 메서드 - > 마지막 인덱스에 계속 추가  
		List<Integer> bList1 = new ArrayList<>();
		bList1.add(3);
		bList1.add(4);
		bList1.add(5);
		System.out.println(bList1.toString());
		bList1.add(1,6); // 2. add 위치 지정 삽입 add(index, value)
		System.out.println(bList1.toString());
		
		// 3. addAll - 또 다른 리스트를 통째로 넣기 
		// -> addAll(index,array)로 위치지정 가능 
		List<Integer> bList2  = new ArrayList<>();
		bList2.add(1);
		bList2.add(2);
		bList2.addAll(bList1);
		System.out.println(bList2.toString());
		
		// 4. set 메서드 set(index, value) -> 값 변경
		bList2.set(1, 5);
		System.out.println(bList2.toString());
		
		// 5. remove 메서드 remove(
		bList2.remove(1);
		System.out.println(bList2.toString());
		bList2.remove(new Integer(3)); // 처음 등장하는 값을 삭제 
		System.out.println(bList2.toString());
		
		// 6. clear 메서드 -> 전부 삭제
		bList2.clear();
		System.out.println(bList2.toString());
		
		// 8. isEmpty 메서드 -> 비어있는지 확인
		System.out.println(bList2.isEmpty());
		
		// 9. size 메서드 -> 크기 확인
		System.out.println(bList2.size());

		// 10. get 메서드 -> 해당 인덱스의 값 가져오기
		System.out.println(bList1.get(0));
		System.out.println(bList1.get(2));
	
		// q1
		System.out.println(bList1.size());
		for (int i = 0; i < bList1.size(); i++) {
			System.out.println(i + "번째: " + bList1.get(i));
		}
		
		
		/*
		 Linked List 연결 리스트
		 List<E>의 모든 공통 특징을 다 가지고 있음(동질 자료, 동적 할당, 추가/변경/삭제 동일 메서드)
		 
		 1. LinkedList<E> 는 객체를 생성할 때 저장 용량을 지정할 수 없음
		 2. 내부적으로 데이터를 저장하는 방식이 다름. 모든 데이터가 서로 연결된 형태로 관리됨
		 
		 */
		
		List<Integer> linkedlist1 = new LinkedList<Integer>();
		
	}


}
