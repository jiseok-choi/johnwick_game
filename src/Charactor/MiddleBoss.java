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
	//중간보스급 부기맨
	{
		this.name = "중간보스";
		this.HP = 40;
		this.Money = 50;
		this.Gun = 1;
		this.levelhp = 40 * level;
	}
	public int stun_count;
	Wick wick;
	MiddleBoss middle;
	
	public MiddleBoss(MiddleBoss middle, Wick wick, int number) { //number는 최소 4이상
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
		
		Random r = new Random();				//2~4초 이내로 랜덤하게 동료부르기
		int num;
		while(Action.Attack_Stop == false) {	//기습공격 들어왔을때 정지
			num = r.nextInt(level);
			Skill_Stun(wick, num, middle);		//중간보스스턴스킬
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	public void Hitme(int damage, MiddleBoss middle) {			//중간보스가 총을 맞는과정
		Random random = new Random(); 		//랜덤 초기화
		int num = random.nextInt(2);		//0,1,2 발생
		if (num > 0) {						//66%확률로 총맞음
			middle.HP = middle.HP - damage;
			if(HP <= 0 && middle.Frend > 0) {
				middle.Frend--;			//동료 수 줄어듬
				middle.Money = middle.Money + 50; 		//존윅에게 줄 돈 증가
				middle.HP = levelhp;
				System.out.println(name+"이 죽었습니다");
			}else if(middle.HP <= 0 && middle.Frend <= 0) {
				System.out.println(name+"이 모두 죽었습니다");
			}
			life(middle);
		}
		//몇명남았는지?
		//FrendCheck(Frend);

	}
	public void Hitme2(int damage, MiddleBoss middle) {			//부기맨이 기관총을 맞는다면
		Random random = new Random(); 		//랜덤 초기화
		int num = random.nextInt(3);		//0,1,2,3 발생
		if(num > 0) {						//75%확률로 총맞음
			middle.HP = middle.HP - damage;
			Frend--;						//동료 한명 무조건 죽음
			System.out.println(name+"이 죽었습니다");
			if(HP <= 0 && middle.Frend > 0) {
				middle.Frend--;				//동료 수 줄어듬
				middle.Money = middle.Money + 50; 		//존윅에게 줄 돈 증가
				middle.HP = levelhp;
				System.out.println(name+"이 죽었습니다");
			}else if(middle.HP <= 0 && middle.Frend <= 0) {
				System.out.println(name+"이 모두 죽었습니다");
			}
			life(middle);
		}
		//몇명남았는지?
		//FrendCheck(Frend);
	}

	public void Hitme3(int damage, MiddleBoss middle) {			//중간보스가 총을 맞는과정
		Random random = new Random(); 		//랜덤 초기화
		int num = random.nextInt(2);		//0,1,2 발생
		if (num >= 0) {						//100%확률로 총맞음
			middle.HP = middle.HP - damage;
			if(HP <= 0 && middle.Frend > 0) {
				middle.Frend--;			//동료 수 줄어듬
				middle.Money = middle.Money + 50; 		//존윅에게 줄 돈 증가
				middle.HP = levelhp;
				System.out.println(name+"이 죽었습니다");
			}else if(middle.HP <= 0 && middle.Frend <= 0) {
				System.out.println(name+"이 모두 죽었습니다");
			}
			life(middle);
		}
		//몇명남았는지?
		//FrendCheck(Frend);

	}
	
	public void frend2(MiddleBoss middle) {	//동료소
		if(middle.life(middle)) {// 생존해 있다면 동료소환
			if(Frend == 1) {	 //쓰레드 넣으면 지워야함
				System.out.println(name+"이(가) 나타났다!");
			}
			System.out.println(name+"이(가) 나타났다!");
			if(middle.Frend_count == 4) {
				Frend++;
				middle.Frend_count = 0;
			}
			middle.Frend_count++;
			middle.Power = 2 + 2 * middle.Frend;	//동료수만큼 파워증가
			//몇명남았는지?
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
		if(middle.life(middle)) {			//중간보스가 살아있다면!
			if (stun_count >= 10) {
				wick.stun = true;
				stun_count = 0;

				//MyFrame f = new MyFrame();
				JFrame frame = new JFrame();			//프레임만들기
				JPanel panel = new JPanel();			//패널만들기
				JLabel label = new JLabel("클릭으로 제압해라!!!!!"); //레이블 만들기
				JButton btnl = new JButton(new ImageIcon("C:\\Users\\chjs9\\Desktop\\이미지\\근접공격.png"));//버튼 추가
				JTextArea txtArea = new JTextArea();	//여러줄글씨
				//JTextField //한줄글씨



				panel.setLayout(new BorderLayout());	//자기가 원하는 방식대로 버튼이나 라벨을 위치에 옮기는 것을 말함 보덜레이아웃은 위아래오른쪽왼쪽 중간 에 위치시킬수 있는것


				panel.add(btnl, BorderLayout.CENTER);		//가운데에 위치시킨것
				//panel.add(label, BorderLayout.CENTER);	//위쪽에 위치시킨것

				//panel.add(txtArea, BorderLayout.WEST);		//왼쪽에 위치시킨것

				btnl.addActionListener(new ActionListener() {
					int wakeup_count = 0;
					@Override
					public void actionPerformed(ActionEvent e) {//클릭하였을때 무언가를 해라
						wakeup_count++;
						if(wakeup_count == 8) {
							wick.stun = false;
							wakeup_count = 0;
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
				frame.setVisible(true);//보여주게 하기 메서드
				frame.setAlwaysOnTop(true);//jframe 최상단 위치 메서드
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
