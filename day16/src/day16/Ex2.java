package day16;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 만약 7개의 데이터를 가진 ArrayList에서 2번 인덱스에 데이터를 추가하고자 한다면
		 2번 인덱스 이후의 모든 데이터들의 위치 정보가 수정되어야 함 
		 
		 0 1 2 3 4 5 6           0 1 2 3 4 5 6 7
		 가 나 다 라 마 바 사   =>   가 나 아 다 라 마 바 사  
		 
		 그러나 Linked List는 각 원소의 앞뒤 정보를 저장하고 있으므로 값이 추가되면
		 값이 추가된 위치의 앞뒤 데이터 정보만 수정하면 됨 -> 데이터를 추가또는 삭제할때
		 속도가 빠름 
		 단, 각 원소가 자신의 인덱스 정보를 갖고있지는 않음 
		 그러므로 특정 인덱스 위치의 값을 가져오기 위해서 앞에서부터 차례대로 번호를 세면서
		 인덱스의 위치를 찾아야함 -> ArrayList는 데이터 자체에 인덱스 번호를 갖고있으므로
		 특정 위치의 데이터를 빠르게 찾을 수 있음 
		 
		 속도: 
		 데이터 추가/ 삭제    Linked List > ArrayList
		 데이터 찾기         Linked List < ArrayList
		 
		 */
		 
		long startTime = 0;
		long endTime = 0;
		
		ArrayList arrTest = new ArrayList();
		LinkedList linkedTest = new LinkedList();
		
		// 데이터 추가 시간 비교  
		startTime = System.nanoTime();
		for (int i = 0; i < 100000 ; i ++) {
			arrTest.add(0,i);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 추가시간 = " + (endTime-startTime)/10000 + "ns");
		
		
		startTime = System.nanoTime();
		for (int i = 0; i < 100000 ; i ++) {
			linkedTest.add(0,i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 추가시간 = " + (endTime-startTime)/10000 + "ns");
	
		

		
		// 검색 시간 비교 
		
		startTime = System.nanoTime();
		for (int i = 0; i < 100000 ; i ++) {
			arrTest.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 검색시간 = " + (endTime-startTime)/10000 + "ns");

		startTime = System.nanoTime();
		for (int i = 0; i < 100000 ; i ++) {
			linkedTest.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 검색시간 = " + (endTime-startTime)/10000 + "ns");
		
		// 데이터 삭제 시간 비교 
		startTime = System.nanoTime();
		for (int i = 0; i < 100000 ; i ++) {
			arrTest.remove(0);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 삭제시간 = " + (endTime-startTime)/10000 + "ns");
		
		
		startTime = System.nanoTime();
		for (int i = 0; i < 100000 ; i ++) {
			linkedTest.remove(0);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 삭제시간 = " + (endTime-startTime)/10000 + "ns");
	}

}
