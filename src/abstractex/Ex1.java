package abstractex;

public class Ex1 {

	public static void main(String[] args) {
		
//		Computer computer = new Computer();		
//		추상클래스는 인스턴스 생성못함
		
		DeskTop desktop = new DeskTop();
		
		NoteBook notebook = new NoteBook();
		
		desktop.turnOn();
		desktop.turnOff();
		desktop.display();
		desktop.typing();
		
		System.out.println();
		
		notebook.turnOff();
		notebook.turnOn();
		notebook.display();
		notebook.typing();
		
//		공통 : 일반메소드
//		다름 : 추상메소드

	}

}

// 추상메소드를 가지고 싶으면 추상클랫 키워드 삽입(abstract)
abstract class Computer{
	
//	일반메소드
	public void turnOn() {
		System.out.println("전원 켭니다");
	}
	
	public void turnOff() {
		System.out.println("전원끕니다");
	}
	
//	컴퓨터마다 화면을 표시하는 방법이 다르니까 추상메소드로 선언 (선언부까지만 쓰고 세미콜론으로 끝내)
	
	public abstract void display();
	
	public abstract void typing();
	
}

class DeskTop extends Computer{		//자동 오버라이드 요망, 안했을 시 밑줄

	@Override
	public void display() {
		System.out.println("DeskTop Display");
		
	}

	@Override
	public void typing() {
		System.out.println("DeskTop Typing");
		
	}
	
}

class NoteBook extends Computer{

	@Override
	public void display() {
		System.out.println("NoteBook Display()");
		
	}

	@Override
	public void typing() {
		System.out.println("NoteBook Typing()");
	}
	
}
