package ch6;

public class Ch6_Ex2 {

	public static void main(String[] args) {
		
		System.out.println("Card.width: " + Card.width); // 스태틱 변수는 객체 생성하지 않고 사용 가
		System.out.println("Card.height: " + Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart"; // 인스턴스 변수는 객체 생성후 참조변수를 통해 접근 가능
		c1.number = 7;
		
		System.out.println("c1 kind : " + c1.kind);
		System.out.println("c1 number : " + c1.number);
		
	}

}

class Card{
	static int width = 100;
	static int height = 250;
	String kind;
	int number;
}