package oop.inherit.bad;

public class Warrior  extends Player{
	
	int rage;
	
	@Override
	void characterInfo() {
		// TODO Auto-generated method stub
		super.characterInfo();
		System.out.println("이것은 새로 작성한 분노 : " + rage);
		
	}
	
	
	
	

}
