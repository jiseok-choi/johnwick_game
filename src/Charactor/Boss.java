package Charactor;

import java.util.Random;

import Main.Action;
import Main.Sound;

public class Boss extends Charactor implements Runnable{
	//���Ǿ� ����
	public boolean life = false;				//���翩��
	{
		this.name = "���ǾƵθ�";
		this.HP = 1000;
		this.Money = 100;
		this.Gun = 1;
		this.Power = 10;
	}
	Wick wick;
	Boss boss;
	public Boss(Wick wick) throws InterruptedException {

		wick.HP = 500;					//������ ����
		
		System.out.println("                               .@#:~#~.        "); 
		Thread.sleep(200);
		System.out.println("                               !@@##$#*        "); 
		Thread.sleep(200);
		System.out.println("                               #@@###@@.       "); 
		Thread.sleep(200);
		System.out.println("                            ~*$@*$$$$$#$$!.    "); 
		Thread.sleep(200);
		System.out.println("                            !@#;;!$=$;~#@@,    ");         
		Thread.sleep(200);
		System.out.println("                            .#@#~....,#@@$     ");         
		Thread.sleep(200);
		System.out.println("                             .#@@@###@@@$.     ");         
		Thread.sleep(200);
		System.out.println("                              .;@@@@@@@!       ");        
		Thread.sleep(200);
		System.out.println("                               ,.:!!!;~,       ");        
		Thread.sleep(200);
		System.out.println("                               $: ,,. @!       ");         
		Thread.sleep(200);
		System.out.println("                               .$####$=        ");        
		Thread.sleep(200);
		System.out.println("                                $@@@@@:        ");     
		Thread.sleep(200);
		System.out.println("                                ~=###*,        ");        
		Thread.sleep(200);
		System.out.println("                              ,!:*. ,=~!.      ");        
		Thread.sleep(200);
		System.out.println("                            ~=*@-*=.#;;@$*-    ");        
		Thread.sleep(200);
		System.out.println("                           !@@$== .   $*#@@:   ");        
		Thread.sleep(200);
		System.out.println("                           :@@##@    :@=@@@,   ");        
		Thread.sleep(200);
		System.out.println("                           ,@@@=@#   ##$@@#    ");        
		Thread.sleep(200);
		System.out.println("                            #@@@!=. -$=@=#=    ");        
		Thread.sleep(200);
		System.out.println("                            =@@@!;: !;##:#;    ");    
		Thread.sleep(200);
		System.out.println("                            :@@@$=~ *$#=:@~    ");
		Thread.sleep(200);
		System.out.println("                            -@@@@@- =@@@$#,    ");
		Thread.sleep(200);
		System.out.println("                            ,@@@@@$,#@@@@@     ");
		Thread.sleep(200);
		System.out.println("                             .,,,,,,,,,,,.     ");
		Thread.sleep(2000);
		
		System.out.println("\n                             �̷� �����! ��!");
		Thread.sleep(2000);
		System.out.println("                             �ᱹ ������� �͹��ȱ�");
		Thread.sleep(2000);
		System.out.println("                             ȭ���ϰ� �ָ����� �ο��� �ʰڳ�");
		Thread.sleep(2000);
		System.out.println("                               Q�� �Է��ϸ� �������� �� �� �ֽ��ϴ� ");
		
	}
	public Boss(Wick wick, Boss boss) {
		this.wick = wick;
		this.boss = boss;
		Action.bossfight = true;
	}
	
	public void Hitme(int damage, Boss boss) {
		HP = HP - damage;
		if(HP < 0) {
			HP = 0;
		}
		if(HP < 500) {
			Action.bossfight = false;
			Action.bossrun = true;
		}
		
		
		
		
		if(HP <= 0) {
			Action.bossrun = false;
			Action.win = true;
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"+name+"�� �׾����ϴ�");
			System.out.println("������ �����߽��ϴ� �����մϴ� ������");
		}
	}


