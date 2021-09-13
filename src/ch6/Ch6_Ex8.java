package ch6;

public class Ch6_Ex8 {

	public static void main(String[] args) {
		
		Product p1 = new Product();
		Product p2 = new Product();
		
		System.out.println("생성된 제품의 시리얼 번호 : " + p1.serialNo);
		System.out.println("생성된 제품의 시리얼 번호 : " + p2.serialNo);
		System.out.println("생성된 제품의 수는 " +  Product.count);
		
	}

}

class Product{
	
	static int count = 0; // 인스턴스 생성된 수를 저장하기 위한 변수
	int serialNo; 
	
	{
		++count;
		serialNo = count; // 인스턴스 블럭은 인스턴스 객체 생성될 때마다 초기화 
	}
	
}
