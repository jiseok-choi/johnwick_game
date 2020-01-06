package Main;
import java.awt.Container;

import javax.swing.JFrame;

import Charactor.*;

public class Stage implements Runnable{
	Wick wick = new Wick();
	//멤버변수
	String location;
	public Stage() {
		
	}
	@Override
	public void run() {
		for (int i = 5; i > 0; i--) {
			try {
				System.out.println("\n\n\n전투시작 "+i+"초 전");
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
			
		System.out.println("\n\n\n적을 섬멸하라!");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	
	
	public void Mylife(Wick wick) {
		String 총명;
		if(wick.Gun == 1) {
			총명 = "권총";
		}
		else if(wick.Gun == 2) {
			총명 = "기관총";
		}
		else {
			총명 = "저격총";
		}
		
		System.out.println("********************************");
		System.out.println("**  존윅체력 : " + wick.HP);
		System.out.println("**  소지금화 : " + wick.Money);
		System.out.println("**  현재총명 : " + 총명);
		System.out.println("**  총알개수 : 권총  ∞ 기관총 "+wick.machine_bullet+" 저격총 "+wick.sniper_bullet);
		System.out.println("********************************");
	}
	public void Mylife(Wick wick, int 남은적수) {
		String 총명;
		if(wick.Gun == 1) {
			총명 = "권총";
		}
		else if(wick.Gun == 2) {
			총명 = "기관총";
		}
		else {
			총명 = "저격총";
		}
		
		if(남은적수 < 0) {
			남은적수 = 0;}
		
		System.out.println("********************************");
		System.out.println("**  존윅체력 : " + wick.HP);
		System.out.println("**  남은적수 : " + 남은적수);
		System.out.println("**  현재총명 : " + 총명);
		System.out.println("**  총알개수 : 권총  ∞ 기관총 "+wick.machine_bullet+" 저격총 "+wick.sniper_bullet);
		System.out.println("********************************");
	}

	void key() {
		System.out.println("<기본설명>");
		System.out.println("존윅은 적을 총으로 제거해야합니다");
		System.out.println("총은 권총, 기관총, 저격총이 존재하며 기관총과 저격총은 총알을 구매해야 합니다");
		System.out.println("호텔에서 치료와 총알을 구입할 수 있습니다");
		System.out.println("회피는 방향에 따라서 움직이기를 완성해야합니다");
		System.out.println("\n\n<조작키>\n총쏘기 : Q");
		System.out.println("총바꾸기 : F");		
		System.out.println("움직이기 : W S A D");
		System.out.println("       (상 하 좌 우)\n\n");
		System.out.println("**********************************************\n<적 캐릭터>");
		System.out.println("                                 .@#:~#~.        "); 
		System.out.println("                                 !@@##$#*        "); 
		System.out.println("                                 #@@###@@.       "); 
		System.out.println("                              ~*$@*$$$$$#$$!.    "); 
		System.out.println("             @@@$@=#@*@@      !@#;;!$=$;~#@@,    ");         
		System.out.println("             @@@** ~@#=@      .#@#~....,#@@$     ");         
		System.out.println("             @@~:: ,#;~@       .#@@@###@@@$.     ");         
		System.out.println("             @@$;= :#@=@        .;@@@@@@@!       ");        
		System.out.println("   .!,       @@!,-  -=!@         ,.:!!!;~,       ");        
		System.out.println(" ,.~;-       @@,     ~$@         $: ,,. @!       ");         
		System.out.println(" !-.-*,      @@      .#@         .$####$=        ");        
		System.out.println(" ~;@@@@-     @        $@          $@@@@@:        ");     
		System.out.println(".**@@@@*     @=-,   - =@          ~=###*,        ");        
		System.out.println(" *#@@@@@     @!,:   ~.=@        ,!:*. ,=~!.      ");        
		System.out.println("   =@@#*-    @$:    - =@      ~=*@-*=.#;;@$*-    ");        
		System.out.println("   @@@@;:    @@@-   .,@@     !@@$== .   $*#@@:   ");        
		System.out.println("   @@@@,.    @@@! * -#@@     :@@##@    :@=@@@,   ");        
		System.out.println("   $@@@,     @@@! @. #@@     ,@@@=@#   ##$@@#    ");        
		System.out.println("   :@~@:     @@@!-@; #@@      #@@@!=. -$=@=#=    ");        
		System.out.println("   -@.$!     @@@::@= #@@      =@@@!;: !;##:#;    ");    
		System.out.println("   ,@.*=     @@@:;@$ $@@      :@@@$=~ *$#=:@~    ");
		System.out.println("   .#.!#     @@@~!@$.!@@      -@@@@@- =@@@$#,    ");
		System.out.println("    @.-@     @@@-!@@:-@@      ,@@@@@$,#@@@@@     ");
		System.out.println("   .#. @,    @@@~#@@$-*$       .,,,,,,,,,,,.     ");
		System.out.println("     부기맨                 중간보스                           마피아두목");
		System.out.println("**********************************************");
		System.out.println(" - 부기맨을 처치할때마다 금화 10개씩 얻습니다");
		System.out.println(" - 부기맨과 중간보스는 동료를 일정확률로 부를 수 있습니다");
		System.out.println(" - 중간보스는 주인공을 제압할 수 있습니다");
		System.out.println(" - 중간보스는 일정확률로 총을 회피할 수 있습니다");
		System.out.println("   (권총44%, 기관총 25%, 저격총 0%)");
		System.out.println(" - 마피아 두목은 끝에 등장합니다");
		System.out.println("\n\n<게임을 시작합니다>");
	}
	
	
	
	//메소드
	void stage1(String land, Wick wick) {

	
		
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println(land+"에 부기맨들이 들이닥쳤다. 싸움을 시작하자");
		Mylife(wick);							//스텟확인하고 싸우기
		System.out.println("Press any key");

	}
	
	void stage2(String land, Wick wick) {
		
		
		
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println(land+"에 마피아두목이 있다는 정보를 입수했다. 싸움을 시작하자");
		Mylife(wick);							//스텟확인하고 싸우기
		System.out.println("Press any key");
	}
	
	
	//휴식 타임
	void rest(int HP) {			
		System.out.println("\n\n\n\n\n\n\n\n");
		System.out.println("       $$$$$$        ");
		System.out.println("       $$$$$$        ");
		System.out.println("    $$$$$$$$$$$$     ");
		System.out.println("    $$$$$$$$$$$$     ");
		System.out.println("    $$--$$$$--$$     ");
		System.out.println("    $$--$$$$--$$     ");
		System.out.println("    $$$$$$$$$$$$$    ");
		System.out.println("   $$$$$$$$$$$$$$$   ");
		System.out.println("   $$$--$$$$--$$$$   ");
		System.out.println("   $$$--$$$$--$$$$   ");
		System.out.println("   $$$$$$$$$$$$$$$   ");
		System.out.println("   $$$$$$$$$$$$$$$   ");
		System.out.println("   $$$$!!===!!$$$$   ");
		System.out.println("   $$$$!!===!!$$$$   ");
		System.out.println(" $$$$$$!!===!!$$$$$$ ");
		System.out.println("**********************");

		System.out.println("\n적들을 모두 제거하였습니다");
		System.out.println("콘티넨탈 호텔로 가시겠습니까?");
		System.out.println("존윅 체력 : " + HP);

		System.out.println("\n1. Yes   2. No");
	}

	public void frendcheck(Boogieman boogie1) {
		boogie1.FrendCheck(boogie1.Frend);
	}
	
	public void frendcheck(Boogieman boogie1, Boogieman boogie2) {
		boogie1.FrendCheck(boogie1.Frend);
		boogie2.FrendCheck(boogie2.Frend);
	}	
	
	public void frendcheck(Boogieman boogie1, Boogieman boogie2, Boogieman boogie3) {
		boogie1.FrendCheck(boogie1.Frend);
		boogie2.FrendCheck(boogie2.Frend);
		boogie3.FrendCheck(boogie3.Frend);
	}
	
	public void frendcheck(Boogieman boogie1, Boogieman boogie2, MiddleBoss middle) {
		boogie1.FrendCheck(boogie1.Frend);
		boogie2.FrendCheck(boogie2.Frend);
		middle.FrendCheck(middle.Frend);
	}
	

	
	
	
}
