
package day6;

import java.util.Scanner;

public class Hw3 {

	public static void main(String[] args) {

	    //3-15
	    Scanner sc = new Scanner(System.in);
	    System.out.println("첫번째 정수를 입력해주세요");
	    int num1 = sc.nextInt();
	    System.out.println("두번째 정수를 입력해주세요");
	    int num2 = sc.nextInt();
	    System.out.println("세번째 정수를 입력해주세요");
	    int num3 = sc.nextInt();

	    int min = num1;
	    min = (num2 < num3) ? ((min < num2) ? num1 : num2) : ((min < num3) ? num1 : num3);
	    
//	    if문 사용
	    if (num2 < num3){
	      if (min > num2){
	        min = num2;
	      }
	    }
	    else if(num2 > num3){
	      if (min > num3){
	        min = num3;
	      }
	    }  
	  
	    System.out.println("최솟값:" + min); 
	    }

	    //3-21
	    System.out.println("월을 입력해주세요");
	    int month = sc.nextInt();
	    String season = "";
	    switch(month){
	      case 3: case 4: case 5:{
	        season = "봄";
	        break;
	      }
	      case 6: case 7: case 8:{
	        season = "여름";
	        break;
	      }  
	      case 9: case 10: case 11:{
	        season = "가을";
	        break;
	      }  
	      case 12: case 1: case 2:{
	        season = "겨울";
	        break;
	      }
	      default:{
	       System.out.println("그런 월은 없습니다"); 
	      }
	    }
	    System.out.println(season);


	    //4-2
			int num = 0;
			do {
				System.out.println("세자리 양의 정수를 입력해주세요");
				Scanner sc = new Scanner(System.in);
				num = sc.nextInt();
				System.out.println("세 자리의 정숫값:" + num);
			} while(num < 100 || num > 999);
			System.out.println("입력한 값은 " + num + " 입니다.");

	    //4-14
	    System.out.println("1부터 n까지의 합을 구합니다");
	    System.out.println("n의 값:");
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int sum = 0;
	    for (int i = 1; i <= n; i++){
	      sum += i;
	    }
	    System.out.printf("1부터 %s까지의 합은 %s입니다", n, sum);

	    // 4-21
	    System.out.println("정방형을 표시합니다");
	    System.out.println("단수는:");
	    Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();
	    for (int i = 0; i < num; i++){
	      for (int j = 0; j < num; j++){
	        System.out.print("*");
	      }
	      System.out.println();
	    }
	    

}
