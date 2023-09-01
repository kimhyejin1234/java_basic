package oop.poly.player_self;

public class Mage_self extends Player_self {

	int mana;
	
	public Mage_self() {
		// TODO Auto-generated constructor stub
	}
	
	public Mage_self(String name) {
		
		this.name = name;
		this.mana = 50;
	}
	//public int blizzard(Player... target) {
	public void blizzard(Player_self[] target) {
		
		System.out.printf("%s님이 눈보라 시전!!\n", this.name );
		this.mana -= 30;
		System.out.printf("30의 마나가 소모됩니다. 남은 정신력 :  %d \n",this.mana);
		System.out.println("--------------------------------");
		for(Player_self p :target) {
			int damage = (int) ((Math.random()*6)+10);
			p.hp -= damage;
			System.out.printf("%s님이 %d 의 피해를 입었습니다.(남은 체력은 %d) \n",p.name,damage,p.hp);
		}
	}
	
}
