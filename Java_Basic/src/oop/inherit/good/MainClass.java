package oop.inherit.good;

public class MainClass {

	public static void main(String[] args) {

			Warrior w1 = new Warrior();
			w1.level = 1;
			w1.hp = 3;
			w1.hp = 50;
			w1.name = "전사1";
			w1.rage = 60;
			w1.characterInfo();
			
			Mage m1 = new Mage();
			m1.atk = 1;
			m1.hp= 1;
			m1.level = 999;
			m1.mana = 888;
			m1.name = "test";
			m1.characterInfo();
			
			
			
	}

}
