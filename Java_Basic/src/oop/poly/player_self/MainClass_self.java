package oop.poly.player_self;

public class MainClass_self {
	public static void main(String[] args) {
		
		Warrior_self w1 = new Warrior_self("전사1");
		Warrior_self w2 = new Warrior_self("전사2");
		Mage_self m1 = new Mage_self("마법사1");
		Mage_self m2 = new Mage_self("마법사2");
		Hunter_self h1 = new Hunter_self("사냥꾼1");
		Hunter_self h2 = new Hunter_self("사냥꾼2");
		
		/*
        1. Mage는 blizzard라는 광역 기술(메서드)을 가지고 있습니다.
        
        2. Mage 클래스에 blizzard라는 메서드를 완성하세요.
        
        3. 메서드 호출부에 들어갈 매개값으로 알맞은 매개변수를 선언하세요.
         광역 마법이기 때문에 타겟이 여러 명이어야 합니다.
         그런데 매개변수는 하나입니다.
         ex) m1.blizzard(???); (배열 쓰라는 소리에요.)
         
         
         
        4. blizzard라는 기술을 시전하는 캐릭터의 이름을 적절한 키워드를
         사용하여 출력해 보세요.
         
        5. 피해량(데미지)은 10 ~ 15사이의 난수를 발생시켜서
         타겟들에게 각각 적용해 주세요.
         
        6. 기본 객체의 hp는 50입니다. hp에서 피해량을 뺀 남은 체력을
         출력해 주세요.
        */
		Player_self[] targets = {w1,w2,m1,h1,h2};
		m1.blizzard(targets);
	}

}
