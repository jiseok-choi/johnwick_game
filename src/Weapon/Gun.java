package Weapon;
import Charactor.*;

public class Gun {
	public int Damage = 2;		//������
	int Price = 50;		//�Ѱ���
	
	Boogieman boogie;
	MiddleBoss middle;
	
	
	public void Attack(Boogieman boogie) {   //�α���� �����ϴ� �޼ҵ�
		boogie.Hitme(Damage, boogie);
	}
	
	public void Attack(MiddleBoss middle) {   //�߰������� �����ϴ� �޼ҵ�
		middle.Hitme3(Damage, middle);
	}
}
