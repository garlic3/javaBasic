package day16;

import java.util.Arrays;
import java.util.Scanner;

public class Hw11 {

	public static void main(String[] args) {
		Hw hw = new Hw();
		Scanner sc = new Scanner(System.in);

		
		// 7-23
		
		int[] a = hw.makeArr("a");
		System.out.println("탐색할 값: ");
		int x = sc.nextInt();
		int[] result = hw.arrayStchIdx(a, x);
		System.out.println("일치하는 요소의 인덱스 ");
		System.out.println(Arrays.toString(result));
		
		
		
		// 7-24
		int[] a = hw.makeArr("a");
		System.out.println("삭제할 요소의 인덱스: ");
		int idx = sc.nextInt();
		int[] result = hw.arrayRmvOf(a, idx);
		hw.printArr(result, "y");
		
		
		// 7-25
		int[] a = hw.makeArr("x");
		System.out.println("삭제를 시작할 인덱스: ");
		int idx = sc.nextInt();
		System.out.println("삭제할 요소의 개수: ");
		int n = sc.nextInt();
		int[] result = hw.arrayRmvOfN(a, idx, n);
		hw.printArr(result, "y");
		
		// 7-26
		int[] a = hw.makeArr("x");
		System.out.println("삽입할 인덱스: ");
		int idx = sc.nextInt();
		System.out.println("삽입할 값: ");
		int x = sc.nextInt();
		int[] result = hw.arrayInsOf(a, idx, x);
		hw.printArr(result, "y");
		
		// 7-29
		int[][] x = {{1,2,3}, {4,5,6}};
		int[][] y = {{6,3,4}, {5,1,2}};
		int[][] z = new int[2][3];
		
		System.out.println(hw.addMatrix(x, y, z));
		System.out.println(Arrays.deepToString(z));
	}

}

class Hw {
	
	// 7-23
	int[] arrayStchIdx(int[] a, int x) {
		int arrLength = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i] == x) {
				arrLength++;
			}
		}
		int[] result = new int[arrLength];
		int value = 0;
		for (int j = 0; j < a.length; j++) {
			if(a[j] == x) {
				result[value] = j;
				value++;
			}
		}
		return result;
	}
	
	// 7-24
	int[] arrayRmvOf(int[] a, int idx) {
		int[] result = new int[a.length-1];
		for (int i = 0; i < result.length; i++) {
			result[i] = a[i];
			if (i >= idx) {
				result[i] = a[i+1];
			}
		}
		return result;
	}
	
	// 7-25
	int[] arrayRmvOfN(int[] a, int idx, int n) {
		int[] result = new int[a.length-n];
		for(int i = 0; i < result.length; i++) {
			if( i < idx) {
				result[i] = a[i];
			}
			else {
			result[i] = a[i+n];
			}
			}
		return result;
	}
	
	// 7-26
	
	int[] arrayInsOf(int[]a, int idx, int x) {
		int[] result = new int[a.length+1];
		for (int i = 0; i < result.length; i++) {
			if(i < idx) {
				result[i] = a[i];
			}
			else if(i > idx){
				result[i] = a[i-1]; 
			}
			
			else {
				result[i] = x;
			}
		}
		return result;
	}
	
	
	// 7-29
	
	boolean addMatrix(int[][] x, int[][] y, int[][] z) {
			if (x.length != y.length) {
				return false;
			}
			for (int i = 0; i < x.length; i++) {
				for (int j = 0; j < x[i].length; j++) {
					if (x[i].length != y[i].length) {
						return false;
					}
					z[i][j] = x[i][j] + y[i][j];
				}

			}
			return true;
		
	}
	
	
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
	
	
	
	
}
