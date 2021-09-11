package ch5;

public class Ch5_Ex1 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1; // 배열 arr에 1~5를 저
		}
		
		System.out.println("복사 전 ");
		System.out.println("arr.length : " + arr.length);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		
		int[] tmp = new int[arr.length * 2];
		
		for(int i = 0; i < arr.length; i++) {
			tmp[i] = arr[i];
		}
		
		arr = tmp;
		
		System.out.println("복사 후 ");
		System.out.println("arr.length : " + arr.length);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		
	}

}
