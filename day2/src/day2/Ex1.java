

package day2;
import java.util.Calendar;


public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int score = 85;
	System.out.println((score > 90)? "A" : (score > 80) ? "B" : (score > 70)? "C":(score> 60)? "D":"F");
	
	int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
    String ampm;
    ampm = (hour > 12) ? "오후":"오전";
    System.out.println("지금 시간은 "+hour+"시이고, "+ampm+"입니다.");
	}
	
}
