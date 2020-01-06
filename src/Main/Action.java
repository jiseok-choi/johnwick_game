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
		System.out.println("난 액션");
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
	public static String[][] map2 = new String[8][83];	//맵만들기
	
	
	public static void main(String[] args) throws InterruptedException {
		Action action = new Action();


		//test zone


		MiddleBoss mi = new MiddleBoss();
		//mi.stun_count = 5;
		//mi.Skill_Stun(wick);
		Wick w = new Wick();		//주인공등장
		Runnable r = new Sound(w);
		Thread t = new Thread(r);
		t.start();
		//end test zone


		String blank = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";

		//시작화면 등장
		Scanner num_scan = new Scanner(System.in);		//입력값 스캔
		Scanner text = new Scanner(System.in);			//단계진행위한 텍스트 입력
		int numscan = 0, flag, holljack, 배팅금화, 미션타임=0; 
		int money = 0;									//돈줍기
		String txt, 회피미션;
		String passkey;

		Music Music = new Music("존윅배경음악1.mp3", true);
		Music.start();


		//System.out.println("\n■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		//System.out.println("  ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");                           
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
		//System.out.println("  ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("\n\n\n뒷세계에 악명높은 부기맨으로 불렸던 존윅은 사랑하는 헬렌을 만나 일상생활을 누리며 살아간다\n");
		System.out.println("5년만에 사랑하는 아내 헬렌이 병으로 죽고 난 뒤 아내 헬렌에게 받은 데이지라는 강아지를 받고 \n");
		System.out.println("겨우 위로 받으며 살아가는데 마피아 조직 보스가 존윅의 차를 훔치고 소중한 데이지마저 죽였다 \r\n\n" + 
				"그렇게 존윅은 다시 복수를 위해 뒷세계로 들어가게 된다.....");
		System.out.println("\n\n■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n");
		System.out.println("   1. 게임바로시작    2. 조작키 설명    3. 게임종료");
		System.out.println("\n■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		while(true) {
			try {
				numscan = num_scan.nextInt();					//스캐너 활성화
				break;
			} catch (Exception e) {
				System.out.println("숫자를 입력하세요");
				num_scan = new Scanner(System.in);
			}
		}
		
		
		Stage stage = new Stage();
		switch(numscan) {
		case 1 :
			System.out.println(blank);					//화면비우기
			break;

		case 2 :  
			stage.key();								//조작키 설명
			passkey = text.next();						//글자 입력시 단계진행
			System.out.println(blank);
			break;

		case 3 :
			System.out.println("시스템이 종료됩니다");
			System.exit(0);
		}
		//상황0 존윅 등장
		Wick wick = new Wick();
		Runnable r1 = new Sound(wick);	//윅 총소리 러너블생성
		Thread t1 = new Thread(r1);		//윅 총소리 쓰레드생성
		//t1.start();
		Runnable easyQ1 = new EasyQuest();	//이지 퀘스트 러너블생성
		Thread easyQ_1 = new Thread(easyQ1);	//이지 퀘스트 쓰레드생성

		//쓰레드생성
		Runnable 로딩 = new Stage();
		Thread 로딩_t = new Thread(로딩);
		
		Runnable 부기맨1동료;
		Thread 부기맨1동료생성;
		Runnable 부기맨2동료;
		Thread 부기맨2동료생성;
		Runnable 부기맨3동료;
		Thread 부기맨3동료생성;
		Runnable 중간보스동료;
		Thread 중간보스동료생성;
		Runnable 중간보스스킬;
		Thread 중간보스스킬발동;
		
		Runnable r_gif = new IMAGE(7);
		Thread gif = new Thread(r_gif);
		gif.start();
		gif.join();
		

		//상황1 부기맨들이 집에 처들어옴
		wick.Gun = 1;
		stage.stage1("집", wick);		//집에 부기맨이 처들어옴
		passkey = text.next();			//약간의 텀
		Music.close();
		//격투 시작
		Boogieman boogie = new Boogieman();
		
		Music = new Music("전투음악1.mp3", true);
		Music.start();
		로딩 = new Stage();
		로딩_t = new Thread(로딩);
		로딩_t.start();
		//전투준비
		r_gif = new IMAGE(2);
		gif = new Thread(r_gif);
		gif.start();
		로딩_t.join();
		///////////////////////////////////////////////////////////////////////////////////////////////////////////
		//적 자동 공격
		AttackTime = 100;
		Timer m_fight1 = new Timer();
		TimerTask t_fight1 = new TimerTask() {
			public void run() {
				if(Attack_Stop == false) {		//다른 미션 나타났을때 잠시 멈춤조건
					if(boogie.life(boogie) == false) {
						m_fight1.cancel();
					}
					if(wick.HP > 0) {
						System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
						boogie.Shot(wick, boogie);				//부기맨의 공격
						wick.Hitme(0);							//존윅 공격 당함
						stage.frendcheck(boogie);				//남은 적수 체크
						//mi.Skill_Stun(wick);					//중간보스스턴스킬
					}
					else {
						m_fight1.cancel();
						System.out.println("윅죽음");
					}
					AttackTime--;
					System.out.println("\n");
					if(!boogie.life) {
						boogie.Frend = -1;
					}
					stage.Mylife(wick, boogie.Frend + 1);			//전투중 지속적으로 체력확인
				}
			}
		};

		m_fight1.schedule(t_fight1, 100, 1000);
		
		// 부기맨의 동료생성 쓰레드
		부기맨1동료 = new Boogieman(boogie);
		부기맨1동료생성 = new Thread(부기맨1동료);
		부기맨1동료생성.start();

		///////////////////////////////////////////////////////////////////////////////////////////////////////////
		//격투신 생성

		while(boogie.life){
			//회피미션 발생
			if(boogie.Frend > 1 && boogie.Frend % 3 == 0) {	//부기맨의 동료가 3배수일때 미션발생
				미션타임++;
				if (미션타임 >= 5) {					//적어도 동료 쏴죽일때까지 횟수채우는 조건
					Attack_Stop = true;
					미션타임 = 0;
					easyQ1 = new EasyQuest();		//이지 퀘스트 러너블생성1
					easyQ_1 = new Thread(easyQ1);	//이지 퀘스트 쓰레드생성
					easyQ_1.start(); 				//이지퀘스트 모션실행
					easyQ_1.join(); 				//끝날때까지 기다리기
					EasyQuest easy = new EasyQuest();
					char Answer[] = easy.mission();			//문제 만들면서 답안지 담아주고
					회피미션 = text.next();					//플레이어가 적어준답을
					while(회피미션.equals("q")) {
						System.out.println("wsad만 입력하세요");
						회피미션 = text.next();
					}
					if(회피미션.length() == 6) {				//주어진 문제 길이 에 맞추는지 판단후(에러 방지)
						char[] chr = 회피미션.toCharArray();
						easy.mission(wick, chr, Answer);	//답을 확인하는 미션
						wick.Hitme(0);
						Attack_Stop = false;
					}
					else {
						System.out.println("공격을 피하지 못하였습니다\n치명적 상처를 얻었습니다");
						wick.Hitme(20);						//미션 강도에 따른 데미지 직접 전달
						Attack_Stop = false;
					}
				}
			}
			txt = text.next();			//입력
			//action.Think(txt);
			switch(txt) {				
			case "q": 					//총발사			
				while(true) {
					Random random = new Random(); 		//랜덤으로 맞기
					int num = random.nextInt(2);		
					if(num >= 0) {
						if(boogie.life(boogie)) {
							wick.Shot(wick, boogie);
							break;
						}
					}
				}

				break;
			case "e": 					//현재상태 확인하기
				stage.Mylife(wick);
				break;
			case "f": 					//총바꾸기
				wick.Change(wick);
				break;
			}
		}
		m_fight1.cancel();				//전투1 자동공격 중지
		wick.Money = wick.Money + boogie.Money;	//부기맨 죽였으니 보상획득
		Music.close();
		///////////////////////////////////////////////////////////////////////////////////////////////////////////
		//콘티넨탈 호텔갈거냐?
		Music = new Music("호텔소리.mp3", true);
		Music.start();
		stage.rest(wick.HP);
		do{								//실수로 q 누름 방지 루프
			flag = 1;
			try{
				numscan = 0;
				numscan = num_scan.nextInt();		//호텔가는지 입력
			}
			catch(InputMismatchException e){
				flag=0;
				num_scan = new Scanner(System.in);
				System.out.println("숫자를 입력하세요");
			}

		}while(flag==0);


		if(numscan == 1) {
			while(true) {
				if(numscan == 1) {					//호텔간다면
					Hotel hotel = new Hotel(wick);		//호텔인사말 등장
					numscan = num_scan.nextInt();	//
					if(numscan == 1) {				//치료를 선택하면
						hotel.Hill(wick);			//HP 회복
					}
					else if(numscan == 2) {			//총알을 선택하면
						hotel.bullet(wick);
						numscan = num_scan.nextInt();
						hotel.bullet(wick, numscan);//선택한 총알 충전
						numscan = 1;				//다시 호텔메뉴
					}
					else if(numscan == 3){
						boolean pass = true;
						int 계속 = 0;
						while(pass) {
							//게임설명
							pass = hotel.holjjack(wick, 1, 0, 0);
							배팅금화 = num_scan.nextInt();		//배팅금화입력
							//배팅금액설정
							pass = hotel.holjjack(wick, 2, 배팅금화, 0);
							if(pass == false) {				//중간에 금화가 부족하면 break
								break;
							}
							System.out.println("1. 홀수     2. 짝수\n(선택하시면 바로 게임이 진행됩니다)");
							holljack = num_scan.nextInt();	//홀짝
							hotel = new Hotel();			//주사위 굴리기 반복위한 재생성
							hotel.start();					//주사위굴리기 팝업

							try {							//주사위 던저질때까지 기다리기
								hotel.join();
							} catch (InterruptedException e) {
								e.printStackTrace();
							}


							if(holljack == 1) {
								pass = hotel.holjjack(wick, 3, 배팅금화, 1);
								계속 = num_scan.nextInt();	
								if(계속 == 1) {
									pass = true;
								}
								else {
									pass = false;
								}
							}
							else {
								pass = hotel.holjjack(wick, 3, 배팅금화, 0);
								계속 = num_scan.nextInt();
								if(계속 == 1) {
									pass = true;
								}
								else {
									pass = false;
								}
							}
						}
						numscan = 1;				//다시 호텔메뉴
					}
					else if(numscan == 4){
						System.out.println("호텔에서 나왔습니다");
						break;
					}
				}
			}
		}

		Music.close();
		Music = new Music("존윅배경음악1.mp3", true);
		Music.start();
//		//////////////////////////////////////////////////////////////////////////////
//		//상황2 클럽에 처들어감
//
//		stage.stage2("클럽", wick);				
//		passkey = text.next();			//약간의 텀
//		Music.close();
//		//격투 시작
//		Boogieman boogie2 = new Boogieman();
//		Boogieman boogie22 = new Boogieman();
//		Music = new Music("전투음악1.mp3", true);
//		Music.start();
//		로딩 = new Stage();
//		로딩_t = new Thread(로딩);
//		로딩_t.start();
//		//전투준비
//		r_gif = new IMAGE(2);
//		gif = new Thread(r_gif);
//		gif.start();
//		로딩_t.join();
//		///////////////////////////////////////////////////////////////////////////////////////////////////////////
//		//적 자동 공격
//		AttackTime = 100;
//		Timer m_fight2 = new Timer();
//		TimerTask t_fight2 = new TimerTask() {
//			public void run() {
//				if(Attack_Stop == false) {		//다른 미션 나타났을때 잠시 멈춤조건
//					if(boogie2.life(boogie2) == false && boogie22.life(boogie22) == false) {
//						m_fight2.cancel();
//					}
//					if(wick.HP > 0) {
//						System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
//						boogie2.Shot(wick, boogie2);						//부기맨의 공격
//						boogie22.Shot(wick, boogie22);						//부기맨의 공격
//						wick.Hitme(0);							//존윅 공격
//						stage.frendcheck(boogie2, boogie22);	//남은 적수 체크
//						//mi.Skill_Stun(wick);					//중간보스스턴스킬
//					}
//					else {
//						m_fight2.cancel();
//						System.out.println("윅죽음");
//					}
//					AttackTime--;
//					System.out.println("\n");
//					if(boogie2.life(boogie2) == false) {
//						boogie2.Frend = -1;}
//					if(boogie22.life(boogie22) == false) {
//						boogie22.Frend = -1;}
//					stage.Mylife(wick, boogie2.Frend + 1+boogie22.Frend + 1);			//전투중 지속적으로 체력확인
//				}
//			}
//		};
//
//		m_fight2.schedule(t_fight2, 100, 1000);
//		
//		// 부기맨의 동료생성 쓰레드
//		부기맨1동료 = new Boogieman(boogie2);
//		부기맨1동료생성 = new Thread(부기맨1동료);
//		부기맨1동료생성.start();
//		
//		// 부기맨의 동료생성 쓰레드
//		부기맨2동료 = new Boogieman(boogie22);
//		부기맨2동료생성 = new Thread(부기맨2동료);
//		부기맨2동료생성.start();
//		
//		///////////////////////////////////////////////////////////////////////////////////////////////////////////
//		//격투신 생성
//
//		while(boogie2.life|| boogie22.life){
//			//회피미션 발생
//			if(boogie2.Frend > 1 && boogie2.Frend % 3 == 0 || boogie22.Frend > 1 && boogie22.Frend % 3 == 0) {	//부기맨의 동료가 3배수일때 미션발생
//				미션타임++;
//				if (미션타임 >= 7) {				//적어도 동료 쏴죽일때까지 횟수채우는 조건
//					Attack_Stop = true;
//					미션타임 = 0;
//					easyQ1 = new EasyQuest();	//이지 퀘스트 러너블생성
//					easyQ_1 = new Thread(easyQ1);	//이지 퀘스트 쓰레드생성
//					easyQ_1.start(); 			//이지퀘스트 모션실행
//					easyQ_1.join(); 			//끝날때까지 기다리기
//					EasyQuest easy = new EasyQuest();
//					char Answer[] = easy.mission();			//문제 만들면서 답안지 담아주고
//					회피미션 = text.next();						//플레이어가 적어준답을
//					while(회피미션.equals("q")) {
//						System.out.println("wsad만 입력하세요");
//						회피미션 = text.next();
//					}
//					if(회피미션.length() == 6) {					//주어진 문제 길이 에 맞추는지 판단후(에러 방지)
//						char[] chr = 회피미션.toCharArray();
//						easy.mission(wick, chr, Answer);	//답을 확인하는 미션
//						wick.Hitme(0);
//						Attack_Stop = false;
//					}
//					else {
//						System.out.println("공격을 피하지 못하였습니다\n치명적 상처를 얻었습니다");
//						wick.Hitme(20);						//미션 강도에 따른 데미지 직접 전달
//						Attack_Stop = false;
//					}
//				}
//			}
//			txt = text.next();			//입력
//			//action.Think(txt);
//			switch(txt) {				
//			case "q": 					//총발사			
//				while(true) {
//					Random random = new Random(); 		//랜덤으로 맞기
//					int num = random.nextInt(2);		//0,1 난수 발생
//					if(num == 0 && boogie2.life(boogie2) == true) {
//						wick.Shot(wick, boogie2);	//존윅이 공격
//						break;
//					}
//					else if(num == 0 && boogie22.life(boogie22) == true) {
//						wick.Shot(wick, boogie22);
//						break;
//					}
//				}
//
//				break;
//			case "e": 					//현재상태 확인하기
//				stage.Mylife(wick);
//				break;
//			case "f": 					//총바꾸기
//				wick.Change(wick);
//				break;
//			}
//		}
//		m_fight2.cancel();				//전투1 자동공격 중지
//		wick.Money = wick.Money + boogie2.Money + boogie22.Money;	//부기맨 죽였으니 보상획득
//		Music.close();
//		///////////////////////////////////////////////////////////////////////////////////////////////////////////
//		//콘티넨탈 호텔갈거냐?
//		Music = new Music("호텔소리.mp3", true);
//		Music.start();
//		stage.rest(wick.HP);
//		do{								//실수로 q 누름 방지 루프
//			flag = 1;
//			try{
//				numscan = 0;
//				numscan = num_scan.nextInt();		//호텔가는지 입력
//			}
//			catch(InputMismatchException e){
//				flag=0;
//				num_scan = new Scanner(System.in);
//				System.out.println("숫자를 입력하세요");
//			}
//
//		}while(flag==0);
//
//
//		if(numscan == 1) {
//			while(true) {
//				if(numscan == 1) {					//호텔간다면
//					Hotel hotel = new Hotel(wick);		//호텔인사말 등장
//					numscan = num_scan.nextInt();	//
//					if(numscan == 1) {				//치료를 선택하면
//						hotel.Hill(wick);			//HP 회복
//					}
//					else if(numscan == 2) {			//총알을 선택하면
//						hotel.bullet(wick);
//						numscan = num_scan.nextInt();
//						hotel.bullet(wick, numscan);//선택한 총알 충전
//						numscan = 1;				//다시 호텔메뉴
//					}
//					else if(numscan == 3){
//						boolean pass = true;
//						int 계속 = 0;
//						while(pass) {
//							//게임설명
//							pass = hotel.holjjack(wick, 1, 0, 0);
//							배팅금화 = num_scan.nextInt();		//배팅금화입력
//							//배팅금액설정
//							pass = hotel.holjjack(wick, 2, 배팅금화, 0);
//							if(pass == false) {				//중간에 금화가 부족하면 break
//								break;
//							}
//							System.out.println("1. 홀수     2. 짝수\n(선택하시면 바로 게임이 진행됩니다)");
//							holljack = num_scan.nextInt();	//홀짝
//							hotel = new Hotel();			//주사위 굴리기 반복위한 재생성
//							hotel.start();					//주사위굴리기 팝업
//
//							try {							//주사위 던저질때까지 기다리기
//								hotel.join();
//							} catch (InterruptedException e) {
//								e.printStackTrace();
//							}
//
//
//							if(holljack == 1) {
//								pass = hotel.holjjack(wick, 3, 배팅금화, 1);
//								계속 = num_scan.nextInt();	
//								if(계속 == 1) {
//									pass = true;
//								}
//								else {
//									pass = false;
//								}
//							}
//							else {
//								pass = hotel.holjjack(wick, 3, 배팅금화, 0);
//								계속 = num_scan.nextInt();
//								if(계속 == 1) {
//									pass = true;
//								}
//								else {
//									pass = false;
//								}
//							}
//						}
//						numscan = 1;				//다시 호텔메뉴
//					}
//					else if(numscan == 4){
//						System.out.println("호텔에서 나왔습니다");
//						break;
//					}
//				}
//			}
//		}
//
//		Music.close();
//		Music = new Music("존윅배경음악1.mp3", true);
//		Music.start();
//

		//////////////////////////////////////////////////////////////////////////////
		//상황3 아지트에 처들어감
		wick.Gun = 1;

		stage.stage2("아지트", wick);				
		passkey = text.next();			//약간의 텀
		Music.close();
		//격투 시작
		Boogieman boogie3 = new Boogieman();
		Boogieman boogie33 = new Boogieman(2);
		Music = new Music("전투음악1.mp3", true);
		Music.start();
		로딩 = new Stage();
		로딩_t = new Thread(로딩);
		로딩_t.start();
		//전투준비
		r_gif = new IMAGE(2);
		gif = new Thread(r_gif);
		gif.start();
		로딩_t.join();
		///////////////////////////////////////////////////////////////////////////////////////////////////////////
		//적 자동 공격
		AttackTime = 100;
		Timer m_fight3 = new Timer();
		TimerTask t_fight3 = new TimerTask() {
			public void run() {
				if(Attack_Stop == false) {		//다른 미션 나타났을때 잠시 멈춤조건
					if(boogie3.life(boogie3) == false && boogie33.life(boogie33) == false) {
						m_fight3.cancel();
					}
					if(wick.HP > 0) {
						System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
						boogie3.Shot(wick, boogie3);						//부기맨의 공격
						boogie33.Shot(wick, boogie33);					//부기맨의 공격
						wick.Hitme(0);							//존윅 공격
						stage.frendcheck(boogie3, boogie33);	//남은 적수 체크
						//mi.Skill_Stun(wick);					//중간보스스턴스킬
					}
					else {
						m_fight3.cancel();
						System.out.println("윅죽음");
					}
					AttackTime--;
					System.out.println("\n");
					if(boogie3.life(boogie3) == false) {
						boogie3.Frend = -1;}
					if(boogie33.life(boogie33) == false) {
						boogie33.Frend = -1;}
					stage.Mylife(wick, boogie3.Frend + 1+boogie33.Frend + 1);			//전투중 지속적으로 체력확인
				}
			}
		};

		m_fight3.schedule(t_fight3, 100, 1000);
		
		// 부기맨의 동료생성 쓰레드
		부기맨1동료 = new Boogieman(boogie3);
		부기맨1동료생성 = new Thread(부기맨1동료);
		부기맨1동료생성.start();
		
		// 부기맨의 동료생성 쓰레드
		부기맨2동료 = new Boogieman(boogie33);
		부기맨2동료생성 = new Thread(부기맨2동료);
		부기맨2동료생성.start();

		///////////////////////////////////////////////////////////////////////////////////////////////////////////
		//격투신 생성

		while(boogie3.life || boogie33.life){
			//회피미션 발생
			if(boogie3.Frend > 1 && boogie3.Frend % 3 == 0 || boogie33.Frend > 1 && boogie33.Frend % 3 == 0) {	//부기맨의 동료가 3배수일때 미션발생
				미션타임++;
				if (미션타임 >= 8) {				//적어도 동료 쏴죽일때까지 횟수채우는 조건
					Attack_Stop = true;
					미션타임 = 0;
					easyQ1 = new EasyQuest();	//이지 퀘스트 러너블생성
					easyQ_1 = new Thread(easyQ1);	//이지 퀘스트 쓰레드생성
					easyQ_1.start(); 			//이지퀘스트 모션실행
					easyQ_1.join(); 			//끝날때까지 기다리기
					EasyQuest easy = new EasyQuest();
					char Answer[] = easy.mission();			//문제 만들면서 답안지 담아주고
					회피미션 = text.next();						//플레이어가 적어준답을
					while(회피미션.equals("q")) {
						System.out.println("wsad만 입력하세요");
						회피미션 = text.next();
					}
					if(회피미션.length() == 6) {					//주어진 문제 길이 에 맞추는지 판단후(에러 방지)
						char[] chr = 회피미션.toCharArray();
						easy.mission(wick, chr, Answer);	//답을 확인하는 미션
						wick.Hitme(0);
						Attack_Stop = false;
					}
					else {
						System.out.println("공격을 피하지 못하였습니다\n치명적 상처를 얻었습니다");
						wick.Hitme(20);						//미션 강도에 따른 데미지 직접 전달
						Attack_Stop = false;
					}
				}
			}
			txt = text.next();			//입력
			//action.Think(txt);
			switch(txt) {				
			case "q": 					//총발사			
				while(true) {
					Random random = new Random(); 		//랜덤으로 맞기
					int num = random.nextInt(2);		//0,1 난수 발생
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
			case "e": 					//현재상태 확인하기
				stage.Mylife(wick);
				break;
			case "f": 					//총바꾸기
				wick.Change(wick);
				break;
			}
		}
		m_fight3.cancel();				//전투1 자동공격 중지
		wick.Money = wick.Money + boogie3.Money + boogie33.Money;	//부기맨 죽였으니 보상획득
		Music.close();
		///////////////////////////////////////////////////////////////////////////////////////////////////////////
		//콘티넨탈 호텔갈거냐?
		Music = new Music("호텔소리.mp3", true);
		Music.start();
		stage.rest(wick.HP);
		do{								//실수로 q 누름 방지 루프
			flag = 1;
			try{
				numscan = 0;
				numscan = num_scan.nextInt();		//호텔가는지 입력
			}
			catch(InputMismatchException e){
				flag=0;
				num_scan = new Scanner(System.in);
				System.out.println("숫자를 입력하세요");
			}

		}while(flag==0);


		if(numscan == 1) {
			while(true) {
				if(numscan == 1) {					//호텔간다면
					Hotel hotel = new Hotel(wick);		//호텔인사말 등장
					numscan = num_scan.nextInt();	//
					if(numscan == 1) {				//치료를 선택하면
						hotel.Hill(wick);			//HP 회복
					}
					else if(numscan == 2) {			//총알을 선택하면
						hotel.bullet(wick);
						numscan = num_scan.nextInt();
						hotel.bullet(wick, numscan);//선택한 총알 충전
						numscan = 1;				//다시 호텔메뉴
					}
					else if(numscan == 3){
						boolean pass = true;
						int 계속 = 0;
						while(pass) {
							//게임설명
							pass = hotel.holjjack(wick, 1, 0, 0);
							배팅금화 = num_scan.nextInt();		//배팅금화입력
							//배팅금액설정
							pass = hotel.holjjack(wick, 2, 배팅금화, 0);
							if(pass == false) {				//중간에 금화가 부족하면 break
								break;
							}
							System.out.println("1. 홀수     2. 짝수\n(선택하시면 바로 게임이 진행됩니다)");
							holljack = num_scan.nextInt();	//홀짝
							hotel = new Hotel();			//주사위 굴리기 반복위한 재생성
							hotel.start();					//주사위굴리기 팝업

							try {							//주사위 던저질때까지 기다리기
								hotel.join();
							} catch (InterruptedException e) {
								e.printStackTrace();
							}


							if(holljack == 1) {
								pass = hotel.holjjack(wick, 3, 배팅금화, 1);
								계속 = num_scan.nextInt();	
								if(계속 == 1) {
									pass = true;
								}
								else {
									pass = false;
								}
							}
							else {
								pass = hotel.holjjack(wick, 3, 배팅금화, 0);
								계속 = num_scan.nextInt();
								if(계속 == 1) {
									pass = true;
								}
								else {
									pass = false;
								}
							}
						}
						numscan = 1;				//다시 호텔메뉴
					}
					else if(numscan == 4){
						System.out.println("호텔에서 나왔습니다");
						break;
					}
				}
			}
		}

		Music.close();
		Music = new Music("존윅배경음악1.mp3", true);
		Music.start();



//		//////////////////////////////////////////////////////////////////////////////
//		//상황4 빌딩에 처들어감
//
//		stage.stage2("빌딩", wick);				
//		passkey = text.next();			//약간의 텀
//		Music.close();
//		//격투 시작
//		Boogieman boogie4 = new Boogieman(2);
//		Boogieman boogie44 = new Boogieman(2);
//		Music = new Music("전투음악1.mp3", true);
//		Music.start();
//		로딩 = new Stage();
//		로딩_t = new Thread(로딩);
//		로딩_t.start();
// 		//전투준비
//		r_gif = new IMAGE(2);
//		gif = new Thread(r_gif);
//		gif.start();
//		로딩_t.join();
//		///////////////////////////////////////////////////////////////////////////////////////////////////////////
//		//적 자동 공격
//		AttackTime = 100;
//		Timer m_fight4 = new Timer();
//		TimerTask t_fight4 = new TimerTask() {
//			public void run() {
//				if(Attack_Stop == false) {		//다른 미션 나타났을때 잠시 멈춤조건
//					if(boogie4.life(boogie4) == false && boogie44.life(boogie44) == false) {
//						m_fight4.cancel();
//					}
//					if(wick.HP > 0) {
//						System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
//						boogie4.Shot(wick, boogie4);						//부기맨의 공격
//						boogie44.Shot(wick, boogie44);						//부기맨의 공격
//						wick.Hitme(0);							//존윅 공격
//						//mi.Skill_Stun(wick);					//중간보스스턴스킬
//					}
//					else {
//						m_fight4.cancel();
//						System.out.println("윅죽음");
//					}
//					AttackTime--;
//					System.out.println("\n");
//					//if(!boogie3.life(boogie3)){
//					//boogie3.Frend = -1;}
//					//if(!boogie33.life(boogie33)){
//					//boogie33.Frend = -1;}
//					stage.Mylife(wick, boogie4.Frend + 1+boogie44.Frend + 1);			//전투중 지속적으로 체력확인
//				}
//			}
//		};
//
//		m_fight4.schedule(t_fight4, 100, 1000);
//
//		// 부기맨의 동료생성 쓰레드
//		부기맨1동료 = new Boogieman(boogie4);
//		부기맨1동료생성 = new Thread(부기맨1동료);
//		부기맨1동료생성.start();
//		
//		// 부기맨의 동료생성 쓰레드
//		부기맨2동료 = new Boogieman(boogie44);
//		부기맨2동료생성 = new Thread(부기맨2동료);
//		부기맨2동료생성.start();
//
//		///////////////////////////////////////////////////////////////////////////////////////////////////////////
//		//격투신 생성
//
//		while(boogie4.life || boogie44.life){
//			//회피미션 발생
//			if(boogie4.Frend > 1 && boogie4.Frend % 3 == 0 || boogie44.Frend > 1 && boogie44.Frend % 3 == 0) {	//부기맨의 동료가 3배수일때 미션발생
//				미션타임++;
//				if (미션타임 >= 8) {				//적어도 동료 쏴죽일때까지 횟수채우는 조건
//					Attack_Stop = true;
//					미션타임 = 0;
//					easyQ1 = new EasyQuest();	//이지 퀘스트 러너블생성
//					easyQ_1 = new Thread(easyQ1);	//이지 퀘스트 쓰레드생성
//					easyQ_1.start(); 			//이지퀘스트 모션실행
//					easyQ_1.join(); 			//끝날때까지 기다리기
//					EasyQuest easy = new EasyQuest();
//					char Answer[] = easy.mission();			//문제 만들면서 답안지 담아주고
//					회피미션 = text.next();						//플레이어가 적어준답을
//					while(회피미션.equals("q")) {
//						System.out.println("wsad만 입력하세요");
//						회피미션 = text.next();
//					}
//					if(회피미션.length() == 6) {					//주어진 문제 길이 에 맞추는지 판단후(에러 방지)
//						char[] chr = 회피미션.toCharArray();
//						easy.mission(wick, chr, Answer);	//답을 확인하는 미션
//						wick.Hitme(0);
//						Attack_Stop = false;
//					}
//					else {
//						System.out.println("공격을 피하지 못하였습니다\n치명적 상처를 얻었습니다");
//						wick.Hitme(20);						//미션 강도에 따른 데미지 직접 전달
//						Attack_Stop = false;
//					}
//				}
//			}
//			txt = text.next();			//입력
//			//action.Think(txt);
//			switch(txt) {				
//			case "q": 					//총발사			
//				while(true) {
//					Random random = new Random(); 		//랜덤으로 맞기
//					int num = random.nextInt(2);		//0,1 난수 발생
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
//			case "e": 					//현재상태 확인하기
//				stage.Mylife(wick);
//				break;
//			case "f": 					//총바꾸기
//				wick.Change(wick);
//				break;
//			}
//		}
//		m_fight3.cancel();				//전투1 자동공격 중지
//		wick.Money = wick.Money + boogie4.Money + boogie44.Money;	//부기맨 죽였으니 보상획득
//		Music.close();
//		///////////////////////////////////////////////////////////////////////////////////////////////////////////
//		//콘티넨탈 호텔갈거냐?
//		Music = new Music("호텔소리.mp3", true);
//		Music.start();
//		stage.rest(wick.HP);
//		do{								//실수로 q 누름 방지 루프
//			flag = 1;
//			try{
//				numscan = 0;
//				numscan = num_scan.nextInt();		//호텔가는지 입력
//			}
//			catch(InputMismatchException e){
//				flag=0;
//				num_scan = new Scanner(System.in);
//				System.out.println("숫자를 입력하세요");
//			}
//
//		}while(flag==0);
//
//
//		if(numscan == 1) {
//			while(true) {
//				if(numscan == 1) {					//호텔간다면
//					Hotel hotel = new Hotel(wick);		//호텔인사말 등장
//					numscan = num_scan.nextInt();	//
//					if(numscan == 1) {				//치료를 선택하면
//						hotel.Hill(wick);			//HP 회복
//					}
//					else if(numscan == 2) {			//총알을 선택하면
//						hotel.bullet(wick);
//						numscan = num_scan.nextInt();
//						hotel.bullet(wick, numscan);//선택한 총알 충전
//						numscan = 1;				//다시 호텔메뉴
//					}
//					else if(numscan == 3){
//						boolean pass = true;
//						int 계속 = 0;
//						while(pass) {
//							//게임설명
//							pass = hotel.holjjack(wick, 1, 0, 0);
//							배팅금화 = num_scan.nextInt();		//배팅금화입력
//							//배팅금액설정
//							pass = hotel.holjjack(wick, 2, 배팅금화, 0);
//							if(pass == false) {				//중간에 금화가 부족하면 break
//								break;
//							}
//							System.out.println("1. 홀수     2. 짝수\n(선택하시면 바로 게임이 진행됩니다)");
//							holljack = num_scan.nextInt();	//홀짝
//							hotel = new Hotel();			//주사위 굴리기 반복위한 재생성
//							hotel.start();					//주사위굴리기 팝업
//
//							try {							//주사위 던저질때까지 기다리기
//								hotel.join();
//							} catch (InterruptedException e) {
//								e.printStackTrace();
//							}
//
//
//							if(holljack == 1) {
//								pass = hotel.holjjack(wick, 3, 배팅금화, 1);
//								계속 = num_scan.nextInt();	
//								if(계속 == 1) {
//									pass = true;
//								}
//								else {
//									pass = false;
//								}
//							}
//							else {
//								pass = hotel.holjjack(wick, 3, 배팅금화, 0);
//								계속 = num_scan.nextInt();
//								if(계속 == 1) {
//									pass = true;
//								}
//								else {
//									pass = false;
//								}
//							}
//						}
//						numscan = 1;				//다시 호텔메뉴
//					}
//					else if(numscan == 4){
//						System.out.println("호텔에서 나왔습니다");
//						break;
//					}
//				}
//			}
//		}
//
//		Music.close();
//		Music = new Music("존윅배경음악1.mp3", true);
//		Music.start();
//









		//////////////////////////////////////////////////////////////////////////////
		//상황5 마피아소유도박장에 처들어감
		wick.Gun = 1;

		stage.stage2("마피아 소유 도박장", wick);				
		passkey = text.next();			//약간의 텀
		Music.close();
		//격투 시작
		Boogieman boogie5 = new Boogieman();
		Boogieman boogie55 = new Boogieman(2);
		Boogieman boogie555 = new Boogieman(2);
		Music = new Music("전투음악1.mp3", true);
		Music.start();
		로딩 = new Stage();
		로딩_t = new Thread(로딩);
		로딩_t.start();
		//전투준비
		r_gif = new IMAGE(2);
		gif = new Thread(r_gif);
		gif.start();
		로딩_t.join();
		///////////////////////////////////////////////////////////////////////////////////////////////////////////
		//적 자동 공격
		AttackTime = 100;
		Timer m_fight5 = new Timer();
		TimerTask t_fight5 = new TimerTask() {
			public void run() {
				if(Attack_Stop == false) {		//다른 미션 나타났을때 잠시 멈춤조건
					if(boogie5.life(boogie5) == false && boogie55.life(boogie55) == false && boogie555.life(boogie555) == false) {
						m_fight5.cancel();
					}
					if(wick.HP > 0) {
						System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
						boogie5.Shot(wick, boogie5);						//부기맨의 공격
						boogie55.Shot(wick, boogie55);						//부기맨의 공격
						boogie555.Shot(wick, boogie555);						//부기맨의 공격
						wick.Hitme(0);							//존윅 공격
						stage.frendcheck(boogie5, boogie55, boogie555);	//남은 적수 체크
						//mi.Skill_Stun(wick);					//중간보스스턴스킬
					}
					else {
						m_fight5.cancel();
						System.out.println("윅죽음");
					}
					AttackTime--;
					System.out.println("\n");
					if(boogie5.life(boogie5) == false) {
						boogie5.Frend = -1;}
					if(boogie55.life(boogie55) == false) {
						boogie55.Frend = -1;}
					if(boogie555.life(boogie555) == false) {
						boogie555.Frend = -1;}
					stage.Mylife(wick, boogie5.Frend + 1+boogie55.Frend + 1+boogie555.Frend + 1);			//전투중 지속적으로 체력확인
				}
			}
		};

		m_fight5.schedule(t_fight5, 100, 1000);

		
		// 부기맨의 동료생성 쓰레드
		부기맨1동료 = new Boogieman(boogie5);
		부기맨1동료생성 = new Thread(부기맨1동료);
		부기맨1동료생성.start();
		
		// 부기맨의 동료생성 쓰레드
		부기맨2동료 = new Boogieman(boogie55);
		부기맨2동료생성 = new Thread(부기맨2동료);
		부기맨2동료생성.start();
		
		// 부기맨의 동료생성 쓰레드
		부기맨3동료 = new Boogieman(boogie555);
		부기맨3동료생성 = new Thread(부기맨3동료);
		부기맨3동료생성.start();
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////////
		//격투신 생성

		while(boogie5.life || boogie55.life || boogie555.life){
			//회피미션 발생
			if(boogie5.Frend > 1 && boogie5.Frend % 3 == 0 || boogie55.Frend > 1 && boogie55.Frend % 3 == 0 || boogie555.Frend > 1 && boogie555.Frend % 3 == 0) {	//부기맨의 동료가 3배수일때 미션발생
				미션타임++;
				if (미션타임 >= 8) {				//적어도 동료 쏴죽일때까지 횟수채우는 조건
					Attack_Stop = true;
					미션타임 = 0;
					easyQ1 = new EasyQuest();	//이지 퀘스트 러너블생성
					easyQ_1 = new Thread(easyQ1);	//이지 퀘스트 쓰레드생성
					easyQ_1.start(); 			//이지퀘스트 모션실행
					easyQ_1.join(); 			//끝날때까지 기다리기
					EasyQuest easy = new EasyQuest();
					char Answer[] = easy.mission();			//문제 만들면서 답안지 담아주고
					회피미션 = text.next();						//플레이어가 적어준답을
					while(회피미션.equals("q")) {
						System.out.println("wsad만 입력하세요");
						회피미션 = text.next();
					}
					if(회피미션.length() == 6) {					//주어진 문제 길이 에 맞추는지 판단후(에러 방지)
						char[] chr = 회피미션.toCharArray();
						easy.mission(wick, chr, Answer);	//답을 확인하는 미션
						wick.Hitme(0);
						Attack_Stop = false;
					}
					else {
						System.out.println("공격을 피하지 못하였습니다\n치명적 상처를 얻었습니다");
						wick.Hitme(20);						//미션 강도에 따른 데미지 직접 전달
						Attack_Stop = false;
					}
				}
			}
			txt = text.next();			//입력
			//action.Think(txt);
			switch(txt) {				
			case "q": 					//총발사			
				while(true) {
					Random random = new Random(); 		//랜덤으로 맞기
					int num = random.nextInt(3);		//0,1 난수 발생
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
			case "e": 					//현재상태 확인하기
				stage.Mylife(wick);
				break;
			case "f": 					//총바꾸기
				wick.Change(wick);
				break;
			}
		}
		m_fight5.cancel();				//전투1 자동공격 중지
		wick.Money = wick.Money + boogie5.Money + boogie55.Money + boogie555.Money;	//부기맨 죽였으니 보상획득
		Music.close();
		///////////////////////////////////////////////////////////////////////////////////////////////////////////
		//콘티넨탈 호텔갈거냐?
		Music = new Music("호텔소리.mp3", true);
		Music.start();
		stage.rest(wick.HP);
		do{								//실수로 q 누름 방지 루프
			flag = 1;
			try{
				numscan = 0;
				numscan = num_scan.nextInt();		//호텔가는지 입력
			}
			catch(InputMismatchException e){
				flag=0;
				num_scan = new Scanner(System.in);
				System.out.println("숫자를 입력하세요");
			}

		}while(flag==0);


		if(numscan == 1) {
			while(true) {
				if(numscan == 1) {					//호텔간다면
					Hotel hotel = new Hotel(wick);		//호텔인사말 등장
					numscan = num_scan.nextInt();	//
					if(numscan == 1) {				//치료를 선택하면
						hotel.Hill(wick);			//HP 회복
					}
					else if(numscan == 2) {			//총알을 선택하면
						hotel.bullet(wick);
						numscan = num_scan.nextInt();
						hotel.bullet(wick, numscan);//선택한 총알 충전
						numscan = 1;				//다시 호텔메뉴
					}
					else if(numscan == 3){
						boolean pass = true;
						int 계속 = 0;
						while(pass) {
							//게임설명
							pass = hotel.holjjack(wick, 1, 0, 0);
							배팅금화 = num_scan.nextInt();		//배팅금화입력
							//배팅금액설정
							pass = hotel.holjjack(wick, 2, 배팅금화, 0);
							if(pass == false) {				//중간에 금화가 부족하면 break
								break;
							}
							System.out.println("1. 홀수     2. 짝수\n(선택하시면 바로 게임이 진행됩니다)");
							holljack = num_scan.nextInt();	//홀짝
							hotel = new Hotel();			//주사위 굴리기 반복위한 재생성
							hotel.start();					//주사위굴리기 팝업

							try {							//주사위 던저질때까지 기다리기
								hotel.join();
							} catch (InterruptedException e) {
								e.printStackTrace();
							}


							if(holljack == 1) {
								pass = hotel.holjjack(wick, 3, 배팅금화, 1);
								계속 = num_scan.nextInt();	
								if(계속 == 1) {
									pass = true;
								}
								else {
									pass = false;
								}
							}
							else {
								pass = hotel.holjjack(wick, 3, 배팅금화, 0);
								계속 = num_scan.nextInt();
								if(계속 == 1) {
									pass = true;
								}
								else {
									pass = false;
								}
							}
						}
						numscan = 1;				//다시 호텔메뉴
					}
					else if(numscan == 4){
						System.out.println("호텔에서 나왔습니다");
						break;
					}
				}
			}
		}

		Music.close();
		Music = new Music("존윅배경음악1.mp3", true);
		Music.start();





		//////////////////////////////////////////////////////////////////////////////
		//상황6 금고보관소에 처들어감
		wick.Gun = 1;
		//testtest
		//1 부기맨침입//2 전투준비//3 자동차도망//4 자동차잡음//5 폭파성공//6 강아지선택
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
		
		stage.stage2("금고보관소", wick);				
		passkey = text.next();			//약간의 텀
		Music.close();
		//격투 시작
		Boogieman boogie6 = new Boogieman();
		Boogieman boogie66 = new Boogieman(2);
		MiddleBoss middle6 = new MiddleBoss();
		Music = new Music("전투음악1.mp3", true);
		Music.start();
		로딩 = new Stage();
		로딩_t = new Thread(로딩);
		로딩_t.start();
		//전투준비
		r_gif = new IMAGE(2);
		gif = new Thread(r_gif);
		gif.start();
		로딩_t.join();
		///////////////////////////////////////////////////////////////////////////////////////////////////////////
		//적 자동 공격
		AttackTime = 100;
		Timer m_fight6 = new Timer();
		TimerTask t_fight6 = new TimerTask() {
			public void run() {
				if(Attack_Stop == false) {		//다른 미션 나타났을때 잠시 멈춤조건
					if(boogie6.life(boogie6) == false && boogie66.life(boogie66) == false && middle6.life(middle6) == false) {
						m_fight6.cancel();
					}
					if(wick.HP > 0) {
						System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
						boogie6.Shot(wick, boogie6);						//부기맨의 공격
						boogie66.Shot(wick, boogie66);					//부기맨의 공격
						middle6.Shot(wick, middle6);	
						//부기맨의 공격
						wick.Hitme(0);							//존윅 공격
						stage.frendcheck(boogie6, boogie66, middle6);	//남은 적수 체크
						//mi.Skill_Stun(wick, 0, middle6);		//중간보스스턴스킬
					}
					else {
						m_fight6.cancel();
						System.out.println("윅죽음");
					}
					AttackTime--;
					System.out.println("\n");
					if(boogie6.life(boogie6) == false) {
						boogie6.Frend = -1;}
					if(boogie66.life(boogie66) == false) {
						boogie66.Frend = -1;}
					if(middle6.life(middle6) == false) {
						middle6.Frend = -1;}
					stage.Mylife(wick, boogie6.Frend + 1+boogie66.Frend + 1+middle6.Frend + 1);			//전투중 지속적으로 체력확인
				}
			}
		};

		m_fight6.schedule(t_fight6, 100, 1000);

		
		// 부기맨의 동료생성 쓰레드
		부기맨1동료 = new Boogieman(boogie6);
		부기맨1동료생성 = new Thread(부기맨1동료);
		부기맨1동료생성.start();
		
		// 부기맨의 동료생성 쓰레드
		부기맨2동료 = new Boogieman(boogie66);
		부기맨2동료생성 = new Thread(부기맨2동료);
		부기맨2동료생성.start();
		
		// 부기맨의 동료생성 쓰레드
		중간보스동료 = new Boogieman(middle6);
		중간보스동료생성 = new Thread(중간보스동료);
		중간보스동료생성.start();
		
		// 중간보스 스킬
		중간보스스킬 = new MiddleBoss(middle6, wick, 2);
		중간보스스킬발동 = new Thread(중간보스스킬);
		중간보스스킬발동.start();
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////////
		//격투신 생성

		while(boogie6.life || boogie66.life || middle6.life){
			//회피미션 발생
			if(boogie6.Frend > 1 && boogie6.Frend % 3 == 0 || boogie66.Frend > 1 && boogie66.Frend % 3 == 0 || middle6.Frend > 1 && middle6.Frend % 3 == 0) {	//부기맨의 동료가 3배수일때 미션발생
				미션타임++;
				if (미션타임 >= 8) {				//적어도 동료 쏴죽일때까지 횟수채우는 조건
					Attack_Stop = true;
					미션타임 = 0;
					easyQ1 = new EasyQuest();	//이지 퀘스트 러너블생성
					easyQ_1 = new Thread(easyQ1);	//이지 퀘스트 쓰레드생성
					easyQ_1.start(); 			//이지퀘스트 모션실행
					easyQ_1.join(); 			//끝날때까지 기다리기
					EasyQuest easy = new EasyQuest();
					char Answer[] = easy.mission();			//문제 만들면서 답안지 담아주고
					회피미션 = text.next();						//플레이어가 적어준답을
					while(회피미션.equals("q")) {
						System.out.println("wsad만 입력하세요");
						회피미션 = text.next();
					}
					if(회피미션.length() == 6) {					//주어진 문제 길이 에 맞추는지 판단후(에러 방지)
						char[] chr = 회피미션.toCharArray();
						easy.mission(wick, chr, Answer);	//답을 확인하는 미션
						wick.Hitme(0);
						Attack_Stop = false;
					}
					else {
						System.out.println("공격을 피하지 못하였습니다\n치명적 상처를 얻었습니다");
						wick.Hitme(20);						//미션 강도에 따른 데미지 직접 전달
						Attack_Stop = false;
					}
				}
			}
			txt = text.next();			//입력
			//action.Think(txt);
			switch(txt) {				
			case "q": 					//총발사			
				while(true) {
					Random random = new Random(); 		//랜덤으로 맞기
					int num = random.nextInt(3);		//0,1 난수 발생
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
			case "e": 					//현재상태 확인하기
				stage.Mylife(wick);
				break;
			case "f": 					//총바꾸기
				wick.Change(wick);
				break;
			}
		}
		m_fight6.cancel();				//전투1 자동공격 중지
		wick.Money = wick.Money + boogie6.Money + boogie66.Money + middle6.Money;	//부기맨 죽였으니 보상획득
		
		////////////////////////////////////////////
		//폭탄퀘스트 발생
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
		System.out.println("<Mission> 마피아조직의 중요 금고가 있는 건물을 파괴하세요");
		
		Runnable r_Bomb = new NomalQuest();
		Thread t_Bomb = new Thread(r_Bomb);
		t_Bomb.start();
		
		//t_Bomb.join();		//미션완수때까지 기다려주기
		////////////////////////////////////////////
		
		passkey = text.next();
		while(passkey.equals("q")) {
			passkey = text.next();
		}
		
		Music.close();
		///////////////////////////////////////////////////////////////////////////////////////////////////////////
		//콘티넨탈 호텔갈거냐?
		Music = new Music("호텔소리.mp3", true);
		Music.start();
		stage.rest(wick.HP);
		do{								//실수로 q 누름 방지 루프
			flag = 1;
			try{
				numscan = 0;
				numscan = num_scan.nextInt();		//호텔가는지 입력
			}
			catch(InputMismatchException e){
				flag=0;
				num_scan = new Scanner(System.in);
				System.out.println("숫자를 입력하세요");
			}

		}while(flag==0);


		if(numscan == 1) {
			while(true) {
				if(numscan == 1) {					//호텔간다면
					Hotel hotel = new Hotel(wick);		//호텔인사말 등장
					numscan = num_scan.nextInt();	//
					if(numscan == 1) {				//치료를 선택하면
						hotel.Hill(wick);			//HP 회복
					}
					else if(numscan == 2) {			//총알을 선택하면
						hotel.bullet(wick);
						numscan = num_scan.nextInt();
						hotel.bullet(wick, numscan);//선택한 총알 충전
						numscan = 1;				//다시 호텔메뉴
					}
					else if(numscan == 3){
						boolean pass = true;
						int 계속 = 0;
						while(pass) {
							//게임설명
							pass = hotel.holjjack(wick, 1, 0, 0);
							배팅금화 = num_scan.nextInt();		//배팅금화입력
							//배팅금액설정
							pass = hotel.holjjack(wick, 2, 배팅금화, 0);
							if(pass == false) {				//중간에 금화가 부족하면 break
								break;
							}
							System.out.println("1. 홀수     2. 짝수\n(선택하시면 바로 게임이 진행됩니다)");
							holljack = num_scan.nextInt();	//홀짝
							hotel = new Hotel();			//주사위 굴리기 반복위한 재생성
							hotel.start();					//주사위굴리기 팝업

							try {							//주사위 던저질때까지 기다리기
								hotel.join();
							} catch (InterruptedException e) {
								e.printStackTrace();
							}


							if(holljack == 1) {
								pass = hotel.holjjack(wick, 3, 배팅금화, 1);
								계속 = num_scan.nextInt();	
								if(계속 == 1) {
									pass = true;
								}
								else {
									pass = false;
								}
							}
							else {
								pass = hotel.holjjack(wick, 3, 배팅금화, 0);
								계속 = num_scan.nextInt();
								if(계속 == 1) {
									pass = true;
								}
								else {
									pass = false;
								}
							}
						}
						numscan = 1;				//다시 호텔메뉴
					}
					else if(numscan == 4){
						System.out.println("호텔에서 나왔습니다");
						break;
					}
				}
			}
		}

		Music.close();
		Music = new Music("존윅배경음악1.mp3", true);
		Music.start();
		
		
		
		
		
		

		//////////////////////////////////////////////////////////////////////////////
		//상황7 보스 주거지에 처들어감
		wick.Gun = 1;

		stage.stage2("보스 주거지", wick);				
		passkey = text.next();			//약간의 텀
		Music.close();
		//격투 시작
		Boogieman boogie7 = new Boogieman();
		Boogieman boogie77 = new Boogieman(2);
		MiddleBoss middle7 = new MiddleBoss(2);
		Music = new Music("전투음악1.mp3", true);
		Music.start();
		로딩 = new Stage();
		로딩_t = new Thread(로딩);
		로딩_t.start();
		//전투준비
		r_gif = new IMAGE(2);
		gif = new Thread(r_gif);
		gif.start();
		로딩_t.join();
		///////////////////////////////////////////////////////////////////////////////////////////////////////////
		//적 자동 공격
		AttackTime = 100;
		Timer m_fight7 = new Timer();
		TimerTask t_fight7 = new TimerTask() {
			public void run() {
				if(Attack_Stop == false) {		//다른 미션 나타났을때 잠시 멈춤조건
					if(boogie7.life(boogie7) == false && boogie77.life(boogie77) == false && middle7.life(middle7) == false) {
						m_fight7.cancel();
					}
					if(wick.HP > 0) {
						System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
						boogie7.Shot(wick, boogie7);						//부기맨의 공격
						boogie77.Shot(wick, boogie77);					//부기맨의 공격
						middle7.Shot(wick, middle7);						//부기맨의 공격
						wick.Hitme(0);							//존윅 공격
						stage.frendcheck(boogie7, boogie77, middle7);	//남은 적수 체크
						//mi.Skill_Stun(wick, 2, middle7);		//중간보스스턴스킬
					}
					else {
						m_fight7.cancel();
						System.out.println("윅죽음");
					}
					AttackTime--;
					System.out.println("\n");
					if(boogie7.life(boogie7) == false) {
						boogie7.Frend = -1;}
					if(boogie77.life(boogie77) == false) {
						boogie77.Frend = -1;}
					if(middle7.life(middle7) == false) {
						middle7.Frend = -1;}
					stage.Mylife(wick, boogie7.Frend + 1 + boogie77.Frend + 1 + middle7.Frend + 1);			//전투중 지속적으로 체력확인
				}
			}
		};

		m_fight7.schedule(t_fight7, 100, 1000);

		
		// 부기맨의 동료생성 쓰레드
		부기맨1동료 = new Boogieman(boogie7);
		부기맨1동료생성 = new Thread(부기맨1동료);
		부기맨1동료생성.start();
		
		// 부기맨의 동료생성 쓰레드
		부기맨2동료 = new Boogieman(boogie77);
		부기맨2동료생성 = new Thread(부기맨2동료);
		부기맨2동료생성.start();
		
		// 부기맨의 동료생성 쓰레드
		중간보스동료 = new Boogieman(middle7);
		중간보스동료생성 = new Thread(중간보스동료);
		중간보스동료생성.start();
		
		// 중간보스 스킬
		중간보스스킬 = new MiddleBoss(middle7, wick, 5);
		중간보스스킬발동 = new Thread(중간보스스킬);
		중간보스스킬발동.start();
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////////
		//격투신 생성

		while(boogie7.life || boogie77.life || middle7.life){
			//회피미션 발생
			if(boogie7.Frend > 1 && boogie7.Frend % 3 == 0 || boogie77.Frend > 1 && boogie77.Frend % 3 == 0 || middle7.Frend > 1 && middle7.Frend % 3 == 0) {	//부기맨의 동료가 3배수일때 미션발생
				미션타임++;
				if (미션타임 >= 8) {				//적어도 동료 쏴죽일때까지 횟수채우는 조건
					Attack_Stop = true;
					미션타임 = 0;
					easyQ1 = new EasyQuest();	//이지 퀘스트 러너블생성
					easyQ_1 = new Thread(easyQ1);	//이지 퀘스트 쓰레드생성
					easyQ_1.start(); 			//이지퀘스트 모션실행
					easyQ_1.join(); 			//끝날때까지 기다리기
					EasyQuest easy = new EasyQuest();
					char Answer[] = easy.mission();			//문제 만들면서 답안지 담아주고
					회피미션 = text.next();						//플레이어가 적어준답을
					while(회피미션.equals("q")) {
						System.out.println("wsad만 입력하세요");
						회피미션 = text.next();
					}
					if(회피미션.length() == 6) {					//주어진 문제 길이 에 맞추는지 판단후(에러 방지)
						char[] chr = 회피미션.toCharArray();
						easy.mission(wick, chr, Answer);	//답을 확인하는 미션
						wick.Hitme(0);
						Attack_Stop = false;
					}
					else {
						System.out.println("공격을 피하지 못하였습니다\n치명적 상처를 얻었습니다");
						wick.Hitme(20);						//미션 강도에 따른 데미지 직접 전달
						Attack_Stop = false;
					}
				}
			}
			txt = text.next();			//입력
			//action.Think(txt);
			switch(txt) {				
			case "q": 					//총발사			
				while(true) {
					Random random = new Random(); 		//랜덤으로 맞기
					int num = random.nextInt(3);		//0,1 난수 발생
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
			case "e": 					//현재상태 확인하기
				stage.Mylife(wick);
				break;
			case "f": 					//총바꾸기
				wick.Change(wick);
				break;
			}
		}
		m_fight7.cancel();				//전투1 자동공격 중지
		wick.Money = wick.Money + boogie7.Money + boogie77.Money + middle7.Money;	//부기맨 죽였으니 보상획득
		
		////////////////////////////////////////////
		
		//추격미션발생
		r_gif = new IMAGE(3);
		gif = new Thread(r_gif);
		gif.start();
		gif.join();
		
		Runnable r_추격 = new HardQuest();
		Thread 추격 = new Thread(r_추격);
		추격.start();
		
		char c;
		text = new Scanner(System.in);
		HardQuest hard = new HardQuest();
		while(hard.continu) {
			c = text.next().charAt(0);
			hard = new HardQuest(c);
		}
		
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n추격성공");
		
		//추격성공시
		r_gif = new IMAGE(4);
		gif = new Thread(r_gif);
		gif.start();
		gif.join();
		////////////////////////////////////////////
		
		
		Music.close();


		////////////////////////////////////////////////////////////////////////////////////////////////////
		

		
		Music = new Music("보스음악.mp3", true);
		Music.start();
		Boss Boss = new Boss(wick);
		passkey = text.next();			//약간의 텀
		
		Runnable boss = new Boss(wick, Boss);
		Thread lastfight = new Thread(boss);
		lastfight.start();
		
		
		wick.Gun = 4;					//주먹으로 싸우기
		
		while(bossfight){
			txt = text.next();			//입력
			switch(txt) {				
			case "q": 					//총발사		
				wick.Shot(wick, Boss);
				break;
			case "f": 					//총바꾸기
				System.out.println("(무기없이 싸우자!)");
				break;
			}
		}
		wick.Gun = 1;
		while(bossrun){
			txt = text.next();			//입력
			switch(txt) {				
			case "q": 					//총발사		
				wick.Shot(wick, Boss);
				break;
			case "f": 					//총바꾸기
				wick.Change(wick);
				break;
			}
		}
		
		if(Action.win) {
			try {
				lastfight.interrupt();
			} catch (Exception e) {
				System.out.println("미션 complete");
			}
		}
		
		
		
		
		
		lastfight.join();
		
		Music.close();
		Music = new Music("존윅배경음악1.mp3", true);
		Music.start();
		
		
		
		
		
		
		
		
		
		
		
		
		//강아지 맞이하기
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
		System.out.println("승리했습니다!");
		System.out.println("종료하시겠습니까?\n 1. Yes");
		//passkey = text.next();
		
		
		
		while(true) {
			try {
				numscan = num_scan.nextInt();					//스캐너 활성화
				break;
			} catch (Exception e) {
				num_scan = new Scanner(System.in);
				System.out.println("1 을 입력하세요");
			}
		}
		Music.close();
		System.exit(0);
		
		



	}

}
