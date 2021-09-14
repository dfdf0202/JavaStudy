package ch7;

public class Ch7_Ex2 {

	public static void main(String[] args) {
		
		Child c = new Child();
		c.method();
		
	}

}

class Parent{
	int x = 10;
}

class Child extends Parent{
	
	int x = 20;
	
	void method() {
		System.out.println("x = " + x); // Child 의 iv x
		System.out.println("this.x = " + this.x); // Child 의 iv x
		System.out.println("super.x = " + super.x); // 상속받은 Parent의 iv x
	}
	
}