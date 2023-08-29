package oop.constructor;

public class Person {

	
	String name;
	int age;
	int height;
	
	Person(){}

	Person(String sName , int sAge , int sHeight){
		
		name = sName;
		age = sAge;
		height = sHeight;
		
	}
	void info() {
		System.out.println("----------------------------");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		System.out.println("----------------------------");
	}
}
