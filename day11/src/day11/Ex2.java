package day11;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		AA aa = new AA();
		aa.checkScore(85);
		aa.checkScore(110);
		
	}

}


class AA {
	void checkScore(int num) throws OverException {
	if ( num > 100 ) {
		throw new OverException();
		}
	else if (num < 0) {
		throw new MinuseException();
		}
	else {
		System.out.println("정상적인 값입니다");
	}
	}
}
class OverException extends Exception {
}

class MinuseException extends Exception {
}
}