package Weapon;

import Charactor.Boogieman;
import Charactor.MiddleBoss;

public class MachineGun extends Gun {
	{
	this.Damage = 5;		//������
	this.Price = 50;		//�Ѱ���
	}
	int bullet = 0;
	
	
	
	
	public void Attack(Boogieman boogie) {   //�α���� �����ϴ� �޼ҵ�
		boogie.Hitme2(Damage, boogie);
	}
	
	public void Attack(MiddleBoss middle) {   //�߰������� �����ϴ� �޼ҵ�
		middle.Hitme2(Damage, middle);
	}
	
	
	
}