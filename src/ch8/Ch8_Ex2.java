package ch8;

public class Ch8_Ex2 {

	public static void main(String[] args) {
		
		// try - catch 의 흐름
		
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0); // 예외 발생 
			System.out.println(4); // 실행되지 않음. 14라인에서 예외 발생하지 않으면 실행 됨 
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(5); // 14 라인에서 예외 발생해서 실행됨. 14라인에서 예외가 없으면 실행되지 않음 
		}
		
		System.out.println(6);
		
	}

}
