package day3;

import java.util.Scanner;

public class Study {

	public static void main(String[] args) {

		int value = 0;
		int sum = 0;
		do {
			System.out.println("숫자를 입력해주세요");
			Scanner sc = new Scanner(System.in);
			value = sc.nextInt();
			sum += value;
		}while(sum < 100);
		
		System.out.println(sum);
	}

}
