package day4;

public class Ex1 {

	public static void main(String[] args) {
	
		String str = "내 이름은 [홍길동]입니다. 나이는[15]살입니다";
	    String name = str.substring(str.indexOf("홍"),str.lastIndexOf("동")+1);
	    String age = str.substring(str.indexOf("1"), str.lastIndexOf("5")+1);
	    System.out.println(name);
	    System.out.println();
	}

}
