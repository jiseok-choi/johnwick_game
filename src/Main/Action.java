package Main;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

import Charactor.*;
import Weapon.*;
import QuestMission.*;

public class Action {


	public void action1() {
		System.out.println("�� �׼�");
	}
	public static boolean Attack_Stop = false;
	public static int AttackTime;
	public static int BossTime;
	public static boolean Boogie1life = true;
	public static boolean Boogie2life = true;
	public static boolean middleboss1life = true;
	public static boolean bossfight = false;
	public static boolean bossrun = false;
	public static boolean win = false;
	public static boolean continu = true;
	public static String[][] map2 = new String[8][83];	//�ʸ����
	
	
	public static void main(String[] args) throws InterruptedException {
		Action action = new Action();


		//test zone


		MiddleBoss mi = new MiddleBoss();
		//mi.stun_count = 5;
		//mi.Skill_Stun(wick);
		Wick w = new Wick();		//���ΰ�����
		Runnable r = new Sound(w);
		Thread t = new Thread(r);
		t.start();
		//end test zone


		String blank = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";

		//����ȭ�� ����
		Scanner num_scan = new Scanner(System.in);		//�Է°� ��ĵ
		Scanner text = new Scanner(System.in);			//�ܰ��������� �ؽ�Ʈ �Է�
		int numscan = 0, flag, holljack, ���ñ�ȭ, �̼�Ÿ��=0; 
		int money = 0;									//���ݱ�
		String txt, ȸ�ǹ̼�;
		String passkey;

		Music Music = new Music("�����������1.mp3", true);
		Music.start();


		//System.out.println("\n���������������������������������������������������������������");
		//System.out.println("  ���������������������������������������������������������������������������������������������");                           
		System.out.println("    !####.            -$###~                  =####~####;=#### ,$@@$.             $###;      ");
		System.out.println("    *@@@@-            -#@@@;                  $@@@@;@@@@*$@@@@,~#@@#:             #@@@*.     ");
		System.out.println("    *@@@@~            -#@@@;                  $@@@@;@@@@*$@@@@,,=@@$~             #@@@*.     ");
		System.out.println("    *@@@@~    .,,.    -#@@@!-,        ,-.     $@@@@;@@@@*$@@@@,.~!*;,    .,-.     #@@@*..... ");
		System.out.println("    *@@@@~  ,=####*.  -#@@@###$~    ~$###*,   $@@@@;@@@@*$@@@@,~$##$~   !$###=-   #@@@*,$$$$~");
		System.out.println("    *@@@@~ ~#@@@@@@#, -#@@@@@@@$-  -@@@@@@=,  $@@@@;@@@@*$@@@@,~@@@@: .#@@@@@@#~  #@@@*=@@@#~");
		System.out.println("    *@@@@~,$@@@@@@@@=.-#@@@@@@@@;  #@@@@@@@!. $@@@@;@@@@*$@@@@,~@@@@:.*@@@@@@@@$- #@@@$@@@@*,");
		System.out.println("    *@@@@~:@@@@@@@@@@:~#@@@@@@@@*.~@@@@@@@@#- $@@@@;@@@@*$@@@@,~@@@@:~#@@@@@@@@@; #@@@@@@@#: ");
		System.out.println("    *@@@@~*@@@@!!#@@@*:#@@@$#@@@*.!@@@#*@@@@~ $@@@@;@@@@*$@@@@,~@@@@:!@@@@*;=$==;.#@@@@@@@$- ");
		System.out.println("    *@@@@~=@@@$,,$@@@=:#@@@!$@@@=,!@@@$:@@@@: $@@@@;@@@@*$@@@@,~@@@@:!@@@#~.-;!*;.#@@@#@@@@: ");
		System.out.println("  .-#@@@@~*@@@#~:#@@@*:#@@@!$@@@=,!@@@$:@@@@: =@@@@=@@@@=#@@@@,~@@@@:!@@@@!-#@@@=,#@@@*@@@@=.");
		System.out.println("  ,@@@@@@-;@@@@@@@@@@!:#@@@!$@@@=,!@@@$:@@@@: *@@@@@@@@@@@@@@#,~@@@@:~#@@@@@@@@@*.#@@@**@@@@-");
		System.out.println("  ,@@@@@=,,$@@@@@@@@$~~#@@@!$@@@=,!@@@$:@@@@: ;@@@@@@@@@@@@@@=,~@@@@:.*@@@@@@@@#:.#@@@*-@@@@*");
		System.out.println("  ,@@@@#:. ~#@@@@@@#:.~#@@@!$@@@=,*@@@$:@@@@: ,#@@@@@##@@@@@@:.~@@@@: ,$@@@@@@@!, #@@@*.=@@@@,");
		System.out.println("  ,@@@$:.   -=@@@@=~. -#@@@!$@@@=,*@@@$:@@@@:  ~#@@@#;~#@@@#;, ~@@@@:  .!@@@@$;,  #@@@*.~@@@@;");
		//System.out.println("  ���������������������������������������������������������������������������������������������");
		System.out.println("\n\n\n�޼��迡 �Ǹ���� �α������ �ҷȴ� ������ ����ϴ� �ﷻ�� ���� �ϻ��Ȱ�� ������ ��ư���\n");
		System.out.println("5�⸸�� ����ϴ� �Ƴ� �ﷻ�� ������ �װ� �� �� �Ƴ� �ﷻ���� ���� ��������� �������� �ް� \n");
		System.out.println("�ܿ� ���� ������ ��ư��µ� ���Ǿ� ���� ������ ������ ���� ��ġ�� ������ ���������� �׿��� \r\n\n" + 
				"�׷��� ������ �ٽ� ������ ���� �޼���� ���� �ȴ�.....");
		System.out.println("\n\n���������������������������������������������\n");
		System.out.println("   1. ���ӹٷν���    2. ����Ű ����    3. ��������");
		System.out.println("\n���������������������������������������������");
		while(true) {
			try {
				numscan = num_scan.nextInt();					//��ĳ�� Ȱ��ȭ
				break;
			} catch (Exception e) {
				System.out.println("���ڸ� �Է��ϼ���");
				num_scan = new Scanner(System.in);
			}
		}
		
		
		Stage stage = new Stage();
		switch(numscan) {
		case 1 :
			System.out.println(blank);					//ȭ�����
			break;

		case 2 :  
			stage.key();								//����Ű ����
			passkey = text.next();						//���� �Է½� �ܰ�����
			System.out.println(blank);
			break;

		case 3 :
			System.out.println("�ý����� ����˴ϴ�");
			System.exit(0);
		}
		//��Ȳ0 ���� ����
		Wick wick = new Wick();
		Runnable r1 = new Sound(wick);	//�� �ѼҸ� ���ʺ����
		Thread t1 = new Thread(r1);		//�� �ѼҸ� ���������
		//t1.start();
		Runnable easyQ1 = new EasyQuest();	//���� ����Ʈ ���ʺ����
		Thread easyQ_1 = new Thread(easyQ1);	//���� ����Ʈ ���������

		//���������
		Runnable �ε� = new Stage();
		Thread �ε�_t = new Thread(�ε�);
		
		Runnable �α��1����;
		Thread �α��1�������;
		Runnable �α��2����;
		Thread �α��2�������;
		Runnable �α��3����;
		Thread �α��3�������;
		Runnable �߰���������;
		Thread �߰������������;
		Runnable �߰�������ų;
		Thread �߰�������ų�ߵ�;
		
		Runnable r_gif = new IMAGE(7);
		Thread gif = new Thread(r_gif);
		gif.start();
		gif.join();
		

		//��Ȳ1 �α�ǵ��� ���� ó����
		wick.Gun = 1;
		stage.stage1("��", wick);		//���� �α���� ó����
		passkey = text.next();			//�ణ�� ��
		Music.close();
		//���� ����
		Boogieman boogie = new Boogieman();
		
		Music = new Music("��������1.mp3", true);
		Music.start();
		�ε� = new Stage();
		�ε�_t = new Thread(�ε�);
		�ε�_t.start();
		//�����غ�
		r_gif = new IMAGE(2);
		gif = new Thread(r_gif);
		gif.start();
		�ε�_t.join();
		///////////////////////////////////////////////////////////////////////////////////////////////////////////
		//�� �ڵ� ����
		AttackTime = 100;
		Timer m_fight1 = new Timer();
		TimerTask t_fight1 = new TimerTask() {
			public void run() {
				if(Attack_Stop == false) {		//�ٸ� �̼� ��Ÿ������ ��� ��������
					if(boogie.life(boogie) == false) {
						m_fight1.cancel();
					}
					if(wick.HP > 0) {
						System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
						boogie.Shot(wick, boogie);				//�α���� ����
						wick.Hitme(0);							//���� ���� ����
						stage.frendcheck(boogie);				//���� ���� üũ
						//mi.Skill_Stun(wick);					//�߰��������Ͻ�ų
					}
					else {
						m_fight1.cancel();
						System.out.println("������");
					}
					AttackTime--;
					System.out.println("\n");
					if(!boogie.life) {
						boogie.Frend = -1;
					}
					stage.Mylife(wick, boogie.Frend + 1);			//������ ���������� ü��Ȯ��
				}
			}
		};

		m_fight1.schedule(t_fight1, 100, 1000);
		
		// �α���� ������� ������
		�α��1���� = new Boogieman(boogie);
		�α��1������� = new Thread(�α��1����);
		�α��1�������.start();

		///////////////////////////////////////////////////////////////////////////////////////////////////////////
		//������ ����

		while(boogie.life){
			//ȸ�ǹ̼� �߻�
			if(boogie.Frend > 1 && boogie.Frend % 3 == 0) {	//�α���� ���ᰡ 3����϶� �̼ǹ߻�
				�̼�Ÿ��++;
				if (�̼�Ÿ�� >= 5) {					//��� ���� �����϶����� Ƚ��ä��� ����
					Attack_Stop = true;
					�̼�Ÿ�� = 0;
					easyQ1 = new EasyQuest();		//���� ����Ʈ ���ʺ����1
					easyQ_1 = new Thread(easyQ1);	//���� ����Ʈ ���������
					easyQ_1.start(); 				//��������Ʈ ��ǽ���
					easyQ_1.join(); 				//���������� ��ٸ���
					EasyQuest easy = new EasyQuest();
					char Answer[] = easy.mission();			//���� ����鼭 ����� ����ְ�
					ȸ�ǹ̼� = text.next();					//�÷��̾ �����ش���
					while(ȸ�ǹ̼�.equals("q")) {
						System.out.println("wsad�� �Է��ϼ���");
						ȸ�ǹ̼� = text.next();
					}
					if(ȸ�ǹ̼�.length() == 6) {				//�־��� ���� ���� �� ���ߴ��� �Ǵ���(���� ����)
						char[] chr = ȸ�ǹ̼�.toCharArray();
						easy.mission(wick, chr, Answer);	//���� Ȯ���ϴ� �̼�
						wick.Hitme(0);
						Attack_Stop = false;
					}
					else {
						System.out.println("������ ������ ���Ͽ����ϴ�\nġ���� ��ó�� ������ϴ�");
						wick.Hitme(20);						//�̼� ������ ���� ������ ���� ����
						Attack_Stop = false;
					}
				}
			}
			txt = text.next();			//�Է�
			//action.Think(txt);
			switch(txt) {				
			case "q": 					//�ѹ߻�			
				while(true) {
					Random random = new Random(); 		//�������� �±�
					int num = random.nextInt(2);		
					if(num >= 0) {
						if(boogie.life(boogie)) {
							wick.Shot(wick, boogie);
							break;
						}
					}
				}

				break;
			case "e": 					//������� Ȯ���ϱ�
				stage.Mylife(wick);
				break;
			case "f": 					//�ѹٲٱ�
				wick.Change(wick);
				break;
			}
		}
		m_fight1.cancel();				//����1 �ڵ����� ����
		wick.Money = wick.Money + boogie.Money;	//�α�� �׿����� ����ȹ��
		Music.close();
		///////////////////////////////////////////////////////////////////////////////////////////////////////////
		//��Ƽ��Ż ȣ�ڰ��ų�?
		Music = new Music("ȣ�ڼҸ�.mp3", true);
		Music.start();
		stage.rest(wick.HP);
		do{								//�Ǽ��� q ���� ���� ����
			flag = 1;
			try{
				numscan = 0;
				numscan = num_scan.nextInt();		//ȣ�ڰ����� �Է�
			}
			catch(InputMismatchException e){
				flag=0;
				num_scan = new Scanner(System.in);
				System.out.println("���ڸ� �Է��ϼ���");
			}

		}while(flag==0);


		if(numscan == 1) {
			while(true) {
				if(numscan == 1) {					//ȣ�ڰ��ٸ�
					Hotel hotel = new Hotel(wick);		//ȣ���λ縻 ����
					numscan = num_scan.nextInt();	//
					if(numscan == 1) {				//ġ�Ḧ �����ϸ�
						hotel.Hill(wick);			//HP ȸ��
					}
					else if(numscan == 2) {			//�Ѿ��� �����ϸ�
						hotel.bullet(wick);
						numscan = num_scan.nextInt();
						hotel.bullet(wick, numscan);//������ �Ѿ� ����
						numscan = 1;				//�ٽ� ȣ�ڸ޴�
					}
					else if(numscan == 3){
						boolean pass = true;
						int ��� = 0;
						while(pass) {
							//���Ӽ���
							pass = hotel.holjjack(wick, 1, 0, 0);
							���ñ�ȭ = num_scan.nextInt();		//���ñ�ȭ�Է�
							//���ñݾ׼���
							pass = hotel.holjjack(wick, 2, ���ñ�ȭ, 0);
							if(pass == false) {				//�߰��� ��ȭ�� �����ϸ� break
								break;
							}
							System.out.println("1. Ȧ��     2. ¦��\n(�����Ͻø� �ٷ� ������ ����˴ϴ�)");
							holljack = num_scan.nextInt();	//Ȧ¦
							hotel = new Hotel();			//�ֻ��� ������ �ݺ����� �����
							hotel.start();					//�ֻ��������� �˾�

							try {							//�ֻ��� ������������ ��ٸ���
								hotel.join();
							} catch (InterruptedException e) {
								e.printStackTrace();
							}


							if(holljack == 1) {
								pass = hotel.holjjack(wick, 3, ���ñ�ȭ, 1);
								��� = num_scan.nextInt();	
								if(��� == 1) {
									pass = true;
								}
								else {
									pass = false;
								}
							}
							else {
								pass = hotel.holjjack(wick, 3, ���ñ�ȭ, 0);
								��� = num_scan.nextInt();
								if(��� == 1) {
									pass = true;
								}
								else {
									pass = false;
								}
							}
						}
						numscan = 1;				//�ٽ� ȣ�ڸ޴�
					}
					else if(numscan == 4){
						System.out.println("ȣ�ڿ��� ���Խ��ϴ�");
						break;
					}
				}
			}
		}

		Music.close();
		Music = new Music("�����������1.mp3", true);
		Music.start();
//		//////////////////////////////////////////////////////////////////////////////
//		//��Ȳ2 Ŭ���� ó��
//
//		stage.stage2("Ŭ��", wick);				
//		passkey = text.next();			//�ణ�� ��
//		Music.close();
//		//���� ����
//		Boogieman boogie2 = new Boogieman();
//		Boogieman boogie22 = new Boogieman();
//		Music = new Music("��������1.mp3", true);
//		Music.start();
//		�ε� = new Stage();
//		�ε�_t = new Thread(�ε�);
//		�ε�_t.start();
//		//�����غ�
//		r_gif = new IMAGE(2);
//		gif = new Thread(r_gif);
//		gif.start();
//		�ε�_t.join();
//		///////////////////////////////////////////////////////////////////////////////////////////////////////////
//		//�� �ڵ� ����
//		AttackTime = 100;
//		Timer m_fight2 = new Timer();
//		TimerTask t_fight2 = new TimerTask() {
//			public void run() {
//				if(Attack_Stop == false) {		//�ٸ� �̼� ��Ÿ������ ��� ��������
//					if(boogie2.life(boogie2) == false && boogie22.life(boogie22) == false) {
//						m_fight2.cancel();
//					}
//					if(wick.HP > 0) {
//						System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
//						boogie2.Shot(wick, boogie2);						//�α���� ����
//						boogie22.Shot(wick, boogie22);						//�α���� ����
//						wick.Hitme(0);							//���� ����
//						stage.frendcheck(boogie2, boogie22);	//���� ���� üũ
//						//mi.Skill_Stun(wick);					//�߰��������Ͻ�ų
//					}
//					else {
//						m_fight2.cancel();
//						System.out.println("������");
//					}
//					AttackTime--;
//					System.out.println("\n");
//					if(boogie2.life(boogie2) == false) {
//						boogie2.Frend = -1;}
//					if(boogie22.life(boogie22) == false) {
//						boogie22.Frend = -1;}
//					stage.Mylife(wick, boogie2.Frend + 1+boogie22.Frend + 1);			//������ ���������� ü��Ȯ��
//				}
//			}
//		};
//
//		m_fight2.schedule(t_fight2, 100, 1000);
//		
//		// �α���� ������� ������
//		�α��1���� = new Boogieman(boogie2);
//		�α��1������� = new Thread(�α��1����);
//		�α��1�������.start();
//		
//		// �α���� ������� ������
//		�α��2���� = new Boogieman(boogie22);
//		�α��2������� = new Thread(�α��2����);
//		�α��2�������.start();
//		
//		///////////////////////////////////////////////////////////////////////////////////////////////////////////
//		//������ ����
//
//		while(boogie2.life|| boogie22.life){
//			//ȸ�ǹ̼� �߻�
//			if(boogie2.Frend > 1 && boogie2.Frend % 3 == 0 || boogie22.Frend > 1 && boogie22.Frend % 3 == 0) {	//�α���� ���ᰡ 3����϶� �̼ǹ߻�
//				�̼�Ÿ��++;
//				if (�̼�Ÿ�� >= 7) {				//��� ���� �����϶����� Ƚ��ä��� ����
//					Attack_Stop = true;
//					�̼�Ÿ�� = 0;
//					easyQ1 = new EasyQuest();	//���� ����Ʈ ���ʺ����
//					easyQ_1 = new Thread(easyQ1);	//���� ����Ʈ ���������
//					easyQ_1.start(); 			//��������Ʈ ��ǽ���
//					easyQ_1.join(); 			//���������� ��ٸ���
//					EasyQuest easy = new EasyQuest();
//					char Answer[] = easy.mission();			//���� ����鼭 ����� ����ְ�
//					ȸ�ǹ̼� = text.next();						//�÷��̾ �����ش���
//					while(ȸ�ǹ̼�.equals("q")) {
//						System.out.println("wsad�� �Է��ϼ���");
//						ȸ�ǹ̼� = text.next();
//					}
//					if(ȸ�ǹ̼�.length() == 6) {					//�־��� ���� ���� �� ���ߴ��� �Ǵ���(���� ����)
//						char[] chr = ȸ�ǹ̼�.toCharArray();
//						easy.mission(wick, chr, Answer);	//���� Ȯ���ϴ� �̼�
//						wick.Hitme(0);
//						Attack_Stop = false;
//					}
//					else {
//						System.out.println("������ ������ ���Ͽ����ϴ�\nġ���� ��ó�� ������ϴ�");
//						wick.Hitme(20);						//�̼� ������ ���� ������ ���� ����
//						Attack_Stop = false;
//					}
//				}
//			}
//			txt = text.next();			//�Է�
//			//action.Think(txt);
//			switch(txt) {				
//			case "q": 					//�ѹ߻�			
//				while(true) {
//					Random random = new Random(); 		//�������� �±�
//					int num = random.nextInt(2);		//0,1 ���� �߻�
//					if(num == 0 && boogie2.life(boogie2) == true) {
//						wick.Shot(wick, boogie2);	//������ ����
//						break;
//					}
//					else if(num == 0 && boogie22.life(boogie22) == true) {
//						wick.Shot(wick, boogie22);
//						break;
//					}
//				}
//
//				break;
//			case "e": 					//������� Ȯ���ϱ�
//				stage.Mylife(wick);
//				break;
//			case "f": 					//�ѹٲٱ�
//				wick.Change(wick);
//				break;
//			}
//		}
//		m_fight2.cancel();				//����1 �ڵ����� ����
//		wick.Money = wick.Money + boogie2.Money + boogie22.Money;	//�α�� �׿����� ����ȹ��
//		Music.close();
//		///////////////////////////////////////////////////////////////////////////////////////////////////////////
//		//��Ƽ��Ż ȣ�ڰ��ų�?
//		Music = new Music("ȣ�ڼҸ�.mp3", true);
//		Music.start();
//		stage.rest(wick.HP);
//		do{								//�Ǽ��� q ���� ���� ����
//			flag = 1;
//			try{
//				numscan = 0;
//				numscan = num_scan.nextInt();		//ȣ�ڰ����� �Է�
//			}
//			catch(InputMismatchException e){
//				flag=0;
//				num_scan = new Scanner(System.in);
//				System.out.println("���ڸ� �Է��ϼ���");
//			}
//
//		}while(flag==0);
//
//
//		if(numscan == 1) {
//			while(true) {
//				if(numscan == 1) {					//ȣ�ڰ��ٸ�
//					Hotel hotel = new Hotel(wick);		//ȣ���λ縻 ����
//					numscan = num_scan.nextInt();	//
//					if(numscan == 1) {				//ġ�Ḧ �����ϸ�
//						hotel.Hill(wick);			//HP ȸ��
//					}
//					else if(numscan == 2) {			//�Ѿ��� �����ϸ�
//						hotel.bullet(wick);
//						numscan = num_scan.nextInt();
//						hotel.bullet(wick, numscan);//������ �Ѿ� ����
//						numscan = 1;				//�ٽ� ȣ�ڸ޴�
//					}
//					else if(numscan == 3){
//						boolean pass = true;
//						int ��� = 0;
//						while(pass) {
//							//���Ӽ���
//							pass = hotel.holjjack(wick, 1, 0, 0);
//							���ñ�ȭ = num_scan.nextInt();		//���ñ�ȭ�Է�
//							//���ñݾ׼���
//							pass = hotel.holjjack(wick, 2, ���ñ�ȭ, 0);
//							if(pass == false) {				//�߰��� ��ȭ�� �����ϸ� break
//								break;
//							}
//							System.out.println("1. Ȧ��     2. ¦��\n(�����Ͻø� �ٷ� ������ ����˴ϴ�)");
//							holljack = num_scan.nextInt();	//Ȧ¦
//							hotel = new Hotel();			//�ֻ��� ������ �ݺ����� �����
//							hotel.start();					//�ֻ��������� �˾�
//
//							try {							//�ֻ��� ������������ ��ٸ���
//								hotel.join();
//							} catch (InterruptedException e) {
//								e.printStackTrace();
//							}
//
//
//							if(holljack == 1) {
//								pass = hotel.holjjack(wick, 3, ���ñ�ȭ, 1);
//								��� = num_scan.nextInt();	
//								if(��� == 1) {
//									pass = true;
//								}
//								else {
//									pass = false;
//								}
//							}
//							else {
//								pass = hotel.holjjack(wick, 3, ���ñ�ȭ, 0);
//								��� = num_scan.nextInt();
//								if(��� == 1) {
//									pass = true;
//								}
//								else {
//									pass = false;
//								}
//							}
//						}
//						numscan = 1;				//�ٽ� ȣ�ڸ޴�
//					}
//					else if(numscan == 4){
//						System.out.println("ȣ�ڿ��� ���Խ��ϴ�");
//						break;
//					}
//				}
//			}
//		}
//
//		Music.close();
//		Music = new Music("�����������1.mp3", true);
//		Music.start();
//

		//////////////////////////////////////////////////////////////////////////////
		//��Ȳ3 ����Ʈ�� ó��
		wick.Gun = 1;

		stage.stage2("����Ʈ", wick);				
		passkey = text.next();			//�ణ�� ��
		Music.close();
		//���� ����
		Boogieman boogie3 = new Boogieman();
		Boogieman boogie33 = new Boogieman(2);
		Music = new Music("��������1.mp3", true);
		Music.start();
		�ε� = new Stage();
		�ε�_t = new Thread(�ε�);
		�ε�_t.start();
		//�����غ�
		r_gif = new IMAGE(2);
		gif = new Thread(r_gif);
		gif.start();
		�ε�_t.join();
		///////////////////////////////////////////////////////////////////////////////////////////////////////////
		//�� �ڵ� ����
		AttackTime = 100;
		Timer m_fight3 = new Timer();
		TimerTask t_fight3 = new TimerTask() {
			public void run() {
				if(Attack_Stop == false) {		//�ٸ� �̼� ��Ÿ������ ��� ��������
					if(boogie3.life(boogie3) == false && boogie33.life(boogie33) == false) {
						m_fight3.cancel();
					}
					if(wick.HP > 0) {
						System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
						boogie3.Shot(wick, boogie3);						//�α���� ����
						boogie33.Shot(wick, boogie33);					//�α���� ����
						wick.Hitme(0);							//���� ����
						stage.frendcheck(boogie3, boogie33);	//���� ���� üũ
						//mi.Skill_Stun(wick);					//�߰��������Ͻ�ų
					}
					else {
						m_fight3.cancel();
						System.out.println("������");
					}
					AttackTime--;
					System.out.println("\n");
					if(boogie3.life(boogie3) == false) {
						boogie3.Frend = -1;}
					if(boogie33.life(boogie33) == false) {
						boogie33.Frend = -1;}
					stage.Mylife(wick, boogie3.Frend + 1+boogie33.Frend + 1);			//������ ���������� ü��Ȯ��
				}
			}
		};

		m_fight3.schedule(t_fight3, 100, 1000);
		
		// �α���� ������� ������
		�α��1���� = new Boogieman(boogie3);
		�α��1������� = new Thread(�α��1����);
		�α��1�������.start();
		
		// �α���� ������� ������
		�α��2���� = new Boogieman(boogie33);
		�α��2������� = new Thread(�α��2����);
		�α��2�������.start();

		///////////////////////////////////////////////////////////////////////////////////////////////////////////
		//������ ����

		while(boogie3.life || boogie33.life){
			//ȸ�ǹ̼� �߻�
			if(boogie3.Frend > 1 && boogie3.Frend % 3 == 0 || boogie33.Frend > 1 && boogie33.Frend % 3 == 0) {	//�α���� ���ᰡ 3����϶� �̼ǹ߻�
				�̼�Ÿ��++;
				if (�̼�Ÿ�� >= 8) {				//��� ���� �����϶����� Ƚ��ä��� ����
					Attack_Stop = true;
					�̼�Ÿ�� = 0;
					easyQ1 = new EasyQuest();	//���� ����Ʈ ���ʺ����
					easyQ_1 = new Thread(easyQ1);	//���� ����Ʈ ���������
					easyQ_1.start(); 			//��������Ʈ ��ǽ���
					easyQ_1.join(); 			//���������� ��ٸ���
					EasyQuest easy = new EasyQuest();
					char Answer[] = easy.mission();			//���� ����鼭 ����� ����ְ�
					ȸ�ǹ̼� = text.next();						//�÷��̾ �����ش���
					while(ȸ�ǹ̼�.equals("q")) {
						System.out.println("wsad�� �Է��ϼ���");
						ȸ�ǹ̼� = text.next();
					}
					if(ȸ�ǹ̼�.length() == 6) {					//�־��� ���� ���� �� ���ߴ��� �Ǵ���(���� ����)
						char[] chr = ȸ�ǹ̼�.toCharArray();
						easy.mission(wick, chr, Answer);	//���� Ȯ���ϴ� �̼�
						wick.Hitme(0);
						Attack_Stop = false;
					}
					else {
						System.out.println("������ ������ ���Ͽ����ϴ�\nġ���� ��ó�� ������ϴ�");
						wick.Hitme(20);						//�̼� ������ ���� ������ ���� ����
						Attack_Stop = false;
					}
				}
			}
			txt = text.next();			//�Է�
			//action.Think(txt);
			switch(txt) {				
			case "q": 					//�ѹ߻�			
				while(true) {
					Random random = new Random(); 		//�������� �±�
					int num = random.nextInt(2);		//0,1 ���� �߻�
					if(num == 0 && boogie3.life(boogie3) == true) {
						wick.Shot(wick, boogie3);
						break;
					}
					else if(num == 1 && boogie33.life(boogie33) == true) {
						wick.Shot(wick, boogie33);
						break;
					}
				}

				break;
			case "e": 					//������� Ȯ���ϱ�
				stage.Mylife(wick);
				break;
			case "f": 					//�ѹٲٱ�
				wick.Change(wick);
				break;
			}
		}
		m_fight3.cancel();				//����1 �ڵ����� ����
		wick.Money = wick.Money + boogie3.Money + boogie33.Money;	//�α�� �׿����� ����ȹ��
		Music.close();
		///////////////////////////////////////////////////////////////////////////////////////////////////////////
		//��Ƽ��Ż ȣ�ڰ��ų�?
		Music = new Music("ȣ�ڼҸ�.mp3", true);
		Music.start();
		stage.rest(wick.HP);
		do{								//�Ǽ��� q ���� ���� ����
			flag = 1;
			try{
				numscan = 0;
				numscan = num_scan.nextInt();		//ȣ�ڰ����� �Է�
			}
			catch(InputMismatchException e){
				flag=0;
				num_scan = new Scanner(System.in);
				System.out.println("���ڸ� �Է��ϼ���");
			}

		}while(flag==0);


		if(numscan == 1) {
			while(true) {
				if(numscan == 1) {					//ȣ�ڰ��ٸ�
					Hotel hotel = new Hotel(wick);		//ȣ���λ縻 ����
					numscan = num_scan.nextInt();	//
					if(numscan == 1) {				//ġ�Ḧ �����ϸ�
						hotel.Hill(wick);			//HP ȸ��
					}
					else if(numscan == 2) {			//�Ѿ��� �����ϸ�
						hotel.bullet(wick);
						numscan = num_scan.nextInt();
						hotel.bullet(wick, numscan);//������ �Ѿ� ����
						numscan = 1;				//�ٽ� ȣ�ڸ޴�
					}
					else if(numscan == 3){
						boolean pass = true;
						int ��� = 0;
						while(pass) {
							//���Ӽ���
							pass = hotel.holjjack(wick, 1, 0, 0);
							���ñ�ȭ = num_scan.nextInt();		//���ñ�ȭ�Է�
							//���ñݾ׼���
							pass = hotel.holjjack(wick, 2, ���ñ�ȭ, 0);
							if(pass == false) {				//�߰��� ��ȭ�� �����ϸ� break
								break;
							}
							System.out.println("1. Ȧ��     2. ¦��\n(�����Ͻø� �ٷ� ������ ����˴ϴ�)");
							holljack = num_scan.nextInt();	//Ȧ¦
							hotel = new Hotel();			//�ֻ��� ������ �ݺ����� �����
							hotel.start();					//�ֻ��������� �˾�

							try {							//�ֻ��� ������������ ��ٸ���
								hotel.join();
							} catch (InterruptedException e) {
								e.printStackTrace();
							}


							if(holljack == 1) {
								pass = hotel.holjjack(wick, 3, ���ñ�ȭ, 1);
								��� = num_scan.nextInt();	
								if(��� == 1) {
									pass = true;
								}
								else {
									pass = false;
								}
							}
							else {
								pass = hotel.holjjack(wick, 3, ���ñ�ȭ, 0);
								��� = num_scan.nextInt();
								if(��� == 1) {
									pass = true;
								}
								else {
									pass = false;
								}
							}
						}
						numscan = 1;				//�ٽ� ȣ�ڸ޴�
					}
					else if(numscan == 4){
						System.out.println("ȣ�ڿ��� ���Խ��ϴ�");
						break;
					}
				}
			}
		}

		Music.close();
		Music = new Music("�����������1.mp3", true);
		Music.start();



//		//////////////////////////////////////////////////////////////////////////////
//		//��Ȳ4 ������ ó��
//
//		stage.stage2("����", wick);				
//		passkey = text.next();			//�ణ�� ��
//		Music.close();
//		//���� ����
//		Boogieman boogie4 = new Boogieman(2);
//		Boogieman boogie44 = new Boogieman(2);
//		Music = new Music("��������1.mp3", true);
//		Music.start();
//		�ε� = new Stage();
//		�ε�_t = new Thread(�ε�);
//		�ε�_t.start();
// 		//�����غ�
//		r_gif = new IMAGE(2);
//		gif = new Thread(r_gif);
//		gif.start();
//		�ε�_t.join();
//		///////////////////////////////////////////////////////////////////////////////////////////////////////////
//		//�� �ڵ� ����
//		AttackTime = 100;
//		Timer m_fight4 = new Timer();
//		TimerTask t_fight4 = new TimerTask() {
//			public void run() {
//				if(Attack_Stop == false) {		//�ٸ� �̼� ��Ÿ������ ��� ��������
//					if(boogie4.life(boogie4) == false && boogie44.life(boogie44) == false) {
//						m_fight4.cancel();
//					}
//					if(wick.HP > 0) {
//						System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
//						boogie4.Shot(wick, boogie4);						//�α���� ����
//						boogie44.Shot(wick, boogie44);						//�α���� ����
//						wick.Hitme(0);							//���� ����
//						//mi.Skill_Stun(wick);					//�߰��������Ͻ�ų
//					}
//					else {
//						m_fight4.cancel();
//						System.out.println("������");
//					}
//					AttackTime--;
//					System.out.println("\n");
//					//if(!boogie3.life(boogie3)){
//					//boogie3.Frend = -1;}
//					//if(!boogie33.life(boogie33)){
//					//boogie33.Frend = -1;}
//					stage.Mylife(wick, boogie4.Frend + 1+boogie44.Frend + 1);			//������ ���������� ü��Ȯ��
//				}
//			}
//		};
//
//		m_fight4.schedule(t_fight4, 100, 1000);
//
//		// �α���� ������� ������
//		�α��1���� = new Boogieman(boogie4);
//		�α��1������� = new Thread(�α��1����);
//		�α��1�������.start();
//		
//		// �α���� ������� ������
//		�α��2���� = new Boogieman(boogie44);
//		�α��2������� = new Thread(�α��2����);
//		�α��2�������.start();
//
//		///////////////////////////////////////////////////////////////////////////////////////////////////////////
//		//������ ����
//
//		while(boogie4.life || boogie44.life){
//			//ȸ�ǹ̼� �߻�
//			if(boogie4.Frend > 1 && boogie4.Frend % 3 == 0 || boogie44.Frend > 1 && boogie44.Frend % 3 == 0) {	//�α���� ���ᰡ 3����϶� �̼ǹ߻�
//				�̼�Ÿ��++;
//				if (�̼�Ÿ�� >= 8) {				//��� ���� �����϶����� Ƚ��ä��� ����
//					Attack_Stop = true;
//					�̼�Ÿ�� = 0;
//					easyQ1 = new EasyQuest();	//���� ����Ʈ ���ʺ����
//					easyQ_1 = new Thread(easyQ1);	//���� ����Ʈ ���������
//					easyQ_1.start(); 			//��������Ʈ ��ǽ���
//					easyQ_1.join(); 			//���������� ��ٸ���
//					EasyQuest easy = new EasyQuest();
//					char Answer[] = easy.mission();			//���� ����鼭 ����� ����ְ�
//					ȸ�ǹ̼� = text.next();						//�÷��̾ �����ش���
//					while(ȸ�ǹ̼�.equals("q")) {
//						System.out.println("wsad�� �Է��ϼ���");
//						ȸ�ǹ̼� = text.next();
//					}
//					if(ȸ�ǹ̼�.length() == 6) {					//�־��� ���� ���� �� ���ߴ��� �Ǵ���(���� ����)
//						char[] chr = ȸ�ǹ̼�.toCharArray();
//						easy.mission(wick, chr, Answer);	//���� Ȯ���ϴ� �̼�
//						wick.Hitme(0);
//						Attack_Stop = false;
//					}
//					else {
//						System.out.println("������ ������ ���Ͽ����ϴ�\nġ���� ��ó�� ������ϴ�");
//						wick.Hitme(20);						//�̼� ������ ���� ������ ���� ����
//						Attack_Stop = false;
//					}
//				}
//			}
//			txt = text.next();			//�Է�
//			//action.Think(txt);
//			switch(txt) {				
//			case "q": 					//�ѹ߻�			
//				while(true) {
//					Random random = new Random(); 		//�������� �±�
//					int num = random.nextInt(2);		//0,1 ���� �߻�
//					if(num == 0 && boogie4.life(boogie4) == true) {
//						wick.Shot(wick, boogie4);
//						break;
//					}
//					else if(num == 1 && boogie44.life(boogie44) == true) {
//						wick.Shot(wick, boogie44);
//						break;
//					}
//				}
//
//				break;
//			case "e": 					//������� Ȯ���ϱ�
//				stage.Mylife(wick);
//				break;
//			case "f": 					//�ѹٲٱ�
//				wick.Change(wick);
//				break;
//			}
//		}
//		m_fight3.cancel();				//����1 �ڵ����� ����
//		wick.Money = wick.Money + boogie4.Money + boogie44.Money;	//�α�� �׿����� ����ȹ��
//		Music.close();
//		///////////////////////////////////////////////////////////////////////////////////////////////////////////
//		//��Ƽ��Ż ȣ�ڰ��ų�?
//		Music = new Music("ȣ�ڼҸ�.mp3", true);
//		Music.start();
//		stage.rest(wick.HP);
//		do{								//�Ǽ��� q ���� ���� ����
//			flag = 1;
//			try{
//				numscan = 0;
//				numscan = num_scan.nextInt();		//ȣ�ڰ����� �Է�
//			}
//			catch(InputMismatchException e){
//				flag=0;
//				num_scan = new Scanner(System.in);
//				System.out.println("���ڸ� �Է��ϼ���");
//			}
//
//		}while(flag==0);
//
//
//		if(numscan == 1) {
//			while(true) {
//				if(numscan == 1) {					//ȣ�ڰ��ٸ�
//					Hotel hotel = new Hotel(wick);		//ȣ���λ縻 ����
//					numscan = num_scan.nextInt();	//
//					if(numscan == 1) {				//ġ�Ḧ �����ϸ�
//						hotel.Hill(wick);			//HP ȸ��
//					}
//					else if(numscan == 2) {			//�Ѿ��� �����ϸ�
//						hotel.bullet(wick);
//						numscan = num_scan.nextInt();
//						hotel.bullet(wick, numscan);//������ �Ѿ� ����
//						numscan = 1;				//�ٽ� ȣ�ڸ޴�
//					}
//					else if(numscan == 3){
//						boolean pass = true;
//						int ��� = 0;
//						while(pass) {
//							//���Ӽ���
//							pass = hotel.holjjack(wick, 1, 0, 0);
//							���ñ�ȭ = num_scan.nextInt();		//���ñ�ȭ�Է�
//							//���ñݾ׼���
//							pass = hotel.holjjack(wick, 2, ���ñ�ȭ, 0);
//							if(pass == false) {				//�߰��� ��ȭ�� �����ϸ� break
//								break;
//							}
//							System.out.println("1. Ȧ��     2. ¦��\n(�����Ͻø� �ٷ� ������ ����˴ϴ�)");
//							holljack = num_scan.nextInt();	//Ȧ¦
//							hotel = new Hotel();			//�ֻ��� ������ �ݺ����� �����
//							hotel.start();					//�ֻ��������� �˾�
//
//							try {							//�ֻ��� ������������ ��ٸ���
//								hotel.join();
//							} catch (InterruptedException e) {
//								e.printStackTrace();
//							}
//
//
//							if(holljack == 1) {
//								pass = hotel.holjjack(wick, 3, ���ñ�ȭ, 1);
//								��� = num_scan.nextInt();	
//								if(��� == 1) {
//									pass = true;
//								}
//								else {
//									pass = false;
//								}
//							}
//							else {
//								pass = hotel.holjjack(wick, 3, ���ñ�ȭ, 0);
//								��� = num_scan.nextInt();
//								if(��� == 1) {
//									pass = true;
//								}
//								else {
//									pass = false;
//								}
//							}
//						}
//						numscan = 1;				//�ٽ� ȣ�ڸ޴�
//					}
//					else if(numscan == 4){
//						System.out.println("ȣ�ڿ��� ���Խ��ϴ�");
//						break;
//					}
//				}
//			}
//		}
//
//		Music.close();
//		Music = new Music("�����������1.mp3", true);
//		Music.start();
//









		//////////////////////////////////////////////////////////////////////////////
		//��Ȳ5 ���ǾƼ��������忡 ó��
		wick.Gun = 1;

		stage.stage2("���Ǿ� ���� ������", wick);				
		passkey = text.next();			//�ణ�� ��
		Music.close();
		//���� ����
		Boogieman boogie5 = new Boogieman();
		Boogieman boogie55 = new Boogieman(2);
		Boogieman boogie555 = new Boogieman(2);
		Music = new Music("��������1.mp3", true);
		Music.start();
		�ε� = new Stage();
		�ε�_t = new Thread(�ε�);
		�ε�_t.start();
		//�����غ�
		r_gif = new IMAGE(2);
		gif = new Thread(r_gif);
		gif.start();
		�ε�_t.join();
		///////////////////////////////////////////////////////////////////////////////////////////////////////////
		//�� �ڵ� ����
		AttackTime = 100;
		Timer m_fight5 = new Timer();
		TimerTask t_fight5 = new TimerTask() {
			public void run() {
				if(Attack_Stop == false) {		//�ٸ� �̼� ��Ÿ������ ��� ��������
					if(boogie5.life(boogie5) == false && boogie55.life(boogie55) == false && boogie555.life(boogie555) == false) {
						m_fight5.cancel();
					}
					if(wick.HP > 0) {
						System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
						boogie5.Shot(wick, boogie5);						//�α���� ����
						boogie55.Shot(wick, boogie55);						//�α���� ����
						boogie555.Shot(wick, boogie555);						//�α���� ����
						wick.Hitme(0);							//���� ����
						stage.frendcheck(boogie5, boogie55, boogie555);	//���� ���� üũ
						//mi.Skill_Stun(wick);					//�߰��������Ͻ�ų
					}
					else {
						m_fight5.cancel();
						System.out.println("������");
					}
					AttackTime--;
					System.out.println("\n");
					if(boogie5.life(boogie5) == false) {
						boogie5.Frend = -1;}
					if(boogie55.life(boogie55) == false) {
						boogie55.Frend = -1;}
					if(boogie555.life(boogie555) == false) {
						boogie555.Frend = -1;}
					stage.Mylife(wick, boogie5.Frend + 1+boogie55.Frend + 1+boogie555.Frend + 1);			//������ ���������� ü��Ȯ��
				}
			}
		};

		m_fight5.schedule(t_fight5, 100, 1000);

		
		// �α���� ������� ������
		�α��1���� = new Boogieman(boogie5);
		�α��1������� = new Thread(�α��1����);
		�α��1�������.start();
		
		// �α���� ������� ������
		�α��2���� = new Boogieman(boogie55);
		�α��2������� = new Thread(�α��2����);
		�α��2�������.start();
		
		// �α���� ������� ������
		�α��3���� = new Boogieman(boogie555);
		�α��3������� = new Thread(�α��3����);
		�α��3�������.start();
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////////
		//������ ����

		while(boogie5.life || boogie55.life || boogie555.life){
			//ȸ�ǹ̼� �߻�
			if(boogie5.Frend > 1 && boogie5.Frend % 3 == 0 || boogie55.Frend > 1 && boogie55.Frend % 3 == 0 || boogie555.Frend > 1 && boogie555.Frend % 3 == 0) {	//�α���� ���ᰡ 3����϶� �̼ǹ߻�
				�̼�Ÿ��++;
				if (�̼�Ÿ�� >= 8) {				//��� ���� �����϶����� Ƚ��ä��� ����
					Attack_Stop = true;
					�̼�Ÿ�� = 0;
					easyQ1 = new EasyQuest();	//���� ����Ʈ ���ʺ����
					easyQ_1 = new Thread(easyQ1);	//���� ����Ʈ ���������
					easyQ_1.start(); 			//��������Ʈ ��ǽ���
					easyQ_1.join(); 			//���������� ��ٸ���
					EasyQuest easy = new EasyQuest();
					char Answer[] = easy.mission();			//���� ����鼭 ����� ����ְ�
					ȸ�ǹ̼� = text.next();						//�÷��̾ �����ش���
					while(ȸ�ǹ̼�.equals("q")) {
						System.out.println("wsad�� �Է��ϼ���");
						ȸ�ǹ̼� = text.next();
					}
					if(ȸ�ǹ̼�.length() == 6) {					//�־��� ���� ���� �� ���ߴ��� �Ǵ���(���� ����)
						char[] chr = ȸ�ǹ̼�.toCharArray();
						easy.mission(wick, chr, Answer);	//���� Ȯ���ϴ� �̼�
						wick.Hitme(0);
						Attack_Stop = false;
					}
					else {
						System.out.println("������ ������ ���Ͽ����ϴ�\nġ���� ��ó�� ������ϴ�");
						wick.Hitme(20);						//�̼� ������ ���� ������ ���� ����
						Attack_Stop = false;
					}
				}
			}
			txt = text.next();			//�Է�
			//action.Think(txt);
			switch(txt) {				
			case "q": 					//�ѹ߻�			
				while(true) {
					Random random = new Random(); 		//�������� �±�
					int num = random.nextInt(3);		//0,1 ���� �߻�
					if(num == 0 && boogie5.life(boogie5) == true) {
						wick.Shot(wick, boogie5);
						break;
					}
					else if(num == 1 && boogie55.life(boogie55) == true) {
						wick.Shot(wick, boogie55);
						break;
					}
					else if(num == 2 && boogie555.life(boogie555) == true) {
						wick.Shot(wick, boogie555);
						break;
					}
				}

				break;
			case "e": 					//������� Ȯ���ϱ�
				stage.Mylife(wick);
				break;
			case "f": 					//�ѹٲٱ�
				wick.Change(wick);
				break;
			}
		}
		m_fight5.cancel();				//����1 �ڵ����� ����
		wick.Money = wick.Money + boogie5.Money + boogie55.Money + boogie555.Money;	//�α�� �׿����� ����ȹ��
		Music.close();
		///////////////////////////////////////////////////////////////////////////////////////////////////////////
		//��Ƽ��Ż ȣ�ڰ��ų�?
		Music = new Music("ȣ�ڼҸ�.mp3", true);
		Music.start();
		stage.rest(wick.HP);
		do{								//�Ǽ��� q ���� ���� ����
			flag = 1;
			try{
				numscan = 0;
				numscan = num_scan.nextInt();		//ȣ�ڰ����� �Է�
			}
			catch(InputMismatchException e){
				flag=0;
				num_scan = new Scanner(System.in);
				System.out.println("���ڸ� �Է��ϼ���");
			}

		}while(flag==0);


		if(numscan == 1) {
			while(true) {
				if(numscan == 1) {					//ȣ�ڰ��ٸ�
					Hotel hotel = new Hotel(wick);		//ȣ���λ縻 ����
					numscan = num_scan.nextInt();	//
					if(numscan == 1) {				//ġ�Ḧ �����ϸ�
						hotel.Hill(wick);			//HP ȸ��
					}
					else if(numscan == 2) {			//�Ѿ��� �����ϸ�
						hotel.bullet(wick);
						numscan = num_scan.nextInt();
						hotel.bullet(wick, numscan);//������ �Ѿ� ����
						numscan = 1;				//�ٽ� ȣ�ڸ޴�
					}
					else if(numscan == 3){
						boolean pass = true;
						int ��� = 0;
						while(pass) {
							//���Ӽ���
							pass = hotel.holjjack(wick, 1, 0, 0);
							���ñ�ȭ = num_scan.nextInt();		//���ñ�ȭ�Է�
							//���ñݾ׼���
							pass = hotel.holjjack(wick, 2, ���ñ�ȭ, 0);
							if(pass == false) {				//�߰��� ��ȭ�� �����ϸ� break
								break;
							}
							System.out.println("1. Ȧ��     2. ¦��\n(�����Ͻø� �ٷ� ������ ����˴ϴ�)");
							holljack = num_scan.nextInt();	//Ȧ¦
							hotel = new Hotel();			//�ֻ��� ������ �ݺ����� �����
							hotel.start();					//�ֻ��������� �˾�

							try {							//�ֻ��� ������������ ��ٸ���
								hotel.join();
							} catch (InterruptedException e) {
								e.printStackTrace();
							}


							if(holljack == 1) {
								pass = hotel.holjjack(wick, 3, ���ñ�ȭ, 1);
								��� = num_scan.nextInt();	
								if(��� == 1) {
									pass = true;
								}
								else {
									pass = false;
								}
							}
							else {
								pass = hotel.holjjack(wick, 3, ���ñ�ȭ, 0);
								��� = num_scan.nextInt();
								if(��� == 1) {
									pass = true;
								}
								else {
									pass = false;
								}
							}
						}
						numscan = 1;				//�ٽ� ȣ�ڸ޴�
					}
					else if(numscan == 4){
						System.out.println("ȣ�ڿ��� ���Խ��ϴ�");
						break;
					}
				}
			}
		}

		Music.close();
		Music = new Music("�����������1.mp3", true);
		Music.start();





		//////////////////////////////////////////////////////////////////////////////
		//��Ȳ6 �ݰ����ҿ� ó��
		wick.Gun = 1;
		//testtest
		//1 �α��ħ��//2 �����غ�//3 �ڵ�������//4 �ڵ�������//5 ���ļ���//6 ����������
//		r_gif = new IMAGE(5);
//		gif = new Thread(r_gif);
//		gif.start();
//		gif.join();
//		r_gif = new IMAGE(2);
//		gif = new Thread(r_gif);
//		gif.start();
//		gif.join();
//		r_gif = new IMAGE(3);
//		gif = new Thread(r_gif);
//		gif.start();
//		gif.join();
		
		stage.stage2("�ݰ�����", wick);				
		passkey = text.next();			//�ణ�� ��
		Music.close();
		//���� ����
		Boogieman boogie6 = new Boogieman();
		Boogieman boogie66 = new Boogieman(2);
		MiddleBoss middle6 = new MiddleBoss();
		Music = new Music("��������1.mp3", true);
		Music.start();
		�ε� = new Stage();
		�ε�_t = new Thread(�ε�);
		�ε�_t.start();
		//�����غ�
		r_gif = new IMAGE(2);
		gif = new Thread(r_gif);
		gif.start();
		�ε�_t.join();
		///////////////////////////////////////////////////////////////////////////////////////////////////////////
		//�� �ڵ� ����
		AttackTime = 100;
		Timer m_fight6 = new Timer();
		TimerTask t_fight6 = new TimerTask() {
			public void run() {
				if(Attack_Stop == false) {		//�ٸ� �̼� ��Ÿ������ ��� ��������
					if(boogie6.life(boogie6) == false && boogie66.life(boogie66) == false && middle6.life(middle6) == false) {
						m_fight6.cancel();
					}
					if(wick.HP > 0) {
						System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
						boogie6.Shot(wick, boogie6);						//�α���� ����
						boogie66.Shot(wick, boogie66);					//�α���� ����
						middle6.Shot(wick, middle6);	
						//�α���� ����
						wick.Hitme(0);							//���� ����
						stage.frendcheck(boogie6, boogie66, middle6);	//���� ���� üũ
						//mi.Skill_Stun(wick, 0, middle6);		//�߰��������Ͻ�ų
					}
					else {
						m_fight6.cancel();
						System.out.println("������");
					}
					AttackTime--;
					System.out.println("\n");
					if(boogie6.life(boogie6) == false) {
						boogie6.Frend = -1;}
					if(boogie66.life(boogie66) == false) {
						boogie66.Frend = -1;}
					if(middle6.life(middle6) == false) {
						middle6.Frend = -1;}
					stage.Mylife(wick, boogie6.Frend + 1+boogie66.Frend + 1+middle6.Frend + 1);			//������ ���������� ü��Ȯ��
				}
			}
		};

		m_fight6.schedule(t_fight6, 100, 1000);

		
		// �α���� ������� ������
		�α��1���� = new Boogieman(boogie6);
		�α��1������� = new Thread(�α��1����);
		�α��1�������.start();
		
		// �α���� ������� ������
		�α��2���� = new Boogieman(boogie66);
		�α��2������� = new Thread(�α��2����);
		�α��2�������.start();
		
		// �α���� ������� ������
		�߰��������� = new Boogieman(middle6);
		�߰������������ = new Thread(�߰���������);
		�߰������������.start();
		
		// �߰����� ��ų
		�߰�������ų = new MiddleBoss(middle6, wick, 2);
		�߰�������ų�ߵ� = new Thread(�߰�������ų);
		�߰�������ų�ߵ�.start();
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////////
		//������ ����

		while(boogie6.life || boogie66.life || middle6.life){
			//ȸ�ǹ̼� �߻�
			if(boogie6.Frend > 1 && boogie6.Frend % 3 == 0 || boogie66.Frend > 1 && boogie66.Frend % 3 == 0 || middle6.Frend > 1 && middle6.Frend % 3 == 0) {	//�α���� ���ᰡ 3����϶� �̼ǹ߻�
				�̼�Ÿ��++;
				if (�̼�Ÿ�� >= 8) {				//��� ���� �����϶����� Ƚ��ä��� ����
					Attack_Stop = true;
					�̼�Ÿ�� = 0;
					easyQ1 = new EasyQuest();	//���� ����Ʈ ���ʺ����
					easyQ_1 = new Thread(easyQ1);	//���� ����Ʈ ���������
					easyQ_1.start(); 			//��������Ʈ ��ǽ���
					easyQ_1.join(); 			//���������� ��ٸ���
					EasyQuest easy = new EasyQuest();
					char Answer[] = easy.mission();			//���� ����鼭 ����� ����ְ�
					ȸ�ǹ̼� = text.next();						//�÷��̾ �����ش���
					while(ȸ�ǹ̼�.equals("q")) {
						System.out.println("wsad�� �Է��ϼ���");
						ȸ�ǹ̼� = text.next();
					}
					if(ȸ�ǹ̼�.length() == 6) {					//�־��� ���� ���� �� ���ߴ��� �Ǵ���(���� ����)
						char[] chr = ȸ�ǹ̼�.toCharArray();
						easy.mission(wick, chr, Answer);	//���� Ȯ���ϴ� �̼�
						wick.Hitme(0);
						Attack_Stop = false;
					}
					else {
						System.out.println("������ ������ ���Ͽ����ϴ�\nġ���� ��ó�� ������ϴ�");
						wick.Hitme(20);						//�̼� ������ ���� ������ ���� ����
						Attack_Stop = false;
					}
				}
			}
			txt = text.next();			//�Է�
			//action.Think(txt);
			switch(txt) {				
			case "q": 					//�ѹ߻�			
				while(true) {
					Random random = new Random(); 		//�������� �±�
					int num = random.nextInt(3);		//0,1 ���� �߻�
					if(num == 0 && boogie6.life(boogie6) == true) {
						wick.Shot(wick, boogie6);
						break;
					}
					else if(num == 1 && boogie66.life(boogie66) == true) {
						wick.Shot(wick, boogie66);
						break;
					}
					else if(num == 2 && middle6.life(middle6) == true) {
						wick.Shot(wick, middle6);
						break;
					}
				}

				break;
			case "e": 					//������� Ȯ���ϱ�
				stage.Mylife(wick);
				break;
			case "f": 					//�ѹٲٱ�
				wick.Change(wick);
				break;
			}
		}
		m_fight6.cancel();				//����1 �ڵ����� ����
		wick.Money = wick.Money + boogie6.Money + boogie66.Money + middle6.Money;	//�α�� �׿����� ����ȹ��
		
		////////////////////////////////////////////
		//��ź����Ʈ �߻�
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
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
		System.out.println("<Mission> ���Ǿ������� �߿� �ݰ� �ִ� �ǹ��� �ı��ϼ���");
		
		Runnable r_Bomb = new NomalQuest();
		Thread t_Bomb = new Thread(r_Bomb);
		t_Bomb.start();
		
		//t_Bomb.join();		//�̼ǿϼ������� ��ٷ��ֱ�
		////////////////////////////////////////////
		
		passkey = text.next();
		while(passkey.equals("q")) {
			passkey = text.next();
		}
		
		Music.close();
		///////////////////////////////////////////////////////////////////////////////////////////////////////////
		//��Ƽ��Ż ȣ�ڰ��ų�?
		Music = new Music("ȣ�ڼҸ�.mp3", true);
		Music.start();
		stage.rest(wick.HP);
		do{								//�Ǽ��� q ���� ���� ����
			flag = 1;
			try{
				numscan = 0;
				numscan = num_scan.nextInt();		//ȣ�ڰ����� �Է�
			}
			catch(InputMismatchException e){
				flag=0;
				num_scan = new Scanner(System.in);
				System.out.println("���ڸ� �Է��ϼ���");
			}

		}while(flag==0);


		if(numscan == 1) {
			while(true) {
				if(numscan == 1) {					//ȣ�ڰ��ٸ�
					Hotel hotel = new Hotel(wick);		//ȣ���λ縻 ����
					numscan = num_scan.nextInt();	//
					if(numscan == 1) {				//ġ�Ḧ �����ϸ�
						hotel.Hill(wick);			//HP ȸ��
					}
					else if(numscan == 2) {			//�Ѿ��� �����ϸ�
						hotel.bullet(wick);
						numscan = num_scan.nextInt();
						hotel.bullet(wick, numscan);//������ �Ѿ� ����
						numscan = 1;				//�ٽ� ȣ�ڸ޴�
					}
					else if(numscan == 3){
						boolean pass = true;
						int ��� = 0;
						while(pass) {
							//���Ӽ���
							pass = hotel.holjjack(wick, 1, 0, 0);
							���ñ�ȭ = num_scan.nextInt();		//���ñ�ȭ�Է�
							//���ñݾ׼���
							pass = hotel.holjjack(wick, 2, ���ñ�ȭ, 0);
							if(pass == false) {				//�߰��� ��ȭ�� �����ϸ� break
								break;
							}
							System.out.println("1. Ȧ��     2. ¦��\n(�����Ͻø� �ٷ� ������ ����˴ϴ�)");
							holljack = num_scan.nextInt();	//Ȧ¦
							hotel = new Hotel();			//�ֻ��� ������ �ݺ����� �����
							hotel.start();					//�ֻ��������� �˾�

							try {							//�ֻ��� ������������ ��ٸ���
								hotel.join();
							} catch (InterruptedException e) {
								e.printStackTrace();
							}


							if(holljack == 1) {
								pass = hotel.holjjack(wick, 3, ���ñ�ȭ, 1);
								��� = num_scan.nextInt();	
								if(��� == 1) {
									pass = true;
								}
								else {
									pass = false;
								}
							}
							else {
								pass = hotel.holjjack(wick, 3, ���ñ�ȭ, 0);
								��� = num_scan.nextInt();
								if(��� == 1) {
									pass = true;
								}
								else {
									pass = false;
								}
							}
						}
						numscan = 1;				//�ٽ� ȣ�ڸ޴�
					}
					else if(numscan == 4){
						System.out.println("ȣ�ڿ��� ���Խ��ϴ�");
						break;
					}
				}
			}
		}

		Music.close();
		Music = new Music("�����������1.mp3", true);
		Music.start();
		
		
		
		
		
		

		//////////////////////////////////////////////////////////////////////////////
		//��Ȳ7 ���� �ְ����� ó��
		wick.Gun = 1;

		stage.stage2("���� �ְ���", wick);				
		passkey = text.next();			//�ణ�� ��
		Music.close();
		//���� ����
		Boogieman boogie7 = new Boogieman();
		Boogieman boogie77 = new Boogieman(2);
		MiddleBoss middle7 = new MiddleBoss(2);
		Music = new Music("��������1.mp3", true);
		Music.start();
		�ε� = new Stage();
		�ε�_t = new Thread(�ε�);
		�ε�_t.start();
		//�����غ�
		r_gif = new IMAGE(2);
		gif = new Thread(r_gif);
		gif.start();
		�ε�_t.join();
		///////////////////////////////////////////////////////////////////////////////////////////////////////////
		//�� �ڵ� ����
		AttackTime = 100;
		Timer m_fight7 = new Timer();
		TimerTask t_fight7 = new TimerTask() {
			public void run() {
				if(Attack_Stop == false) {		//�ٸ� �̼� ��Ÿ������ ��� ��������
					if(boogie7.life(boogie7) == false && boogie77.life(boogie77) == false && middle7.life(middle7) == false) {
						m_fight7.cancel();
					}
					if(wick.HP > 0) {
						System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
						boogie7.Shot(wick, boogie7);						//�α���� ����
						boogie77.Shot(wick, boogie77);					//�α���� ����
						middle7.Shot(wick, middle7);						//�α���� ����
						wick.Hitme(0);							//���� ����
						stage.frendcheck(boogie7, boogie77, middle7);	//���� ���� üũ
						//mi.Skill_Stun(wick, 2, middle7);		//�߰��������Ͻ�ų
					}
					else {
						m_fight7.cancel();
						System.out.println("������");
					}
					AttackTime--;
					System.out.println("\n");
					if(boogie7.life(boogie7) == false) {
						boogie7.Frend = -1;}
					if(boogie77.life(boogie77) == false) {
						boogie77.Frend = -1;}
					if(middle7.life(middle7) == false) {
						middle7.Frend = -1;}
					stage.Mylife(wick, boogie7.Frend + 1 + boogie77.Frend + 1 + middle7.Frend + 1);			//������ ���������� ü��Ȯ��
				}
			}
		};

		m_fight7.schedule(t_fight7, 100, 1000);

		
		// �α���� ������� ������
		�α��1���� = new Boogieman(boogie7);
		�α��1������� = new Thread(�α��1����);
		�α��1�������.start();
		
		// �α���� ������� ������
		�α��2���� = new Boogieman(boogie77);
		�α��2������� = new Thread(�α��2����);
		�α��2�������.start();
		
		// �α���� ������� ������
		�߰��������� = new Boogieman(middle7);
		�߰������������ = new Thread(�߰���������);
		�߰������������.start();
		
		// �߰����� ��ų
		�߰�������ų = new MiddleBoss(middle7, wick, 5);
		�߰�������ų�ߵ� = new Thread(�߰�������ų);
		�߰�������ų�ߵ�.start();
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////////
		//������ ����

		while(boogie7.life || boogie77.life || middle7.life){
			//ȸ�ǹ̼� �߻�
			if(boogie7.Frend > 1 && boogie7.Frend % 3 == 0 || boogie77.Frend > 1 && boogie77.Frend % 3 == 0 || middle7.Frend > 1 && middle7.Frend % 3 == 0) {	//�α���� ���ᰡ 3����϶� �̼ǹ߻�
				�̼�Ÿ��++;
				if (�̼�Ÿ�� >= 8) {				//��� ���� �����϶����� Ƚ��ä��� ����
					Attack_Stop = true;
					�̼�Ÿ�� = 0;
					easyQ1 = new EasyQuest();	//���� ����Ʈ ���ʺ����
					easyQ_1 = new Thread(easyQ1);	//���� ����Ʈ ���������
					easyQ_1.start(); 			//��������Ʈ ��ǽ���
					easyQ_1.join(); 			//���������� ��ٸ���
					EasyQuest easy = new EasyQuest();
					char Answer[] = easy.mission();			//���� ����鼭 ����� ����ְ�
					ȸ�ǹ̼� = text.next();						//�÷��̾ �����ش���
					while(ȸ�ǹ̼�.equals("q")) {
						System.out.println("wsad�� �Է��ϼ���");
						ȸ�ǹ̼� = text.next();
					}
					if(ȸ�ǹ̼�.length() == 6) {					//�־��� ���� ���� �� ���ߴ��� �Ǵ���(���� ����)
						char[] chr = ȸ�ǹ̼�.toCharArray();
						easy.mission(wick, chr, Answer);	//���� Ȯ���ϴ� �̼�
						wick.Hitme(0);
						Attack_Stop = false;
					}
					else {
						System.out.println("������ ������ ���Ͽ����ϴ�\nġ���� ��ó�� ������ϴ�");
						wick.Hitme(20);						//�̼� ������ ���� ������ ���� ����
						Attack_Stop = false;
					}
				}
			}
			txt = text.next();			//�Է�
			//action.Think(txt);
			switch(txt) {				
			case "q": 					//�ѹ߻�			
				while(true) {
					Random random = new Random(); 		//�������� �±�
					int num = random.nextInt(3);		//0,1 ���� �߻�
					if(num == 0 && boogie7.life(boogie7) == true) {
						wick.Shot(wick, boogie7);
						break;
					}
					else if(num == 1 && boogie77.life(boogie77) == true) {
						wick.Shot(wick, boogie77);
						break;
					}
					else if(num == 2 && middle7.life(middle7) == true) {
						wick.Shot(wick, middle7);
						break;
					}
				}

				break;
			case "e": 					//������� Ȯ���ϱ�
				stage.Mylife(wick);
				break;
			case "f": 					//�ѹٲٱ�
				wick.Change(wick);
				break;
			}
		}
		m_fight7.cancel();				//����1 �ڵ����� ����
		wick.Money = wick.Money + boogie7.Money + boogie77.Money + middle7.Money;	//�α�� �׿����� ����ȹ��
		
		////////////////////////////////////////////
		
		//�߰ݹ̼ǹ߻�
		r_gif = new IMAGE(3);
		gif = new Thread(r_gif);
		gif.start();
		gif.join();
		
		Runnable r_�߰� = new HardQuest();
		Thread �߰� = new Thread(r_�߰�);
		�߰�.start();
		
		char c;
		text = new Scanner(System.in);
		HardQuest hard = new HardQuest();
		while(hard.continu) {
			c = text.next().charAt(0);
			hard = new HardQuest(c);
		}
		
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n�߰ݼ���");
		
		//�߰ݼ�����
		r_gif = new IMAGE(4);
		gif = new Thread(r_gif);
		gif.start();
		gif.join();
		////////////////////////////////////////////
		
		
		Music.close();


		////////////////////////////////////////////////////////////////////////////////////////////////////
		

		
		Music = new Music("��������.mp3", true);
		Music.start();
		Boss Boss = new Boss(wick);
		passkey = text.next();			//�ణ�� ��
		
		Runnable boss = new Boss(wick, Boss);
		Thread lastfight = new Thread(boss);
		lastfight.start();
		
		
		wick.Gun = 4;					//�ָ����� �ο��
		
		while(bossfight){
			txt = text.next();			//�Է�
			switch(txt) {				
			case "q": 					//�ѹ߻�		
				wick.Shot(wick, Boss);
				break;
			case "f": 					//�ѹٲٱ�
				System.out.println("(������� �ο���!)");
				break;
			}
		}
		wick.Gun = 1;
		while(bossrun){
			txt = text.next();			//�Է�
			switch(txt) {				
			case "q": 					//�ѹ߻�		
				wick.Shot(wick, Boss);
				break;
			case "f": 					//�ѹٲٱ�
				wick.Change(wick);
				break;
			}
		}
		
		if(Action.win) {
			try {
				lastfight.interrupt();
			} catch (Exception e) {
				System.out.println("�̼� complete");
			}
		}
		
		
		
		
		
		lastfight.join();
		
		Music.close();
		Music = new Music("�����������1.mp3", true);
		Music.start();
		
		
		
		
		
		
		
		
		
		
		
		
		//������ �����ϱ�
		r_gif = new IMAGE(6);
		gif = new Thread(r_gif);
		gif.start();
		
		
		
		
		
		System.out.println(" ##  ##    ####    ##  ##            ##   ##  ######   ##  ##              ##    \r\n" + 
				" ##  ##   ##  ##   ##  ##            ##   ##    ##     ### ##              ##    \r\n" + 
				"  ####    ##  ##   ##  ##            ## # ##    ##     ######              ##    \r\n" + 
				"   ##     ##  ##   ##  ##            #######    ##     ######              ##    \r\n" + 
				"   ##     ##  ##   ##  ##            ### ###    ##     ## ###                    \r\n" + 
				"   ##      ####    ######            ##   ##  ######   ##  ##              ##    \r\n" + 
				"");
		System.out.println("�¸��߽��ϴ�!");
		System.out.println("�����Ͻðڽ��ϱ�?\n 1. Yes");
		//passkey = text.next();
		
		
		
		while(true) {
			try {
				numscan = num_scan.nextInt();					//��ĳ�� Ȱ��ȭ
				break;
			} catch (Exception e) {
				num_scan = new Scanner(System.in);
				System.out.println("1 �� �Է��ϼ���");
			}
		}
		Music.close();
		System.exit(0);
		
		



	}

}
