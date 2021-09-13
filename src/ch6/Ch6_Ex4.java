package ch6;

public class Ch6_Ex4 {

	public static void main(String[] args) {
		
		Data d = new Data();
		
		d.x = 10; // Data 의 x 값이 10으로 바뀜 
		
		System.out.println("main x : " + d.x); // 10
		
		change(d); 
		
		System.out.println("After Change");
		System.out.println("main x : " + d.x);
		
	}
	
	static void change(Data d) {
		d.x = 1000;
		System.out.println("change x : " + d.x);
	}

}

class Data{
	int x;
}