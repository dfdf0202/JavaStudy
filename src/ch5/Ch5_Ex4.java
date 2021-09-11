package ch5;

public class Ch5_Ex4 {

	public static void main(String[] args) {
		
		// 로또 예제
		
		int[] lotto = new int[45];
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		}
		
		int temp = 0;
		int j = 0;
		
		for(int i = 0; i < 6; i++) {
			j = (int)(Math.random() * 45); 
			temp = lotto[j];  
			lotto[i] = lotto[j];
			lotto[j] = temp;
		}
		
		for(int i=0; i < 6; i++) {
			System.out.println(lotto[i]);
		}
		
	}

}
