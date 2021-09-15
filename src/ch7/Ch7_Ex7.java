package ch7;

public class Ch7_Ex7 {
	
	public static void main(String[] args) {
		Unit[] group = {new Marine() , new Tank(), new DropShip()};
		
		for (int i=0; i<group.length; i++) {
			group[i].move(100, 200);
		}
	}
}

abstract class Unit{
	int x, y;
	abstract void move(int x, int y);
	void stop() {
		System.out.println("현재 위치에 정지 ");
	}
}

class Marine extends Unit{
	void move(int x, int y) {
		System.out.println("[Marine]" + x + ", "+ y + " 로 이동 ");
	}
	void stimpack() {
		System.out.println("스팀팩 사용 ");
	}
}

class Tank extends Unit{
	void move(int x, int y) {
		System.out.println("[Tank]" + x + ", "+ y + " 로 이동 ");
	}
	void changeMode() {
		System.out.println("시즈모드 ");
	}
}

class DropShip extends Unit{
	void move(int x, int y) {
		System.out.println("[DropShip]" + x + ", "+ y + " 로 이동 ");
	}
	void load() {
		System.out.println("유닛 태우기 ");
	}
	void unload() {
		System.out.println("유닛 내리기 ");
	}
}