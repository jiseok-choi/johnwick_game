package Main;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import Charactor.Wick;

public class Hotel extends Thread{
	Wick wick = new Wick();
	String blank = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";
	
	int Hillmoney = 20;				//치료요금
	int Bullet_Machine = 50;		//기관총 총알 개수
	int price_Machine = 50;			//기관총 총알 가격
	int Bullet_Sniper = 30;			//저격총 총알 개수
	int price_Sniper = 50;			//저격총 총알 가격
	
	int 주사위1 = 0;
	int 주사위2 = 0;
	int 배팅한도 = 0;
	int 배팅금화 = 0;
	//메소드
	
	public Hotel() {
		
	}
	
	
	public Hotel(Wick wick) {						//호텔 인사말
		System.out.println();
		System.out.println("Mr.존윅씨 무엇을 도와드릴까요?");
		System.out.println("소지금화 " + wick.Money);
		System.out.println("현재체력 " + wick.HP);
		System.out.println("1. 의사를 불러주세요(금화-20)   2. 총알이 필요합니다      3. 카지노에 무슨게임이 있죠?    4. 나가겠습니다");
	}
	

	
	
	
	public void Hill(Wick wick) {			//존윅치료회복
		if(wick.Money >= 20) {
			System.out.println();
			if(wick.HP > 950) {
				wick.HP = 1000;}
			else {
				wick.HP = wick.HP + 50;}
			wick.Money = wick.Money - 20;
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("치료를 완료했습니다");
			System.out.println("언제든 대기하겠습니다 존윅씨");
		}
		else {
			System.out.println("금화가 부족합니다");
		}
	}
	
	
	public void bullet(Wick wick) {			//총구매상황
		System.out.println("\n\n\n");
		System.out.println("현재 존윅님께서 소지하고 계신 상태 입니다");
		System.out.println("보유금화 : "+wick.Money);
		System.out.println("총알개수 : 권총  ∞ 기관총 "+wick.machine_bullet+" 저격총 "+wick.sniper_bullet);
		System.out.println("기관총알 "+Bullet_Machine+"개에 금화"+ price_Machine+"개");
		System.out.println("저격총알 "+Bullet_Sniper+"개에 금화"+ price_Sniper+"개");
		System.out.println("\n무엇이 필요하십니까?\n1. 기관총알        2. 저격총알        3. 구매하지 않겠습니다");
	}
	
	public void bullet(Wick wick, int num) { //무엇을 구매할건지?
		
//		switch(num){
//		case 1 :
//			if (wick.Money > price_Machine) {
//				wick.machine_bullet = wick.machine_bullet + Bullet_Machine;	//총알 충전
//				wick.Money = wick.Money - price_Machine;					//금화 차감
//				System.out.println("구매 감사합니다 존윅씨");
//			}
//			else {
//				System.out.println("금화가 부족합니다");
//			}
//			break;
//		case 2 :
//			if(wick.Money > price_Machine) {
//				wick.sniper_bullet = wick.sniper_bullet + Bullet_Sniper;	//총알충전
//				wick.Money = wick.Money - price_Sniper;						//금화 차감
//				System.out.println("구매 감사합니다 존윅씨");
//			}
//			else {
//				System.out.println("금화가 부족합니다");
//			}
//			break;
//		case 3 :
//			System.out.println("감사합니다 존윅씨");
//			break;
//		}
		if(num == 1) {
			if (wick.Money > price_Machine) {
				wick.machine_bullet = wick.machine_bullet + Bullet_Machine;	//총알 충전
				wick.Money = wick.Money - price_Machine;					//금화 차감
				System.out.println("구매 감사합니다 존윅씨");
			}
			else {
				System.out.println("금화가 부족합니다");
			}
		}
		else if(num == 2) {
			if(wick.Money > price_Machine) {
			wick.sniper_bullet = wick.sniper_bullet + Bullet_Sniper;	//총알충전
			wick.Money = wick.Money - price_Sniper;						//금화 차감
			System.out.println("구매 감사합니다 존윅씨");
			}
			else {
				System.out.println("금화가 부족합니다");
			}
		}
		else {
			System.out.println("감사합니다 존윅씨");
		}
	}
	
