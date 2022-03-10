package jungsuk;

public class Ex {

	public static void main(String[] args) {
//		///2-8
//		int x = 1;
//		int y = 2;
//		int z = 3;
//		
//		int tnum = x;
//		x = y;
//		y = z;
//		z = tnum;
//		
//		
//		System.out.println("x=" + x);
//		System.out.println("y=" + y);
//		System.out.println("z=" + z);
//		/// x = 2 y= 3 z= 1
//		
//		
//		//3-3
//		
//		int num = 456;
//		System.out.println(num/100*100);
//		
//		// output: 400
//		
//		//3-4
//		int numOfapples = 123;
//		int sizeOfBucket = 10;
//		int numOfBucket = numOfapples / sizeOfBucket + 1;
//		
//		System.out.println("필요한 바구니의 수:"+numOfBucket);
//		
//		//3-5
//		int num2 = 10;
//		System.out.println((num2 > 0)? "양수":(num2 < 0)? "음수":"0");
//		
//		//3-6
//		int fahrenheit = 100;
//		float celcius = (float)5/9 * (fahrenheit - 32);
//		// c = 5/9 * (f-32)
//		System.out.println("Fahrenheit:"+fahrenheit);
//		System.out.println("Celcius:"+celcius);
//				
//		
		//4-2
		int sum = 0;
		for (int i = 1; i < 21; i++) {
			if(i % 2 == 0 || i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println("합계:"+sum);
		
		//4-3
		sum = 0;
		for (int j = 1; j < 11; j++) {
			for(int k = 1; k < 11; k++) {
				sum += k;
			}
		}
		System.out.println("합계:"+sum);
		
		
		//4-4

		sum = 0;
		int n;
		int m;
		for (n = 1, m = -2; ; n += 2, m -= -2) {
			sum = n + m;
			if(sum >= 100) {
				System.out.println("n:"+ n);
				System.out.println("m:"+ m);
				System.out.println("합계:" + sum);
				break;
			}
		}
		
		
	}

}
