package Charactor;
import java.util.Timer;
import java.util.TimerTask;

import Main.Action;

import java.util.Random;

public class Boogieman extends Charactor implements Runnable{
	int level = 1;
	int levelhp = 20 * level;
	public int Frend = 1 * level;		//���� �ο�
	public int Frend_count = 0;
	public boolean life = false;				//���翩��
	
	Boogieman boogie;
	Object object;
	//���� ������ �α��
	{
		this.name = "�α��";
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
		
		Random r = new Random();				//2~4�� �̳��� �����ϰ� ����θ���
		int num;
		while(Action.Attack_Stop == false) {	//������� �������� ����
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
	//�޼ҵ� 1. �ڵ��ѽ��
	public void Shot(Wick wick, Boogieman boogie) {
		if(boogie.life) {
			wick.HP = wick.HP - Power;}
		
	}
	
	
	public void frend() {	//�����ȯ
		if(boogie.life) {// ������ �ִٸ� �����ȯ
			System.out.println(name+"��(��) �����Ѵ�!");
			if(boogie.Frend_count >= 5) {		//4�� ������ ���� ����
				boogie.Frend++;
				System.out.println(name+"��(��) ��Ÿ����!");
				boogie.Power = 1 + 1 * boogie.Frend;	//�������ŭ �Ŀ�����
				boogie.Frend_count = 0;
			}
			boogie.Frend_count++;
			//����Ҵ���?
			//FrendCheck(Frend);
		}
	}
	
	public void frend(Boogieman boogie, int num) {	//�����ȯ
		if(boogie.life) {// ������ �ִٸ� �����ȯ
			System.out.println(name+"��(��) �����Ѵ�!");
			if(boogie.Frend_count >= 5) {		//4�� ������ ���� ����
				boogie.Frend++;
				System.out.println(name+"��(��) ��Ÿ����!");
				boogie.Power = 1 + 1 * boogie.Frend;	//�������ŭ �Ŀ�����
				boogie.Frend_count = 0;
			}
			boogie.Frend_count = boogie.Frend_count + num;
			boogie.Frend_count++;
			//����Ҵ���?
			//FrendCheck(Frend);
		}
	}
	
	
	
	
	public void Hitme(int damage, Boogieman boogie) {			//�α���� ���� �´´ٸ�
		boogie.HP = boogie.HP - damage;
		if(boogie.HP <= 0 && boogie.Frend > 0) {
			boogie.Frend--;							//���� �� �پ��
			boogie.Money = boogie.Money + 10; 		//�������� �� �� ����
			boogie.HP = levelhp;
			System.out.println(name+"�� �׾����ϴ�");
		}else if(boogie.HP <= 0 && boogie.Frend <= 0) {
			System.out.println(name+"�� ��� �׾����ϴ�");
		}
		life(boogie);
		//����Ҵ���?
		//FrendCheck(Frend);
	}
	
	public void Hitme2(int damage, Boogieman boogie) {			//�α���� ������� �´´ٸ�
		boogie.HP = boogie.HP - damage;
		boogie.Frend--;								//���� �Ѹ� ������ ����
		boogie.Money = boogie.Money + 10;
		if(boogie.HP <= 0 && boogie.Frend > 0) {
			boogie.Frend--;							//���� �� �پ��
			boogie.Money = boogie.Money + 10;
			boogie.HP = levelhp;
			System.out.println(name+"�� �׾����ϴ�");
		}else if(boogie.HP <= 0 && boogie.Frend <= 0) {
			System.out.println(name+"�� ��� �׾����ϴ�");
		}
		life(boogie);
		//����Ҵ���?
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
