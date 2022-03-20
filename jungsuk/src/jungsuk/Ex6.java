package jungsuk;

public class Ex6 {

	public static void main(String[] args) {
		Student3 st3 = new Student3("홍길동", 1, 1, 100, 60, 76);
		System.out.println(st3.name);
		System.out.println(st3.getAverage());
		System.out.println(st3.getTotal());
		
		Exercise ex = new Exercise();
		System.out.println(ex.getDistance(1,1,2,2));
		
		Ex6_18 ex6_18 = new Ex6_18();
		System.out.println(ex6_18.isNumber("123"));
		System.out.println(ex6_18.isNumber("1234o"));
		
		int[] data = {3,2,9,4,7};
		Ex6_20 ex6_20 = new Ex6_20();
		System.out.println(ex6_20.max(null));
		System.out.println(ex6_20.max(data));
		System.out.println(ex6_20.max(new int[] {}));
		
		Ex6_21 ex6_21 = new Ex6_21();
		System.out.println(ex6_21.abs(5));
		System.out.println(ex6_21.abs(-10));
		
		
	}
}

// 6-1
class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
}

// 6-2
class Student2 {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student2(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
}

// 6-3
class Student3 {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student3(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal() {
		return kor + eng + math;
	}
	
	float getAverage() {
		float avg = (kor + eng + math)/(float)3;
		float result = (float)(Math.round(avg*10)*0.1);
		//avg = 78.66664
		return result;
	}
	
}

// 6-4
class Exercise {
	static double getDistance(int x, int y, int x1, int y1) {
		int xresult = (int) Math.pow((x1-x), 2);
		int yresult = (int) Math.pow((y1-y), 2);
		double result = (double) Math.sqrt((xresult + yresult));
		return result;
	}
}

// 6-6
class Mypoint {
	int x;
	int y;
	
	Mypoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	double getDistance(int x, int y, int x1, int y1) {
		int xresult = (int) Math.pow((x1-x), 2);
		int yresult = (int) Math.pow((y1-y), 2);
		double result = (double) Math.sqrt((xresult + yresult));
		return result;
	}
}

// 6-7
class Ex6_17 {
	int[] shuffle(int[] arr) {
		int tmp;
		int num = (int)(Math.random()*10);
		for (int i =0; i < arr.length; i++) {
			tmp = arr[i];
			arr[i] = arr[num];
			arr[num] = tmp;		
		}
		return arr;
	}
	
}

// 6-8
class Ex6_18 {
	boolean isNumber(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if ( str.charAt(i) - '0' < 0 && str.charAt(i) - '0' > 9) {
				count++ ;
			}
		}
		
		if (count == 0) {
			return false;
		}
		else {
			return true;
		}
	}
}


// 6-19
class MyTv {
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	void turnOnOff() {
		isPowerOn =! (isPowerOn);
}
	
	void volumeUp() {
		if (volume < MAX_VOLUME) {
			volume++;
		}
	}
	
	void volumeDown() {
		if (volume > MIN_VOLUME) {
			volume--;
		}
	}
	
	void channelUp() {
		if(channel == MAX_CHANNEL) {
			channel = MIN_CHANNEL;
		}
		else {
			channel++;
		}
	}
	
	void ChannelDown() {
		if(channel == MIN_CHANNEL) {
			channel = MAX_CHANNEL;
		}
		else {
			channel--;
		}
	}
	
	
}

// 6-20
class Ex6_20 {
	int max(int[] arr) {
		if (arr == null) {
			return -999999;
		}
		else {
			int max = 0;
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] >= max) {
				max = arr[i];
			}
		}
			return (max != 0) ? max : -999999;
		}
	}
}

// 6-21
class Ex6_21 {
	int abs (int value) {
		if (value < 0) {
			return -value;
		}
		else {
			return value;
		}
	}
}