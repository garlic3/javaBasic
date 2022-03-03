package day1;

public class Ex3 {

	public static void main(String[] args) {


//		형변환 type casting
//		boolean 을 제외한 기본 자료형은 형변환 가능
		
		int value = (int)5.3;
		System.out.println(value); // double의 값이 int로 변환되면서 소수점 아래값이 삭제
		
//		자동타입변환(자바가 자동으로 수행) 
//		수동타입변환(개발자가 직접 수행)
//		크기가 작은 자료형을 큰 자료형에 대입할때는 손실이 발생 하지 않음 -> 자동타입변환됨 up casting
		
		float ex_1 = 3; //자동타입변환  
		long ex_2 = 5; //자동타입변환
		
		int ex_3 = (int)3.5; // 0.5의 데이터값 손실이 발생, 수동타입변환 
		float ex_4 = (float)7.5; // double 7.5 의 데이터값 손실이 발생되지 않음, 수동타입변환 
		
//		자료형 간의 연산
//		boolean 을 제외한 기본 자료형은 서로 연산 가능
//		단, 같은 자료형끼리만 가능하며 결과값 역시 같은 자료형만 나옴
//		int 보다 작은 자료형의 연산결과는 int가 나옴(cpu에서의 연산 최소단위가 int이기 때문)
		
		
		
	}

}
