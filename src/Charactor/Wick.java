package Charactor;
import java.util.Random;

import Main.Sound;
import Weapon.*;

public class Wick extends Charactor {
	//�츮�� ���ΰ� ����
	{
		this.name = "����";
		this.HP = 1000;			//ü��
		this.Money = 100;		//���� ��ȭ
		this.Gun = 1;			//�⺻���� ����
		this.Power = 100;
	}
	
	Wick wick;
	
	
	public int machine_bullet = 50;		//����� �Ѿ˰���
	public int sniper_bullet = 0;		//������ �Ѿ˰���
	public boolean stun = false;		//���ϻ��� ����
	
	Gun gun = new Gun();
	MachineGun gun2 = new MachineGun();
	Sniper gun3 = new Sniper();
	
	Runnable r1;	//�� �ѼҸ� ���ʺ����
	Thread t1;		//�� �ѼҸ� ���������
	
	
	public Wick(){

	}

	///////////////�߰� �޼ҵ�
	//�ѽ�� �޼ҵ�
	public int Shot(Wick wick, Boogieman boogie) {		//�α�Ǹ� ����

		if(wick.stun == false) {								//������ �ƴѻ��¸� ������ �� ����
			if(Gun == 1) {
				//Power = gun.Damage;
				//boogie.Hitme(Power);
				gun.Attack(boogie);
				r1 = new Sound(wick);
				t1 = new Thread(r1);
				t1.start();
			}
			if(Gun == 2) {
				//Power = gun2.Damage;
				if(wick.machine_bullet > 4) {
					gun2.Attack(boogie);
					//System.out.println("���ٴ�!!");
					wick.machine_bullet = wick.machine_bullet - 5;
					r1 = new Sound(wick);
					t1 = new Thread(r1);
					t1.start();
				}
				else {
					System.out.println("����� �Ѿ��� �����մϴ�");
					wick.Gun = 0;
					r1 = new Sound(wick);
					t1 = new Thread(r1);
					t1.start();
				}
			}

			if(Gun == 3) {
				//Power = gun3.Damage;
				if(wick.machine_bullet > 0) {
					gun3.Attack(boogie);
					//System.out.println("���ƾƾ�!!!!!");
					wick.sniper_bullet = wick.sniper_bullet - 1;
					r1 = new Sound(wick);
					t1 = new Thread(r1);
					t1.start();
				}
				else {
					System.out.println("������ �Ѿ��� �����մϴ�");
					wick.Gun = 0;
					r1 = new Sound(wick);
					t1 = new Thread(r1);
					t1.start();
				}
				System.out.println("��!!!");
			}
		}
		else {
			System.out.println("���� ���� �����϶�!!!");
		}

		return 0;
	}

	public int Shot(Wick wick, MiddleBoss middle) {		//�α�Ǹ� ����

		if(wick.stun == false) {								//������ �ƴѻ��¸� ������ �� ����
			if(Gun == 1) {
				gun.Attack(middle);				
				r1 = new Sound(wick);
				t1 = new Thread(r1);
				t1.start();
			}
			if(Gun == 2) {
				//Power = gun2.Damage;
				if(wick.machine_bullet > 4) {
					gun2.Attack(middle);
					wick.machine_bullet = wick.machine_bullet - 5;
					r1 = new Sound(wick);
					t1 = new Thread(r1);
					t1.start();
					
				}
				else {
					System.out.println("����� �Ѿ��� �����մϴ�");
					wick.Gun = 0;
					r1 = new Sound(wick);
					t1 = new Thread(r1);
					t1.start();
				}
			}

			if(Gun == 3) {
				//Power = gun3.Damage;
				if(wick.machine_bullet > 0) {
					gun3.Attack(middle);
					r1 = new Sound(wick);
					t1 = new Thread(r1);
					t1.start();
					wick.sniper_bullet = wick.sniper_bullet - 1;
				}
				else {
					System.out.println("������ �Ѿ��� �����մϴ�");
					wick.Gun = 0;
				}
				System.out.println("��!!!");
			}
		}
		else {
			System.out.println("���� ���� �����϶�!!!");
		}

		return 0;
	}




