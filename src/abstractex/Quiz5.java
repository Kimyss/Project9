package abstractex;

import java.util.ArrayList;

public class Quiz5 {

	public static void main(String[] args) {
		ArrayList<Animal1> list = new ArrayList<Animal1>();
		
		list.add(new Human());
		list.add(new Tiger());
		
//		Animal1 human = list.get(0);
//		Animal1 tiger = list.get(1);
		
		for (int i = 0; i < list.size(); i++) {
			Animal1 animal = list.get(i); // 리스트 안에 저장된 요소 꺼내기

			animal.sleep(); // 메소드 호출
			animal.move();

			if (animal instanceof Human) { // 실제 인스턴스의 타입 확인
				Human human = (Human) animal; // 다운캐스팅
				human.readBook(); // 사람이 가지고 있는 메소드 호출

			} else if (animal instanceof Tiger) {
				Tiger tiger = (Tiger) animal;
				tiger.hunting(); // 호랑이가 가지고 있는 메소드 호출
			}

			System.out.println();

		}
		

	}

}
