package Charactor;
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

import Main.Action;



public class MiddleBoss extends Boogieman implements Runnable{
	//�߰������� �α��
	{
		this.name = "�߰�����";
		this.HP = 40;
		this.Money = 50;
		this.Gun = 1;
		this.levelhp = 40 * level;
	}
	public int stun_count;
	Wick wick;
	MiddleBoss middle;
	
	public MiddleBoss(MiddleBoss middle, Wick wick, int number) { //number�� �ּ� 4�̻�
		this.level = number;
		this.life = true;
		this.wick = wick;
		this.middle = middle;
	}
	
	
	public MiddleBoss() {
		this.life = true;
	}
	public MiddleBoss(int level) {
		this.life = true;
		this.level = level;
	}
	@Override
	public void run() {
		
		Random r = new Random();				//2~4�� �̳��� �����ϰ� ����θ���
		int num;
		while(Action.Attack_Stop == false) {	//������� �������� ����
			num = r.nextInt(level);
			Skill_Stun(wick, num, middle);		//�߰��������Ͻ�ų
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	public void Hitme(int damage, MiddleBoss middle) {			//�߰������� ���� �´°���
		Random random = new Random(); 		//���� �ʱ�ȭ
		int num = random.nextInt(2);		//0,1,2 �߻�
		if (num > 0) {						//66%Ȯ���� �Ѹ���
			middle.HP = middle.HP - damage;
			if(HP <= 0 && middle.Frend > 0) {
				middle.Frend--;			//���� �� �پ��
				middle.Money = middle.Money + 50; 		//�������� �� �� ����
				middle.HP = levelhp;
				System.out.println(name+"�� �׾����ϴ�");
			}else if(middle.HP <= 0 && middle.Frend <= 0) {
				System.out.println(name+"�� ��� �׾����ϴ�");
			}
			life(middle);
		}
		//����Ҵ���?
		//FrendCheck(Frend);

	}
	public void Hitme2(int damage, MiddleBoss middle) {			//�α���� ������� �´´ٸ�
		Random random = new Random(); 		//���� �ʱ�ȭ
		int num = random.nextInt(3);		//0,1,2,3 �߻�
		if(num > 0) {						//75%Ȯ���� �Ѹ���
			middle.HP = middle.HP - damage;
			Frend--;						//���� �Ѹ� ������ ����
			System.out.println(name+"�� �׾����ϴ�");
			if(HP <= 0 && middle.Frend > 0) {
				middle.Frend--;				//���� �� �پ��
				middle.Money = middle.Money + 50; 		//�������� �� �� ����
				middle.HP = levelhp;
				System.out.println(name+"�� �׾����ϴ�");
			}else if(middle.HP <= 0 && middle.Frend <= 0) {
				System.out.println(name+"�� ��� �׾����ϴ�");
			}
			life(middle);
		}
		//����Ҵ���?
		//FrendCheck(Frend);
	}

	public void Hitme3(int damage, MiddleBoss middle) {			//�߰������� ���� �´°���
		Random random = new Random(); 		//���� �ʱ�ȭ
		int num = random.nextInt(2);		//0,1,2 �߻�
		if (num >= 0) {						//100%Ȯ���� �Ѹ���
			middle.HP = middle.HP - damage;
			if(HP <= 0 && middle.Frend > 0) {
				middle.Frend--;			//���� �� �پ��
				middle.Money = middle.Money + 50; 		//�������� �� �� ����
				middle.HP = levelhp;
				System.out.println(name+"�� �׾����ϴ�");
			}else if(middle.HP <= 0 && middle.Frend <= 0) {
				System.out.println(name+"�� ��� �׾����ϴ�");
			}
			life(middle);
		}
		//����Ҵ���?
		//FrendCheck(Frend);

	}
	
	public void frend2(MiddleBoss middle) {	//�����
		if(middle.life(middle)) {// ������ �ִٸ� �����ȯ
			if(Frend == 1) {	 //������ ������ ��������
				System.out.println(name+"��(��) ��Ÿ����!");
			}
			System.out.println(name+"��(��) ��Ÿ����!");
			if(middle.Frend_count == 4) {
				Frend++;
				middle.Frend_count = 0;
			}
			middle.Frend_count++;
			middle.Power = 2 + 2 * middle.Frend;	//�������ŭ �Ŀ�����
			//����Ҵ���?
			//FrendCheck(Frend);
		}
	}

	public boolean life(MiddleBoss middle) {
		
		if(middle.HP <= 0 && middle.Frend <= 0) {
			middle.life = false;
		}
		return middle.life;
	}

	public void Skill_Stun(Wick wick, int plus, MiddleBoss middle) {
		stun_count++;
		stun_count = stun_count + plus;
		if(middle.life(middle)) {			//�߰������� ����ִٸ�!
			if (stun_count >= 10) {
				wick.stun = true;
				stun_count = 0;

				//MyFrame f = new MyFrame();
				JFrame frame = new JFrame();			//�����Ӹ����
				JPanel panel = new JPanel();			//�гθ����
				JLabel label = new JLabel("Ŭ������ �����ض�!!!!!"); //���̺� �����
				JButton btnl = new JButton(new ImageIcon("C:\\Users\\chjs9\\Desktop\\�̹���\\��������.png"));//��ư �߰�
				JTextArea txtArea = new JTextArea();	//�����ٱ۾�
				//JTextField //���ٱ۾�



				panel.setLayout(new BorderLayout());	//�ڱⰡ ���ϴ� ��Ĵ�� ��ư�̳� ���� ��ġ�� �ű�� ���� ���� �������̾ƿ��� ���Ʒ������ʿ��� �߰� �� ��ġ��ų�� �ִ°�


				panel.add(btnl, BorderLayout.CENTER);		//����� ��ġ��Ų��
				//panel.add(label, BorderLayout.CENTER);	//���ʿ� ��ġ��Ų��

				//panel.add(txtArea, BorderLayout.WEST);		//���ʿ� ��ġ��Ų��

				btnl.addActionListener(new ActionListener() {
					int wakeup_count = 0;
					@Override
					public void actionPerformed(ActionEvent e) {//Ŭ���Ͽ����� ���𰡸� �ض�
						wakeup_count++;
						if(wakeup_count == 8) {
							wick.stun = false;
							wakeup_count = 0;
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
				frame.setVisible(true);//�����ְ� �ϱ� �޼���
				frame.setAlwaysOnTop(true);//jframe �ֻ�� ��ġ �޼���
			}
		}
		
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
			System.out.println("@@@@@@$@=#@*@@@@@");
			System.out.println("@@@@@** ~@#=@@@@@");
			System.out.println("@@@@@~:: ,#;~@@@@");
			System.out.println("@@@@@$;= :#@=@@@@");
			System.out.println("@@@@@!,-  -=!@@@@");
			System.out.println("@@@@@,     ~$@@@@");
			System.out.println("@@@@@      .#@@@@");
			System.out.println("@@@@        $@@@@");
			System.out.println("@@@@=-,   - =@@@@");
			System.out.println("@@@@!,:   ~.=@@@@");
			System.out.println("@@@@$:    - =@@@@");
			System.out.println("@@@@@@-   .,@@@@@");
			System.out.println("@@@@@@! * -#@@@@@");
			System.out.println("@@@@@@! @.,#@@@@@");
			System.out.println("@@@@@@!-@;.#@@@@@");
			System.out.println("@@@@@@::@= #@@@@@");
			System.out.println("@@@@@@:;@$ $@@@@@");
			System.out.println("@@@@@@~!@$.!@@@@@");
			System.out.println("@@@@@@-!@@:-@@@@@");
			System.out.println("@@@@@@~#@@$-*$@@@");

			break;
		case 1 :
			System.out.println("@@@@@@@@$:#@@@@@@@$@=#@*@@@@@@@@");
			System.out.println("@@@@@@@@; =@@@@@@@** ~@#=@@@@@@@");
			System.out.println("@@@@@@@@* #@@@@@@~:: ,#;~@@@@@@@");
			System.out.println("@@@@@@@$~ -$@@@@@$;= :#@=@@@@@@@");
			System.out.println("@@@@@@#    .$@@@@!,-  -=!@@@@@@@");
			System.out.println("@@@@@@*     !@@@@,     ~$@@@@@@@");
			System.out.println("@@@@@@~     ;@@@@      .#@@@@@@@");
			System.out.println("@@@@@@--   ~,@@@$       $@@@@@@@");
			System.out.println("@@@@@#,-   *-@@@=-,   - =@@@@@@@");
			System.out.println("@@@@@#-~   *;@@@!,:   ~.=@@@@@@@");
			System.out.println("@@@@@@-;   !=@@@!$:   - =@@@@@@@");
			System.out.println("@@@@@@;*   ;@@@@@@-   .,@@@@@@@@");
			System.out.println("@@@@@#:-   :@@@@@@! * -#@@@@@@@@");
			System.out.println("@@@@@#$:   ;@@@@@@! @.,#@@@@@@@@");
			System.out.println("@@@@@#@= . @@@@@@@!-@;.#@@@@@@@@");
			System.out.println("@@@@@##= ..@@@@@@@::@= #@@@@@@@@");
			System.out.println("@@@@@@@=  ~@@@@@@@:;@$ $@@@@@@@@");
			System.out.println("@@@@@@@#  ,@@@@@@@~!@$.!@@@@@@@@");
			System.out.println("@@@@@@@@.~~=@@@@@@-!@@:-@@@@@@@@");
			System.out.println("@@@@@@@@:$@@@@@@@@~#@@$-*$@@@@@@");
			break;
		case 2 :
			System.out.println("@@@@@@@$:#@@@@@@@$@=#@*@@@@@@@~;@@@@@@@@@");
			System.out.println("@@@@@@@; =@@@@@@@** ~@#=@@@@@=,:@@@@@@@@@");
			System.out.println("@@@@@@@* #@@@@@@~:: ,#;~@@@@@@,;@@@@@@@@@");
			System.out.println("@@@@@@$~ -$@@@@@$;= :#@=@@@!@=. ~=@@@@@@@");
			System.out.println("@@@@@#    .$@@@@!,-  -=!@@@-~ -  ,#@@@@@@");
			System.out.println("@@@@@*     !@@@@,     ~$@@@       !@@@@@@");
			System.out.println("@@@@@~     ;@@@@      .#@@@.      -@@@@@@");
			System.out.println("@@@@@--   ~,@@@$       $@@@:     .~@@@@@@");
			System.out.println("@@@@#,-   *-@@@=-,   - =@@@@!    ,;@@@@@@");
			System.out.println("@@@@#-~   *;@@@!,:   ~.=@@@@;    ,;@@@@@@");
			System.out.println("@@@@@-;   !=@@@!$:   - =@@@@:    -=@@@@@@");
			System.out.println("@@@@@;*   ;@@@@@@-   .,@@@@@:    *@@@@@@@");
			System.out.println("@@@@#:-   :@@@@@@! * -#@@@@@;    !@@@@@@@");
			System.out.println("@@@@#$:   ;@@@@@@! @.,#@@@@@!  . :@@@@@@@");
			System.out.println("@@@@#@= . @@@@@@@!-@;.#@@@@@! ,- :@@@@@@@");
			System.out.println("@@@@##= ..@@@@@@@::@= #@@@@@! :~ -@@@@@@@");
			System.out.println("@@@@@@=  ~@@@@@@@:;@$ $@@@@@* ;* ,@@@@@@@");
			System.out.println("@@@@@@#  ,@@@@@@@~!@$.!@@@@@* !$ .$@@@@@@");
			System.out.println("@@@@@@@.~~=@@@@@@-!@@:-@@@@@!.*@-.=@@@@@@");
			System.out.println("@@@@@@@:$@@@@@@@@~#@@$-*$@@@!=#@$;=@@@@@@");
			break;
		case 3 :
			System.out.println("@@@@@@@$:#@@@@@@@$@=#@*@@@@@@@~;@@@@@@@@*,@@@@@@@@@@");
			System.out.println("@@@@@@@; =@@@@@@@** ~@#=@@@@@=,:@@@@@@@@~ !@@@@@@@@@");
			System.out.println("@@@@@@@* #@@@@@@~:: ,#;~@@@@@@,;@@@@@@@@; *@@@@@@@@@");
			System.out.println("@@@@@@$~ -$@@@@@$;= :#@=@@@!@=. ~=@@@@@=, :#@@@@@@@@");
			System.out.println("@@@@@#    .$@@@@!,-  -=!@@@-~ -  ,#@@@=    ,#@@@@@@@");
			System.out.println("@@@@@*     !@@@@,     ~$@@@       !@@@,     !*@@@@@@");
			System.out.println("@@@@@~     ;@@@@      .#@@@.      -@@@    *$#$@@@@@@");
			System.out.println("@@@@@--   ~,@@@$       $@@@:     .~@@@-   .~@@@@@@@@");
			System.out.println("@@@@#,-   *-@@@=-,   - =@@@@!    ,;@@@#-   -@@@@@@@@");
			System.out.println("@@@@#-~   *;@@@!,:   ~.=@@@@;    ,;@@@@:   -@@@@@@@@");
			System.out.println("@@@@@-;   !=@@@!$:   - =@@@@:    -=@@@@;   -@@@@@@@@");
			System.out.println("@@@@@;*   ;@@@@@@-   .,@@@@@:    *@@@@@*   ,@@@@@@@@");
			System.out.println("@@@@#:-   :@@@@@@! * -#@@@@@;    !@@@@@= - ,@@@@@@@@");
			System.out.println("@@@@#$:   ;@@@@@@! @.,#@@@@@!  . :@@@@@= ! .=@@@@@@@");
			System.out.println("@@@@#@= . @@@@@@@!-@;.#@@@@@! ,- :@@@@@= *  !@@@@@@@");
			System.out.println("@@@@##= ..@@@@@@@::@= #@@@@@! :~ -@@@@@= =: !@@@@@@@");
			System.out.println("@@@@@@=  ~@@@@@@@:;@$ $@@@@@* ;* ,@@@@@= == !@@@@@@@");
			System.out.println("@@@@@@#  ,@@@@@@@~!@$.!@@@@@* !$ .$@@@@= =@ !@@@@@@@");
			System.out.println("@@@@@@@.~~=@@@@@@-!@@:-@@@@@!.*@-.=@@@@$ =@.!@@@@@@@");
			System.out.println("@@@@@@@:$@@@@@@@@~#@@$-*$@@@!=#@$;=@@@@#,=@!;@@@@@@@");
			break;
		case 4 :
			System.out.println("@@@@@@@$:#@@@@@@@$@=#@*@@@@@@@~;@@@@@@@@*,@@@@@@@@@@@!-@@#@@@@");
			System.out.println("@@@@@@@; =@@@@@@@** ~@#=@@@@@=,:@@@@@@@@~ !@@@@@@@@@#~-=#!@@@@");
			System.out.println("@@@@@@@* #@@@@@@~:: ,#;~@@@@@@,;@@@@@@@@; *@@@@@@@@@#,-##*@@@@");
			System.out.println("@@@@@@$~ -$@@@@@$;= :#@=@@@!@=. ~=@@@@@=, :#@@@@@@#~  -==~#@@@");
			System.out.println("@@@@@#    .$@@@@!,-  -=!@@@-~ -  ,#@@@=    ,#@@@@@!  .. :.$@@@");
			System.out.println("@@@@@*     !@@@@,     ~$@@@       !@@@,     !*@@@#~  .. ..;@@@");
			System.out.println("@@@@@~     ;@@@@      .#@@@.      -@@@    *$#$@@@$.    .-,$@@@");
			System.out.println("@@@@@--   ~,@@@$       $@@@:     .~@@@-   .~@@@@@!~,   ;##@@@@");
			System.out.println("@@@@#,-   *-@@@=-,   - =@@@@!    ,;@@@#-   -@@@@@;~,   ;@@@@@@");
			System.out.println("@@@@#-~   *;@@@!,:   ~.=@@@@;    ,;@@@@:   -@@@@@~~,   -@@@@@@");
			System.out.println("@@@@@-;   !=@@@!$:   - =@@@@:    -=@@@@;   -@@@@@*;.   ,@@@@@@");
			System.out.println("@@@@@;*   ;@@@@@@-   .,@@@@@:    *@@@@@*   ,@@@@@@=.   :@@@@@@");
			System.out.println("@@@@#:-   :@@@@@@! * -#@@@@@;    !@@@@@= - ,@@@@@@* -; =@@@@@@");
			System.out.println("@@@@#$:   ;@@@@@@! @.,#@@@@@!  . :@@@@@= ! .=@@@@@! $! $@@@@@@");
			System.out.println("@@@@#@= . @@@@@@@!-@;.#@@@@@! ,- :@@@@@= *  !@@@@@: @* @@@@@@@");
			System.out.println("@@@@##= ..@@@@@@@::@= #@@@@@! :~ -@@@@@= =: !@@@@#,,@* @@@@@@@");
			System.out.println("@@@@@@=  ~@@@@@@@:;@$ $@@@@@* ;* ,@@@@@= == !@@@@$ ;@!,@@@@@@@");
			System.out.println("@@@@@@#  ,@@@@@@@~!@$.!@@@@@* !$ .$@@@@= =@ !@@@@$ *@!-@@@@@@@");
			System.out.println("@@@@@@@.~~=@@@@@@-!@@:-@@@@@!.*@-.=@@@@$ =@.!@@@@=.$@*-@@@@@@@");
			System.out.println("@@@@@@@:$@@@@@@@@~#@@$-*$@@@!=#@$;=@@@@#,=@!;@@@@-~#@=-*@@@@@@");
			break;
		case 5 :
			System.out.println("@@@@@@@$:#@@@@@@@$@=#@*@@@@@@@~;@@@@@@@@*,@@@@@@@@@@@!-@@#@@@@@@@@$:#@@@@@");
			System.out.println("@@@@@@@; =@@@@@@@** ~@#=@@@@@=,:@@@@@@@@~ !@@@@@@@@@#~-=#!@@@@@@@@; =@@@@@");
			System.out.println("@@@@@@@* #@@@@@@~:: ,#;~@@@@@@,;@@@@@@@@; *@@@@@@@@@#,-##*@@@@@@@@* #@@@@@");
			System.out.println("@@@@@@$~ -$@@@@@$;= :#@=@@@!@=. ~=@@@@@=, :#@@@@@@#~  -==~#@@@@@@$~ -$@@@@");
			System.out.println("@@@@@#    .$@@@@!,-  -=!@@@-~ -  ,#@@@=    ,#@@@@@!  .. :.$@@@@@#    .$@@@");
			System.out.println("@@@@@*     !@@@@,     ~$@@@       !@@@,     !*@@@#~  .. ..;@@@@@*     !@@@");
			System.out.println("@@@@@~     ;@@@@      .#@@@.      -@@@    *$#$@@@$.    .-,$@@@@@~     ;@@@");
			System.out.println("@@@@@--   ~,@@@$       $@@@:     .~@@@-   .~@@@@@!~,   ;##@@@@@@--   ~,@@@");
			System.out.println("@@@@#,-   *-@@@=-,   - =@@@@!    ,;@@@#-   -@@@@@;~,   ;@@@@@@@#,-   *-@@@");
			System.out.println("@@@@#-~   *;@@@!,:   ~.=@@@@;    ,;@@@@:   -@@@@@~~,   -@@@@@@@#-~   *;@@@");
			System.out.println("@@@@@-;   !=@@@!$:   - =@@@@:    -=@@@@;   -@@@@@*;.   ,@@@@@@@@-;   !=@@@");
			System.out.println("@@@@@;*   ;@@@@@@-   .,@@@@@:    *@@@@@*   ,@@@@@@=.   :@@@@@@@@;*   ;@@@@");
			System.out.println("@@@@#:-   :@@@@@@! * -#@@@@@;    !@@@@@= - ,@@@@@@* -; =@@@@@@@#:-   :@@@@");
			System.out.println("@@@@#$:   ;@@@@@@! @.,#@@@@@!  . :@@@@@= ! .=@@@@@! $! $@@@@@@@#$:   ;@@@@");
			System.out.println("@@@@#@= . @@@@@@@!-@;.#@@@@@! ,- :@@@@@= *  !@@@@@: @* @@@@@@@@#@= . @@@@@");
			System.out.println("@@@@##= ..@@@@@@@::@= #@@@@@! :~ -@@@@@= =: !@@@@#,,@* @@@@@@@@##= ..@@@@@");
			System.out.println("@@@@@@=  ~@@@@@@@:;@$ $@@@@@* ;* ,@@@@@= == !@@@@$ ;@!,@@@@@@@@@@=  ~@@@@@");
			System.out.println("@@@@@@#  ,@@@@@@@~!@$.!@@@@@* !$ .$@@@@= =@ !@@@@$ *@!-@@@@@@@@@@#  ,@@@@@");
			System.out.println("@@@@@@@.~~=@@@@@@-!@@:-@@@@@!.*@-.=@@@@$ =@.!@@@@=.$@*-@@@@@@@@@@@.~~=@@@@");
			System.out.println("@@@@@@@:$@@@@@@@@~#@@$-*$@@@!=#@$;=@@@@#,=@!;@@@@-~#@=-*@@@@@@@@@@:$@@@@@@");
			break;
		case 6 :
			System.out.println("@@@@@@@$:#@@@@@@@$@=#@*@@@@@@@~;@@@@@@@@*,@@@@@@@@@@@!-@@#@@@@@@@@$:#@@@@@@@@@@@~;@@@@@@");
			System.out.println("@@@@@@@; =@@@@@@@** ~@#=@@@@@=,:@@@@@@@@~ !@@@@@@@@@#~-=#!@@@@@@@@; =@@@@@@@@@@=,:@@@@@@");
			System.out.println("@@@@@@@* #@@@@@@~:: ,#;~@@@@@@,;@@@@@@@@; *@@@@@@@@@#,-##*@@@@@@@@* #@@@@@@@@@@@,;@@@@@@");
			System.out.println("@@@@@@$~ -$@@@@@$;= :#@=@@@!@=. ~=@@@@@=, :#@@@@@@#~  -==~#@@@@@@$~ -$@@@@@@@!@=. ~=@@@@");
			System.out.println("@@@@@#    .$@@@@!,-  -=!@@@-~ -  ,#@@@=    ,#@@@@@!  .. :.$@@@@@#    .$@@@@@@-~ -  ,#@@@");
			System.out.println("@@@@@*     !@@@@,     ~$@@@       !@@@,     !*@@@#~  .. ..;@@@@@*     !@@@@@@       !@@@");
			System.out.println("@@@@@~     ;@@@@      .#@@@.      -@@@    *$#$@@@$.    .-,$@@@@@~     ;@@@@@@    *$#$@@@");
			System.out.println("@@@@@--   ~,@@@$       $@@@:     .~@@@-   .~@@@@@!~,   ;##@@@@@@--   ~,@@@@@@-   .~@@@@@");
			System.out.println("@@@@#,-   *-@@@=-,   - =@@@@!    ,;@@@#-   -@@@@@;~,   ;@@@@@@@#,-   *-@@@@@@#-   -@@@@@");
			System.out.println("@@@@#-~   *;@@@!,:   ~.=@@@@;    ,;@@@@:   -@@@@@~~,   -@@@@@@@#-~   *;@@@@@@@:   -@@@@@");
			System.out.println("@@@@@-;   !=@@@!$:   - =@@@@:    -=@@@@;   -@@@@@*;.   ,@@@@@@@@-;   !=@@@@@@@;   -@@@@@");
			System.out.println("@@@@@;*   ;@@@@@@-   .,@@@@@:    *@@@@@*   ,@@@@@@=.   :@@@@@@@@;*   ;@@@@@@@@*   ,@@@@@");
			System.out.println("@@@@#:-   :@@@@@@! * -#@@@@@;    !@@@@@= - ,@@@@@@* -; =@@@@@@@#:-   :@@@@@@@@= - ,@@@@@");
			System.out.println("@@@@#$:   ;@@@@@@! @.,#@@@@@!  . :@@@@@= ! .=@@@@@! $! $@@@@@@@#$:   ;@@@@@@@@= ! .=@@@@");
			System.out.println("@@@@#@= . @@@@@@@!-@;.#@@@@@! ,- :@@@@@= *  !@@@@@: @* @@@@@@@@#@= . @@@@@@@@@= *  !@@@@");
			System.out.println("@@@@##= ..@@@@@@@::@= #@@@@@! :~ -@@@@@= =: !@@@@#,,@* @@@@@@@@##= ..@@@@@@@@@= =: !@@@@");
			System.out.println("@@@@@@=  ~@@@@@@@:;@$ $@@@@@* ;* ,@@@@@= == !@@@@$ ;@!,@@@@@@@@@@=  ~@@@@@@@@@= == !@@@@");
			System.out.println("@@@@@@#  ,@@@@@@@~!@$.!@@@@@* !$ .$@@@@= =@ !@@@@$ *@!-@@@@@@@@@@#  ,@@@@@@@@@= =@ !@@@@");
			System.out.println("@@@@@@@.~~=@@@@@@-!@@:-@@@@@!.*@-.=@@@@$ =@.!@@@@=.$@*-@@@@@@@@@@@.~~=@@@@@@@@$ =@.!@@@@");
			System.out.println("@@@@@@@:$@@@@@@@@~#@@$-*$@@@!=#@$;=@@@@#,=@!;@@@@-~#@=-*@@@@@@@@@@:$@@@@@@@@@@#,=@!;@@@@");
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
			
		case 777 :
				System.out.println("@@@@@@@$:#@@@@@@@$@=#@*@@@@@@@~;@@@@@@@@*,@@@@@@@@@@@!-@@#@@@@@@@@$:#@@@@@@@@@@@~;@@@@@@");
				System.out.println("@@@@@@@; =@@@@@@@** ~@#=@@@@@=,:@@@@@@@@~ !@@@@@@@@@#~-=#!@@@@@@@@; =@@@@@@@@@@=,:@@@@@@");
				System.out.println("@@@@@@@* #@@@@@@~:: ,#;~@@@@@@,;@@@@@@@@; *@@@@@@@@@#,-##*@@@@@@@@* #@@@@@@@@@@@,;@@@@@@");
				System.out.println("@@@@@@$~ -$@@@@@$;= :#@=@@@!@=. ~=@@@@@=, :#@@@@@@#~  -==~#@@@@@@$~ -$@@@@@@@!@=. ~=@@@@");
				System.out.println("@@@@@#    .$@@@@!,-  -=!@@@-~ -  ,#@@@=    ,#@@@@@!  .. :.$@@@@@#    .$@@@@@@-~ -  ,#@@@");
				System.out.println("@@@@@*     !@@@@,     ~$@@@       !@@@,     !*@@@#~  .. ..;@@@@@*     !@@@@@@       !@@@");
				System.out.println("@@@@@~     ;@@@@      .#@@@.      -@@@    *$#$@@@$.    .-,$@@@@@~     ;@@@@@@    *$#$@@@");
				System.out.println("@@@@@--   ~,@@@$       $@@@:     .~@@@-   .~@@@@@!~,   ;##@@@@@@--   ~,@@@@@@-   .~@@@@@");
				System.out.println("@@@@#,-   *-@@@=-,   - =@@@@!    ,;@@@#-   -@@@@@;~,   ;@@@@@@@#,-   *-@@@@@@#-   -@@@@@");
				System.out.println("@@@@#-~   *;@@@!,:   ~.=@@@@;    ,;@@@@:   -@@@@@~~,   -@@@@@@@#-~   *;@@@@@@@:   -@@@@@");
				System.out.println("@@@@@-;   !=@@@!$:   - =@@@@:    -=@@@@;   -@@@@@*;.   ,@@@@@@@@-;   !=@@@@@@@;   -@@@@@");
				System.out.println("@@@@@;*   ;@@@@@@-   .,@@@@@:    *@@@@@*   ,@@@@@@=.   :@@@@@@@@;*   ;@@@@@@@@*   ,@@@@@");
				System.out.println("@@@@#:-   :@@@@@@! * -#@@@@@;    !@@@@@= - ,@@@@@@* -; =@@@@@@@#:-   :@@@@@@@@= - ,@@@@@");
				System.out.println("@@@@#$:   ;@@@@@@! @.,#@@@@@!  . :@@@@@= ! .=@@@@@! $! $@@@@@@@#$:   ;@@@@@@@@= ! .=@@@@");
				System.out.println("@@@@#@= . @@@@@@@!-@;.#@@@@@! ,- :@@@@@= *  !@@@@@: @* @@@@@@@@#@= . @@@@@@@@@= *  !@@@@");
				System.out.println("@@@@##= ..@@@@@@@::@= #@@@@@! :~ -@@@@@= =: !@@@@#,,@* @@@@@@@@##= ..@@@@@@@@@= =: !@@@@");
				System.out.println("@@@@@@=  ~@@@@@@@:;@$ $@@@@@* ;* ,@@@@@= == !@@@@$ ;@!,@@@@@@@@@@=  ~@@@@@@@@@= == !@@@@");
				System.out.println("@@@@@@#  ,@@@@@@@~!@$.!@@@@@* !$ .$@@@@= =@ !@@@@$ *@!-@@@@@@@@@@#  ,@@@@@@@@@= =@ !@@@@");
				System.out.println("@@@@@@@.~~=@@@@@@-!@@:-@@@@@!.*@-.=@@@@$ =@.!@@@@=.$@*-@@@@@@@@@@@.~~=@@@@@@@@$ =@.!@@@@");
				System.out.println("@@@@@@@:$@@@@@@@@~#@@$-*$@@@!=#@$;=@@@@#,=@!;@@@@-~#@=-*@@@@@@@@@@:$@@@@@@@@@@#,=@!;@@@@");
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
