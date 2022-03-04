package day3;

public class Ex1 {

	public static void main(String[] args) {
/*
 조건을 만족하는 동안 실행구문이 게속 반복 
 while(조건) {
 실행구문;
// }
// 
// */
		int num = 0, sum = 0;
		while(sum < 100) {
			sum += num;
			num++;
		}
		System.out.println((num-1)+"까지의 합 = " + sum);
		
		
		int a = 0;
		while(a<10) {
			System.out.println(a + " ");
			a ++;
		}
		System.out.println();
		
		for(int b = 0; b < 10; b++) {
			System.out.println(b + " ");
			
		}
	
		int c = 0;
		while(true) {
			if (c > 10) {
				break;
			}
			System.out.println(c);
			c++;
		}
/*		
 do-while
 do {
 	실행구문
 	} while(조건문);
*/
		
		
		int i = 0;
		while(i < 3) {
			int j = 0; // 초기화 위치 중요!
			while(j < 5) {
				System.out.println(i + " "+ j);
				j++;
				
			}
			i++;
		}
		
		
		
		
	}
}
