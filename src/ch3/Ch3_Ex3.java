package ch3;

public class Ch3_Ex3 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 4;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a / (float)b);
		
		// 나누기 연산자의 두 피연산자가 모두 int 타입인 경우, 결과도 int
		// 그래서 연산결과가 2.5이여도 int 타입의 값인 2로 결과 반환.
		// 올바른 결과를 얻기 위해서는 어느 한쪽을 실수형으로 형변환 해야 올바른 결과를 얻을수 있음 
		
	}

}
