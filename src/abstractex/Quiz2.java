package abstractex;

public class Quiz2 {

	public static void main(String[] args) {
	
//		변수의 자료형으로 BUS만 사용할 수있음
		Bus bus = new Bus();
		AutoCar autoCar = new AutoCar();
		
		bus.run();
		bus.refuel();
		bus.takePassenger();
		
		System.out.println();
		
		autoCar.run();
		autoCar.refuel();
		autoCar.load();

	}

}

abstract class Car1{
	
//	자동차가 달리고, 기름 넣는 기능은 모든 자동차 가지고 있지만
//	자식마다 동작하는 방식이 다름
	
	public abstract void run();
	
	public abstract void refuel();
	
}

class Bus extends Car1{

	@Override
	public void run() {
		System.out.println("버스 달립니다");
		
	}

	@Override
	public void refuel() {
		System.out.println("천연가스 충전합니다");
		
	}
	
	public void takePassenger() {
		System.out.println("승객을 버스에 태웁니다");
	}
}

class AutoCar extends Car1{

	@Override
	public void run() {
		System.out.println("자동차 달립니다");
		
	}

	@Override
	public void refuel() {
		System.out.println("휘발유 주유합니다");
		
	}
	public void load() {
		System.out.println("짐을 싣습니다");
	}
	
}
	