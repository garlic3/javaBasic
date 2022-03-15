package day9;

public class Study {
	
	static int value = 10;

	public static void main(String[] args) {

		//1
		
		int[] array = new int[5];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = i+1;
			System.out.printf("a[%s] = %s %n", i, array[i]);
		}
		
		int [] array2 = new int[]{1,2,3,4,5};
	
	
		//2
		int[] array3 = new int[100];
		for (int j = 0; j < array3.length; j++) {
			array3[j] = j+1;
			System.out.printf("a[%s] = %s %n", j, array3[j]);
		}
		
		//3
        int [][] array4 = {{1},{1,2},{1,2,3},{1,2,3,4}};
        for(int a = 0; a < array4.length; a++) {
        	System.out.print((a+1) + "번째 줄을 출력합니다 ");
        	for (int b= 0; b < array4[a].length; b++) {
        		System.out.print(array4[a][b] + " ");
        	}
        System.out.println();
        }
        
        //4
        int [] array5 = {1,5,3,6,7};
        for(int each:array5) {
        	System.out.println(each);
        }
        
        Car c = new Car();
        c.print();
        
        MyClass m = new MyClass();
        System.out.println(m.myMethod(10));
        System.out.println(m.myMethod(20));
        
        System.out.println(value);
        
        Person person = new Person(25);
        System.out.println(person.age);
        
        Person2 person2 = new Person2("사람", 25);
        System.out.println(person2.name);
        System.out.println(person2.age);
        
        Car2 car2 = new Car2();
        car2.run(140);
        
        Car3 car31 = new Car3();
        Car3 car32 = new Car3("자동차");
        Car3 car33 = new Car3("자동차", 1234);

        System.out.println(car31.name + "," +car31.number);
        System.out.println(car32.name + "," + car32.number);
        System.out.println(car33.name + "," + car33.number);
        
	}

}

//5
class Car {
	public void print() {
		System.out.println("성공");
	}
	
}

//6
class Song {
	String songTitle;
	String singer;
	String albumName;
	int trackNumber;
	
}

//7
class MyClass {
	int myMethod(int a) {
		return a;
	}
}

//9
class Person {
	int age;
	Person(int a){
		age = a;
	}
	
}

//10
class Person2 {
	int age;
	String name;
	public Person2(String name, int age) {
		this.age = age;
		this.name = name;
	}
}

//11
class Car2{
	public void run() {
		System.out.println("차가 달립니다.");
	}
	
	public void run(int speed) {
		System.out.println("차가 " + speed + "km로 달립니다.");
	}
}

//12
class Car3 {
	String name;
	int number;
	
	Car3(){
		this("이름없음",0);
	}
	
	Car3(String name){
		this(name,0);
	}
	Car3(String name, int number){
		this.name = name;
		this.number = number;
	}
}
