package day6;

public class Ex2_1 {

	public static void main(String[] args) {
		// 생성자 오버로딩
		// 생성자의 모양(개수, 자료형)에 따라 객체를 생성하는 방법이 결정
		
		K k1 = new K();
		K k2 = new K("할로");
		K k3 = new K(3,5);
		
		int num = 1;
		int num2 = 3;
		String str = "할로";
		
		K k5 = new K(num, num2);
		K k6 = new K(str);
		
		
	}

}


class K {
	K() {
		System.out.println("첫번째 생성자");
	}
	
	K(String b){
		System.out.println("문자입니다");
	}

	K(int a, int b){
		System.out.println("숫자입니다");
	}
}