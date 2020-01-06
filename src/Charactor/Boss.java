package Charactor;

import java.util.Random;

import Main.Action;
import Main.Sound;

public class Boss extends Charactor implements Runnable{
	//마피아 보스
	public boolean life = false;				//생사여부
	{
		this.name = "마피아두목";
		this.HP = 1000;
		this.Money = 100;
		this.Gun = 1;
		this.Power = 10;
	}
	Wick wick;
	Boss boss;
	public Boss(Wick wick) throws InterruptedException {

		wick.HP = 500;					//벨런스 조정
		
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
		
		System.out.println("\n                             이런 제기랄! 존!");
		Thread.sleep(2000);
		System.out.println("                             결국 여기까지 와버렸군");
		Thread.sleep(2000);
		System.out.println("                             화끈하게 주먹으로 싸우지 않겠나");
		Thread.sleep(2000);
		System.out.println("                               Q를 입력하며 데미지를 줄 수 있습니다 ");
		
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
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"+name+"이 죽었습니다");
			System.out.println("복수에 성공했습니다 축하합니다 존윅씨");
		}
	}


	@Override
	public void run() {
		try {
			hit(boss, wick);
		} catch (InterruptedException e) {
		}
	}
	
	Runnable 맞는소리;
	Thread 처맞는소리;
	
	
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
				//System.out.println("보스에게 공격당했다!");
				맞는소리 = new Sound(boss);
				처맞는소리 = new Thread(맞는소리);
				처맞는소리.start();
				System.out.println("존윅체력: "+wick.HP+"  보스체력 : " + boss.HP);
				}
			else if(skill == 1) {
				System.out.println(hit2);
				wick.HP = wick.HP - 20;
				//System.out.println("보스에게 공격당했다!");
				맞는소리 = new Sound(boss);
				처맞는소리 = new Thread(맞는소리);
				처맞는소리.start();
				System.out.println("존윅체력: "+wick.HP+"  보스체력 : " + boss.HP);
				}
			else {
				System.out.println(hit3);
				wick.HP = wick.HP - 20;
				//System.out.println("보스에게 공격당했다!");
				맞는소리 = new Sound(boss);
				처맞는소리 = new Thread(맞는소리);
				처맞는소리.start();
				System.out.println("존윅체력: "+wick.HP+"  보스체력 : " + boss.HP);
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
				System.out.println("당신은 패배하였습니다");
				System.exit(0);
			}
		}
		System.out.println("\n\n\n\n\n\n\n이런 젠장! 내가 이길 수 있을리 없지");
		Thread.sleep(1000);
		System.out.println("다음에 또 보자구 존!");
		Thread.sleep(1000);
		System.out.println("(보스가 도망간다 제한시간안에 총으로 맞추자)");
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
			System.out.println("             "+count + "초 안에 두목을 처치하시오");
			System.out.println("보스 남은 체력 : " + boss.HP);
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
			System.out.println("             "+count + "초 안에 두목을 처치하시오");
			System.out.println("보스 남은 체력 : " + boss.HP);

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
			System.out.println("             "+count + "초 안에 두목을 처치하시오");
			System.out.println("보스 남은 체력 : " + boss.HP);

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
			System.out.println("             "+count + "초 안에 두목을 처치하시오");
			System.out.println("보스 남은 체력 : " + boss.HP);

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
		System.out.println(" 당신은 미션을 성공하지 못했습니다");
		
		System.exit(0);
	}
	
}
