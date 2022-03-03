

package day2;
import java.util.Calendar;


public class Ex1 {

	public static void main(String[] args) {
	/*
	산술 연산자 +  -  *  /  %
	증감 연산자 ++ --
	비트 연산자 &(and) |(or)
	비교 연산자 < > <= >= == !=
	대입 연산자 = += -= *= /=
	삼항 연산자 (조건식)? true: false
	
	a++ 후위형
	++a 전위형
	
	 */
			
	int score = 85;
	String credit = ((score >= 90)? "A" : (score >= 80) ? "B" : (score >= 70)? "C":(score>= 60)? "D":"F");
	System.out.println(credit);
	
	int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
    String ampm;
    ampm = (hour > 12) ? "오후":"오전";
    System.out.println("지금 시간은 "+hour+"시이고, "+ampm+"입니다.");
	}
	
}
