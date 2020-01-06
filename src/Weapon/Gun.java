package Weapon;
import Charactor.*;

public class Gun {
	public int Damage = 2;		//데미지
	int Price = 50;		//총가격
	
	Boogieman boogie;
	MiddleBoss middle;
	
	
	public void Attack(Boogieman boogie) {   //부기맨을 공격하는 메소드
		boogie.Hitme(Damage, boogie);
	}
	
	public void Attack(MiddleBoss middle) {   //중간보스를 공격하는 메소드
		middle.Hitme3(Damage, middle);
	}
}
