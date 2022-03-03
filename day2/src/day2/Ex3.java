package day2;
import java.util.Calendar;
import java.util.Scanner;


public class Ex3 {

	public static void main(String[] args) {
		int month = Calendar.getInstance().get(Calendar.MONTH)+1;
		 String season = "";
		 switch(month) {
		 case 12: case 1: case 2:
			 season = "겨울";
			 break;
		 case 3: case 4: case 5:
			 season = "봄";
			 break;
		 case 6: case 7: case 8:
			 season = "여름";
			 break;
		 case 9: case 10: case 11:
			 season = "가을";
			 break;
//			 ctrl + shift + o = 여러개를 모두 import 
//			 ctrl + space = 해당 라이브러리만 import 
			 
		 }
//		 System.out.println("지금은 "+ month +"월이고, "+ season +"입니다.");
		
//		 입력받아서 출력하기
//		 Scanner sc = new Scanner(System.in);
//		 System.out.println("월을 입력하세요");
//		 int mon = sc.nextInt();
		 
		 
//		 for 문에서의 무한루프 
//		 for (int i = 0;   ; i++) {
//			System.out.print(i + " ");	
//		 }
	
		 
//		 이중 for문
		 for(int i = 1; i <= 3; i ++) {
			 for(int j = 1; j <= 5; j ++) {
				 System.out.println(i + "일차"+ j + "교시");
			 }
		 }
//		for each
//		String name = "홍길동"; 변수 1개에 데이터 1개 저장
//		array 배열 사용 
		String[] names = {"홍길동","이몽룡","성춘향"};
		int[] numbers = {1,2,3,4,5};
		
		for(String name: names) {
			System.out.println(name);
		}
		
		
		
		 
	}

}
