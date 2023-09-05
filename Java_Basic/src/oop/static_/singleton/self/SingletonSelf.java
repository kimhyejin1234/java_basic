package oop.static_.singleton.self;

public class SingletonSelf {
	private SingletonSelf() {
		System.out.println("객체가 생성됨!");// !TODO Auto-generated constructor stub
	} 
	
	private static SingletonSelf s = new SingletonSelf();
	
	public static SingletonSelf getInstance() {
		return s;
	}
	
	
	public void method1() {
		System.out.println("여러 군데에서 쓰이는 중요한 메서드");
	}
	public void method2() {
		System.out.println("프로그램 내에서 꼭 한번 불러야 하는 귀한  메서드");
	}

}
