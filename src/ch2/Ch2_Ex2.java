package ch2;

public class Ch2_Ex2 {
	
	public static void main(String[] args) {
		
		// 두 변수의 값을 교환하는 것은 두 컵에 담긴 내용물을 바꾸려면 컵이 하나 더 필요한것과 같다

		int x = 10, y = 20;
		int tmp = 0;
		
		System.out.println("x : " + x + " y : " + y);
		
		tmp = x;
		x = y;
		y = tmp; 
				
		System.out.println("x : " + x + " y : " + y);
		
	}
	
}