	public int Shot(Wick wick, Boogieman boogie, MiddleBoss middle) {			//�α�ǰ� �߰����� ���� ����

		if(wick.stun == false) {
			if(Gun == 1) {
				gun.Attack(boogie);
				gun.Attack(middle);
				r1 = new Sound(wick);
				t1 = new Thread(r1);
				t1.start();
			}
			if(Gun == 2) {
				if(wick.machine_bullet > 4) {
					gun2.Attack(boogie);
					gun2.Attack(middle);
					r1 = new Sound(wick);
					t1 = new Thread(r1);
					t1.start();
					wick.machine_bullet = wick.machine_bullet - 5;
				}
				else {
					System.out.println("����� �Ѿ��� �����մϴ�");
				}
			}
			if(Gun == 3) {
				if(wick.machine_bullet > 0) {
					gun3.Attack(boogie);
					gun3.Attack(middle);
					r1 = new Sound(wick);
					t1 = new Thread(r1);
					t1.start();
					wick.sniper_bullet = wick.sniper_bullet - 1;
				}
				else {
					System.out.println("������ �Ѿ��� �����մϴ�");
				}
				System.out.println("��!!!");
			}
		}
		else {
			System.out.println("���� ���� �����϶�!!!");
		}

		return 0;
	}

	public int Shot(Wick wick, Boss boss) {

		if(wick.stun == false) {
			if(Gun == 4) {
				r1 = new Sound(wick);
				t1 = new Thread(r1);
				t1.start();
				boss.Hitme(10, boss);
				Hit();
				System.out.println("����ü��: "+wick.HP+"  ����ü�� : " + boss.HP);
			}
			if(Gun == 1) {
				r1 = new Sound(wick);
				t1 = new Thread(r1);
				t1.start();
				boss.Hitme(10, boss);
			}
			if(Gun == 2) {
				if(wick.machine_bullet > 4) {
					r1 = new Sound(wick);
					t1 = new Thread(r1);
					t1.start();
					wick.machine_bullet = wick.machine_bullet - 5;
					boss.Hitme(15, boss);
				}
				else {
					System.out.println("����� �Ѿ��� �����մϴ�");
				}
			}
			if(Gun == 3) {
				if(wick.machine_bullet > 0) {
					r1 = new Sound(wick);
					t1 = new Thread(r1);
					t1.start();
					wick.sniper_bullet = wick.sniper_bullet - 1;
					boss.Hitme(50, boss);
				}
				else {
					System.out.println("������ �Ѿ��� �����մϴ�");
				}
				System.out.println("��!!!");
			}

		}
		else {
			System.out.println("���� ���� �����϶�!!!");
		}


		return 0;
	}

	//�ѹٲٱ� �޼ҵ�
	public int Change(Wick wick) {	//���� �ӽŰ� ������ ������ �ٲ�
		if(wick.Gun == 3 || wick.Gun == 4) {
			wick.Gun = 1;
			System.out.println("���� ����");
		}
		else {
			wick.Gun++;
			if(wick.Gun == 2) {
				System.out.println("�ӽŰ� ����");
			}
			else if(wick.Gun == 3){
				System.out.println("������ ����");
			}
			else {
				System.out.println("���� ����");
			}
		}
		return 0;
	}



	//ȸ�Ǳ�� �޼ҵ�
	public int evasion(String move) {
		int damage = 0;
		return damage;
	}

	public void life() {
		System.out.println("HP : "+ HP);
		System.out.println("");
	}


