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
	
	int Hillmoney = 20;				//ġ����
	int Bullet_Machine = 50;		//����� �Ѿ� ����
	int price_Machine = 50;			//����� �Ѿ� ����
	int Bullet_Sniper = 30;			//������ �Ѿ� ����
	int price_Sniper = 50;			//������ �Ѿ� ����
	
	int �ֻ���1 = 0;
	int �ֻ���2 = 0;
	int �����ѵ� = 0;
	int ���ñ�ȭ = 0;
	//�޼ҵ�
	
	public Hotel() {
		
	}
	
	
	public Hotel(Wick wick) {						//ȣ�� �λ縻
		System.out.println();
		System.out.println("Mr.������ ������ ���͵帱���?");
		System.out.println("������ȭ " + wick.Money);
		System.out.println("����ü�� " + wick.HP);
		System.out.println("1. �ǻ縦 �ҷ��ּ���(��ȭ-20)   2. �Ѿ��� �ʿ��մϴ�      3. ī���뿡 ���������� ����?    4. �����ڽ��ϴ�");
	}
	

	
	
	
	public void Hill(Wick wick) {			//����ġ��ȸ��
		if(wick.Money >= 20) {
			System.out.println();
			if(wick.HP > 950) {
				wick.HP = 1000;}
			else {
				wick.HP = wick.HP + 50;}
			wick.Money = wick.Money - 20;
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("ġ�Ḧ �Ϸ��߽��ϴ�");
			System.out.println("������ ����ϰڽ��ϴ� ������");
		}
		else {
			System.out.println("��ȭ�� �����մϴ�");
		}
	}
	
	
	public void bullet(Wick wick) {			//�ѱ��Ż�Ȳ
		System.out.println("\n\n\n");
		System.out.println("���� �����Բ��� �����ϰ� ��� ���� �Դϴ�");
		System.out.println("������ȭ : "+wick.Money);
		System.out.println("�Ѿ˰��� : ����  �� ����� "+wick.machine_bullet+" ������ "+wick.sniper_bullet);
		System.out.println("����Ѿ� "+Bullet_Machine+"���� ��ȭ"+ price_Machine+"��");
		System.out.println("�����Ѿ� "+Bullet_Sniper+"���� ��ȭ"+ price_Sniper+"��");
		System.out.println("\n������ �ʿ��Ͻʴϱ�?\n1. ����Ѿ�        2. �����Ѿ�        3. �������� �ʰڽ��ϴ�");
	}
	
	public void bullet(Wick wick, int num) { //������ �����Ұ���?
		
//		switch(num){
//		case 1 :
//			if (wick.Money > price_Machine) {
//				wick.machine_bullet = wick.machine_bullet + Bullet_Machine;	//�Ѿ� ����
//				wick.Money = wick.Money - price_Machine;					//��ȭ ����
//				System.out.println("���� �����մϴ� ������");
//			}
//			else {
//				System.out.println("��ȭ�� �����մϴ�");
//			}
//			break;
//		case 2 :
//			if(wick.Money > price_Machine) {
//				wick.sniper_bullet = wick.sniper_bullet + Bullet_Sniper;	//�Ѿ�����
//				wick.Money = wick.Money - price_Sniper;						//��ȭ ����
//				System.out.println("���� �����մϴ� ������");
//			}
//			else {
//				System.out.println("��ȭ�� �����մϴ�");
//			}
//			break;
//		case 3 :
//			System.out.println("�����մϴ� ������");
//			break;
//		}
		if(num == 1) {
			if (wick.Money > price_Machine) {
				wick.machine_bullet = wick.machine_bullet + Bullet_Machine;	//�Ѿ� ����
				wick.Money = wick.Money - price_Machine;					//��ȭ ����
				System.out.println("���� �����մϴ� ������");
			}
			else {
				System.out.println("��ȭ�� �����մϴ�");
			}
		}
		else if(num == 2) {
			if(wick.Money > price_Machine) {
			wick.sniper_bullet = wick.sniper_bullet + Bullet_Sniper;	//�Ѿ�����
			wick.Money = wick.Money - price_Sniper;						//��ȭ ����
			System.out.println("���� �����մϴ� ������");
			}
			else {
				System.out.println("��ȭ�� �����մϴ�");
			}
		}
		else {
			System.out.println("�����մϴ� ������");
		}
	}
	
	public boolean holjjack(Wick wick, int num, int ���ñ�ȭ, int holjak) {
		boolean �ܰ����� = true;
		
		if(num == 1) {		//���Ӽ���
			System.out.println("ī���� Ȧ¦ �ֻ������ӿ� ���Ű� ȯ���մϴ�");
			System.out.println("�ڡڡڰ��� ����ڡڡ�");
			System.out.println("1. �ֻ����� 2���Դϴ�");
			System.out.println("2. �����Ͻ� ��ȭ �ѵ����� ���ñ��� ���� �� �ֽ��ϴ�");
			System.out.println("3. ������ �ϰ� �ֻ����� ������ ���̸Ӵ� Ȧ���� ¦���� ���� �� �ֽ��ϴ�");
			System.out.println("4. ������ ���߸� ���ñ�ȭ�� 2��, ������ ���ϸ� ���ñ�ȭ�� �Ҹ��մϴ�");

			System.out.println("\n**  ������ȭ : " + wick.Money);
			System.out.print("�󸶸� �����Ͻðڽ��ϱ�? : ");
		}
		else if(num == 2) {		//���ñݾ׼���
			System.out.println();
			if(wick.Money >= ���ñ�ȭ) {
				wick.Money = wick.Money - ���ñ�ȭ;	
			}
			else {
				System.out.println("��ȭ�� �����մϴ�");
				�ܰ����� = false;
			}
		}
		else if(num == 3) {		//��� ����
			Random ran = new Random();
			�ֻ���1 = ran.nextInt(6) + 1;
			Random ran2 = new Random();
			�ֻ���2 = ran2.nextInt(6) + 1;
			int Ȧ¦ = �ֻ���1 + �ֻ���2;
			int ��� = Ȧ¦ % 2;
			
			if(��� == holjak) {
				System.out.println("ù��° �ֻ���  : "+�ֻ���1 + " �ι�° �ֻ���  : "+�ֻ���2 );
				System.out.println("�����Դϴ�!!!");
				System.out.println("�����Ͻ� �ݾ� "+���ñ�ȭ+"��ȭ�� ȹ���ϼ̽��ϴ�!");
				System.out.println("��ӵ����Ͻðڽ��ϱ�?");
				wick.Money = wick.Money + ���ñ�ȭ * 2;
				System.out.println("\n**  ������ȭ : " + wick.Money);
				System.out.println("1. Yes   2. No");
			}
			else {
				System.out.println("ù��° �ֻ���  : "+�ֻ���1 + " �ι�° �ֻ���  : "+�ֻ���2 );
				System.out.println("�ƽ����ϴ� ������ ����Ͻðڽ��ϱ�?");
				System.out.println("\n**  ������ȭ : " + wick.Money);
				System.out.println("1. Yes   2. No");
			}
			
		}
		
		return �ܰ�����;
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
		JFrame frame = new JFrame();			//�����Ӹ����
		JPanel panel = new JPanel();			//�гθ����
		JLabel label = new JLabel("Ŭ������ �����ض�!!!!!"); //���̺� �����
		JButton btnl = new JButton(new ImageIcon(".\\�̹���\\�ֻ���.gif"));//��ư �߰�
		JTextArea txtArea = new JTextArea();	//�����ٱ۾�
		//JTextField //���ٱ۾�



		panel.setLayout(new BorderLayout());	//�ڱⰡ ���ϴ� ��Ĵ�� ��ư�̳� ���� ��ġ�� �ű�� ���� ���� �������̾ƿ��� ���Ʒ������ʿ��� �߰� �� ��ġ��ų�� �ִ°�


		panel.add(btnl, BorderLayout.CENTER);		//����� ��ġ��Ų��
		//panel.add(label, BorderLayout.CENTER);	//���ʿ� ��ġ��Ų��

		//panel.add(txtArea, BorderLayout.WEST);		//���ʿ� ��ġ��Ų��

		btnl.addActionListener(new ActionListener() {
			int stun_count = 0;
			@Override
			public void actionPerformed(ActionEvent e) {//Ŭ���Ͽ����� ���𰡸� �ض�
				stun_count++;
				if(stun_count == 10) {
					stun_count = 0;
					frame.setVisible(false);
				}
			} //��ư�� �׼Ǳ���� �߰��ϰڴ�!!!!!



		});

		//panel ���� add�ϰ� frame add�� �����ϴ� ������ ��Ű��
		frame.add(panel);	//frame�� panel �� ���� ���� �ʰ� ȭ�鿡 �־��ֱ�


		frame.setResizable(false); //����� �����Ҽ� �ֳ�? false�� ���� �ȵ�
		frame.setPreferredSize(new Dimension(840, 840/12*9)); //�ַ� �̷�������� �����Ǳ� ���Ѵ�
		frame.setSize(840,840/12*9); //��½� �����Ǵ� �����
		frame.setLocationRelativeTo(null); //null ���� �Է��ϸ� ����� ����Ѵ�
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //ȭ��â�� ���� ���̻� ������ �ȵǰ��϶�
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
