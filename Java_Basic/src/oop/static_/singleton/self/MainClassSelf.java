package oop.static_.singleton.self;

public class MainClassSelf {

	public static void main(String[] args) {
		SingletonSelf s = SingletonSelf.getInstance();
		s.method1();
		s.method2();
		
		
		SingletonSelf s1 = SingletonSelf.getInstance();
		SingletonSelf s2 = SingletonSelf.getInstance();
		SingletonSelf s3 = SingletonSelf.getInstance();
		SingletonSelf s4 = SingletonSelf.getInstance();
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		
	}

}
