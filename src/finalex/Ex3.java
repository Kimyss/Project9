package finalex;

public class Ex3 {

	public static void main(String[] args) {
		

	}

}

class Parents{
	
	final void method1() {
		
	}
	
	void method2() {
		
	}
}

class Child extends Parents{

	@Override
	void method2() {
		
		super.method2();
	}
	
//	일반메소드 method2는 재정의가 가능 하지만
//	final이 붙은 method1은 재정의 불가
	
}
