package day10;

public class Ex1 {

	public static void main(String[] args) {
		ZooKeeper zooKeeper = new ZooKeeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		zooKeeper.feed(tiger);
		zooKeeper.feed(lion);
	}

}

interface Predator {
	String getFood();
}

class Animal {
	String name;
	
	void setName(String name) {
		this.name = name;
	}
}

class Tiger extends Animal implements Predator {
	public String getFood() {
		return "apple";
	}
	
}

class Lion extends Animal implements Predator{
	public String getFood() {
		return "banana";
	}
	
}

class ZooKeeper{
	void feed(Predator predator) {
		System.out.println("feed " + predator.getFood());
	}
	

	
}



