package ch6;

public class Ch6_Ex5 {

	public static void main(String[] args) {
		
		int n = 20;
		
		long result = 0;
		
		for(int i=1; i<=n; i++) {
			result = factorial(n);
			
			if(result == -1) {
				System.out.println("fail");
				break;
			}
		}
		System.out.print(" result : " + result);
	}
	
	static long factorial(int n) {
		if( n <= 0 || n > 20) {
			return -1;
		}
		
		if(n <= 1) {
			return 1;
		} else {
			return n * factorial(n-1);
		}
	}

}
