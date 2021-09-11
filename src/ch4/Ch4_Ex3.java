package ch4;

import java.util.Scanner;

public class Ch4_Ex3 {

	public static void main(String[] args) {
		
		// break를 주지 않으면 맨 마지막 코드까지 실행 후 종료 됨 
		
		int level = 0;
		
		System.out.println("당신의 레벨을 입력해주세요. >");
		
		Scanner scanner = new Scanner(System.in);
		
		level = scanner.nextInt();
		
		switch(level) {
			
			case 3 : System.out.println("삭제 권한을 준다.");
			case 2 : System.out.println("쓰기 권한을 준다.");
			case 1 : System.out.println("읽기 권한을 준다.");
			
		}
		
	}

}
