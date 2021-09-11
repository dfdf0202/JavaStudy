package ch4;

public class Ch4_Ex8 {
	
	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i == j) {
					System.out.print("["+ i + "," + j +"]");
				}else {
					System.out.print("     ");
				}
			}
			System.out.println();
		}
		
	}
	
}
