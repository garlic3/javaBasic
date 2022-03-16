package day10;

import java.util.Arrays;
import java.util.Scanner;

public class Hw6 {

	public static void main(String[] args) {
		
		// 6-8		
		Arr arr = new Arr();
		int[] a = arr.makeArr();
		arr.inputArr(a,100);
		arr.printArr(a,"a");
		
		System.out.println("찾을 숫자: ");
		Scanner sc = new Scanner(System.in);
		int answer = sc.nextInt();
		
		// 가장 앞에 있는 요소 찾는 프로그램 
		int i = 0;
		while(true) {
			if(a[i] == answer) {
				System.out.printf("그 값은 a[%s]에 있습니다 %n", i);
				break;
				
			}
			i++;
		}
		
		// 가장 뒤에 있는 요소 찾는 프로그램
		int j = a.length - 1;
		while(true) {
			if(a[j] == answer) {
				System.out.printf("그 값은 a[%s]에 있습니다 %n", j);
				break;
			}
			j--;
		}
		
		// 6-11
		Arr arr = new Arr();
		int[] a = arr.makeArr();
		arr.inputArr(a, 10);
	
		int i = 1;
		while(i != a.length-1) {
			a[i] = (int)((Math.random()*10)+1);
			if (a[i] != a[i-1]) {
				i++;
			}
		}
		
		arr.printArr(a, "a");
		
		// 6-12
		Arr arr = new Arr();
		int[] a = arr.makeArr();
		arr.inputArr(a, 10);
		
		int i = 1;
		int count = 0;
		
		while(i < a.length) {
			for (int j = 0; j < i; j++) {
				if (a[j] == a[i]) {
					count++;
				}
			}
			if(count == 0) {
				i++;
			}
		}
		
		for(int i = 1; i < a.length; i++) {
			int j = 0;
			while(j < i) {
				if ( a[i] == a[j]) {
					a[i] = ((int)(Math.random()*10)+1);
				}
				j++;
				
			}
		}
		arr.printArr(a, "a");
		
		// 6-13
		Arr arr = new Arr();
		int[] a = arr.makeArr();
		arr.inputArr(a, 100);
		arr.printArr(a, "a");
		
		System.out.println("요소를 섞었습니다");
		
		for (int i = 0; i < a.length; i++) {
			int k = (int)(Math.random()*a.length);
			int tem = a[i];
			a[i] = a[k];
			a[k] = tem;
		}
		arr.printArr(a,"a");
		
		// 6-14
		Arr arr = new Arr();
		int[] a = arr.makeArr();
		arr.inputArr(a, 15);
		arr.printArr(a, "a");
		
		int[] b = Arrays.copyOf(a, a.length);
			
		for (int c = 1; c < b.length; c++) {
			for (int d = 0; d < c; d++) {
				if ( b[d] > b[c]) {
					int tem = b[c];
					b[c] = b[d];
					b[d] = tem;
				}
			}
		}
		arr.printArr(b, "b");
		
			
			
	}

}

class Arr {
	int[] makeArr() {
		System.out.println("요소 수:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		return arr;
				
	}
	void printArr(int[] a, String arrayName) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%s[%s] = %s%n", arrayName ,i, a[i]);
		}
	}
	
	int[] inputArr(int[] a, int j) {
		for (int i = 0; i < a.length; i++) {
			a[i] = ((int)(Math.random()*j) + 1);
		}
		return a;
	}
}