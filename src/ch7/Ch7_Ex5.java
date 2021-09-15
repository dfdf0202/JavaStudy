package ch7;

public class Ch7_Ex5 {

	public static void main(String[] args) {
		
		Car car = null;
		
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.warter();
		car = fe; // 자손 ---> 조상 : 형변환 생략 가능 
		//car.warter(); // Car 타입의 참조변수로 warter()를 호출할 수 없음 
		fe = (FireEngine) car;
		
		fe.warter();
		
		FireEngine fe3 = new FireEngine();
		
		if(fe3 instanceof FireEngine) {
			System.out.println("This is a FireEngine instance");
		}
		if(fe3 instanceof Car) {
			System.out.println("This is a Car instance");
		}
		
	}

}

class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("Brrrr~");
	}
	
	void stop() {
		System.out.println("stop");
	}
}

class FireEngine extends Car {
	void warter() {
		System.out.println("warter");
	}
}