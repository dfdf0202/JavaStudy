package ch7;

public class Ch7_Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Point{
	int x, y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return "x : " + x + ", y : " + y;
	}
}

class Point3D extends Point{
	
	int z;
	
	Point3D(int x, int y, int z){
		
		super(x,y); // Point 클래스에 기본 생성자가 없기 때문에 에러 발생
					// Point 클래스에 기본 생성자를 생성하던지 기존에 작성되있는 Point(int x, inty) 를 호출해야 함 
		
		//this.x = x;
		//this.y = y;
		this.z = z;
	}
	
}
