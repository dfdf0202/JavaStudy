package ch7;

public class Ch7_Ex6 {

	public static void main(String[] args) {
		
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Computer());
		b.summary();
	}

}

class Product{
	int price; 
	int bonusPoint;
	
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv extends Product{
	Tv(){
		super(100); // 조상클래스 생성자 Product(int price) 를 호출 
	}
	public String toString() {return "TV";}
}

class Computer extends Product{
	Computer(){
		super(200);
	}
	public String toString() {return "Computer"; }
}

class Buyer{
	int money = 1000;
	int bonusPoint = 0;
	Product[] item = new Product[10];
	// 배열을 사용하면 갯수가 고정되는것을 Vector 로 보안 가능 
	int i = 0;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액부족 ");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[i++] = p;
		System.out.println(p + " 를 구매하였습니다. ");
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		for(int i=0; i<item.length; i++) {
			if(item[i] == null) {
				break;
			}
			sum += item[i].price;
			itemList += item[i] + " , ";
		}
		
		System.out.println("구입한 물품의 총금액은 : " + sum);
		System.out.println("구입한 물품 : " + itemList);
		
	}
}

