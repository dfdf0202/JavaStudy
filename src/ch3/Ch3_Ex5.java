package ch3;

public class Ch3_Ex5 {

	public static void main(String[] args) {
		
		// 소숫점 아래를 버리는게 아니라 반올림 하는 법
		
		float pi = 3.141592f;
		float shortPi = (int)(pi * 1000 + 0.5) / 1000f;
		System.out.println(shortPi);
		
		// (int)(3141.562 + 0.5) / 1000f; ----> (int)(3142.092) / 1000f
		// (3142) / 1000f -----> 3.142
		
		// Math.round() 사용 법
		
		pi = 3.141592f;
		shortPi = (float) (Math.round(pi * 1000) / 1000.0);
		System.out.println(shortPi);
		
	}

}
