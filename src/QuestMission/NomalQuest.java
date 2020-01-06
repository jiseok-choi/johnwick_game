package QuestMission;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Main.IMAGE;



public class NomalQuest extends EasyQuest implements Runnable{
	{
		this.QuestLevel = 2;
	}
	int building = 100;

	IMAGE image = new IMAGE(5);
	
	boolean 동작 = false;
	boolean 빨강 = false;
	boolean 파랑 = false;
	boolean 노랑 = false;


	String blank = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";

	@Override
	public void run() {

		폭탄();		//폭탄만들고

	}


	class Mypanel extends JPanel{
		ImageIcon 폭탄기판 = new ImageIcon(".\\이미지\\폭탄\\폭탄기판.jpg");
		Image img = 폭탄기판.getImage();

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0,0,this);
		}
	}

	Mypanel mypanel = new Mypanel();


	ImageIcon 미설치상태 = new ImageIcon(".\\이미지\\폭탄\\미설치상태.jpg");
	ImageIcon 끊어진빨강 = new ImageIcon(".\\이미지\\폭탄\\끊어진빨강.jpg");
	ImageIcon 끊어진파랑 = new ImageIcon(".\\이미지\\폭탄\\끊어진파랑.jpg");
	ImageIcon 끊어진노랑 = new ImageIcon(".\\이미지\\폭탄\\끊어진노랑.jpg");
	ImageIcon 설치상태 = new ImageIcon(".\\이미지\\폭탄\\설치상태.jpg");
	ImageIcon 이은빨강 = new ImageIcon(".\\이미지\\폭탄\\이은빨강.jpg");
	ImageIcon 이은파랑 = new ImageIcon(".\\이미지\\폭탄\\이은파랑.jpg");
	ImageIcon 이은노랑 = new ImageIcon(".\\이미지\\폭탄\\이은노랑.jpg");

	public void 폭탄() {

		JFrame frame = new JFrame();			//프레임만들기

		JButton btn1 = new JButton(설치상태);//버튼 추가  275 94
		JButton btn2 = new JButton(끊어진빨강);//버튼 추가 528, 114
		JButton btn3 = new JButton(끊어진파랑);//버튼 추가 527, 105
		JButton btn4 = new JButton(끊어진노랑);//버튼 추가 523, 98
		btn1.setBounds(480, 40, 275, 94);
		btn2.setBounds(330, 180, 480, 114);
		btn3.setBounds(332, 299, 480, 105);
		btn4.setBounds(335, 409, 480, 100);


		mypanel.setLayout(null);	//자기가 원하는 방식대로 버튼이나 라벨을 위치에 옮기는 것을 말함 보덜레이아웃은 위아래오른쪽왼쪽 중간 에 위치시킬수 있는것 (null값으로 하면 절대위치지정)


		mypanel.add(btn1, null);		//절대위치
		mypanel.add(btn2, null);		//절대위치
		mypanel.add(btn3, null);		//절대위치
		mypanel.add(btn4, null);		//절대위치

		btn1.addActionListener(new ActionListener() {//버튼의 속성
			//변수자리
			@Override
			public void actionPerformed(ActionEvent e) {//클릭하였을때 무언가를 해라
				Runnable r_Bomb = new Main.Sound("폭탄", 1);		//폭탄소리만들기1
				Thread t_Bomb = new Thread(r_Bomb);				//폭탄소리만들기2
				t_Bomb.start();									//폭탄소리실행
				if(빨강 == true && 파랑 == true && 노랑 == true) {
					동작 = true;// 굳이 해줄필요 없지만 게임방향바꿀수도 있음

					frame.setVisible(false);
					

					
						//Runnable r = new IMAGE(5);
						//Thread t = new Thread(r);
						//t.start();
						
					
					try {
						//t.join();
						Bomb();

					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			} //버튼의 액션기능을 추가하겠다!!!!!
		});
		btn2.addActionListener(new ActionListener() {//버튼의 속성
			//변수자리
			@Override
			public void actionPerformed(ActionEvent e) {//클릭하였을때 무언가를 해라
				if(빨강 == false) {
					Runnable r_Bomb = new Main.Sound("폭탄", 2);		//폭탄소리만들기1
					Thread t_Bomb = new Thread(r_Bomb);				//폭탄소리만들기2
					t_Bomb.start();									//폭탄소리실행
					btn2.setIcon(이은빨강);
					빨강 = true;
				}
				else {
					btn2.setIcon(끊어진빨강);
					빨강 = false;
				}
			}
		});
		btn3.addActionListener(new ActionListener() {//버튼의 속성
			//변수자리
			@Override
			public void actionPerformed(ActionEvent e) {//클릭하였을때 무언가를 해라
				if(파랑 == false) {
					Runnable r_Bomb = new Main.Sound("폭탄", 2);		//폭탄소리만들기1
					Thread t_Bomb = new Thread(r_Bomb);				//폭탄소리만들기2
					t_Bomb.start();									//폭탄소리실행
					btn3.setIcon(이은파랑);
					파랑 = true;
				}
				else {
					btn3.setIcon(끊어진파랑);
					파랑 = false;
				}
			}
		});
		btn4.addActionListener(new ActionListener() {//버튼의 속성
			//변수자리
			@Override
			public void actionPerformed(ActionEvent e) {//클릭하였을때 무언가를 해라
				if(노랑 == false) {
					Runnable r_Bomb = new Main.Sound("폭탄", 2);		//폭탄소리만들기1
					Thread t_Bomb = new Thread(r_Bomb);				//폭탄소리만들기2
					t_Bomb.start();									//폭탄소리실행
					btn4.setIcon(이은노랑);
					노랑 = true;
				}
				else {
					btn4.setIcon(끊어진노랑);
					노랑 = false;
				}
			}
		});



		//panel 먼저 add하고 frame add후 설정하는 순서를 지키자
		frame.add(mypanel);	//frame과 panel 이 따로 놀지 않게 화면에 넣어주기


		frame.setResizable(false); //사이즈를 조절할수 있나? false는 조절 안됨
		frame.setSize(900,600); //출력시 고정되는 사이즈값
		frame.setLocationRelativeTo(null); //null 값을 입력하면 가운데에 출력한다
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //화면창을 끄면 더이상 실행이 안되게하라
		frame.setVisible(true);//보여주게 하기 메서드
		frame.setAlwaysOnTop(true);//jframe 최상단 위치 메서드
	}


	public void Bomb() throws InterruptedException {
		

		
		Runnable r_Bomb = new Main.Sound("폭탄", 3);		//폭탄터지는소리
		Thread t_Bomb = new Thread(r_Bomb);				//폭탄터지는소리
		t_Bomb.start();									//폭탄터지는소리
		
		System.out.println("               $$$$$$$$$$$     ");
		System.out.println("               $$--$$$--$$     ");
		System.out.println("               $$--$$$--$$     ");
		System.out.println("               $$$$$$$$$$$     ");
		System.out.println("               $$--$$$--$$     ");
		System.out.println("               $$--$$$--$$     ");
		System.out.println("               $$$$$$$$$$$     ");
		System.out.println("               $$--$$$--$$     ");
		System.out.println("               $$--$$$--$$     ");
		System.out.println("               $$$$$$$$$$$     ");
		System.out.println("               $$$$$$$$$$$     ");
		System.out.println("               $$$!===!$$$     ");
		System.out.println("               $$$!===!$$$     ");
		System.out.println("               $$$!===!$$$     ");

		Thread.sleep(200);
		System.out.println(blank);
		System.out.println("               $$$$$$$$$$$     ");
		System.out.println("               $$--$$$--$$     ");
		System.out.println("               $$--$$$--$$     ");
		System.out.println("               $$$$$$$$$$$     ");
		System.out.println("               $$--$$$--$$     ");
		System.out.println("               $$--$$$--$$     ");
		System.out.println("               $$$$$$$$$$$     ");
		System.out.println("               $$--$$$--$$     ");
		System.out.println("               $$--$$$--$$     ");
		System.out.println("               $$$$$$$$$$$     ");
		System.out.println("               $$$$$$$$$$$     ");
		System.out.println("               $$$*****$$$     ");
		System.out.println("               $$$*****$$$     ");
		System.out.println("               $$$*****$$$     ");

		Thread.sleep(200);
		System.out.println(blank);

		System.out.println("               $$$$$$$$$$$     ");
		System.out.println("               $$--$$$--$$     ");
		System.out.println("               $$--$$$--$$     ");
		System.out.println("               $$$$$$$$$$$     ");
		System.out.println("               $$--$$$--$$     ");
		System.out.println("               $$--$$$--$$     ");
		System.out.println("               $$$$$$$$$$$     ");
		System.out.println("               $$**$$$**$$     ");
		System.out.println("               $$**$$$**$$     ");
		System.out.println("               $$$$$$$$$$$     ");
		System.out.println("               $$$$$$$$$$$     ");
		System.out.println("               $$$*****$$$     ");
		System.out.println("               $$$*****$$$     ");
		System.out.println("               $$$*****$$$     ");

		Thread.sleep(200);
		System.out.println(blank);


		System.out.println("               $$$$$$$$$$$     ");
		System.out.println("               $$--$$$--$$     ");
		System.out.println("               $$--$$$--$$     ");
		System.out.println("               $$$$$$$$$$$     ");
		System.out.println("               $$**$$$**$$     ");
		System.out.println("               $$**$$$**$$     ");
		System.out.println("               $$$$$$$$$$$     ");
		System.out.println("               $$**$$$**$$     ");
		System.out.println("               $$**$$$**$$     ");
		System.out.println("               $$$$$$$$$$$     ");
		System.out.println("               $$$$$$$$$$$     ");
		System.out.println("               $$$*****$$$     ");
		System.out.println("               $$$*****$$$     ");
		System.out.println("               $$$*****$$$     ");

		Thread.sleep(200);
		System.out.println(blank);


		System.out.println("               $$$$$$$$$$$     ");
		System.out.println("               $$**$$$**$$     ");
		System.out.println("               $$**$$$**$$     ");
		System.out.println("               $$$$$$$$$$$     ");
		System.out.println("               $$**$$$**$$     ");
		System.out.println("               $$**$$$**$$     ");
		System.out.println("               $$$$$$$$$$$     ");
		System.out.println("               $$**$$$**$$     ");
		System.out.println("               $$**$$$**$$     ");
		System.out.println("               $$$$$$$$$$$     ");
		System.out.println("               $$$$$$$$$$$     ");
		System.out.println("               $$$*****$$$     ");
		System.out.println("               $$$*****$$$     ");
		System.out.println("               $$$*****$$$     ");

		Thread.sleep(200);
		System.out.println(blank);

		System.out.println("               $$$$$ $$$$$     ");
		System.out.println("               $$**$ $**$$     ");
		System.out.println("               $$**$  **$$     ");
		System.out.println("               $$$$  $$$$$     ");
		System.out.println("               $$ *$ $**$$     ");
		System.out.println("               $$ *$ $**$      ");
		System.out.println("               $$ $$ $$$$      ");
		System.out.println("                $**$ $**$$     ");
		System.out.println("                $**$ $**$$     ");
		System.out.println("                $$$$ $$$$$     ");
		System.out.println("        :;*:~~:;!;:~~~~~;;~~~:!:;;       ");
		System.out.println("    ::!*!!*;;;;!*;;;::::!!:;:;*;;!!!~    ");
		System.out.println("  ,~;;!*!!**!!!***!!;;;!*!!;!*!!!***!~;, ");

		Thread.sleep(200);
		System.out.println(blank);


		System.out.println(";;::~~-,,,,,,,,,,,,,,,,,...,,,--~~:::;;!\r\n" +
				"--.                                ..,-~\r\n" + 
				"~--,.          ..........          .--~~\r\n" + 
				"           .................            \r\n" + 
				"          ...................           \r\n" + 
				"        .......................         \r\n" + 
				"          ...................           \r\n" + 
				"         .....................          \r\n" + 
				"          ...................           \r\n" + 
				"             .......... ....            \r\n" + 
				"             ...       ..,...           \r\n" + 
				"         ...,     .  .   . ..           \r\n" + 
				"         ~~~-.,----,,,,. . ..,          \r\n" + 
				"            ~-~--~~--~-,,---            \r\n" + 
				"*!!;;;;;;;;:::::::::::::~:::::;;;;;!!!**\r\n" + 
				"");

		Thread.sleep(200);
		System.out.println(blank);

		System.out.println("--~~::::~-,.                ..,-~:;;;;::\r\n" + 
				"          -,.             ..            \r\n" + 
				"          ,..   ,,,,,,,     .,          \r\n" + 
				"          .  ,,,,,,,,,,,,,,  .,,        \r\n" + 
				"           ,,,,,,,,,,,,,,,,,,,          \r\n" + 
				"       ..   ..,,,,,,,,,,,,,,.,,,.       \r\n" + 
				"      --,.  ...,,,,,,,,,,,,,.,,.,       \r\n" + 
				"         ,. .,..,,,,,,,,,,,,...,-       \r\n" + 
				"        ,,. ..,,,,,,,,,,,,,,,..,-       \r\n" + 
				"        ,,..,,,,,,,,,,,,,,,,,.,,-       \r\n" + 
				"         ,..,,,,,,,,....,,,,..,,        \r\n" + 
				"        -,,,,,,,,,,,,,,,,,,,,.,         \r\n" + 
				"         ,,,,,,,,,,,,,,,,,,,.,,         \r\n" + 
				"          ,,,,,,,,,,,,,,,,,,,,,         \r\n" + 
				"          .....  .....,.........        \r\n" + 
				"          ~;;!~,,---~~,,,..,,..-:       \r\n" + 
				"         !**==:::;!!*;:~-,.,-~;*$=      \r\n" + 
				";;::::;!*****!;:;;!!!;;:~~-~;!**==$=;::;\r\n" + 
				"");
		Thread.sleep(200);
		System.out.println(blank);

		System.out.println("\r\n" + 
				"=!:--,,,,,,,,..--.  . ..........,,,,-:!=\r\n" + 
				"$$=!;::~--,,,,-;~,    . ....,,,--:;!*===\r\n" + 
				"                                        \r\n" + 
				"             ,~~,;;;;;;;                \r\n" + 
				"           :, ,;;;;;;;;;;;              \r\n" + 
				"           ,,,;;;;;;;;;;;;;-            \r\n" + 
				"         ,,,,;;;;;;;;;;;;;;;,,          \r\n" + 
				"         ~~-,;;;;;;;;;;;;;;;;--         \r\n" + 
				"           ~.;;;;;;;;;;;;;;;~:;         \r\n" + 
				"           :~--;;;;;;;;;;;,             \r\n" + 
				"              ~~~-;;;;~~~~              \r\n" + 
				"                ~-;;;;~~~               \r\n" + 
				"                ~~;;;;-~~               \r\n" + 
				"                ~:!;;;:~                \r\n" + 
				"               -~;!!!!;;:               \r\n" + 
				"!!;;;;;;!!*****!!**==***:~:;!*==*!;;;;!!\r\n" + 
				"!!!;;;;*==*=*****====***!!!*=$$#$=;;;!!!\r\n" + 
				"");
		Thread.sleep(200);
		System.out.println(blank);

		System.out.println("\r\n" + 
				"=!:--,,,,,,,,..--.  . ..........,,,,-:!=\r\n" + 
				"$$=!;::~--,,,,-;~,    . ....,,,--:;!*===\r\n" + 
				"                                        \r\n" + 
				"             ,$$$$$$$$$$$$$             \r\n" + 
				"           $$$$$$$$$$$$$$$$$$$          \r\n" + 
				"         $$$$$$$$$$$$$$$$$$$$$$         \r\n" + 
				"        $$$$$$$$$$$$$$$$$$$$$$$$        \r\n" + 
				"         ~~$$$$$$$$$$$$$$$$$$$-         \r\n" + 
				"           ~.$$$$$$$$$$$$$$$~:;         \r\n" + 
				"           :~--$$$$$$$$$$$,             \r\n" + 
				"              ~~~-$$$$~~~~              \r\n" + 
				"                ~-$$$$~~~               \r\n" + 
				"                ~~$$$$-~~               \r\n" + 
				"                ~:$$$;:~                \r\n" + 
				"               -~;$$$$;;:               \r\n" + 
				"!!;;;;;;!!**$$$$$$$$$$$$$$$4!*==*!;;;;!!\r\n" + 
				"!!!;;;$$$$$$$$$$$$$$$$$$$$$$$$$$$$;;;!!!\r\n" + 
				"");

		Thread.sleep(200);
		System.out.println(blank);

		System.out.println("\r\n" + 
				"=!:--,,,,,,,,..--.  . ..........,,,,-:!=\r\n" + 
				"$$=!;::~--,,,,-;~,    . ....,,,--:;!*===\r\n" + 
				"                                        \r\n" + 
				"             ,$$$$$$$$$$$$$             \r\n" + 
				"           $$$$$$$$$$$$$$$$$$$          \r\n" + 
				"                                        \r\n" + 
				"                                        \r\n" + 
				"             ,$$$$$$$$$$$$$             \r\n" + 
				"           $$$$$$$$$$$$$$$$$$$          \r\n" + 
				"                                        \r\n" + 
				"       ############################     \r\n" + 
				"         #######################        \r\n" + 
				"     ###############################    \r\n" + 
				"     ###############################    \r\n" + 
				"      #############################     \r\n" + 
				"         ######################         \r\n" + 
				"           ####################         \r\n" + 
				"           #################            \r\n" + 
				"              ############              \r\n" + 
				"                ~-####~~~               \r\n" + 
				"                ~~####-~~               \r\n" + 
				"                ~:####:~                \r\n" + 
				"               -~;#####;:               \r\n" + 
				"!!;;;;;;!!**$$$$$$$$$$$$$$$4!*==*!;;;;!!\r\n" + 
				"!!!;;;$$$$$$$$$$$$$$$$$$$$$$$$$$$$;;;!!!\r\n" + 
				"");


		Thread.sleep(200);
		System.out.println(blank);
		System.out.println("~--,,..........,,-,,.,,~~,..........,,-~\r\n" + 
				"~~-,,,,,,....-::;;;~,--:!;..........,,-~\r\n" + 
				"~~---,,,,,,,-;;;!;;~-~~~!*-,,..,,,,,,--~\r\n" + 
				"*::~~-------;;!**!:,--~:;=;,,,,,,,--~;!=\r\n" + 
				"$$$==*;::~~~;;=*!*;~.-;::*$;~~~~:!*=====\r\n" + 
				"!**======**!:!=*==!:,-;~:*$$*****===***!\r\n" + 
				"~~:;!!!;!!**!*$==!:~,,--;*$$==**!;::~~~-\r\n" + 
				"~~---------~=*:.  ..,. ,-;!=~~---,,,,,--\r\n" + 
				"::~~~~~~~~~~;:. ...,,~~. -::-----------~\r\n" + 
				"*!!!;;;::::;;!:~:::,-;!:~~~~~~~~~:::::;!\r\n" + 
				"**!!!!!!!!!!!!!!!;;,~:!!!!;;;;;;;;;;;;;!\r\n" + 
				"*!!!!!!!!!!!!!!!!;;,~:!!!!;;;;;;;;;;;;;;\r\n" + 
				"!!!;;;;;;;;;;;;;;:;;;!;;;;;;;;;;;;;;;;;;\r\n" + 
				"!!;;;;;;;;;;;;;;;;;!!;;;;;;;;::;;;;;;;;!\r\n" + 
				"!!;;;;;;;;;::::::!*!*;:;;;:~:::::;;;;;;!\r\n" + 
				"!!;;;;;;;;;;;;;;;***==!;;~-:;!!;;;;;;;!!\r\n" + 
				"!!;;;:!!*****=****======*;;**=$==*;:;;;!\r\n" + 
				"*!!;;;*=$$====**===$$$$======$#$##*;;!!!\r\n" + 
				"");

		Thread.sleep(200);
		System.out.println(blank);
		System.out.println("\r\n" + 
				"~-,..           .-~.:!*~~;-           ..\r\n" + 
				"~-,,.         -,-:~~;!!;~!=:          ..\r\n" + 
				"~--,..       ,~,-:~!!;:;:*=*,         ..\r\n" + 
				"~~-,,.....  .--,~~;**!;!!*==*         ..\r\n" + 
				"::~~-,,,,...,,~-!:**!!!!!**=*.      ..,-\r\n" + 
				"!!;;:~~--,,,--;~**=*;:!;;*==;,,.,,,--~~:\r\n" + 
				":;;;;:::::~~:;*!!=*;~~;--;*=;~~~~~~~~~~~\r\n" + 
				"--,-,,,,,,-~~:!::;~!::;:~;!!~~~~~-,..   \r\n" + 
				"~-,,..........,~~~!*!!**;:-..          .\r\n" + 
				":~--,,,,,,,,,,,,,,,:**~~-,.............,\r\n" + 
				";:~~---------~------~!~--,-,,,,,,,,,----\r\n" + 
				"::~~--------------,:,!:--------------,--\r\n" + 
				"::~~---------------;-;~-----------------\r\n" + 
				"::~~--------------~!-;;-----------------\r\n" + 
				";:~~-----------~--;*~!!~--------------~~\r\n" + 
				";::~~--~~~~:::::;;!*:!*=:~--~~:;:~~~--~~\r\n" + 
				";::~~-:!;!!!!!!!;!!;***=*!;;!!!==!*!~~~~\r\n" + 
				"!;;:~~*$*=****!!*=**$$$#$****!=##=$#:~::\r\n" + 
				"");
		Thread.sleep(200);
		System.out.println(blank);
		System.out.println("\r\n" + 
				":~-,,,~:!!!!!!!;:--:;!!;;;;;;::~-.  .,,-\r\n" + 
				"~--,.   .,-~;$$$$$$$$$$$$$$$,..      .,-\r\n" + 
				"~-,..     $$$$$$$$$$$$$$$$$$$$$$      .,\r\n" + 
				"--,..  $$$$$$$$$$$$$$$$$$$$$$$$$$     .,\r\n" + 
				"-,,.  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$    .\r\n" + 
				"-,,..  $$$$$$$$$$$$$$$$$$$$$$$$$$$$    .\r\n" + 
				"~-,,.... $$$$$$$$$$$$$$$$$$$$$$$$      .\r\n" + 
				";::-,,....$$$$$$$$$$$$$$$$$$$$$$    ,,--\r\n" + 
				"::~~~~-,,-,-$$$$$$$$$$$$$$$$$,.,,,,,---,\r\n" + 
				"-,,,,...,,---~:$$$$$$$$$$$-,,-,,,,..   .\r\n" + 
				",,..         ...$$$$$$$$$              .\r\n" + 
				"-,....      .... $$$$$$$               .\r\n" + 
				"~-,,......,,,.....,$$$......         ..,\r\n" + 
				"~-,,...............$$$.............  ..,\r\n" + 
				"~-,..............,~$$$................,,\r\n" + 
				"~-,,.............,:$$$-..............,,-\r\n" + 
				"~--,,,,,,,,,,,----;$$$!-,,,,,--,,..,,,--\r\n" + 
				":~--,,--~~$$$$$$$$$$$$$$$$$$$$;:::~---~~\r\n" + 
				":~~--~;;$$$$$$$$$$$$$$$$$$$$$$$$$$*:--~:\r\n" + 
				"!;;::!=$$$$$$$$$$$$$$$$$$$$$$$$$$$$!::;;\r\n" + 
				"");
		Thread.sleep(3000);
		System.out.println("\nPress any key");
	}












}
