package ch4;

import java.util.Scanner;

public class Ch4_Ex2 {

	public static void main(String[] args) {
		
		// break는 해당 case문을 수행 한 후 switch 문을 빠져나옴
		// default는 조건문의 조건이 case문에 없을때 실행되는 코드 
		
		System.out.println("현재 월을 입력하세요. >");
		
		Scanner scanner = new Scanner(System.in);
		
		int month = scanner.nextInt();
		
		switch(month) {
			case 3: case 4: case 5:
				System.out.println("현재 계절은 봄입니다.");
				break;
			case 6: case 7: case 8:
				System.out.println("현재 계절은 여름입니다.");
				break;
			case 9: case 10: case 11:
				System.out.println("현재 계절은 가을입니다.");
				break;
			default:
				System.out.println("현재 계절은 겨울입니다.");
		}
		
	}

}
