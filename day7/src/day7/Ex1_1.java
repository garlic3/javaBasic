package day7;

public class Ex1_1 {

	public static void main(String[] args) {
		C c = new C();
		c.averageScore(1);
		c.averageScore(1,2);
		c.averageScore(1,2,3);
		c.averageScore(1,2,3,4);
	}

}


class C {
	double avg;
	void averageScore (int...values) {
		int sum = 0;
		for(int each: values) {
			sum += each;
		}
		avg = (double)sum / values.length;
		System.out.println(avg);
	}
}
	