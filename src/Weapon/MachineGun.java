package Weapon;

import Charactor.Boogieman;
import Charactor.MiddleBoss;

public class MachineGun extends Gun {
	{
	this.Damage = 5;		//데미지
	this.Price = 50;		//총가격
	}
	int bullet = 0;
	
	
	
	
	public void Attack(Boogieman boogie) {   //부기맨을 공격하는 메소드
		boogie.Hitme2(Damage, boogie);
	}
	
	public void Attack(MiddleBoss middle) {   //중간보스를 공격하는 메소드
		middle.Hitme2(Damage, middle);
	}
	
	
	
}