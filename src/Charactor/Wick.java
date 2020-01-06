package Charactor;
import java.util.Random;

import Main.Sound;
import Weapon.*;

public class Wick extends Charactor {
	//우리의 주인공 존윅
	{
		this.name = "존윅";
		this.HP = 1000;			//체력
		this.Money = 100;		//소지 금화
		this.Gun = 1;			//기본권총 소유
		this.Power = 100;
	}
	
	Wick wick;
	
	
	public int machine_bullet = 50;		//기관총 총알개수
	public int sniper_bullet = 0;		//저격총 총알개수
	public boolean stun = false;		//스턴상태 유무
	
	Gun gun = new Gun();
	MachineGun gun2 = new MachineGun();
	Sniper gun3 = new Sniper();
	
	Runnable r1;	//윅 총소리 러너블생성
	Thread t1;		//윅 총소리 쓰레드생성
	
	
	public Wick(){

	}

	///////////////추가 메소드
	//총쏘기 메소드
	public int Shot(Wick wick, Boogieman boogie) {		//부기맨만 공격

		if(wick.stun == false) {								//스턴이 아닌상태만 공격할 수 있음
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
					//System.out.println("따다당!!");
					wick.machine_bullet = wick.machine_bullet - 5;
					r1 = new Sound(wick);
					t1 = new Thread(r1);
					t1.start();
				}
				else {
					System.out.println("기관총 총알이 부족합니다");
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
					//System.out.println("따아아앙!!!!!");
					wick.sniper_bullet = wick.sniper_bullet - 1;
					r1 = new Sound(wick);
					t1 = new Thread(r1);
					t1.start();
				}
				else {
					System.out.println("저격총 총알이 부족합니다");
					wick.Gun = 0;
					r1 = new Sound(wick);
					t1 = new Thread(r1);
					t1.start();
				}
				System.out.println("탕!!!");
			}
		}
		else {
			System.out.println("적을 먼저 제압하라!!!");
		}

		return 0;
	}

	public int Shot(Wick wick, MiddleBoss middle) {		//부기맨만 공격

		if(wick.stun == false) {								//스턴이 아닌상태만 공격할 수 있음
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
					System.out.println("기관총 총알이 부족합니다");
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
					System.out.println("저격총 총알이 부족합니다");
					wick.Gun = 0;
				}
				System.out.println("탕!!!");
			}
		}
		else {
			System.out.println("적을 먼저 제압하라!!!");
		}

		return 0;
	}




	public int Shot(Wick wick, Boogieman boogie, MiddleBoss middle) {			//부기맨과 중간보스 같이 공격

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
					System.out.println("기관총 총알이 부족합니다");
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
					System.out.println("저격총 총알이 부족합니다");
				}
				System.out.println("탕!!!");
			}
		}
		else {
			System.out.println("적을 먼저 제압하라!!!");
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
				System.out.println("존윅체력: "+wick.HP+"  보스체력 : " + boss.HP);
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
					System.out.println("기관총 총알이 부족합니다");
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
					System.out.println("저격총 총알이 부족합니다");
				}
				System.out.println("탕!!!");
			}

		}
		else {
			System.out.println("적을 먼저 제압하라!!!");
		}


		return 0;
	}

	//총바꾸기 메소드
	public int Change(Wick wick) {	//권총 머신건 저격총 순서로 바뀜
		if(wick.Gun == 3 || wick.Gun == 4) {
			wick.Gun = 1;
			System.out.println("권총 장착");
		}
		else {
			wick.Gun++;
			if(wick.Gun == 2) {
				System.out.println("머신건 장착");
			}
			else if(wick.Gun == 3){
				System.out.println("저격총 장착");
			}
			else {
				System.out.println("권총 장착");
			}
		}
		return 0;
	}



	//회피기능 메소드
	public int evasion(String move) {
		int damage = 0;
		return damage;
	}

	public void life() {
		System.out.println("HP : "+ HP);
		System.out.println("");
	}


	//test 객체받기
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
