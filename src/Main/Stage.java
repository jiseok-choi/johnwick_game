package Main;
import java.awt.Container;

import javax.swing.JFrame;

import Charactor.*;

public class Stage implements Runnable{
	Wick wick = new Wick();
	//�������
	String location;
	public Stage() {
		
	}
	@Override
	public void run() {
		for (int i = 5; i > 0; i--) {
			try {
				System.out.println("\n\n\n�������� "+i+"�� ��");
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
			
		System.out.println("\n\n\n���� �����϶�!");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	
	
	public void Mylife(Wick wick) {
		String �Ѹ�;
		if(wick.Gun == 1) {
			�Ѹ� = "����";
		}
		else if(wick.Gun == 2) {
			�Ѹ� = "�����";
		}
		else {
			�Ѹ� = "������";
		}
		
		System.out.println("********************************");
		System.out.println("**  ����ü�� : " + wick.HP);
		System.out.println("**  ������ȭ : " + wick.Money);
		System.out.println("**  �����Ѹ� : " + �Ѹ�);
		System.out.println("**  �Ѿ˰��� : ����  �� ����� "+wick.machine_bullet+" ������ "+wick.sniper_bullet);
		System.out.println("********************************");
	}
	public void Mylife(Wick wick, int ��������) {
		String �Ѹ�;
		if(wick.Gun == 1) {
			�Ѹ� = "����";
		}
		else if(wick.Gun == 2) {
			�Ѹ� = "�����";
		}
		else {
			�Ѹ� = "������";
		}
		
		if(�������� < 0) {
			�������� = 0;}
		
		System.out.println("********************************");
		System.out.println("**  ����ü�� : " + wick.HP);
		System.out.println("**  �������� : " + ��������);
		System.out.println("**  �����Ѹ� : " + �Ѹ�);
		System.out.println("**  �Ѿ˰��� : ����  �� ����� "+wick.machine_bullet+" ������ "+wick.sniper_bullet);
		System.out.println("********************************");
	}

	void key() {
		System.out.println("<�⺻����>");
		System.out.println("������ ���� ������ �����ؾ��մϴ�");
		System.out.println("���� ����, �����, �������� �����ϸ� ����Ѱ� �������� �Ѿ��� �����ؾ� �մϴ�");
		System.out.println("ȣ�ڿ��� ġ��� �Ѿ��� ������ �� �ֽ��ϴ�");
		System.out.println("ȸ�Ǵ� ���⿡ ���� �����̱⸦ �ϼ��ؾ��մϴ�");
		System.out.println("\n\n<����Ű>\n�ѽ�� : Q");
		System.out.println("�ѹٲٱ� : F");		
		System.out.println("�����̱� : W S A D");
		System.out.println("       (�� �� �� ��)\n\n");
		System.out.println("**********************************************\n<�� ĳ����>");
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
		System.out.println("     �α��                 �߰�����                           ���ǾƵθ�");
		System.out.println("**********************************************");
		System.out.println(" - �α���� óġ�Ҷ����� ��ȭ 10���� ����ϴ�");
		System.out.println(" - �α�ǰ� �߰������� ���Ḧ ����Ȯ���� �θ� �� �ֽ��ϴ�");
		System.out.println(" - �߰������� ���ΰ��� ������ �� �ֽ��ϴ�");
		System.out.println(" - �߰������� ����Ȯ���� ���� ȸ���� �� �ֽ��ϴ�");
		System.out.println("   (����44%, ����� 25%, ������ 0%)");
		System.out.println(" - ���Ǿ� �θ��� ���� �����մϴ�");
		System.out.println("\n\n<������ �����մϴ�>");
	}
	
	
	
	//�޼ҵ�
	void stage1(String land, Wick wick) {

	
		
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println(land+"�� �α�ǵ��� ���̴��ƴ�. �ο��� ��������");
		Mylife(wick);							//����Ȯ���ϰ� �ο��
		System.out.println("Press any key");

	}
	
	void stage2(String land, Wick wick) {
		
		
		
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println(land+"�� ���ǾƵθ��� �ִٴ� ������ �Լ��ߴ�. �ο��� ��������");
		Mylife(wick);							//����Ȯ���ϰ� �ο��
		System.out.println("Press any key");
	}
	
	
	//�޽� Ÿ��
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

		System.out.println("\n������ ��� �����Ͽ����ϴ�");
		System.out.println("��Ƽ��Ż ȣ�ڷ� ���ðڽ��ϱ�?");
		System.out.println("���� ü�� : " + HP);

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
