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
	
	boolean ���� = false;
	boolean ���� = false;
	boolean �Ķ� = false;
	boolean ��� = false;


	String blank = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";

	@Override
	public void run() {

		��ź();		//��ź�����

	}


	class Mypanel extends JPanel{
		ImageIcon ��ź���� = new ImageIcon(".\\�̹���\\��ź\\��ź����.jpg");
		Image img = ��ź����.getImage();

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0,0,this);
		}
	}

	Mypanel mypanel = new Mypanel();


	ImageIcon �̼�ġ���� = new ImageIcon(".\\�̹���\\��ź\\�̼�ġ����.jpg");
	ImageIcon ���������� = new ImageIcon(".\\�̹���\\��ź\\����������.jpg");
	ImageIcon �������Ķ� = new ImageIcon(".\\�̹���\\��ź\\�������Ķ�.jpg");
	ImageIcon ��������� = new ImageIcon(".\\�̹���\\��ź\\���������.jpg");
	ImageIcon ��ġ���� = new ImageIcon(".\\�̹���\\��ź\\��ġ����.jpg");
	ImageIcon �������� = new ImageIcon(".\\�̹���\\��ź\\��������.jpg");
	ImageIcon �����Ķ� = new ImageIcon(".\\�̹���\\��ź\\�����Ķ�.jpg");
	ImageIcon ������� = new ImageIcon(".\\�̹���\\��ź\\�������.jpg");

	public void ��ź() {

		JFrame frame = new JFrame();			//�����Ӹ����

		JButton btn1 = new JButton(��ġ����);//��ư �߰�  275 94
		JButton btn2 = new JButton(����������);//��ư �߰� 528, 114
		JButton btn3 = new JButton(�������Ķ�);//��ư �߰� 527, 105
		JButton btn4 = new JButton(���������);//��ư �߰� 523, 98
		btn1.setBounds(480, 40, 275, 94);
		btn2.setBounds(330, 180, 480, 114);
		btn3.setBounds(332, 299, 480, 105);
		btn4.setBounds(335, 409, 480, 100);


		mypanel.setLayout(null);	//�ڱⰡ ���ϴ� ��Ĵ�� ��ư�̳� ���� ��ġ�� �ű�� ���� ���� �������̾ƿ��� ���Ʒ������ʿ��� �߰� �� ��ġ��ų�� �ִ°� (null������ �ϸ� ������ġ����)


		mypanel.add(btn1, null);		//������ġ
		mypanel.add(btn2, null);		//������ġ
		mypanel.add(btn3, null);		//������ġ
		mypanel.add(btn4, null);		//������ġ

		btn1.addActionListener(new ActionListener() {//��ư�� �Ӽ�
			//�����ڸ�
			@Override
			public void actionPerformed(ActionEvent e) {//Ŭ���Ͽ����� ���𰡸� �ض�
				Runnable r_Bomb = new Main.Sound("��ź", 1);		//��ź�Ҹ������1
				Thread t_Bomb = new Thread(r_Bomb);				//��ź�Ҹ������2
				t_Bomb.start();									//��ź�Ҹ�����
				if(���� == true && �Ķ� == true && ��� == true) {
					���� = true;// ���� �����ʿ� ������ ���ӹ���ٲܼ��� ����

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
			} //��ư�� �׼Ǳ���� �߰��ϰڴ�!!!!!
		});
		btn2.addActionListener(new ActionListener() {//��ư�� �Ӽ�
			//�����ڸ�
			@Override
			public void actionPerformed(ActionEvent e) {//Ŭ���Ͽ����� ���𰡸� �ض�
				if(���� == false) {
					Runnable r_Bomb = new Main.Sound("��ź", 2);		//��ź�Ҹ������1
					Thread t_Bomb = new Thread(r_Bomb);				//��ź�Ҹ������2
					t_Bomb.start();									//��ź�Ҹ�����
					btn2.setIcon(��������);
					���� = true;
				}
				else {
					btn2.setIcon(����������);
					���� = false;
				}
			}
		});
		btn3.addActionListener(new ActionListener() {//��ư�� �Ӽ�
			//�����ڸ�
			@Override
			public void actionPerformed(ActionEvent e) {//Ŭ���Ͽ����� ���𰡸� �ض�
				if(�Ķ� == false) {
					Runnable r_Bomb = new Main.Sound("��ź", 2);		//��ź�Ҹ������1
					Thread t_Bomb = new Thread(r_Bomb);				//��ź�Ҹ������2
					t_Bomb.start();									//��ź�Ҹ�����
					btn3.setIcon(�����Ķ�);
					�Ķ� = true;
				}
				else {
					btn3.setIcon(�������Ķ�);
					�Ķ� = false;
				}
			}
		});
		btn4.addActionListener(new ActionListener() {//��ư�� �Ӽ�
			//�����ڸ�
			@Override
			public void actionPerformed(ActionEvent e) {//Ŭ���Ͽ����� ���𰡸� �ض�
				if(��� == false) {
					Runnable r_Bomb = new Main.Sound("��ź", 2);		//��ź�Ҹ������1
					Thread t_Bomb = new Thread(r_Bomb);				//��ź�Ҹ������2
					t_Bomb.start();									//��ź�Ҹ�����
					btn4.setIcon(�������);
					��� = true;
				}
				else {
					btn4.setIcon(���������);
					��� = false;
				}
			}
		});



		//panel ���� add�ϰ� frame add�� �����ϴ� ������ ��Ű��
		frame.add(mypanel);	//frame�� panel �� ���� ���� �ʰ� ȭ�鿡 �־��ֱ�


		frame.setResizable(false); //����� �����Ҽ� �ֳ�? false�� ���� �ȵ�
		frame.setSize(900,600); //��½� �����Ǵ� �����
		frame.setLocationRelativeTo(null); //null ���� �Է��ϸ� ����� ����Ѵ�
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //ȭ��â�� ���� ���̻� ������ �ȵǰ��϶�
		frame.setVisible(true);//�����ְ� �ϱ� �޼���
		frame.setAlwaysOnTop(true);//jframe �ֻ�� ��ġ �޼���
	}


	public void Bomb() throws InterruptedException {
		

		
		Runnable r_Bomb = new Main.Sound("��ź", 3);		//��ź�����¼Ҹ�
		Thread t_Bomb = new Thread(r_Bomb);				//��ź�����¼Ҹ�
		t_Bomb.start();									//��ź�����¼Ҹ�
		
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
