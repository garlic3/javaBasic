package day11;

import java.util.Arrays;
import java.util.Scanner;

public class Hw7 {

	public static void main(String[] args) {

		// 6-15
		System.out.println("해당 월의 영어 단어를 입력하시오.");
		System.out.println("첫 글자는 대문자, 나머지는 소문자로 입력하세요.");
		
		DatePro dp = new DatePro();
		int num = dp.getrn(12, 1);
		String answer = dp.makerm(num); 
		
		int replay = 1;
		do {
			
			System.out.printf("%s월:", num);
			Scanner sc = new Scanner(System.in);
			String month = sc.nextLine();			
			
			if (month.equals(answer)) {
				System.out.println("정답입니다. 다시 한번? 1...Yes/0..No : ");
				replay = sc.nextInt();
				int rnum = num;
				while(rnum == num) {
				rnum = dp.getrn(12, 1);
				}
				answer = dp.makerm(rnum);
				
				}
			else {
				System.out.println("틀렸습니다");
			}
			
		}while(replay != 0);
		
 
		// 6-16
		DatePro dp = new DatePro();
		int num = dp.getrn(6, 0);
		String[] kr = new String[] {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
		String[] answerList = new String[]{"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		
		System.out.println("요일명을 영어 소문자로 입력하시오");
		
		int replay = 1;
		do {
			System.out.println(kr[num] +":");
			Scanner sc = new Scanner(System.in);
			String answer = sc.nextLine();
			if(answer.equals(answerList[num])) {
				System.out.println("정답입니다. 다시 한번? 1...Yes/0...No : ");
				replay = sc.nextInt();
				int tnum = num;
				while(num == tnum) {
				num = dp.getrn(6, 0);
				}
			}
			else {
				System.out.println("틀렸습니다");
			}
		}while(replay != 0);
		
		// 6-18
//		GetArr garr = new GetArr();
//		int[][] a = garr.makeArr(4, 3, "a");
//		int[][] b = garr.makeArr(3, 4, "b");

		/*
		 a              b 			answer
		 1 2 3        4 3 2 1      16 10 16 18
		 2 3 1        3 2 1 4 	   19 13 11 17
		 3 1 2        2 1 4 3 	   19 13 15 13
		 2 1 3                     17 11 17 15
		 */

		int[][] a = {
				{1,2,3},
				{2,3,1},
				{3,1,2},
				{2,1,3}
		};
		
		int[][] b = {
				{4,3,2,1},
				{3,2,1,4},
				{2,1,4,3}
		};
		
		int[][] answer = new int[4][4];
		int sum = 0;
		
		for (int k = 0; k < 4; k++) {
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 3; j ++) {
				sum += a[k][j] * b[j][i];
				
				}
				answer[k][i] = sum;
				sum = 0;
			}
		}
			
		for (int z = 0; z < answer.length; z++) {
			for (int w = 0; w< answer[z].length; w++) {
				System.out.printf("answer[%s][%s] = %s %n", z,w,answer[z][w]);
			}
		}

		
		// 7-1
		Sign sg = new Sign();
		
		System.out.println("정수 x : ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println("signOf(x)는 " + sg.signOf(x)+ "입니다.");
		

		// 7-2
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 a: ");
		int a = sc.nextInt();
		System.out.println("정수 a: ");
		int b = sc.nextInt();
		System.out.println("정수 a: ");
		int c = sc.nextInt();
		
		Num num = new Num();
		int min = num.min(a, b, c);
		System.out.println("최솟값은 " + min + "입니다");
		
		
		
	}

}

class DatePro {
	String makerm(int num) {
		String[] answerList = new String[] {"January", "February", "March","April","May",
				"June","July","August","September","October","November","December"};
		String answer = answerList[num-1];
		return answer;
	}
	
	int getrn(int a, int b) {
		int bnum = ((int)(Math.random()*a)+b);
		return bnum;
	}
}

class GetArr {
	int[][] makeArr(int a, int b, String name) {
		int [][] arr = new int[a][b];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
			System.out.println("행렬"+ name + "의 요소를 입력하세요 ");
			System.out.printf(name+ "[%s][%s] : ", i, j);
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			arr[i][j] = num;
			}
		}
		return arr;
	}
}

class Sign {
	int signOf(int x) {
		if (x > 0) {
			return 1;
		}
		else if(x == 0) {
			return 0;
		}
		else {
			return -1;
		}
		
	}
}

class Num {
	int min(int a, int b, int c) {
		int min = a;
		if(a >= b && c >= b) {
			min = b;
		}
		else if(a >= c && b >= c) {
			min = c;
		}
		else {
			min = a;
		}
		return min;
	}
}