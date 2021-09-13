package ch6;

public class Ch6_Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Car{
	String color;
	String gearType;
	int door;
	
	Car(){
		this("white", "auto", 4);  // 기본생성자에서 매개변수가 있는 다른 생성자 호
	}
	
	Car(String color){
		this(color, "auto", 4);
	}
	
	Car(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}