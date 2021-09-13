package ch6;

public class Ch6_Ex3 {
	
	// 메서드 호출 순서
	
	public static void main(String[] args) {
		
		System.out.println("mian 실행 "); // 1 
		firstMethod();
		System.out.println("main 끝 "); // 4
		
	}
	
	static void firstMethod() {
		secondMethod();
		System.out.println("fristMethod()"); // 3
	}
	
	static void secondMethod() {
		System.out.println("secondMethod()"); // 2
	}
	
}
