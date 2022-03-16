package day10;

public class Study2 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setName("poppy");
		System.out.println(dog.name);
		dog.sleep();
		
		Animal dog2 = new Dog();
//		Dog dog3 = new Animal(); 에러 
	}

}


class Animal {
	String name;
	
	void setName(String name) {
		this.name = name;
	}
}

class Dog extends Animal{
	void sleep() {
		System.out.println(this.name + " zzzz");
	}
}