	@Override
	public void run() {
		try {
			hit(boss, wick);
		} catch (InterruptedException e) {
		}
	}
	
	Runnable �´¼Ҹ�;
	Thread ó�´¼Ҹ�;
	
	
	public void hit(Boss boss, Wick wick) throws InterruptedException {
		
		Random random;
		int skill;
		
		String hit1;
		String hit2;
		String hit3;
		
		
		hit1 = "                                                  \r\n" + 
				"                                                                   ~*=:.        \r\n" + 
				"                                                                  ~@@@@:        \r\n" + 
				"                                                                 .*@@@@         \r\n" + 
				"                                                                 .~@@@@         \r\n" + 
				"                                                                  .*@@@    .    \r\n" + 
				"                                       .,                     ,. .:;@@@#- .     \r\n" + 
				"                                      .~,                    -@! ;@@@@@@$;:,    \r\n" + 
				"                                      ,.                     .#;,=@@@@@@@@@!    \r\n" + 
				"                                --    -,                      #!!@@@@@@@@@@*    \r\n" + 
				"                                ;#$;:,.  *=.      .--,       .@@@@@@@@@@@@@!    \r\n" + 
				"                               ,@@@@@#:  =@-      -@@@#;-... ,@@@@@@@@@@@@@;    \r\n" + 
				"                               -@@@@@@:  :@@=;:;;;*@@@@@@@@@@@@@@@@@@@@@@@@:    \r\n" + 
				"                               -@@@@@@#~ .#$=$@@@@@@@@@@@@@@@@@@@@@@@@@@@@@-    \r\n" + 
				"                               ,$@@@@@@$!!;-.,~:::::;=#@@@@@@@@@@@@@@@@@@@@.    \r\n" + 
				"                                ;@@@@@@@@@$-         .,-~*#@@@@@@@@@@@#::@#     \r\n" + 
				"                                .,,.=@@@@@@$.            ..,=@@@@@@@@@;  .-     \r\n" + 
				"                                    ;@@@@@@@:                $@@@@@@#~          \r\n" + 
				"                                    ,@@@@@@@=     -.         .@@@@@@~           \r\n" + 
				"                                    .@@@@@@@$-  .;@;          =@@@@;            \r\n" + 
				"                                    .@@@@@@@@;~!=@=~          ;@@@#.            \r\n" + 
				"                                    .@@@@@@@@@#@#,.           -@@@#             \r\n" + 
				"                                     @@@@@@@@@@#.             ,@@@$             \r\n" + 
				"                                     $*~=@@@@@@-              ,#@@=             \r\n" + 
				"                                        *@@@@@@~              .$@@$             \r\n" + 
				"                                        *@@@@@@*              .=@@#             \r\n" + 
				"                                       ,=@@@@@@#-             .=@@@.            \r\n" + 
				"                                       ,$@@@@@@@$             .=@@@.            \r\n" + 
				"                                       .=@@@@@@@@=             !@@@-            \r\n" + 
				"                                        *@@@@@@@@@:            ,*@@:            \r\n" + 
				"                                        ;@@@@@@@@@$,            -$@!            \r\n" + 
				"                                        ~#@@@@@@@@@!.           .=@*            \r\n" + 
				"";
		
		hit2 = "                                                  \r\n" + 
				"                                                                           .,   \r\n" + 
				"                                  -:,                                    -$@@#! \r\n" + 
				"                                ,$@@@$,                                 ,#@@@@@~\r\n" + 
				"                                $@@@@@@.                                $@@@@@@=\r\n" + 
				"                                @@@@@@@!                               .#@@@@@@@\r\n" + 
				"                               ,@@@@@@@$                               .@@@@@@@#\r\n" + 
				"                                @@@@@@@#                               .#@@@@@@*\r\n" + 
				"                                $@@@@@@$                                *@@@@@@-\r\n" + 
				"                                ,#@@@@@*.,                               $@@@#- \r\n" + 
				"                                 ,=@@@@@@#$:                    .       ,@@@;.  \r\n" + 
				"                                    ,@@@@$@@#~                 ~@#.    ,#@@@.   \r\n" + 
				"                                     ,@@@=@@@@#:               $@@#-  .=#$#@.   \r\n" + 
				"                                      =@@@$$@@@@,              ;@@@#:.!#@@=@    \r\n" + 
				"                                      -@@@@@=#@@:               :@@@@@@@@@=*    \r\n" + 
				"                                       !@@@@@$@@!     ~-     ,,  .#@@@@@$=@.    \r\n" + 
				"                                       ,@@@@@$@@$.,-  ~~  -=#@@#*~.*@#=$#@$     \r\n" + 
				"                                        :@@@@$@@@,~.. ..~=@@@@@@@@#;*$@@@@!     \r\n" + 
				"                                         $@@@$@@@~;,:.;@@@@@@@@@@@@@@;=*::      \r\n" + 
				"                                         -@#@@*@=,, *#@@@@@@=,~#@@@@@$$:#;      \r\n" + 
				"                                          ~=@#.. .~-@@@@@@*-   .;@@@@;=!;.      \r\n" + 
				"                                          !@@=~  ,;:$@@#=,       ,$@@;$@!       \r\n" + 
				"                                          :$@@$:~:  .!;.          -@@;*;.       \r\n" + 
				"                                         =#=@@$..;                ,@@=$-        \r\n" + 
				"                                        ;@@#@;                    ,@@#@         \r\n" + 
				"                                       -***@:                     ,@@**         \r\n" + 
				"                                      .!$$$~                      ,@@#*         \r\n" + 
				"                                      -@@@=                       ,@@@!         \r\n" + 
				"                                      -@@@=                       ,@@@;         \r\n" + 
				"";
		
		
		hit3 = "                                                  \r\n" + 
				"                                        .                                       \r\n" + 
				"                                  ...  :=*-                                     \r\n" + 
				"                                ,*##$;.@@@#                                     \r\n" + 
				"                               ~#@@@@@*@@@@,                                    \r\n" + 
				"                              ,$@@@@@@$@@@@~                           -:;;~.   \r\n" + 
				"                              !@@@@@@@$@@@@:                         .;$@@@#*,  \r\n" + 
				"                              @@@@@@@@$@@@@;                         ;@@@@@@@=. \r\n" + 
				"                              @@@@@@@@$@@@@:                        -#@@@@@@@@~ \r\n" + 
				"                              @@@@@@@@*@@@@~                        *@@@@@@@@@! \r\n" + 
                "                              @@@@@@@@!@@@@,                        #@@@@@@@@@= \r\n" + 
				"                              *@@@@@@@!@@@@                         @@@@@@@@@@=.\r\n" + 
				"                              ,#@@@@@#=@@@#                         @@@@@@@@@@* \r\n" + 
				"                               :#@@@@$@@@@* ,:                      #@@@@@@@@@: \r\n" + 
				"                                ~#@@@=@@@@-.~:-                     ;@@@@@@@@=, \r\n" + 
				"                                 =@@@=@@@#  ,,     !:,              .$@@@@@@#~  \r\n" + 
				"                                 =@@$#@@@=-     .  :--               ;@@@@#$-   \r\n" + 
				"                                 =@@$#@@@!*    .~  --               .=@@@$:.    \r\n" + 
				"                                 $@#$@@@#*~-  ..        ,==;       .=@@@@!      \r\n" + 
				"                                 $@$#@###~ *!*$         $@@@;      ###@@@!      \r\n" + 
				"                                 $@$@@#,.   ,;~         @@@@@!.   ;*##=#@;      \r\n" + 
				"                                 =@$$@@:   .*#$!~.      *@@@@@*, ~=@@@@=#~      \r\n" + 
				"                                 *@@$=#,   ;@@@@#$*-    .*@@@@@$=#@@@@@=#,      \r\n" + 
				"                                 ;@@@$,    @@@@@@@@@#!,   ;@@@@@@@@@@@=#$       \r\n" + 
				"                                 ~@@@@@*. .@@@@@@@@@@@@=;-.~$@@@@@@#$=#@;       \r\n" + 
				"                                 ,@@@@@#~-~=@@@@@@@@@@@@@#!--*@@@#$$$@@@,       \r\n" + 
				"                                 .@@@@@=;$,;**$@@@@@@@@@@@@#*-~==$#@@@@*        \r\n" + 
				"                                  #@@@@*!#..;, ,;=#@@@@@@@@@@#*@@@@@@@@,        \r\n" + 
				"                                  ;==$@*!#- .     ,~!=@@@@@@@@@@@@@@@@=         \r\n" + 
				"                                  ,;!;$*!*-          ,~=@@@@@@@@@@@@@@~         \r\n" + 
				"                                  .$@#@*::*,           .;@@@@@@@@@@@@=.         \r\n" + 
				"                                   $@@@*::*$-            :#@@@@@@@@@@;          \r\n" + 
				"                                   ;=!$*!*:*=~            :#@@@@@@@@$,          \r\n" + 
				"                                   ,;!$=*#=!=$~            ~$@@@@@@@;           \r\n" + 
				"                                   ,$@@@@@@@@@@:            ~@@@@@@$            \r\n" + 
				"";
		
		while(Action.bossfight) {
			random = new Random();
			skill = random.nextInt(2);
			
			if(skill == 0) {
				System.out.println(hit1);
				wick.HP = wick.HP - 20;
				//System.out.println("�������� ���ݴ��ߴ�!");
				�´¼Ҹ� = new Sound(boss);
				ó�´¼Ҹ� = new Thread(�´¼Ҹ�);
				ó�´¼Ҹ�.start();
				System.out.println("����ü��: "+wick.HP+"  ����ü�� : " + boss.HP);
				}
			else if(skill == 1) {
				System.out.println(hit2);
				wick.HP = wick.HP - 20;
				//System.out.println("�������� ���ݴ��ߴ�!");
				�´¼Ҹ� = new Sound(boss);
				ó�´¼Ҹ� = new Thread(�´¼Ҹ�);
				ó�´¼Ҹ�.start();
				System.out.println("����ü��: "+wick.HP+"  ����ü�� : " + boss.HP);
				}
			else {
				System.out.println(hit3);
				wick.HP = wick.HP - 20;
				//System.out.println("�������� ���ݴ��ߴ�!");
				�´¼Ҹ� = new Sound(boss);
				ó�´¼Ҹ� = new Thread(�´¼Ҹ�);
				ó�´¼Ҹ�.start();
				System.out.println("����ü��: "+wick.HP+"  ����ü�� : " + boss.HP);
				}
			Thread.sleep(500);
			if(wick.HP < 0) {
				System.out.println(
						" ##   ##    ###     #####    #####     ###     #####    #  ##            ######    #####     ###     #    \r\n" + 
						" ### ###    ##     ##  ##   ##  ##     ##     ##  ##   ##  ##            ##       ##  ##     ##     ##   \r\n" + 
						" #######    ##     ##       ##         ##     ##  ##   ### ##            ##       ##  ##     ##     ##   \r\n" + 
						" ## # ##    ##      ####     ####      ##     ##  ##   ######            ####     ######     ##     ##   \r\n" + 
						" ##   ##    ##         ##       ##     ##     ##  ##   ######            ##       ##  ##     ##     ##   \r\n" + 
						" ##   ##    ##         ##       ##     ##     ##  ##   ## ###            ##       ##  ##     ##     ##   \r\n" + 
						" ##   ##    ##     ##  ##   ##  ##     ##     ##  ##   ##  ##            ##       ##  ##     ##     ##   \r\n" + 
						" ##   #    ###     #####    #####     ###     #####    ##  #             ##       ##  #     ###     #####    ");
				System.out.println("����� �й��Ͽ����ϴ�");
				System.exit(0);
			}
		}
		System.out.println("\n\n\n\n\n\n\n�̷� ����! ���� �̱� �� ������ ����");
		Thread.sleep(1000);
		System.out.println("������ �� ���ڱ� ��!");
		Thread.sleep(1000);
		System.out.println("(������ �������� ���ѽð��ȿ� ������ ������)");
		Thread.sleep(1000);
		
		int count = 10;
		Action.bossrun = true;
		while(Action.bossrun) {
			
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\r\n" + 
					"                                 .*@@#    \r\n" + 
					"                                  :@@$    \r\n" + 
					"                                  ;@@~    \r\n" + 
					"                                 ~@@,     \r\n" + 
					"                                .#@@;     \r\n" + 
					"                                *@@#=     \r\n" + 
					"                               =@@@=!     \r\n" + 
					"                               #@#$$~     \r\n" + 
					"                               #!#*#:-.   \r\n" + 
					"                              -#$@$@##=:  \r\n" + 
					"                              *@@@@;,,-,  \r\n" + 
					"                             ;@@@@@=.     \r\n" + 
					"                               #@@@@#,    \r\n" + 
					"                               #@@#@@$.   \r\n" + 
					"                               =@$;#@@:   \r\n" + 
					"                              ;:@@$@@@;   \r\n" + 
					"                              *#@@#@*,    \r\n" + 
					"                              :@@~        \r\n" + 
					"                             .=@!         \r\n" + 
					"                             ~@!          \r\n" + 
					"                             ;!           \r\n" + 
					"                            ;@-           \r\n" + 
					"                            ;#:           \r\n" + 
					"                            .~:           \r\n" + 
					"");
			System.out.println("             "+count + "�� �ȿ� �θ��� óġ�Ͻÿ�");
			System.out.println("���� ���� ü�� : " + boss.HP);
			Thread.sleep(250);
			System.out.println("\r\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" + 
					"                                 !#$,     \r\n" + 
					"                                 @@@~     \r\n" + 
					"                                 !@@;     \r\n" + 
					"                                 !@;.     \r\n" + 
					"                                *@@;      \r\n" + 
					"                              -*@@@$      \r\n" + 
					"                             ,#@$@@$      \r\n" + 
					"                             :@=@@@*      \r\n" + 
					"                             ,@$@@@@=*,   \r\n" + 
					"                              ;@@@=.~#!   \r\n" + 
					"                             ,=@@@!       \r\n" + 
					"                              -@@@=.      \r\n" + 
					"                              ~@@@@:      \r\n" + 
					"                         ~,   $@@@@#.     \r\n" + 
					"                      .=@#$==;@@=.#@#.    \r\n" + 
					"                      ~;:;*$@@@#- ,$@~    \r\n" + 
					"                           .-:$~   *@*    \r\n" + 
					"                                   ~@=.   \r\n" + 
					"                                    ;#,   \r\n" + 
					"                                     =!   \r\n" + 
					"                                     *#-  \r\n" + 
					"                                     .~.  \r\n" + 
					"");
			System.out.println("             "+count + "�� �ȿ� �θ��� óġ�Ͻÿ�");
			System.out.println("���� ���� ü�� : " + boss.HP);

			Thread.sleep(250);
			System.out.println("\r\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" + 
					"                                    ,~-.  \r\n" + 
					"                                   -#@@!  \r\n" + 
					"                                   -#@@*  \r\n" + 
					"                                    *@@*  \r\n" + 
					"                                   ,=@$:  \r\n" + 
					"                                  .=@@!   \r\n" + 
					"                                 -$@@@#   \r\n" + 
					"                                ;@@#@@#,  \r\n" + 
					"                               .$@;@@@#.  \r\n" + 
					"                               ,$$;@@@=   \r\n" + 
					"                               .=:$@@@.   \r\n" + 
					"                               ,*;@@@#    \r\n" + 
					"                              .==@@@@#    \r\n" + 
					"                               -~$@@@@*.  \r\n" + 
					"                                ~##@@@@*. \r\n" + 
					"                                *@@=;#@@* \r\n" + 
					"                               ,$@@~ .===.\r\n" + 
					"                               :@@: .*@$- \r\n" + 
					"                              =@@*  ,#@!  \r\n" + 
					"                             !@@;  -=$,   \r\n" + 
					"                            -@@;. ,##.    \r\n" + 
					"                           ~$@~   .=*     \r\n" + 
					"                          .@$.     :=     \r\n" + 
					"                          .$;       ;.    \r\n" + 
					"                           ;;             \r\n" + 
					"                           .-             \r\n" + 
					"");
			System.out.println("             "+count + "�� �ȿ� �θ��� óġ�Ͻÿ�");
			System.out.println("���� ���� ü�� : " + boss.HP);

			Thread.sleep(250);
			System.out.println("\r\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" + 
					"                                     .    \r\n" + 
					"                                    *=*.  \r\n" + 
					"                                   -@@@-  \r\n" + 
					"                                    $@@!  \r\n" + 
					"                                   .$@*,  \r\n" + 
					"                                  ,$@@-   \r\n" + 
					"                                 ,=@@@:   \r\n" + 
					"                                ,#@@@@~   \r\n" + 
					"                                =@*#@=,   \r\n" + 
					"                                ;#$$@*    \r\n" + 
					"                                 !@@=@-   \r\n" + 
					"                                ~@@@@:*   \r\n" + 
					"                                ;@@@@,!*  \r\n" + 
					"                            -,  -@@$@!,=  \r\n" + 
					"                          ,!$$~..@@#@=    \r\n" + 
					"                           ..:#$!@@#@@,   \r\n" + 
					"                               *@@@~$@:   \r\n" + 
					"                               .;#$,#@~   \r\n" + 
					"                                 .. @@-   \r\n" + 
					"                                    =@-   \r\n" + 
					"                                    -#,   \r\n" + 
					"                                    -#-   \r\n" + 
					"                                    !$=;  \r\n" + 
					"                                     ...  \r\n" + 
					"");
			System.out.println("             "+count + "�� �ȿ� �θ��� óġ�Ͻÿ�");
			System.out.println("���� ���� ü�� : " + boss.HP);

			Thread.sleep(250);
			count--;
			
			if(count < 0 || Action.win) {
			Action.bossrun = false;}
			
		}
//		boolean t = true;
//		while(t) {
//			if(Action.win) {
//				t=false;
//			}
//			Thread.sleep(1000);
//		}
		
		
		System.out.println(
				" ##   ##    ###     #####    #####     ###     #####    #  ##            ######    #####     ###     #    \r\n" + 
				" ### ###    ##     ##  ##   ##  ##     ##     ##  ##   ##  ##            ##       ##  ##     ##     ##   \r\n" + 
				" #######    ##     ##       ##         ##     ##  ##   ### ##            ##       ##  ##     ##     ##   \r\n" + 
				" ## # ##    ##      ####     ####      ##     ##  ##   ######            ####     ######     ##     ##   \r\n" + 
				" ##   ##    ##         ##       ##     ##     ##  ##   ######            ##       ##  ##     ##     ##   \r\n" + 
				" ##   ##    ##         ##       ##     ##     ##  ##   ## ###            ##       ##  ##     ##     ##   \r\n" + 
				" ##   ##    ##     ##  ##   ##  ##     ##     ##  ##   ##  ##            ##       ##  ##     ##     ##   \r\n" + 
				" ##   #    ###     #####    #####     ###     #####    ##  #             ##       ##  #     ###     #####    ");
		System.out.println(" ����� �̼��� �������� ���߽��ϴ�");
		
		System.exit(0);
	}
	
}
