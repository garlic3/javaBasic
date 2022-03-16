package day10;

public class Ex2 {

	public static void main(String[] args) {
 /*
   exception 예외
   예외: 연산오류, 숫자 포맷오류 등과 같이 상황에 따라 개발자가 해결 할 수 있는 '오류'
   에러: 자바에서 발생하는 오류로 개발자가 해결할 수 없는 오류
   
   예외의 최상위 클래스 Exception
   에러의 최상위 클래스 Error
   
   -> Throwable 클래스를 상속받고 있음(Throwable 클래스의 모든 기능을 포함)
   
   Exception 클래스 -> 일반예외 클래스(checked exception), 실행예외 클래스(unchecked exception)
   
   일반 예외 클래스 : 컴파일 전에 예외 발생 문법을 검사
   실행 예외 클래스 : 실행 중에 체크. 예외 처리 하지 않더라도 실행됨.
   ( 프로그램 실행중에 프로그램이 강제 종료되는 이유는 대부분 실행 예외 때문)
   
   1. 일반 예외 클래스: 예외 처리를 하지 않으면 컴파일 자체가 불가능
   IngerrupteException - Thred.sleep(시간)
   일정 시간 동안 해당 쓰레드를 일시 정지 상태로 만드는 Thread 클래스의 매서드.
   이 매서드는 일반 예외가 발생할 수 있기 때문에 반드시 예외처리를 해야함.
   예외 처리를 생략하면 문법 오류가 발생해서 컴파일 자체가 불가능
   
   classNotFoundException , IOException, FileNotFoundException, CloneNotSupportedException
   
   InterruptedException 
   Thread.sleep(1000);
   
   ClassNotFoundException
   Class cls = Class.forName("java.lang.Object");
   
   2. 실행 예외 클래스: 예외 처리 없이 컴파일과 실행은 가능하지만 실행 중에 실행 예외가 발생하면
   프로그램이 강제 종료됨
   
   ArithmeticException 
   Arithmetic = '산술', '연산'
   연산 자체가 불가능 할때 발생되는 실행 예외
   System.out.println(3/0);
   
   ClassCastException 
   상속 관계에 있는 클래스 간의 업캐스팅은 항상 가능하지만 다운캐스팅은 가능할수도 불가능할수도 있음
   다운 캐스팅이 불가능 한 상황에서 다운 캐스팅을 시도할 때 발생 
   
   A a = new A();
   B b = (B) a;
   
   class A{}
   class B extends A {}
   
   ArrayIndexOutOfBoundsException
   배열의 인덱스를 잘못 사용할 때 발생
   
   int [] a = {1,2,3};
   System.out.println(a[3]);

   자바에서는 예외 처리 구문이 있으면 적절히 예외가 처리됐다고 판단 -> 프로그램을 강제 종료하지 않음
  */
		
	
	}

}
