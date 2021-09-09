package ch3;

public class Ch3_Ex2 {
	
	public static void main(String[] args) {
		
		int i = 5, j = 0;
		
		j = i++;
		
		System.out.println("j=i++; 실행후, i= " + i + ", j= " + j);
		
		i = 5;
		j = 0; // 결과 비교를 위해 i 와 j를 5 와 0으로 초기화
		
		j = ++i;
		
		System.out.println("j=i++; 실행후, i= " + i + ", j= " + j);
		
		// 후위형 j=i++ 에서는 i의 값인 5를 먼저 읽어와 j에 5가 저장 된후 i값이 증가 된걸 볼 수 있다.
		// 전위형 j=++i 에서는 i의 값이 6으로 증가된 후에 값이 j에 저장된다.
		
	}
	
}
