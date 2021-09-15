package ch7;

public class Ch7_Ex4 {

	public static void main(String[] args) {
		
		//Singleton s= new Singleton(); // 생성자에 접근제어자를 private를 주어서 외부에서 객체 생성 X
		Singleton s = Singleton.getInstance();

	}

}

final class Singleton{
	
	private static Singleton s = new Singleton();
	
	private Singleton() {
		System.out.println("Singleton........");
	}
	
	public static Singleton getInstance() {
		if(s == null) {
			s = new Singleton();
		}
		return s;
	}
	
}