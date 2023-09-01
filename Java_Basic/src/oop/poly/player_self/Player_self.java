package oop.poly.player_self;

public class Player_self  {
	
	String name;
	int level;
	int atk;
	int hp;
	int mana;
	
	Player_self(){
		level = 1;
		atk = 3;
		hp = 50;
		mana = 50;
		
	}
	
	Player_self(String name){
		this(); //같은 클래스의 다른 생성자를 부를는 문법.
		this.name = name;
		
	}
	
	
}
