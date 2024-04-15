package abstractex;

public class Quiz3 {

	public static void main(String[] args) {
		
//		변수의 자료형으로 human만 사용할 수있음
//		부모타입으로 형변환하면readBook사용불가 Tiger도 마찬가지 hunting
		Human human = new Human();
		Tiger tiger = new Tiger();
		
		human.sleep();
		human.move();
		human.readBook();
		
		System.out.println();
		
		tiger.sleep();
		tiger.move();
		tiger.hunting();
		

	}

}

abstract class Animal1{
	
	public void sleep() {
		System.out.println("밤에는 잠을 잡니다");
	}
	
	public abstract void move();
}

class Human extends Animal1{

	@Override
	public void move() {
		System.out.println("사람은 두발로 걷습니다");
		
	}
	public void readBook() {
		System.out.println("사람은 책 읽습니다");
	}
}

class Tiger extends Animal1{

	@Override
	public void move() {
		System.out.println("호랑이 네발로 뜁니다");
		
	}
	public void hunting() {
		System.out.println("호랑이 사냥해요");
	}
}
	
	
