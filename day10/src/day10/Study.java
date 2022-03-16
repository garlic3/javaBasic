package day10;

public class Study {

	public static void main(String[] args) {

		// 메소드에 값(primitive type)을 전달받는 것과 객체(reference type)을 전달 받는것의 차이
		
		Counter myCounter = new Counter();
		System.out.println("before update:" + myCounter.count);
		Updater myUpdater = new Updater();
		myUpdater.update(myCounter);
		System.out.println("after update:" + myCounter.count);
	}
		

}


class Updater {
	void update(Counter counter) {
		counter.count++;
	}
}

class Counter {	
	int count = 0;

}


