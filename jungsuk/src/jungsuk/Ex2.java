package jungsuk;

public class Ex2 {

	public static void main(String[] args) {

		//3-3
		
		int num = 456;
		System.out.println(num/100*100);
		
		// output: 400
		
		
		//3-4
		int numOfapples = 123;
		int sizeOfBucket = 10;
		int numOfBucket = numOfapples / sizeOfBucket + 1;
		
		System.out.println("필요한 바구니의 수:"+numOfBucket);
		
		
		//3-5
		int num2 = 10;
		System.out.println((num2 > 0)? "양수":(num2 < 0)? "음수":"0");
		
		
		//***3-6 
		int fahrenheit = 100;
		// 화씨를 섭씨로 변환하는 공식 대입 
		float celcius = ((float)5/9 * (fahrenheit - 32))*100;
		// 소수점 셋째자리에서 반올림
		
		
		
		// c = 5/9 * (f-32)
		System.out.println("Fahrenheit:"+fahrenheit);
		System.out.println("Celcius:"+celcius);

	}

}