	public boolean holjjack(Wick wick, int num, int 배팅금화, int holjak) {
		boolean 단계진행 = true;
		
		if(num == 1) {		//게임설명
			System.out.println("카지노 홀짝 주사위게임에 오신걸 환영합니다");
			System.out.println("★★★게임 설명★★★");
			System.out.println("1. 주사위는 2개입니다");
			System.out.println("2. 소지하신 금화 한도내에 배팅금을 넣을 수 있습니다");
			System.out.println("3. 배팅을 하고 주사위를 굴리면 게이머는 홀수와 짝수를 정할 수 있습니다");
			System.out.println("4. 정답을 맞추면 배팅금화의 2배, 맞추지 못하면 배팅금화는 소멸합니다");

			System.out.println("\n**  소지금화 : " + wick.Money);
			System.out.print("얼마를 배팅하시겠습니까? : ");
		}
		else if(num == 2) {		//배팅금액설정
			System.out.println();
			if(wick.Money >= 배팅금화) {
				wick.Money = wick.Money - 배팅금화;	
			}
			else {
				System.out.println("금화가 부족합니다");
				단계진행 = false;
			}
		}
		else if(num == 3) {		//결과 진행
			Random ran = new Random();
			주사위1 = ran.nextInt(6) + 1;
			Random ran2 = new Random();
			주사위2 = ran2.nextInt(6) + 1;
			int 홀짝 = 주사위1 + 주사위2;
			int 결과 = 홀짝 % 2;
			
			if(결과 == holjak) {
				System.out.println("첫번째 주사위  : "+주사위1 + " 두번째 주사위  : "+주사위2 );
				System.out.println("정답입니다!!!");
				System.out.println("배팅하신 금액 "+배팅금화+"금화를 획득하셨습니다!");
				System.out.println("계속도전하시겠습니까?");
				wick.Money = wick.Money + 배팅금화 * 2;
				System.out.println("\n**  소지금화 : " + wick.Money);
				System.out.println("1. Yes   2. No");
			}
			else {
				System.out.println("첫번째 주사위  : "+주사위1 + " 두번째 주사위  : "+주사위2 );
				System.out.println("아쉽습니다 게임을 계속하시겠습니까?");
				System.out.println("\n**  소지금화 : " + wick.Money);
				System.out.println("1. Yes   2. No");
			}
			
		}
		
		return 단계진행;
	}
	
