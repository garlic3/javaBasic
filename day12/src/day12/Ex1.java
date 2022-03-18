package day12;

public class Ex1 {

	public static void main(String[] args) {
		// 3 6 9 게임  100이하의 숫자중...

	    // 1    2     짝     4     5       짝    7      8       짝       10
	    // 11   12    짝
	    // 21
	    // 짝   짝    짝짝   짝     짝      짝짝
	    // 41
	    // 51
	    // 짝
	    // 71
	    // 81
	    // 짝                                                   짝짝      100
		
		Check check = new Check();
		
		for (int i = 1; i < 101; i++) {
			int count = 0;
			String snum = i + "\t";
			
			
			// 10보다 작은 수에서 3,6,9의 개수 세기
			if (i > 10) {
				count = check.checkThree(snum);
			}

			snum = (count == 1) ? "짝\t" : (count == 2) ? "짝짝\t" : i + "\t";

			// 10의 배수라면 줄바꿈  
			if (i % 10 == 0) {
				snum += "\n";
			}
			// 10보다 작고 3의 배수라면
			else if (i < 10 && i % 3 == 0) {
				snum = "짝\t";
			}
			System.out.print(snum);
			
		}
		
		
	}

}

class Check {
		int checkThree(String snum) {
			int count = 0;
			// 첫번째 자리에 3,6,9가 있다면 count = 1 
			if (snum.charAt(0) == '3'||snum.charAt(0) == '6'||snum.charAt(0) == '9') {
				count++;
			}
			// 두번째 자리에 3,6,9가 있다면 count = 2
			if (snum.charAt(1) == '3'||snum.charAt(1) == '6'||snum.charAt(1) == '9') {
				count++;
			}
			return count;
		}
		
}
