package ch5;

public class Ch5_Ex2 {

	public static void main(String[] args) {
		
		// 총합과 평균 구하는 예제
		
		int sum = 0;
		float avg = 0f;
		
		int[] score = { 100, 88, 100, 100, 90 };
		
		for(int i = 0; i < score.length; i++) {
			sum += score[i]; // sum에 score 값들을 다 더함 
		}
		
		avg = sum / (float) score.length;
		
		System.out.println(" 총점 : " + sum);
		System.out.println(" 평균 : " + avg);
		
	}

}
