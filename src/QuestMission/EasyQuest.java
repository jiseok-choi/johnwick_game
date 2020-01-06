package QuestMission;
import Charactor.Wick;
import java.util.*;

public class EasyQuest implements Runnable{
	String Quest;		//문제 담아줄 변수
	int QuestLevel = 1;		//문제 난이도

	Random random = new Random();
	ArrayList wasd = new ArrayList();		//문제의 답(string)


	public EasyQuest() {
		//		ArrayList 상하좌우 = new ArrayList();		//출력할 문제
		//		상하좌우.add('↑');
		//		상하좌우.add('←');
		//		상하좌우.add('↓');
		//		상하좌우.add('→');
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
	

	public char[] mission() { //문제생성
		
		System.out.println("\n\n치명적인 공격이 들어옵니다 피하십시오\n\n");

		//String[] 상하좌우 = {"↑", "←", "↓", "→"};
		char[] 상하좌우 = {'↑', '←', '↓', '→'};
		//String[] wsad = {"w", "a", "s", "d"};
		char[] wsad = {'w', 'a', 's', 'd'};
		ArrayList 상하좌우문제 = new ArrayList();	//출력할 문제
		int num = 6;							//쉬운문제는 6개만
		char[] 답안지 = new char[num];

		for (int i = 0; i < num; i++) {			
			Random random = new Random(); 		//상하좌우 범위내에서 랜덤숫자 발생
			int num2 = random.nextInt(4);		//발생된 숫자로 인한
			상하좌우문제.add(상하좌우[num2]);			//상하좌우문제 생성
			답안지[i] = wsad[num2];
		}
		System.out.println(상하좌우문제.toString());
		return 답안지;
	}
	
	
	
	
	
	public void mission(Wick wick, char[] quest, char[] answer) { //문제를 맞추었는지 확인하기
		boolean pass = true;
		for (int i = 0; i < answer.length; i++) {	//한글자씩 검사후 pass nonpass 결정
			if(quest[i] != answer[i]) {
				pass = false;
			}
		}
		if (pass) {
			System.out.println("공격을 피했습니다!\n\n\n\n\n\n\n\n\n\n");
		}
		else {
			wick.HP = wick.HP - 20;
			System.out.println("공격을 피하지 못하였습니다\n\n\n\n\n\n\n\n\n\n");
		}
//		if(quest.equals(answer)) {
//			System.out.println("공격을 피했습니다!\n\n\n\n\n\n\n\n\n\n");
//		}
//		else {
//			wick.HP = wick.HP - 20;
//			System.out.println("공격을 피하지 못하였습니다\n\n\n\n\n\n\n\n\n\n");
//		}
	}



}
