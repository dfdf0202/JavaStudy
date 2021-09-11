package ch5;

public class Ch5_Ex3 {
	
	public static void main(String[] args) {
		
		// 최대값 최소값 구하는 예제 
		
		int[] score = { 79, 88, 91, 33, 100, 55, 95};
		
		int max = score[0]; // 배열의 첫 번째 값을 최대값으로 초기화
		int min = score[0]; // 배열의 첫 번째 값을 최소값으로 초기화
		
		for(int i=0; i < score.length; i++) {
			if(score[i] > max) {
				max = score[i];
			} else if(score[i] < min) {
				min = score[i];
			}
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
	}
	
}