	//test ��ü�ޱ�
	public void Hit() {
		
		
		Random r = new Random();
		int num = r.nextInt(2);
		if(num == 0) {
		System.out.println("                                                  \r\n" + 
				"                 -~.                              \r\n" + 
				"   ,            =@#@!.                            \r\n" + 
				"  !@#          ;@@@@@*                            \r\n" + 
				"  #@@~         $@@@@@@;                           \r\n" + 
				"  $@=.         *@@@@@@-                 ;*!;-,    \r\n" + 
				"  :@#          :@@@@@=                 *@@@@@@;   \r\n" + 
				"   #@!          @@@@@*                 *@@@@@@@~  \r\n" + 
				"   ~@@:         *@@@@-                .*@@@@@@@=  \r\n" + 
				"   .@@@-  -*#@=$@@@@@                 #@@@@@@@@#  \r\n" + 
				"    ;@@@@@@@@@@@@@@@@#$*,             =@@@@@@@@$  \r\n" + 
				"     !@@@@@@@@@@@@@@@@@@@~            ~@@@@@@@@!  \r\n" + 
				"      .,~;@@@@@@@@@@@@@@@@-           :@@@@@@@#,  \r\n" + 
				"          ~!@@@@@@@#@@@@@@@=~       , *@@@@@@#,   \r\n" + 
				"            @@@@@@#@@@@@@@@@@@##!!;=@@@@@@@#.     \r\n" + 
				"            $@@@@#@@@@;.,,!@@@@@##@@@@@@@@@=      \r\n" + 
				"            ;@@@#@@@@*     .:$$$==**@@@@@@@@      \r\n" + 
				"            ~@@@@@@@@:             $@@@@@@@@.     \r\n" + 
				"            ;@@@@@@@@~        .   :@@@@@@@@@-     \r\n" + 
				"            =@@@@@@@@.        ,=:,@@@@@@@@@@~     \r\n" + 
				"            $@@@@@@@@.        .:@@@@@@@@@@@@-     \r\n" + 
				"            #@@@@@@@@.        .!$@@@@@@@@@@@.     \r\n" + 
				"            @@@@@@@@@.          $@@@@@@@@@@@      \r\n" + 
				"            @@@@@@@@@,         ,@@@@@@@@@@@-      \r\n" + 
				"           ,@@@@@@@@@.         =@@@@@@@@@@;       \r\n" + 
				"            #@@@@@@@@.        .@@@@@@@@@@$        \r\n" + 
				"            =@@@@@@@#         ;@@@@@@@@@@,        \r\n" + 
				"            :@@@@@@@!        .@@@#@@@@@@~         \r\n" + 
				"            .@@@@##@.        -@@#@@@@@@=          \r\n" + 
				"             @@@@@#!         $@#@@@@@@#.          \r\n" + 
				"             $@@@@#;        .@@@@@@@@@*           \r\n" + 
				"");}
		
		else if(num == 1) {
		System.out.println("                                                  \r\n" + 
				"          ,-.                                     \r\n" + 
				"        .*@@@!               .                    \r\n" + 
				"        !@@@@@:            *@@#~                  \r\n" + 
				"       .#@@@@@#           =@@@@@,                 \r\n" + 
				"       ,@@@@@@#           @@@@@@=                 \r\n" + 
				"        @@@@@@=          .@@@@@@#                 \r\n" + 
				"        ~@@@@@.           @@@@@@*                 \r\n" + 
				"         -*$!.            *@@@@@-==$*.            \r\n" + 
				"          -!:              ;$#=,!=@$##.           \r\n" + 
				"         !@=#!              .~*#@@@@$@#.          \r\n" + 
				"        *@!@=@         .;!=#@@@@@@=*@@@$          \r\n" + 
				"       :@@*@@=~        @@@@@@@@===@@@@@@!         \r\n" + 
				"       @@@*@@=*        *@@$====@#;@@@@@@@-        \r\n" + 
				"      -@@@#$@@$;:!$#.   *=#@#=;,  ~@@@@@@=        \r\n" + 
				"      :@@@@=#@@@@@@@-    ,. .,-~,  ;@@@@@@,       \r\n" + 
				"      ;@@*@@$=#@@@$;   -:*$@@@@@@-  $@@@@@!       \r\n" + 
				"      :@@-@@@@$*.   ~=@@@@@@@@@@@*  ,@@@@@$       \r\n" + 
				"      -@@:@@@@@@;-*@@@@@@@@@@@@@@: .$@@@@@*       \r\n" + 
				"       @@$:@@@@@@@@@@@@@@@@@#=*!: -#@@@@@#,       \r\n" + 
				"       !@= #@@@@@@@@@@@$!~,      ~@@@@@@!.        \r\n" + 
				"        -  -@@@@@@@@$:.         -@@@@@*           \r\n" + 
				"            :@@@@@*,           .@@@@@:            \r\n" + 
				"             .@@@@             $@@@@-             \r\n" + 
				"              #@@@.           :@@@@~              \r\n" + 
				"              =@@@-           @@@@*               \r\n" + 
				"              !@@@:          :@@@@.               \r\n" + 
				"              :@@@;          #@@@:                \r\n" + 
				"              ~@@@!          @@@@.                \r\n" + 
				"              -@@@!         ,@@@$                 \r\n" + 
				"              ~@@@!          @@@~                 \r\n" + 
				"              :@@@;          -!:                  \r\n" + 
				"");}
		else {
		System.out.println("                                                  \r\n" + 
				"                         --                       \r\n" + 
				"                        *@@*        .             \r\n" + 
				"    .=@@;              ;@@@@.     ,#@@!           \r\n" + 
				"   .@@@@@$            ~@@@@#     ,@@@@@$          \r\n" + 
				"   !@@@@@@-          .@@@@#.     *@@@@@@.         \r\n" + 
				"   $@@@@@@:          $@@@@,      $@@@@@@~         \r\n" + 
				"   *@@@@@@~         ~@@##~   *@- =@@@@@@,         \r\n" + 
				"   ,@@@@@@.        .@@@$*   *#@$ -@@@@@#          \r\n" + 
				"    ~@@@@.     ~@= !@@@$   ~@$@@~ ~@@@#           \r\n" + 
				"      ..-##-   =@@.@@@@;    #!@@@,  ..!$,         \r\n" + 
				"        @*~#; -@@*;@@@@     ~@*@@@*. $@#@$        \r\n" + 
				"       ~##@#:~@@@-@@@@:      =@*@@@@@##@$@-       \r\n" + 
				"       :@#@@@@@@!~@@@@        $@!#@@@@@@@@$       \r\n" + 
				"        @$=@@@@; *@@@*        .$@#=;$##=;@@       \r\n" + 
				"        =@@#**$@:@@@@,          ~#@@@#@@@@@.      \r\n" + 
				"         @@@@@@@@@@@#             ,--$@@@@@-      \r\n" + 
				"         ,@@@@@@@@@@=                *@@@@@:      \r\n" + 
				"          -@@@@@@@@@~                :@@@@@;      \r\n" + 
				"           -@@@@@@@@.                ~@@@@@;      \r\n" + 
				"            .$@@@@@@,                ~@@@@@~      \r\n" + 
				"              :#@@@@~                :@@@@@,      \r\n" + 
				"                *@@@:                =@@@@@.      \r\n" + 
				"                !@@@;              -@@@@@@$       \r\n" + 
				"                !@@@!             ~@@@@@@@-       \r\n" + 
				"                ;@@@!            -@@@@@@@@.       \r\n" + 
				"                !@@@!           .@@@@@@@@@        \r\n" + 
				"                !@@@;           *@@@@;@@@@        \r\n" + 
				"                !@@@:          ,@@@@! @@@@.       \r\n" + 
				"                *@@@~          *@@@$  $@@@-       \r\n" + 
				"                =@@@-          #@@@~  !@@@=       \r\n" + 
				"");}
		
		
		
	}
}
