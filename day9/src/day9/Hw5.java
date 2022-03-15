package day9;

import java.util.Arrays;
import java.util.Scanner;

public class Hw5 {

	public static void main(String[] args) {

		// 4-30
		System.out.println("숫자 맞추기 게임 시작!");	
		System.out.println("0 부터 99 사이의 숫자를 맞추세요.");
		int cnum = (int)(Math.random()*100);
		System.out.println(cnum);
		int pnum = 6;
		int num = 0;
		do {
			System.out.printf("남은 횟수 %d회, 어떤 숫자일까?:", pnum);
			Scanner sc = new Scanner(System.in);
			num = sc.nextInt();
			if( num < cnum ) {
				System.out.println("더 큰 숫자 입니다.");
				pnum--;
			}
			else if( num > cnum ) {
				System.out.println("더 작은 숫자 입니다.");
				pnum--;
			}
			else {
				break;
			}
			
		} while ( pnum > 0 );
		
		System.out.println(pnum + " 회만에 맞추었습니다");
		System.out.println("정답은 " + cnum + " 입니다");
		
		
		// 6-1
		
		double[] a = new double[5];
		ArrPro arr1 = new ArrPro();
		arr1.printArr(a);
		
		
		// 6-2 	
		int[] a2 = new int[5];
		for(int i = 0; i < a2.length; i++) {
			a2[i] = 5-i;
			System.out.printf("a[%s] = %s %n", i , a2[i]);
		}

		
		// 6-3
		
		double[] a3 = new double[5];
		for(int i = 0; i< a3.length; i++) {
			a3[i] = ( i +1 ) * 1.1;
			System.out.printf("a[%s] = %s %n", i, a3[i]);

		}
		
		// 6-6
/*		
		1. 배열의 길이 입력받기
		2. 입력받은 수만큼 배열 생성
		3. 개별 요소 입력받기
		4. 개별 요소를 배열의 해당 인덱스에 넣어주기
		5. 배열 출력하기
		6. 주어진 형태로 배열 출력하기 
		
*/
		
//		배열의 길이 입력받기
		System.out.println("요소 수: ");
		Scanner sc = new Scanner(System.in);
		int lnum = sc.nextInt();
		
//		입력 받은 수를 길이로 하여 배열 생성 
		int[] a4 = new int[lnum];
		

//		개별 요소의 값을 입력받고 배열에 값을 넣어주기
		int count = 0;
		do {
			System.out.println("요소 값: ");
			int unum = sc.nextInt();
			a4[count] = unum;
			count++;
		} while(count != lnum);

//		배열 출력
		ArrPro arr4 = new ArrPro();
		arr4.printArr(a4);
		
//		정해진 형태로 배열 출력
		String result = "a = {";
		for (int each: a4) {
			if (each == a4[a4.length-1]) {
				result += each + "}";
			}
			else{
				result += each + ",";
			}
		}
		System.out.println(result);
	}

}
	


class ArrPro {

	void printArr(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("a[%s] = %s %n", i, a[i]);
		}
	}
	
	void printArr(double[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("a[%s] = %s %n", i, a[i]);
		}
	}
	
	
}