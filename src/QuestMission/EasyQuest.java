package QuestMission;
import Charactor.Wick;
import java.util.*;

public class EasyQuest implements Runnable{
	String Quest;		//���� ����� ����
	int QuestLevel = 1;		//���� ���̵�

	Random random = new Random();
	ArrayList wasd = new ArrayList();		//������ ��(string)


	public EasyQuest() {
		//		ArrayList �����¿� = new ArrayList();		//����� ����
		//		�����¿�.add('��');
		//		�����¿�.add('��');
		//		�����¿�.add('��');
		//		�����¿�.add('��');
	}

	@Override
	public void run() {
		try {
			warning();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void warning() throws InterruptedException {

		System.out.println("                                                                                                      .,,.   ");
		System.out.println("                                                                                            ..       .!#$$~  ");
		System.out.println("      ..                                                                                  ~:;!:.      ,;*@=. ");
		System.out.println("    .:!!;:,                                                                               @@@@@;        .$@- ");
		System.out.println("   .!@@@@@;                                                                               @@@@@=.        =@; ");
		System.out.println("   -@@@@@@;                                                                               @@@@@$,        *@= ");
		System.out.println("   :@@@@@@!                                                                               #@@@@=.        =@#.");
		System.out.println("   ~@@@@@@;                                                                               ~@@@@=..~******#@@.");
		System.out.println("   ,#@@@@$~                                                                           ~*$$$@@@@@$$#@@@@@@@@#.");
		System.out.println("  ~!@@@@#:                                                                        ,;=#@@@@@@@@@@@@@@@@@@@!,. ");
		System.out.println(" ,@@@@@@@@@                                                            @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#:     ");
		System.out.println(" ,@@@@@@@@@                                                             ==@@@@@@@##$$#@@@@@@@@@@@@@@;.       ");
		System.out.println(" ,@@@@@@@@*,                                                                          .!#@@@@@@@@@@$-        ");
		System.out.println(" ,@@@@@@@@*.                                                                             *@@@@@@@@@=,        ");
		System.out.println(" ,@@@@@@@@*.                                                                              *@@@@@@@@=,        ");
		System.out.println(" ,@@@@@@@@*.                                                                               #@@@@@@@*,        ");
		System.out.println(" ,@@@@@@@@;                                                                                ;@@@@@@@=,        ");
		System.out.println(" ,@@@@@@@#~                                                                                ,@@@@@@@@:        ");
		System.out.println(" ,@@@@@@@=,                                                                                .@@@@@@@@=,       ");
		System.out.println(" ,@@@@@@@;                                                                                  #@@@@@@@@!.      ");
		System.out.println(" ,@@@@@@$-                                                                                  ~@@@@@@@@#~      ");
		Thread.sleep(150);
		System.out.println("                                                                                                .,,.   ");
		System.out.println("                                                                                      ..       .!#$$~  ");
		System.out.println("      ..                                                                            ~:;!:.      ,;*@=. ");
		System.out.println("    .:!!;:,                                                                         @@@@@;        .$@- ");
		System.out.println("   .!@@@@@;                                                                         @@@@@=.        =@; ");
		System.out.println("   -@@@@@@;                                                                         @@@@@$,        *@= ");
		System.out.println("   :@@@@@@!                                                                         #@@@@=.        =@#.");
		System.out.println("   ~@@@@@@;                                                                         ~@@@@=..~******#@@.");
		System.out.println("   ,#@@@@$~                                                                     ~*$$$@@@@@$$#@@@@@@@@#.");
		System.out.println("  ~!@@@@#:                                                                  ,;=#@@@@@@@@@@@@@@@@@@@!,. ");
		System.out.println(" ,@@@@@@@@@                                                      @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#:     ");
		System.out.println(" ,@@@@@@@@@                                                       ==@@@@@@@##$$#@@@@@@@@@@@@@@;.       ");
		System.out.println(" ,@@@@@@@@*,                                                                    .!#@@@@@@@@@@$-        ");
		System.out.println(" ,@@@@@@@@*.                                                                       *@@@@@@@@@=,        ");
		System.out.println(" ,@@@@@@@@*.                                                                        *@@@@@@@@=,        ");
		System.out.println(" ,@@@@@@@@*.                                                                         #@@@@@@@*,        ");
		System.out.println(" ,@@@@@@@@;                                                                          ;@@@@@@@=,        ");
		System.out.println(" ,@@@@@@@#~                                                                          ,@@@@@@@@:        ");
		System.out.println(" ,@@@@@@@=,                                                                          .@@@@@@@@=,       ");
		System.out.println(" ,@@@@@@@;                                                                            #@@@@@@@@!.      ");
		System.out.println(" ,@@@@@@$-                                                                            ~@@@@@@@@#~      ");
		Thread.sleep(150);
		System.out.println("                                                                                          .,,.   ");
		System.out.println("                                                                                ..       .!#$$~  ");
		System.out.println("      ..                                                                      ~:;!:.      ,;*@=. ");
		System.out.println("    .:!!;:,                                                                   @@@@@;        .$@- ");
		System.out.println("   .!@@@@@;                                                                   @@@@@=.        =@; ");
		System.out.println("   -@@@@@@;                                                                   @@@@@$,        *@= ");
		System.out.println("   :@@@@@@!                                                                   #@@@@=.        =@#.");
		System.out.println("   ~@@@@@@;                                                                   ~@@@@=..~******#@@.");
		System.out.println("   ,#@@@@$~                                                               ~*$$$@@@@@$$#@@@@@@@@#.");
		System.out.println("  ~!@@@@#:                                                            ,;=#@@@@@@@@@@@@@@@@@@@!,. ");
		System.out.println(" ,@@@@@@@@@                                                @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#:     ");
		System.out.println(" ,@@@@@@@@@                                                 ==@@@@@@@##$$#@@@@@@@@@@@@@@;.       ");
		System.out.println(" ,@@@@@@@@*,                                                              .!#@@@@@@@@@@$-        ");
		System.out.println(" ,@@@@@@@@*.                                                                 *@@@@@@@@@=,        ");
		System.out.println(" ,@@@@@@@@*.                                                                  *@@@@@@@@=,        ");
		System.out.println(" ,@@@@@@@@*.                                                                   #@@@@@@@*,        ");
		System.out.println(" ,@@@@@@@@;                                                                    ;@@@@@@@=,        ");
		System.out.println(" ,@@@@@@@#~                                                                    ,@@@@@@@@:        ");
		System.out.println(" ,@@@@@@@=,                                                                    .@@@@@@@@=,       ");
		System.out.println(" ,@@@@@@@;                                                                      #@@@@@@@@!.      ");
		System.out.println(" ,@@@@@@$-                                                                      ~@@@@@@@@#~      ");
		Thread.sleep(150);
		System.out.println("                                                                                  .,,.   ");
		System.out.println("                                                                        ..       .!#$$~  ");
		System.out.println("      ..                                                              ~:;!:.      ,;*@=. ");
		System.out.println("    .:!!;:,                                                           @@@@@;        .$@- ");
		System.out.println("   .!@@@@@;                                                           @@@@@=.        =@; ");
		System.out.println("   -@@@@@@;                                                           @@@@@$,        *@= ");
		System.out.println("   :@@@@@@!                                                           #@@@@=.        =@#.");
		System.out.println("   ~@@@@@@;                                                           ~@@@@=..~******#@@.");
		System.out.println("   ,#@@@@$~                                                       ~*$$$@@@@@$$#@@@@@@@@#.");
		System.out.println("  ~!@@@@#:                                                    ,;=#@@@@@@@@@@@@@@@@@@@!,. ");
		System.out.println(" ,@@@@@@@@@                                        @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#:     ");
		System.out.println(" ,@@@@@@@@@                                         ==@@@@@@@##$$#@@@@@@@@@@@@@@;.       ");
		System.out.println(" ,@@@@@@@@*,                                                      .!#@@@@@@@@@@$-        ");
		System.out.println(" ,@@@@@@@@*.                                                         *@@@@@@@@@=,        ");
		System.out.println(" ,@@@@@@@@*.                                                          *@@@@@@@@=,        ");
		System.out.println(" ,@@@@@@@@*.                                                           #@@@@@@@*,        ");
		System.out.println(" ,@@@@@@@@;                                                            ;@@@@@@@=,        ");
		System.out.println(" ,@@@@@@@#~                                                            ,@@@@@@@@:        ");
		System.out.println(" ,@@@@@@@=,                                                            .@@@@@@@@=,       ");
		System.out.println(" ,@@@@@@@;                                                              #@@@@@@@@!.      ");
		System.out.println(" ,@@@@@@$-                                                              ~@@@@@@@@#~      ");
		Thread.sleep(150);
		System.out.println("                                                                          .,,.   ");
		System.out.println("                                                                ..       .!#$$~  ");
		System.out.println("      ..                                                      ~:;!:.      ,;*@=. ");
		System.out.println("    .:!!;:,                                                   @@@@@;        .$@- ");
		System.out.println("   .!@@@@@;                                                   @@@@@=.        =@; ");
		System.out.println("   -@@@@@@;                                                   @@@@@$,        *@= ");
		System.out.println("   :@@@@@@!                                                   #@@@@=.        =@#.");
		System.out.println("   ~@@@@@@;                                                   ~@@@@=..~******#@@.");
		System.out.println("   ,#@@@@$~                                               ~*$$$@@@@@$$#@@@@@@@@#.");
		System.out.println("  ~!@@@@#:                                            ,;=#@@@@@@@@@@@@@@@@@@@!,. ");
		System.out.println(" ,@@@@@@@@@                                @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#:     ");
		System.out.println(" ,@@@@@@@@@                                 ==@@@@@@@##$$#@@@@@@@@@@@@@@;.       ");
		System.out.println(" ,@@@@@@@@*,                                              .!#@@@@@@@@@@$-        ");
		System.out.println(" ,@@@@@@@@*.                                                 *@@@@@@@@@=,        ");
		System.out.println(" ,@@@@@@@@*.                                                  *@@@@@@@@=,        ");
		System.out.println(" ,@@@@@@@@*.                                                   #@@@@@@@*,        ");
		System.out.println(" ,@@@@@@@@;                                                    ;@@@@@@@=,        ");
		System.out.println(" ,@@@@@@@#~                                                    ,@@@@@@@@:        ");
		System.out.println(" ,@@@@@@@=,                                                    .@@@@@@@@=,       ");
		System.out.println(" ,@@@@@@@;                                                      #@@@@@@@@!.      ");
		System.out.println(" ,@@@@@@$-                                                      ~@@@@@@@@#~      ");
		Thread.sleep(150);
		System.out.println("                                                                .,,.   ");
		System.out.println("                                                      ..       .!#$$~  ");
		System.out.println("      ..                                            ~:;!:.      ,;*@=. ");
		System.out.println("    .:!!;:,                                         @@@@@;        .$@- ");
		System.out.println("   .!@@@@@;                                         @@@@@=.        =@; ");
		System.out.println("   -@@@@@@;                                         @@@@@$,        *@= ");
		System.out.println("   :@@@@@@!                                         #@@@@=.        =@#.");
		System.out.println("   ~@@@@@@;                                         ~@@@@=..~******#@@.");
		System.out.println("   ,#@@@@$~                                     ~*$$$@@@@@$$#@@@@@@@@#.");
		System.out.println("  ~!@@@@#:                                  ,;=#@@@@@@@@@@@@@@@@@@@!,. ");
		System.out.println(" ,@@@@@@@@@                      @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#:     ");
		System.out.println(" ,@@@@@@@@@                       ==@@@@@@@##$$#@@@@@@@@@@@@@@;.       ");
		System.out.println(" ,@@@@@@@@*,                                    .!#@@@@@@@@@@$-        ");
		System.out.println(" ,@@@@@@@@*.                                       *@@@@@@@@@=,        ");
		System.out.println(" ,@@@@@@@@*.                                        *@@@@@@@@=,        ");
		System.out.println(" ,@@@@@@@@*.                                         #@@@@@@@*,        ");
		System.out.println(" ,@@@@@@@@;                                          ;@@@@@@@=,        ");
		System.out.println(" ,@@@@@@@#~                                          ,@@@@@@@@:        ");
		System.out.println(" ,@@@@@@@=,                                          .@@@@@@@@=,       ");
		System.out.println(" ,@@@@@@@;                                            #@@@@@@@@!.      ");
		System.out.println(" ,@@@@@@$-                                            ~@@@@@@@@#~      ");
		Thread.sleep(150);
		System.out.println("                                                 .,,.   ");
		System.out.println("                                       ..       .!#$$~  ");
		System.out.println("      ..                             ~:;!:.      ,;*@=. ");
		System.out.println("    .:!!;:,                          @@@@@;        .$@- ");
		System.out.println("   .!@@@@@;                          @@@@@=.        =@; ");
		System.out.println("   -@@@@@@;                          @@@@@$,        *@= ");
		System.out.println("   :@@@@@@!                          #@@@@=.        =@#.");
		System.out.println("   ~@@@@@@;                          ~@@@@=..~******#@@.");
		System.out.println("   ,#@@@@$~                      ~*$$$@@@@@$$#@@@@@@@@#.");
		System.out.println("  ~!@@@@#:                   ,;=#@@@@@@@@@@@@@@@@@@@!,. ");
		System.out.println(" ,@@@@@@@@@       @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#:     ");
		System.out.println(" ,@@@@@@@@@        ==@@@@@@@##$$#@@@@@@@@@@@@@@;.       ");
		System.out.println(" ,@@@@@@@@*,                     .!#@@@@@@@@@@$-        ");
		System.out.println(" ,@@@@@@@@*.                        *@@@@@@@@@=,        ");
		System.out.println(" ,@@@@@@@@*.                         *@@@@@@@@=,        ");
		System.out.println(" ,@@@@@@@@*.                          #@@@@@@@*,        ");
		System.out.println(" ,@@@@@@@@;                           ;@@@@@@@=,        ");
		System.out.println(" ,@@@@@@@#~                           ,@@@@@@@@:        ");
		System.out.println(" ,@@@@@@@=,                           .@@@@@@@@=,       ");
		System.out.println(" ,@@@@@@@;                             #@@@@@@@@!.      ");
		System.out.println(" ,@@@@@@$-                             ~@@@@@@@@#~      ");
		Thread.sleep(150);
		System.out.println("                                          .,,.   ");
		System.out.println("                                ..       .!#$$~  ");
		System.out.println("      ..                      ~:;!:.      ,;*@=. ");
		System.out.println("    .:!!;:,                   @@@@@;        .$@- ");
		System.out.println("   .!@@@@@;                   @@@@@=.        =@; ");
		System.out.println("   -@@@@@@;                   @@@@@$,        *@= ");
		System.out.println("   :@@@@@@!                   #@@@@=.        =@#.");
		System.out.println("   ~@@@@@@;                   ~@@@@=..~******#@@.");
		System.out.println("   ,#@@@@$~               ~*$$$@@@@@$$#@@@@@@@@#.");
		System.out.println("  ~!@@@@#:            ,;=#@@@@@@@@@@@@@@@@@@@!,. ");
		System.out.println(" ,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#:     ");
		System.out.println(" ,@@@@@@@@@ ==@@@@@@@##$$#@@@@@@@@@@@@@@;.       ");
		System.out.println(" ,@@@@@@@@*,              .!#@@@@@@@@@@$-        ");
		System.out.println(" ,@@@@@@@@*.                 *@@@@@@@@@=,        ");
		System.out.println(" ,@@@@@@@@*.                  *@@@@@@@@=,        ");
		System.out.println(" ,@@@@@@@@*.                   #@@@@@@@*,        ");
		System.out.println(" ,@@@@@@@@;                    ;@@@@@@@=,        ");
		System.out.println(" ,@@@@@@@#~                    ,@@@@@@@@:        ");
		System.out.println(" ,@@@@@@@=,                    .@@@@@@@@=,       ");
		System.out.println(" ,@@@@@@@;                      #@@@@@@@@!.      ");
		System.out.println(" ,@@@@@@$-                      ~@@@@@@@@#~      ");
	}
	

	public char[] mission() { //��������
		
		System.out.println("\n\nġ������ ������ ���ɴϴ� ���Ͻʽÿ�\n\n");

		//String[] �����¿� = {"��", "��", "��", "��"};
		char[] �����¿� = {'��', '��', '��', '��'};
		//String[] wsad = {"w", "a", "s", "d"};
		char[] wsad = {'w', 'a', 's', 'd'};
		ArrayList �����¿칮�� = new ArrayList();	//����� ����
		int num = 6;							//������� 6����
		char[] ����� = new char[num];

		for (int i = 0; i < num; i++) {			
			Random random = new Random(); 		//�����¿� ���������� �������� �߻�
			int num2 = random.nextInt(4);		//�߻��� ���ڷ� ����
			�����¿칮��.add(�����¿�[num2]);			//�����¿칮�� ����
			�����[i] = wsad[num2];
		}
		System.out.println(�����¿칮��.toString());
		return �����;
	}
	
	
	
	
	
	public void mission(Wick wick, char[] quest, char[] answer) { //������ ���߾����� Ȯ���ϱ�
		boolean pass = true;
		for (int i = 0; i < answer.length; i++) {	//�ѱ��ھ� �˻��� pass nonpass ����
			if(quest[i] != answer[i]) {
				pass = false;
			}
		}
		if (pass) {
			System.out.println("������ ���߽��ϴ�!\n\n\n\n\n\n\n\n\n\n");
		}
		else {
			wick.HP = wick.HP - 20;
			System.out.println("������ ������ ���Ͽ����ϴ�\n\n\n\n\n\n\n\n\n\n");
		}
//		if(quest.equals(answer)) {
//			System.out.println("������ ���߽��ϴ�!\n\n\n\n\n\n\n\n\n\n");
//		}
//		else {
//			wick.HP = wick.HP - 20;
//			System.out.println("������ ������ ���Ͽ����ϴ�\n\n\n\n\n\n\n\n\n\n");
//		}
	}



}
