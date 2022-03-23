package day15;

import java.util.Scanner;

public class Hw10 {

	public static void main(String[] args) {
		
		Hw hw = new Hw();
		Scanner sc = new Scanner(System.in);
	
		
		// 7-18
		
		int[] a = hw.makeArr("a");
		hw.aryRmv(a, 2);
		hw.printArr(a,"a");

		
		// 7-19

		int[] a = hw.makeArr("a");
		System.out.println("삭제를 시작할 인덱스: ");
		int idx = sc.nextInt();
		System.out.println("삭제할 요소의 수: ");
		int n = sc.nextInt();
		hw.aryRmv2(a, idx, n);
		hw.printArr(a, "a");

		// 7-20
		int[] a = hw.makeArr("a");
		System.out.println("삽입할 요소의 인덱스: ");
		int idx = sc.nextInt();
		System.out.println("삽입할 값: ");
		int x = sc.nextInt();
		hw.aryIns(a, idx, x);
		hw.printArr(a, "a");
		
		
		// 7-21
		int[] a = hw.makeArr("a");
		int[] b = hw.makeArr("b");
		hw.aryExchng(a, b);
		System.out.println("배열 a와 b의 전체 요소를 교환했습니다.");
		hw.printArr(a, "a");
		hw.printArr(b, "b");
	
		
		// 7-22
		int[] x = hw.makeArr("x");
		int[] y = hw.arrayClone(x);
		hw.printArr(y, "y");
	}
}


class Hw {
	
	// 배열을 순서대로 출력해주는 메서드 
	void printArr(int[] a, String arrName) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%s[%s] = %s %n", arrName, i, a[i]);
		}
	}
	
	// 배열을 입력한 이름으로 만들어주는 메서드 
	int[] makeArr(String arrName) {
		Scanner sc = new Scanner(System.in);
		System.out.println("요소 수: ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("a[" +i + "]:");
			int n = sc.nextInt();
			arr[i] = n;
		}
		return arr;
	}

	// 7-18
	
	void aryRmv(int[] a, int idx) {
		for (int i = idx; i < a.length-1; i++) {
			a[i] = a[i+1];
		}
	}
	
	// 7-19
	void aryRmv2(int[] a, int idx, int n ) {
		for (int i = idx; i <= (idx + n); i++) {
			if((a.length-1)-n > 0 && (i+n) <= a.length-1) {
				a[i] = a[i+n];
			}	 
			// a[1] = a[4]
			// a[2] = a[5]
			// a[3] = a[3]		
		}
	}
	
	// 7-20
	void aryIns(int[] a, int idx, int x) {
		for (int i = a.length-1; i > idx; i--) {
			a[i] = a[i-1];
			// a[3] = a[2]
			// a[4] = a[3]
			// a[5] = a[4]
		}
		a[idx] = x;
	}
	
	// 7-21
	void aryExchng(int[] a, int[] b) {
		int s = (a.length > b.length) ? b.length : a.length;
		for (int i = 0; i < s; i++){
			int tmp = a[i];
			a[i] = b[i];
			b[i] = tmp;
		}
	}
	
	// 7-22
	int[] arrayClone(int[] x) {
		int[] y = x.clone();
		System.out.println("배열 x를 복사해서 배열 y를 생성했습니다.");
		return y;
		}
	
}