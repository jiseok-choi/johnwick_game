package Charactor;

public class Charactor {
	//�������
	String name;
	public int HP = 0;				//ü��
	public int Money = 0;			//������ȭ
	public int Gun = 0;			//�������� �� 0.����, 1.����, 2.�����, 3.������
	public int Power = 0;
	
	String blank = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";
	//������ ������ְ�
	public Charactor(){
		//System.out.println(HP);
	}
	//�޼ҵ�
//	public int Shot(){		//�ѽ�� ����
//		int damage = 0;
//		
//		switch(Gun){		//�����ϰ� �ִ� ���� ������ ���� ���������� �޶���
//        case 1 : 
//            damage = 5; 
//            break;
//        case 2 : 
//        	damage = 10; 
//            break;
//        case 3 : 
//        	damage = 100; 
//            break;
//		}
//		
//		return damage;		//������ ��ȯ
//	}
	public void Hitme(int damage) {
		HP = HP - damage;
		if(HP <= 0) {
			if(name == "����") {
				System.out.println("\n\n        :$@@@*,                              ");
				System.out.println("      .@@@@@@@@;                            ");
				System.out.println("     $@@@@@@@@@@@@@@@@@@@@@@@@@@:           ");
				System.out.println("     -@@@@@@@@@@@@@@@@@@@@@@@@@@:           ");
				System.out.println("      :@@@@@@@@#;;#@@@;;;;;;;#@@:           ");
				System.out.println("       ,#@@@@@*   =@@@       *@@:           ");
				System.out.println("                  =@@@       *@@:           ");
				System.out.println("                  =@@@       *@@@@@@@@@@@   ");
				System.out.println("\n\n\n ##  ##    ####    ##  ##            ####     ######   ######              ##    \r\n" + 
						" ##  ##   ##  ##   ##  ##            ## ##      ##     ##                  ##    \r\n" + 
						"  ####    ##  ##   ##  ##            ##  ##     ##     #####               ##    \r\n" + 
						"   ##     ##  ##   ##  ##            ##  ##     ##     ##                  ##    \r\n" + 
						"   ##     ##  ##   ##  ##            ## ##      ##     ##                        \r\n" + 
						"   ##      ####    ######            ####     ######   ######              ##    \r\n" + 
						"");
				System.out.println("\n������ �׾����ϴ�\n������ �Ϸ����� ���߽��ϴ�");
				System.exit(0);
			}
			else if(name == "���ǾƵθ�") {
				System.out.println("���� ������ �׿����ϴ�!!!");
				System.exit(0);
			}
			else {
				System.out.println(name+"�� �׾����ϴ�");
			}
		}
		
	}

}
