package abstractex;

import java.util.ArrayList;

public class Quiz4 {

	public static void main(String[] args) {
		
//		부모타입의 리스트 생성
		ArrayList<Car1> list = new ArrayList<Car1>();
		
		list.add(new Bus());			//버스 객체 추가
		list.add(new AutoCar());		//오토카 객체 추가
		
//		Car1 bus = list.get(0);
		
		for (int i =0; i < list.size(); i++) {
			
			Car1 car = list.get(i);
			
			car.run();
			car.refuel();
		}
		
//		if (car instanceof Bus) {
//			Bus bus = (Bus) car;
//		}
		
	}

}
