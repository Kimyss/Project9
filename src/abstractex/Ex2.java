package abstractex;

public class Ex2 {

	public static void main(String[] args) {
		
		Animal dog =  new Dog();		//부모로 형변환
		dog.breath();
		dog.sound();					//재정의된 메소드 호출됨
		
		System.out.println();
		
		Animal cat = new Cat();
		cat.breath();
		cat.sound();
	}

}

// 동물클래스
abstract class Animal {

//	공통기능 : 일반메소드로 선언
	public void breath() {
		System.out.println("숨을 쉽니다");
	}

// 동물마다 내는 소리 다르니깐 추상메소드로 선언 -> 추상메소드를 가지면 클래스도 추상클래스로 작성요망

	public abstract void sound();

}

// 고양이 클래스
class Cat extends Animal {

	@Override
	public void sound() {
		System.out.println("야옹야오~야옹");
	}
}

// 강아지 클래스
class Dog extends Animal {

	@Override
	public void sound() {
		System.out.println("왕왕~멍멍");
	}
}
