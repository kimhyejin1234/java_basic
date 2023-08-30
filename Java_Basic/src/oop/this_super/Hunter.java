package oop.this_super;

public class Hunter  extends Player{
	String pet;

	Hunter(String name){
		super(name);
		pet = name;
	}
	@Override
	void characterInfo() {
		// TODO Auto-generated method stub
		super.characterInfo();
		System.out.println("#팻 이름 : " + this.pet);
	}
	
	
}
