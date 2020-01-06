package Charactor;
import java.util.Timer;
import java.util.TimerTask;

import Main.Action;

import java.util.Random;

public class Boogieman extends Charactor implements Runnable{
	int level = 1;
	int levelhp = 20 * level;
	public int Frend = 1 * level;		//동료 인원
	public int Frend_count = 0;
	public boolean life = false;				//생사여부
	
	Boogieman boogie;
	Object object;
	//하위 조직원 부기맨
	{
		this.name = "부기맨";
		this.HP = 20 * level;
		this.Money = 10;
		this.Gun = 1;
		this.Power = 1;
	}
	public Boogieman(Boogieman boogie) {
		this.life = true;
		this.boogie = boogie;
	}
	
	@Override
	public void run() {
		
		Random r = new Random();				//2~4초 이내로 랜덤하게 동료부르기
		int num;
		while(Action.Attack_Stop == false) {	//기습공격 들어왔을때 정지
			num = r.nextInt(2);
			frend(boogie, num);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	public Boogieman() {
		this.life = true;
	}
	
	public Boogieman(int level) {
		this.level = level;
		this.life = true;		
	}
	//메소드 1. 자동총쏘기
	public void Shot(Wick wick, Boogieman boogie) {
		if(boogie.life) {
			wick.HP = wick.HP - Power;}
		
	}
	
	
	public void frend() {	//동료소환
		if(boogie.life) {// 생존해 있다면 동료소환
			System.out.println(name+"이(가) 공격한다!");
			if(boogie.Frend_count >= 5) {		//4초 지나면 동료 생성
				boogie.Frend++;
				System.out.println(name+"이(가) 나타났다!");
				boogie.Power = 1 + 1 * boogie.Frend;	//동료수만큼 파워증가
				boogie.Frend_count = 0;
			}
			boogie.Frend_count++;
			//몇명남았는지?
			//FrendCheck(Frend);
		}
	}
	
	public void frend(Boogieman boogie, int num) {	//동료소환
		if(boogie.life) {// 생존해 있다면 동료소환
			System.out.println(name+"이(가) 공격한다!");
			if(boogie.Frend_count >= 5) {		//4초 지나면 동료 생성
				boogie.Frend++;
				System.out.println(name+"이(가) 나타났다!");
				boogie.Power = 1 + 1 * boogie.Frend;	//동료수만큼 파워증가
				boogie.Frend_count = 0;
			}
			boogie.Frend_count = boogie.Frend_count + num;
			boogie.Frend_count++;
			//몇명남았는지?
			//FrendCheck(Frend);
		}
	}
	
	
	
	
	public void Hitme(int damage, Boogieman boogie) {			//부기맨이 총을 맞는다면
		boogie.HP = boogie.HP - damage;
		if(boogie.HP <= 0 && boogie.Frend > 0) {
			boogie.Frend--;							//동료 수 줄어듬
			boogie.Money = boogie.Money + 10; 		//존윅에게 줄 돈 증가
			boogie.HP = levelhp;
			System.out.println(name+"이 죽었습니다");
		}else if(boogie.HP <= 0 && boogie.Frend <= 0) {
			System.out.println(name+"이 모두 죽었습니다");
		}
		life(boogie);
		//몇명남았는지?
		//FrendCheck(Frend);
	}
	
	public void Hitme2(int damage, Boogieman boogie) {			//부기맨이 기관총을 맞는다면
		boogie.HP = boogie.HP - damage;
		boogie.Frend--;								//동료 한명 무조건 죽음
		boogie.Money = boogie.Money + 10;
		if(boogie.HP <= 0 && boogie.Frend > 0) {
			boogie.Frend--;							//동료 수 줄어듬
			boogie.Money = boogie.Money + 10;
			boogie.HP = levelhp;
			System.out.println(name+"이 죽었습니다");
		}else if(boogie.HP <= 0 && boogie.Frend <= 0) {
			System.out.println(name+"이 모두 죽었습니다");
		}
		life(boogie);
		//몇명남았는지?
		//FrendCheck(Frend);
	}
	
	
	
	public boolean life(Boogieman boogie) {
		
		if(boogie.HP < 1 && boogie.Frend < 1) {
			boogie.life = false;
		}
		return boogie.life;
	}
	
	
	public void FrendCheck(int num) {
		switch(num) {
		case 998 :
			System.out.println("        :$@@@*,                              ");
			System.out.println("      .@@@@@@@@;                            ");
			System.out.println("     $@@@@@@@@@@@@@@@@@@@@@@@@@@:           ");
			System.out.println("     -@@@@@@@@@@@@@@@@@@@@@@@@@@:           ");
			System.out.println("      :@@@@@@@@#;;#@@@;;;;;;;#@@:           ");
			System.out.println("       ,#@@@@@*   =@@@       *@@:           ");
			System.out.println("                  =@@@       *@@:           ");
			System.out.println("                  =@@@       *@@@@@@@@@@@   ");
			break;
		case 0 :
			//System.out.println(blank);
			System.out.println("      .!,  ");         
			System.out.println("    ,.~;-  ");         
			System.out.println("    !-.-*, ");         
			System.out.println("    ~;@@@@- ");        
			System.out.println("   .**@@@@* ");        
			System.out.println("    *#@@@@@ ");         
			System.out.println("      =@@#*-");        
			System.out.println("      @@@@;:");     
			System.out.println("      @@@@,.");        
			System.out.println("      $@@@, ");        
			System.out.println("      :@~@: ");        
			System.out.println("      -@.$! ");        
			System.out.println("      ,@.*= ");        
			System.out.println("      .#.!# ");        
			System.out.println("       @.-@ ");        
			System.out.println("      .#. @,");    
			break;
		case 1 :
			//System.out.println(blank);
			System.out.println("      .!,        .;.  ");         
			System.out.println("    ,.~;-        ;=-  ");         
			System.out.println("    !-.-*,       .,.  ");         
			System.out.println("    ~;@@@@-     -@@@: ");        
			System.out.println("   .**@@@@*     @@@@$ ");        
			System.out.println("    *#@@@@@    ,@@@@@.");         
			System.out.println("      =@@#*-   -#@@#@--");        
			System.out.println("      @@@@;:   ~#@@@=:-");     
			System.out.println("      @@@@,.   -*@@@~~.");        
			System.out.println("      $@@@,    -~@@@.  ");        
			System.out.println("      :@~@:    ~!@@@   ");        
			System.out.println("      -@.$!    ..@##   ");        
			System.out.println("      ,@.*=    -.@=#   ");        
			System.out.println("      .#.!#    ..@#!   ");        
			System.out.println("       @.-@     .@@;   ");        
			System.out.println("      .#. @,     #*;.  ");          
	        break;
		case 2 :
			//System.out.println(blank);
			System.out.println("      .!,        .;.       ,@-  ");         
			System.out.println("    ,.~;-        ;=-       .#,  ");         
			System.out.println("    !-.-*,       .,.      ,!@;. ");         
			System.out.println("    ~;@@@@-     -@@@:     @@@@= ");        
			System.out.println("   .**@@@@*     @@@@$    .@@@@@,");        
			System.out.println("    *#@@@@@    ,@@@@@.   ,@@@@@-");         
			System.out.println("      =@@#*-   -#@@#@-   -*@@@@~");        
			System.out.println("      @@@@;:   ~#@@@=:   -;@@@$~");     
			System.out.println("      @@@@,.   -*@@@~~   .~@@@!-");        
			System.out.println("      $@@@,    -~@@@.     .@=@~ ");        
			System.out.println("      :@~@:    ~!@@@      .@-@~ ");        
			System.out.println("      -@.$!    ..@##      -@.@~ ");        
			System.out.println("      ,@.*=    -.@=#      :@ #: ");        
			System.out.println("      .#.!#    ..@#!      !@ #; ");        
			System.out.println("       @.-@     .@@;      $# #; ");        
			System.out.println("      .#. @,     #*;.     #* $! ");          
			break;
		case 3 :
			//System.out.println(blank);
			System.out.println("      .!,        .;.       ,@-       ~.  ");         
			System.out.println("    ,.~;-        ;=-       .#,      .#;  ");         
			System.out.println("    !-.-*,       .,.      ,!@;.     ,-.  ");         
			System.out.println("    ~;@@@@-     -@@@:     @@@@=    !$@#. ");        
			System.out.println("   .**@@@@*     @@@@$    .@@@@@,   @@@@= ");        
			System.out.println("    *#@@@@@    ,@@@@@.   ,@@@@@-   -;@@# ");         
			System.out.println("      =@@#*-   -#@@#@-   -*@@@@~    ~@@@,");        
			System.out.println("      @@@@;:   ~#@@@=:   -;@@@$~    ;@@$~");     
			System.out.println("      @@@@,.   -*@@@~~   .~@@@!-    !@@;-");        
			System.out.println("      $@@@,    -~@@@.     .@=@~     !@@-.");        
			System.out.println("      :@~@:    ~!@@@      .@-@~     :@@, ");        
			System.out.println("      -@.$!    ..@##      -@.@~     -@@  ");        
			System.out.println("      ,@.*=    -.@=#      :@ #:     ,@-  ");        
			System.out.println("      .#.!#    ..@#!      !@ #;     *@.  ");        
			System.out.println("       @.-@     .@@;      $# #;    ~@@.  ");        
			System.out.println("      .#. @,     #*;.     #* $!    .;@-  ");
			break;
		case 4 :
			//System.out.println(blank);
			System.out.println("      .!,        .;.       ,@-       ~.       .~.  ");         
			System.out.println("    ,.~;-        ;=-       .#,      .#;       ~$:. ");         
			System.out.println("    !-.-*,       .,.      ,!@;.     ,-.      ~=-:: ");         
			System.out.println("    ~;@@@@-     -@@@:     @@@@=    !$@#.    .@@#;# ");        
			System.out.println("   .**@@@@*     @@@@$    .@@@@@,   @@@@=    ~@@$@@ ");        
			System.out.println("    *#@@@@@    ,@@@@@.   ,@@@@@-   -;@@#    !@@$!. ");         
			System.out.println("      =@@#*-   -#@@#@-   -*@@@@~    ~@@@,   ;=@$@. ");        
			System.out.println("      @@@@;:   ~#@@@=:   -;@@@$~    ;@@$~   -@$#@: ");     
			System.out.println("      @@@@,.   -*@@@~~   .~@@@!-    !@@;-    #$@@* ");        
			System.out.println("      $@@@,    -~@@@.     .@=@~     !@@-.   .=##@- ");        
			System.out.println("      :@~@:    ~!@@@      .@-@~     :@@,     ,#-@- ");        
			System.out.println("      -@.$!    ..@##      -@.@~     -@@      ~@.@, ");        
			System.out.println("      ,@.*=    -.@=#      :@ #:     ,@-      !$,@. ");        
			System.out.println("      .#.!#    ..@#!      !@ #;     *@.      @-.#. ");        
			System.out.println("       @.-@     .@@;      $# #;    ~@@.     .@ ,#- ");        
			System.out.println("      .#. @,     #*;.     #* $!    .;@-     .@..;; ");          
	        break;
		case 5 :
			//System.out.println(blank);
			System.out.println("      .!,        .;.       ,@-       ~.       .~.       .#,     ");         
			System.out.println("    ,.~;-        ;=-       .#,      .#;       ~$:.    ,.###     ");         
			System.out.println("    !-.-*,       .,.      ,!@;.     ,-.      ~=-::    !-.-*,    ");         
			System.out.println("    ~;@@@@-     -@@@:     @@@@=    !$@#.    .@@#;#    ~;@@@@-   ");        
			System.out.println("   .**@@@@*     @@@@$    .@@@@@,   @@@@=    ~@@$@@   .**@@@@*   ");        
			System.out.println("    *#@@@@@    ,@@@@@.   ,@@@@@-   -;@@#    !@@$!.    *#@@@@@   ");         
			System.out.println("      =@@#*-   -#@@#@-   -*@@@@~    ~@@@,   ;=@$@.      =@@#*-  ");        
			System.out.println("      @@@@;:   ~#@@@=:   -;@@@$~    ;@@$~   -@$#@:      @@@@;:  ");     
			System.out.println("      @@@@,.   -*@@@~~   .~@@@!-    !@@;-    #$@@*      @@@@,.  ");        
			System.out.println("      $@@@,    -~@@@.     .@=@~     !@@-.   .=##@-      $@@@,   ");        
			System.out.println("      :@~@:    ~!@@@      .@-@~     :@@,     ,#-@-      :@~@:   ");        
			System.out.println("      -@.$!    ..@##      -@.@~     -@@      ~@.@,      -@.$!   ");        
			System.out.println("      ,@.*=    -.@=#      :@ #:     ,@-      !$,@.      -@.$!   ");        
			System.out.println("      .#.!#    ..@#!      !@ #;     *@.      @-.#.      .#.!#   ");        
			System.out.println("       @.-@     .@@;      $# #;    ~@@.     .@ ,#-       @.-@   ");        
			System.out.println("      .#. @,     #*;.     #* $!    .;@-     .@..;;      .#. @,  ");          
	        break;
		case 6 :
			//System.out.println(blank);
			System.out.println("      .!,        .;.       ,@-       ~.       .~.       .#,        ,@-     ");         
			System.out.println("    ,.~;-        ;=-       .#,      .#;       ~$:.    ,.###        .#,     ");         
			System.out.println("    !-.-*,       .,.      ,!@;.     ,-.      ~=-::    !-.-*,      ,!@;.    ");         
			System.out.println("    ~;@@@@-     -@@@:     @@@@=    !$@#.    .@@#;#    ~;@@@@-     @@@@=    ");        
			System.out.println("   .**@@@@*     @@@@$    .@@@@@,   @@@@=    ~@@$@@   .**@@@@*    .@@@@@,   ");        
			System.out.println("    *#@@@@@    ,@@@@@.   ,@@@@@-   -;@@#    !@@$!.    *#@@@@@    ,@@@@@-   ");         
			System.out.println("      =@@#*-   -#@@#@-   -*@@@@~    ~@@@,   ;=@$@.      =@@#*-   -*@@@@~   ");        
			System.out.println("      @@@@;:   ~#@@@=:   -;@@@$~    ;@@$~   -@$#@:      @@@@;:   -;@@@$~   ");     
			System.out.println("      @@@@,.   -*@@@~~   .~@@@!-    !@@;-    #$@@*      @@@@,.   .~@@@!-   ");        
			System.out.println("      $@@@,    -~@@@.     .@=@~     !@@-.   .=##@-      $@@@,     .@=@~    ");        
			System.out.println("      :@~@:    ~!@@@      .@-@~     :@@,     ,#-@-      :@~@:     .@-@~    ");        
			System.out.println("      -@.$!    ..@##      -@.@~     -@@      ~@.@,      -@.$!     .@-@~    ");        
			System.out.println("      ,@.*=    -.@=#      :@ #:     ,@-      !$,@.      -@.$!     :@ #:    ");        
			System.out.println("      .#.!#    ..@#!      !@ #;     *@.      @-.#.      .#.!#     !@ #;    ");        
			System.out.println("       @.-@     .@@;      $# #;    ~@@.     .@ ,#-       @.-@     $# #;    ");        
			System.out.println("      .#. @,     #*;.     #* $!    .;@-     .@..;;      .#. @,    #* $!    ");          
	        break;
		case 999 :
			System.out.println("        :$@@@*,                              ");
			System.out.println("      .@@@@@@@@;                            ");
			System.out.println("     .@@@@@@@@@@;                           ");
			System.out.println("     !@@@@@@@@@@@.                          ");
			System.out.println("    -#@@@@@@@@@@@                          ");
			System.out.println("    -@@@@@@@@@@@@@@@@@@@@@@@@@@@~           ");
			System.out.println("    .@@@@@@@@@@@@@@@@@@@@@@@@@@@:           ");
			System.out.println("     $@@@@@@@@@@@@@@@@@@@@@@@@@@:           ");
			System.out.println("     -@@@@@@@@@@@@@@@@@@@@@@@@@@:           ");
			System.out.println("      :@@@@@@@@#;;#@@@;;;;;;;#@@:           ");
			System.out.println("       ,#@@@@@*   =@@@       *@@:           ");
			System.out.println("          --.     =@@@       *@@:           ");
			System.out.println("                  =@@@       *@@:           ");
			System.out.println("                  =@@@       *@@@=======*   ");
			System.out.println("                  =@@@       *@@@@@@@@@@@   ");
			System.out.println("                  :==*       :==========*   ");
			
			break;
//	        default:
//	    		System.out.println("   .!,     .;.    ,@-    ~.    .~.  ");         
//	    		System.out.println(" ,.~;-     ;=-    .#,   .#;    ~$:. ");         
//	    		System.out.println(" !-.-*,    .,.   ,!@;.  ,-.   ~=-:: ");         
//	    		System.out.println(" ~;@@@@-  -@@@:  @@@@= !$@#. .@@#;# ");        
//	    		System.out.println(".**@@@@*  @@@@$ .@@@@@,@@@@= ~@@$@@ ");        
//	    		System.out.println(" *#@@@@@ ,@@@@@.,@@@@@--;@@# !@@$!. ");         
//	    		System.out.println("   =@@#*--#@@#@--*@@@@~ ~@@@,;=@$@. ");        
//	    		System.out.println("   @@@@;:~#@@@=:-;@@@$~ ;@@$~-@$#@: ");     
//	    		System.out.println("   @@@@,.-*@@@~~.~@@@!- !@@;- #$@@* ");        
//	    		System.out.println("   $@@@, -~@@@.  .@=@~  !@@-..=##@- ");        
//	    		System.out.println("   :@~@: ~!@@@   .@-@~  :@@,  ,#-@- ");        
//	    		System.out.println("   -@.$! ..@##   -@.@~  -@@   ~@.@, ");        
//	    		System.out.println("   ,@.*= -.@=#   :@ #:  ,@-   !$,@. ");        
//	    		System.out.println("   .#.!# ..@#!   !@ #;  *@.   @-.#. ");        
//	    		System.out.println("    @.-@  .@@;   $# #; ~@@.  .@ ,#- ");        
//	    		System.out.println("   .#. @,  #*;.  #* $! .;@-  .@..;; ");    
		}
			
	                        
	}




	
	
	
	
}
