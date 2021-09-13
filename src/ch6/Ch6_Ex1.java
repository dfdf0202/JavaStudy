package ch6;

public class Ch6_Ex1 {
	
	public static void main(String[] args) {
		
		Tv t; // Tv 객체를 참조하기 위한 변수 t를 선언
		t = new Tv(); // new 연산자에 의해 생성된 Tv 객체의 주소를 참조변수 t가 가르키게 
		
		t.channel = 7; // Tv 멤버변수인 channel 의 값을 참조변수를 통해 7로 저장함
		t.channelDown(); // Tv 메서드 channelDown() 를 호출함
		
		System.out.println(t.channel);
		
	}

}

class Tv{
	
	String color;
	boolean power;
	int channel;
	
	void power() {
		power = !power; 
	}
	
	void channelUp() {
		++channel;
	}
	
	void channelDown() {
		--channel;
	}
	
}