package ch3;

public class Ch3_Ex4 {
	
	public static void main(String[] args) {
		
		// 원하는 소숫점 자리 구하는 방법
		
		float pi = 3.141592f;
		float shortPi = (int)(pi * 1000) / 1000f;
		System.out.println(shortPi);
		
		// 제일 먼저 수행되는 것은 pi * 1000 
		// (int)(3141.592f) / 1000f; ----> (3141) / 1000f;
		// 3.141f;
		
	}
	
}
