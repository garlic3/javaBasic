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
		
	
		for (int i = 1; i < 101; i++) {
			int count = 0;
			String result = i + "\t";
			
			 
			// 10보다 크고 3,6,9로 끝나면
			
			if (i > 10 && (result.charAt(1) == '3'||result.charAt(1) == '6'||result.charAt(1) == '9' )) {
				count ++;
			}
			// 10보다 크고 3,6,9로 시작하면
			if (i > 10 && (result.charAt(0) == '3'||result.charAt(0) == '6'||result.charAt(0) == '9')) {
				count ++;
			}
			// 숫자에 3,6,9개 2개라면 짝짝 1개라면 짝
			result = (count == 1) ? "짝\t" : (count == 2) ? "짝짝\t" : i + "\t";

			// 10의 배수라면 줄바꿈  
			if (i % 10 == 0) {
				result += "\n";
			}
			// 10보다 작고 3의 배수라면
			if (i < 10 && i % 3 == 0) {
				result = "짝\t";
			}
			System.out.print(result);
			
		}
		
		
		
		
	}

}
