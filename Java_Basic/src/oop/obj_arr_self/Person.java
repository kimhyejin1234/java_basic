package oop.obj_arr_self;

public class Person {
	private String name;
	private int age;
	private String sex;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	
	public Person(String name, int age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public void personInfo() {
		System.out.printf("이름 : %s \n나이: %d \n성별: %s\n",this.name,this.age,this.sex);
	}
	

}
