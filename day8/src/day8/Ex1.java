package day8;

import java.util.Arrays;

public class Ex1 {

	public static void main(String[] args) {
		// 배열, 반복, 조건
		
		int[] a = {1,2,3,4,5};
		Study str = new Study();
		str.even(a);
		str.twice(a);
		
		
//		for (int i = 0; i < a.length; i++) {
//			if (a[i] % 2 == 0) {
//			System.out.println(a[i]);
//			}
//		}		
		
		// 1. 첫 수부터 숫자 2개씩 나누어 출력 
		// 12 23 34 45
		
//		for (int i = 0; i < a.length-1; i++) {
//		System.out.printf("%d%d ", a[i],a[i+1]);
//		}
		
		// 2. 첫 수부터 숫자 2개씩을 더한 값이 짝수인 그 해당 숫자 2개의 인덱스 번호를 배열로
		// 만들어 출력(처음 등장한 더한값이 짝수인 2개의 수)
	
		int[] b = {1,3,4,5,6};
		str.firstEven(b);
		
//		int[] c = new int[2];
//		for (int i = 0; i < b.length-1; i++) {
//			if ((b[i] + b[i+1]) % 2 == 0) {
//				c[0] = i;
//				c[1] = i+1;
//			}
//		}
//		System.out.println(Arrays.toString(c));
		
	}

}

class Study {
	Study() {
		
	}
	// 생성자 
	
	void even(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if(a[i] % 2 == 0) {
				System.out.println(a[i]);
			}
		}
	}
	
	void twice(int[] a) {
		for (int i = 0; i < a.length-1; i++) {
			System.out.println(a[i] + "," + a[i+1]);
		}
	}
	void firstEven(int[] a) {
		int[] c = new int[2];
		for (int i = 0; i< a.length-1; i++) {
			if ((a[i] + a[i+1]) % 2 == 0) {
				c[0] = i;
				c[1] = i+1;
			}
	
		}
		System.out.println(Arrays.toString(c));
	}
}	