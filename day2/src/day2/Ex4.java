package day2;

public class Ex4 {

	public static void main(String[] args) {
//		q1. 1부터 1000까지의 자연수 중 3의 배수의 합을 계산
//		int sum = 0;
//		for(int i=1; i <=1000; i++) {
//			if (i % 3 == 0) {
//				sum += i;
//			}
//		}
//		System.out.println(sum);

//		for(int i = 1; i < 6; i++) {
//			for(int j = 1; j < i; j ++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
//		for (int i = 1; i < 6; i++) {
//			for(int j = 6; j > i; j--) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
	
//		정삼각형 별모양 찍
	
		int scores[] = {70,60,55,75,95,90,80,80,85,100};
		int sum = 0;
		int max = 0;
		int min = scores[0];
		double avg = 0;
		for (int score:scores) {
			sum += score;
			avg = sum / scores.length;
			if (score > max) {
				max = score;
			}
			else if(score < min) {
				min = score;
			}
			
		}
		System.out.println("합계"+sum);
		System.out.println("평균"+avg);
		System.out.println("최대"+max);
		System.out.println("최소"+min);
	}
}
