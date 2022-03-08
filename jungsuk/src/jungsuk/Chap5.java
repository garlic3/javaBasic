package jungsuk;

import java.util.Arrays;

public class Chap5 {

	public static void main(String[] args) {
		String[] strArr = {"가위","바위","보"};
		System.out.println(Arrays.toString(strArr));
		
		for (int i=0; i < strArr.length; i++) {
			int ran = (int)(Math.random()*3);
			String ts = strArr[i];
			strArr[i] = strArr[ran];
			strArr[ran] = ts;
			System.out.println(strArr[ran]);
		}
		System.out.println(Arrays.toString(strArr));
		
	
/*
  1.String 클래스는 문자 배열 char[]와 매서드(기능)를 결합한것
  2.String 클래스는 내용을 변경할 수 없음(read 만 가능)
  		
 */
		
	 String string = "ABCDE";
	 char ch = string.charAt(2);
	 System.out.println(ch);
	 
	 String str2 = string.substring(1,4);
	 System.out.println(str2);
	 
	 
	 
	}

}
