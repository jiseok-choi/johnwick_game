package Weapon;

import Charactor.*;

public class Sniper extends Gun {
	{
	this.Damage = 100;		//������
	this.Price = 500;		//�Ѱ���
	}
	int bullet = 0;
	
	
	public void Attack(Boss boss) {   //�α���� �����ϴ� �޼ҵ�
		boss.Hitme(Damage, boss);
	}
}
