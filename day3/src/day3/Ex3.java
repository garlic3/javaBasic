package day3;

import java.util.Random;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		System.out.println("숫자를 입력해주세요");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		switch(num) {
		case 0:
			System.out.println("입력하신 숫자는 0 입니다");
			break;
			default:
			System.out.println("입력하신 숫자는 0이 아닙니다");
		}
		
	/*	Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String ans = (num == 0) ? "입력하신 숫자는 0입니다":"입력하신 숫자는 0이 아닙니다.";
		System.out.println(ans);*/
		
		System.out.println("점수를 입력해주세요");
		Scanner sc = new Scanner(System.in);
		String score = sc.nextLine();
		
		char first = score.charAt(0);
		char second = score.charAt(1);
		
		int fn = Character.getNumericValue(first);	
		int ln = Character.getNumericValue(second);

		String deg = (fn == 9) ? "A" :(fn == 8)? "B" :(fn == 7)? "C":(fn>5) ? "D":"F";
		String extra = (ln > 6) ? "+" : (ln > 2)? "-" : "";
		
		
		if (score.equals("100")) {
			System.out.println("당신의 점수는 100점이고 학점은 A+입니다 축하합니다!");
		} 
		else if(deg.equals("F")){
			extra = "";
			System.out.printf("당신의 점수는 %s점이고 학점은 %s%s입니다 노력하세요!",score,deg,extra);

		
		}
				
		else {
			System.out.printf("당신의 점수는 %s점이고 학점은 %s%s입니다",score,deg,extra);
			}
		
		

		
		
		System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력해주세요");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		int comp = (int)(Math.random()*3)+1;
		System.out.printf("당신은 %s입니다%n컴은 %s입니다%n", choice, comp);
		
		String win = "당신이 이겼습니다";
		String lose = "당신이 졌습니다";
		String draw = "비겼습니다";
		
		switch(choice) {
		case 1:
			String game = (comp == 1)? draw :(comp == 3)? win:lose;
			System.out.println(game);
			break;
		case 2:
			game = (comp == 2)? draw:(comp == 1)? win:lose;
			System.out.println(game);
			break;
		case 3:
			game = (comp == 3)? draw:(comp == 2)? win:lose;
			System.out.println(game);
			break;
				
	
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 a 입력해주세요");
		int num_1 = sc.nextInt();
		System.out.println("숫자 b 입력해주세요");
		int num_2 = sc.nextInt();
		String result = (num_1 > num_2)? "a가 크다":(num_1 < num_2)? "b가 크다" : "같다";
		System.out.println(result);

		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자a 입력해주세요");
		int num_1 = sc.nextInt();
		System.out.println("숫자b 입력해주세요");
		int num_2 = sc.nextInt();
		System.out.println("숫자c 입력해주세요");
		int num_3 = sc.nextInt();
		
		int min = num_1;
		min = (num_2 > num_3)? num_1:(min > num_2)? num_2: (min > num_3)? num_3: num_1;
		System.out.println(min);
		
		/*
		 if(min > b){
		 min = b;
		 }
		 if(min > c){
		 min = c;
		 }
		 System.out.println(min);
		 */
		
		
		
//		100 ~ 999 중에서 입력받은 값이 3의 양의 정수인지 판별하기 
		
		int num = 0;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("100~999중에서 숫자를 입력하세요");
			num = sc.nextInt();
		}while(num % 3 != 0);
		System.out.printf("입력한 값은 %s입니다", num);
		

	
		
		Random random = new Random();
		int comp = 10 + random.nextInt(90);
		int guess = 0;
		System.out.println("10부터 99까지의 숫자를 맞추세요");
		do{
			System.out.println("어떤 숫자일까요?");
			Scanner sc = new Scanner(System.in);
			guess = sc.nextInt(); 
			if(guess > comp) {
				System.out.println("더 작은 숫자입니다");
			}
			else if (guess < comp){
				System.out.println("더 큰 숫자입니다");
			}
		}while(guess != comp);
		System.out.println("정답입니다");
	
		
		
		
		
		
	}

}
