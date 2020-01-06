package Weapon;

import Charactor.*;

public class Sniper extends Gun {
	{
	this.Damage = 100;		//데미지
	this.Price = 500;		//총가격
	}
	int bullet = 0;
	
	
	public void Attack(Boss boss) {   //부기맨을 공격하는 메소드
		boss.Hitme(Damage, boss);
	}
}