	public void run() {
		//holjjack_action();
		try {
			asciiart();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
//		try {
//			sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	
	public void holjjack_action() {
		JFrame frame = new JFrame();			//프레임만들기
		JPanel panel = new JPanel();			//패널만들기
		JLabel label = new JLabel("클릭으로 제압해라!!!!!"); //레이블 만들기
		JButton btnl = new JButton(new ImageIcon(".\\이미지\\주사위.gif"));//버튼 추가
		JTextArea txtArea = new JTextArea();	//여러줄글씨
		//JTextField //한줄글씨



		panel.setLayout(new BorderLayout());	//자기가 원하는 방식대로 버튼이나 라벨을 위치에 옮기는 것을 말함 보덜레이아웃은 위아래오른쪽왼쪽 중간 에 위치시킬수 있는것


		panel.add(btnl, BorderLayout.CENTER);		//가운데에 위치시킨것
		//panel.add(label, BorderLayout.CENTER);	//위쪽에 위치시킨것

		//panel.add(txtArea, BorderLayout.WEST);		//왼쪽에 위치시킨것

		btnl.addActionListener(new ActionListener() {
			int stun_count = 0;
			@Override
			public void actionPerformed(ActionEvent e) {//클릭하였을때 무언가를 해라
				stun_count++;
				if(stun_count == 10) {
					stun_count = 0;
					frame.setVisible(false);
				}
			} //버튼의 액션기능을 추가하겠다!!!!!



		});

		//panel 먼저 add하고 frame add후 설정하는 순서를 지키자
		frame.add(panel);	//frame과 panel 이 따로 놀지 않게 화면에 넣어주기


		frame.setResizable(false); //사이즈를 조절할수 있나? false는 조절 안됨
		frame.setPreferredSize(new Dimension(840, 840/12*9)); //주로 이런사이즈로 생성되길 원한다
		frame.setSize(840,840/12*9); //출력시 고정되는 사이즈값
		frame.setLocationRelativeTo(null); //null 값을 입력하면 가운데에 출력한다
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //화면창을 끄면 더이상 실행이 안되게하라
		frame.setVisible(true);
	}
	
	public void asciiart() throws InterruptedException {
        
		System.out.println("                              \r\n" + 
		"     :========                \r\n" + 
		"    :$$$$$$$@$                \r\n" + 
		"   :#######@@$    .-          \r\n" + 
		"   =@@@@@@@@@$    ~@#:,       \r\n" + 
		"   =@@@@@@@@@$    *@@@@$*-    \r\n" + 
		"   =@@@@@@@@@$    #@@@@@@@*   \r\n" + 
		"   =@@@@@@@@@$   -@@@@@@@@$,  \r\n" + 
		"   =@@@@@@@@@$   =@@@@@@@@$;  \r\n" + 
		"   =@@@@@@@@@~  .#@@@@@@@#$$  \r\n" + 
		"   =@@@@@@@@~   -@@@@@@@@$$!  \r\n" + 
		"   !$$$$$$$:    ~@@@@@@@@$$:  \r\n" + 
		"                 #@@@@@@#$$,  \r\n" + 
		"                 ~@@@@@@$$=   \r\n" + 
		"                  !@@@@@#$:   \r\n" + 
		"                    ~!#@@$.   \r\n" + 
		"                       ,*=    \r\n" + 
		"                              \r\n" + 
		"                              \r\n" + 
		"                              \r\n" + 
		"                              \r\n" + 
		"                              \r\n" + 
		"                              \r\n" + 
		"                              \r\n" + 
		"                              \r\n" + 
		"");
		sleep(100);
	    System.out.println(blank);
		System.out.println("                             \r\n" + 
				"                              \r\n" + 
				"                              \r\n" + 
				"                              \r\n" + 
				"                              \r\n" + 
				"                              \r\n" + 
				"     -;~-.                    \r\n" + 
				"     ;#@@@@#!                 \r\n" + 
				"     !$@@@@@@$                \r\n" + 
				"     *$#@@@@@@:               \r\n" + 
				"     =$#@@@@@@@    ,#$$$-     \r\n" + 
				"    .$$@@@@@@@@   -@@@$$$-    \r\n" + 
				"    -$$@@@@@@@=  -@@@@@$$$~   \r\n" + 
				"    ~$$@@@@@@@: ,@@@@@@@$$$-  \r\n" + 
				"     *#@@@@@@@~-@@@@@@@@@$$$- \r\n" + 
				"     ,#@@@@@@@-*@@@@@@@@@@@@$ \r\n" + 
				"      ~*=#@@@@. =@@@@@@@@@@$  \r\n" + 
				"           ,!#   =@@@@@@@@$   \r\n" + 
				"                  *@@@@@@$.   \r\n" + 
				"                   *@@@@=     \r\n" + 
				"                    ;@@=      \r\n" + 
				"                              \r\n" + 
				"                              \r\n" + 
				"");
		sleep(100);
	    System.out.println(blank);
		System.out.println("                             \r\n" + 
				"               :=##!          \r\n" + 
				"           .~*@@@@@@#,        \r\n" + 
				"           =@@@@@@@@@!        \r\n" + 
				"           ;$#@@@@@@@$        \r\n" + 
				"           ,$$@@@@@@@@,       \r\n" + 
				"            *$#@@@@@@@=       \r\n" + 
				"            ~$$@@@@@@@@.      \r\n" + 
				"            ,$$#@@@@@@@~      \r\n" + 
				"             =$#@@@@@$;       \r\n" + 
				"         .;-,.;=@@$*.         \r\n" + 
				"        ;@@#$$,               \r\n" + 
				"      -$@@@@$$*               \r\n" + 
				"    .*@@@@@@#$$~              \r\n" + 
				"    *@@@@@@@@$$=              \r\n" + 
				"     $@@@@@@@@$$*             \r\n" + 
				"     ~@@@@@@@@@#$-            \r\n" + 
				"      *@@@@@@@@@@:            \r\n" + 
				"      .@@@@@@@@=              \r\n" + 
				"       ~@@@@@#-               \r\n" + 
				"        :*$#;                 \r\n" + 
				"                              \r\n" + 
				"                              \r\n" + 
				"                              \r\n" + 
				"");
		sleep(100);
	    System.out.println(blank);
		System.out.println("\r\n" + 
				"                              \r\n" + 
				"                              \r\n" + 
				"                              \r\n" + 
				"                              \r\n" + 
				"                              \r\n" + 
				"                              \r\n" + 
				"                              \r\n" + 
				"                              \r\n" + 
				"                    ,;~       \r\n" + 
				"                  *$$$$!.     \r\n" + 
				"                 :@@@$$$$~    \r\n" + 
				"                ,@@@@@#$$$!.  \r\n" + 
				"                =@@@@@@#$$$=- \r\n" + 
				"             . !@@@@@@@@@#@@; \r\n" + 
				"        .-:*@@*@@@@@@@@@@@@$  \r\n" + 
				"      ~#@@@@@@@@@@@@@@@@@@@,  \r\n" + 
				"      $@@@@@@@@@@@@@@@@@@@:   \r\n" + 
				"      !$#@@@@@@@@@@@@@@@@=    \r\n" + 
				"      ;$$@@@@@@@@==@@@@@@,    \r\n" + 
				"      ~$$#@@@@@@@# !#@$=-     \r\n" + 
				"       $$#@@@@@@@@.           \r\n" + 
				"       =$$@@@@@@@@:           \r\n" + 
				"       ~$$@@@@@@@@!           \r\n" + 
				"       .=$@@@@@@@=:           \r\n" + 
				"         ;$@@#!-              \r\n" + 
				"                              \r\n" + 
				"");
		sleep(100);
	    System.out.println(blank);
        System.out.println("\r\n" + 
        		"                              \r\n" + 
        		"                              \r\n" + 
        		"                              \r\n" + 
        		"                              \r\n" + 
        		"                              \r\n" + 
        		"                              \r\n" + 
        		"                              \r\n" + 
        		"                              \r\n" + 
        		"                              \r\n" + 
        		"                              \r\n" + 
        		"         .                    \r\n" + 
        		"        ;@.                   \r\n" + 
        		"       !$@$.                  \r\n" + 
        		"     .*$$@@$        *=*;,     \r\n" + 
        		"     =$$#@@@=      #@@$$$,    \r\n" + 
        		"   .=$$#@@@@@!   ,#@@@@$$=.   \r\n" + 
        		"   ~$$#@@@@@@@~ ~@@@@@@#$$=   \r\n" + 
        		"   ~$#@@@@@@@@:;@@@@@@@@#$$!  \r\n" + 
        		"   ;@@@@@@@@@@~$@@@@@@@@@#$$; \r\n" + 
        		"   ;@@@@@@@@@@, #@@@@@@@@@@@@,\r\n" + 
        		"    =@@@@@@@@=  -@@@@@@@@@@$. \r\n" + 
        		"     $@@@@@@*    ~@@@@@@@@=   \r\n" + 
        		"     .@@@@@;      ;@@@@@@!    \r\n" + 
        		"      .#@@:        !@@@@:     \r\n" + 
        		"       ,@-           .@.      \r\n" + 
        		"                              \r\n" + 
        		"");
		sleep(100);
	    System.out.println(blank);
        System.out.println("\r\n" + 
        		"                              \r\n" + 
        		"                              \r\n" + 
        		"                              \r\n" + 
        		"                              \r\n" + 
        		"      !@==~               ..  \r\n" + 
        		"    .$@@#$$,         ,:!=$$!  \r\n" + 
        		"   ~#@@@@$$=.       !$$$$$@#  \r\n" + 
        		"  !@@@@@@@$$!      ,$$$##@@@. \r\n" + 
        		"  $@@@@@@@@$$:     $@@@@@@@@, \r\n" + 
        		"   @@@@@@@@@#$     $@@@@@@@@~ \r\n" + 
        		"   -@@@@@@@@@!     ;@@@@@@@@! \r\n" + 
        		"    !@@@@@@@,      -@@@@@@@@; \r\n" + 
        		"     $@@@@$        .@@@@@@@@  \r\n" + 
        		"     .:*#;          @@@@@@@,  \r\n" + 
        		"                    @@$!~,    \r\n" + 
        		"                    ,         \r\n" + 
        		"");
		sleep(100);
	    System.out.println(blank);
        System.out.println("\r\n" + 
        		"                              \r\n" + 
        		"                              \r\n" + 
        		" ;@@@@@@=                     \r\n" + 
        		" ;@@@@@@#*          *@$$=.    \r\n" + 
        		" ;@@@@@@#$*        *@@@$$*.   \r\n" + 
        		" ;@@@@@@#$$       =@@@@@$$*   \r\n" + 
        		" ;@@@@@@#$$      $@@@@@@@$$=  \r\n" + 
        		" ;@@@@@@#$$     $@@@@@@@@@$$* \r\n" + 
        		" ;@@@@@@#$$     ,@@@@@@@@@@@* \r\n" + 
        		" ,#@@@@@@$$      ,@@@@@@@@@*  \r\n" + 
        		"  .#@@@@@@$       .@@@@@@@!   \r\n" + 
        		"    -------        ,@@@@@;    \r\n" + 
        		"                    -!*=~     \r\n" + 
        		"                              \r\n" + 
        		"");
		sleep(100);
	    System.out.println(blank);
        System.out.println("\r\n" + 
        		"                              \r\n" + 
        		"   .$$$$$$$!                  \r\n" + 
        		"  .=$$$$$$@*         *$$$$$$! \r\n" + 
        		"  #@@@@@@@@*       .=$$$$$$@: \r\n" + 
        		"  @@@@@@@@@*       $######@@: \r\n" + 
        		"  @@@@@@@@@*      .@@@@@@@@@: \r\n" + 
        		"  @@@@@@@@@*      .@@@@@@@@@: \r\n" + 
        		"  @@@@@@@@@*      .@@@@@@@@@: \r\n" + 
        		"  @@@@@@@@@:      .@@@@@@@@@: \r\n" + 
        		"  @@@@@@@@:       .@@@@@@@@@: \r\n" + 
        		"  @@@@@@@:        .@@@@@@@@!  \r\n" + 
        		"                  .@@@@@@@!   \r\n" + 
        		"                              \r\n" + 
        		"");

	}
}
