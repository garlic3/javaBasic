

package day3;

import java.util.Scanner;
public class Ex2 {

	public static void main(String[] args) {

//  break -> 탈출 제어 키워드
 				
		for(int i = 0; i < 10; i++) {
			if(i == 5) {
				break;
			}
		}
		
//		out: //위치 지정 레이블 -> 외부에 위치한 out 경로까지 빠져나옴 
		for(int i = 0; i <10; i ++) {
			for(int j = 0; j < 10; j ++) {
				if(j ==3) {
					break out;
				}
			System.out.println(i + " " + j);
			}
		}
		
//	 	continue 제어 키워드 -> 특정구문을 실행하지 않고 건너뛰는 용도로 사용
		for (int a = 0; a < 10; a++) {
			if(a == 3) {
				continue;
			}
			System.out.println(a + " ");
			
		}
		
		for(int c = 0; c < 5; c++) {
			for(int d = 0; d < 5; d++) {
				if ( d == 3) {
					continue;
				}
				System.out.println(c + ", " + d);
			}
		}
		
		for(int i = 10; i > 0; i -= 2) {
			System.out.println(i);
		}
		
		int i = 10;
		while(i > 0) {
			System.out.println(i);
			i -= 2;
			
		}
		
		for(int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				if(i ==2) {
					continue;
				}
				if(j == 1) {
					break;
				}
				System.out.println(i + " " + j);
				System.out.println("A");
			}
		}
		
		for(int i = 0; i < 10; i ++) {
			for(int j = 0; j < 5; j++) {
				if( i ==3 & j ==2) {
					i = 10; 
					j = 5;
					continue;
				}
				System.out.println(i+" "+ j);
			}
		}
		
//		메뉴선택
//		1) 빅맥 
//		2) 팝콘
//		3) 백반 
		
		while(true) {
			System.out.println("원하는 메뉴를 선택하세요");
			System.out.println("메뉴선택");
			System.out.println("1)빅맥");
			System.out.println("2)팝콘");
			System.out.println("3)백반");
			Scanner sc = new Scanner(System.in);
			int menu = sc.nextInt();
			
			if (menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				break ;
			}
			if(menu <0 || menu >3){
				System.out.println("메뉴를 잘못 선택하셨습니다(종료:0)");
			}
			
			if( menu <= 3) {
				System.out.printf("선택하신 메뉴는 %d번 입니다%n", menu);
				continue;
			}
	
		}

		
		
	}

}
