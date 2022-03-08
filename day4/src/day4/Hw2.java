package day4;

import java.util.Scanner;

public class Hw2 {

	public static void main(String[] args) {
		//2-11
		int pnum = (int)(Math.random()*9)+1;
		int mnum = (int)(Math.random()*-9)-1;
		int dnum = (int)(Math.random()*90)+10;
		
		System.out.println("3개의 난수를 생성했습니다");
		System.out.println("한 자리 양의 정수:"+pnum);
		System.out.println("한 자리 음의 정수:"+mnum);
		System.out.println("두 자리 양의 정수:"+dnum);
		
		//2-14
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력해주세요");
		String name = sc.nextLine();
		String lname = name.substring(0,1);
		String fname = name.substring(1);
		
		System.out.printf("성:%s%n이름:%s%n", lname, fname);
		System.out.println("안녕하세요. "+name+" 씨.");
		
		
		//3-3
		
		Scanner sc = new Scanner(System.in);
		System.out.println("변수 A 입력");
		int a = sc.nextInt();
		System.out.println("변수 B 입력");
		int b = sc.nextInt();
		
		
		System.out.println("변수 A:"+a);
		System.out.println("변수 B:"+b);
		
		if(a % b == 0) {
			System.out.println("B는 A의 약수 입니다.");
		}
		
		
		//3-5
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요");
		int num = sc.nextInt();
		String result = "0";
		if (num > 0) {
			result = "양수";
		}
		else if(num < 0) {
			result = "음수";
		}
		
		System.out.println("정수값:"+num);
		System.out.printf("값이 %s입니다", result);

		
		//3-7
		Scanner sc = new Scanner(System.in);
		System.out.println("a값을 입력하세요");
		int a = sc.nextInt();
		System.out.println("b값을 입력하세요");
		int b = sc.nextInt();
		String result = "a와 b가 같 다";
		if (a > b) {
			result = "a가 크다.";
		}
		else if (a < b) {
			result = "b가 크다.";
			}
		System.out.println("변수 a:"+a);
		System.out.println("변수 b:"+b);
		System.out.println(result);
		
		
		
		
	}

}
