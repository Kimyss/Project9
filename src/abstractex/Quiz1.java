package abstractex;

public class Quiz1 {

	public static void main(String[] args) {
		
//		변수의 자료형으로 Car와 Sonata를 사용할 수 있음. 확장한 부분이 없기 때문에
		
		Sonata sonata = new Sonata();
		Avante avante = new Avante();
		
		sonata.start();
		sonata.drive();
		sonata.stop();
		sonata.turnOff();
		
		System.out.println();
		
		avante.start();
		avante.drive();
		avante.stop();
		avante.turnOff();
		
	}

}


abstract class Car{
	
	public abstract void start();

	public abstract void drive();

	public abstract void stop();

	public abstract void turnOff();


}

// 동작의 다름 -> 자식클래스에서 오버라이드했다.

class Sonata extends Car{

	@Override
	public void start() {
		System.out.println("Sonata 시동켭니다");
		
	}

	@Override
	public void drive() {
		System.out.println("Sonata 달립니다");
		
	}

	@Override
	public void stop() {
		System.out.println("Sonata 멈춥니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Sonata 시동 끕니다");
		
	}


	
}

class Avante extends Car{

	@Override
	public void start() {
		System.out.println("Avante 시동켭니다");
		
	}

	@Override
	public void drive() {
		System.out.println("Avante 달립니다");
		
	}

	@Override
	public void stop() {
		System.out.println("Avante 멈춥니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Avante 시동끕니다");
		
	}
}
