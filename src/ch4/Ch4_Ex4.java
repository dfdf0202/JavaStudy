package ch4;

import java.util.Scanner;

public class Ch4_Ex4 {

	public static void main(String[] args) {
		
		System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력하세요. >");
		
		Scanner scanner = new Scanner(System.in);
		
		int user = scanner.nextInt();
		int com = (int)(Math.random() * 3 ) + 1;
		
		switch( user - com ) {
		
			case 2: case -1:
				System.out.println("컴퓨터 승.");
				break;
			
			case 1: case -2:
				System.out.println("당신이 이겼습니다.");
				break;
			
			case 0:
				System.out.println("비겼습니다.");
		}
		
	}

}
