package QuestMission;

import Main.Action;

public class HardQuest extends NomalQuest implements Runnable{
	{
		this.QuestLevel = 3;
	}
	
	
	
	 
			int a ;
			String John = "$";
			String man = "M";
			char empty = ' ';
			char wall = '■';
			int onekan = 1;
			char[][] map = new char[18][43];	//맵만들기
			//String[][] map2 = new String[18][43];	//맵만들기
			char check;
			int onetime = 0;
			boolean life = true;
			public boolean continu = true;
			public HardQuest() {

			}

			public HardQuest(char c4) {
				
				onetime = 0;
				switch(c4) {
				case 'r':{
					Action.map2[1][2] = "$";
				}
				case 'w':{

					for (int i = 0; i < 8; i++) {
						for (int j = 0; j < 83; j++) {
							c = Action.map2[i][j];
							if (c.equals("$")) {
								c2 = Action.map2[i-1][j];	
								if(onetime == 0) {
									//if (!c2.equals("■") || !c2.equals("M")) {
									if (c2.equals(" ")) {	

										Action.map2[i-1][j] = John;				
										Action.map2[i][j] = " ";
										onetime++;
									}
								}
							}

						}
					}
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					for (int i = 0; i < 8; i++) {
						for (int j = 0; j < 83; j++) {
							System.out.print(Action.map2[i][j]);		//출력하기
						}
						System.out.println();					//줄바꿈
					}
					System.out.println("w:위, s:아래, a:왼쪽, d:오른쪽     GG까지 도착하세요!");

				}
				case 's':{

					for (int i = 0; i < 8; i++) {
						for (int j = 0; j < 83; j++) {
							c = Action.map2[i][j];
							if (c.equals("$")) {
								c2 = Action.map2[i+1][j];
								if(onetime == 0) {
									if (c2.equals(" ")) {
										Action.map2[i+1][j] = John;
										Action.map2[i][j] = " ";
										onetime++;
									}
								}
								//System.out.print(map2[i][j]);		//출력하기
							}

							//System.out.println();					//줄바꿈
						}
					}
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					for (int i = 0; i < 8; i++) {
						for (int j = 0; j < 83; j++) {
							System.out.print(Action.map2[i][j]);		//출력하기
						}
						System.out.println();					//줄바꿈
					}
					System.out.println("w:위, s:아래, a:왼쪽, d:오른쪽     GG까지 도착하세요!");
				}		

				case 'a':{
					for (int i = 0; i < 8; i++) {
						for (int j = 0; j < 83; j++) {
							c = Action.map2[i][j];
							if (c.equals("$")) {
								c2 = Action.map2[i][j-1];
								if(onetime == 0) {
									if (c2.equals(" ")) {
										Action.map2[i][j-1] = John;
										Action.map2[i][j] = " ";
										onetime++;
									}
									else if(c2.equals("G")) {
										Action.continu = false;
										continu = false;
									}
								}
								//System.out.print(map2[i][j]);		//출력하기
							}

							//System.out.println();					//줄바꿈
						}
					}
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					for (int i = 0; i < 8; i++) {
						for (int j = 0; j < 83; j++) {
							System.out.print(Action.map2[i][j]);		//출력하기
						}
						System.out.println();					//줄바꿈
					}
					System.out.println("w:위, s:아래, a:왼쪽, d:오른쪽     GG까지 도착하세요!");
				}			
				case 'd':{

					for (int i = 0; i < 8; i++) {
						for (int j = 0; j < 83; j++) {
							c = Action.map2[i][j];
							if (c.equals("$")) {
								c2 = Action.map2[i][j+1];
								if(onetime == 0) {
									if (c2.equals(" ")) {
										Action.map2[i][j+1] = John;
										Action.map2[i][j] = " ";
										onetime++;
									}
								}
								//System.out.print(map2[i][j]);		//출력하기
							}

							//System.out.println();					//줄바꿈
						}
					}
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					for (int i = 0; i < 8; i++) {
						for (int j = 0; j < 83; j++) {
							System.out.print(Action.map2[i][j]);		//출력하기
						}
						System.out.println();					//줄바꿈
					}
					System.out.println("w:위, s:아래, a:왼쪽, d:오른쪽     GG까지 도착하세요!");
				}
				}






			}








			public void map(){




				String[] strmap = new String[18];

				strmap[0] = "■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■";
				strmap[1] = "■  $   ■■■■■■■■■■■■■■■■■■■                ■";
				strmap[2] = "■      ■■■■■■■■■■■■■■■■■■■      ■■■■      ■";
				strmap[3] = "■■■■■    ■■■■■■■■■■■■■■■■■        ■■      ■";
				strmap[4] = "■         ■■■                     ■■      ■";
				strmap[5] = "■        /■■■                     ■■      ■";
				strmap[6] = "■          ■■                     ■■      ■";
				strmap[7] = "■M     M  /■■    ■■■■■■■■■■■■■■■■■■■      ■";
				strmap[8] = "■M     M   ■■    ■■■■■■■■■■■■■■■■■■■      ■";
				strmap[9] = "■M     M   ■■    ■■■■■■■■■■■■■■■■■■■      ■";
				strmap[10] ="■M     M   ■■                     ■■■     ■";
				strmap[11] ="■M     M   ■■                     ■■■■    ■";
				strmap[12] ="■M     M   ■■■■■■■■■■■■■■■■       ■■■■    ■";
				strmap[13] ="■M     M   ■■■■■■■■■■■■■■■■       ■■■■    ■";
				strmap[14] ="■M     M   ■■■■■■■■■■■■■■■■       ■■■■    ■";
				strmap[15] ="■                                 ■■■■■GGG■";
				strmap[16] ="■                                 ■■■■■GGG■";
				strmap[17] ="■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■";

				String[] strmap2 = new String[8];

				strmap2[0] = "■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■";
				strmap2[1] = "■ $ ■■          ← ■■           ← ■■             ← ■■            ← ■■            ← ■";
				strmap2[2] = "■   ■■          ← ■■           ← ■■             ← ■■            ← ■■            ← ■";
				strmap2[3] = "■   ■■          ← ■■           ← ■■             ← ■■            ← ■■            ← ■";
				strmap2[4] = "■        ←   ■■          ← ■■           ← ■■            ← ■■             ← ■■     ■";
				strmap2[5] = "■        ←   ■■          ← ■■           ← ■■            ← ■■             ← ■■     ■";
				strmap2[6] = "■        ←   ■■          ← ■■           ← ■■            ← ■■             ← ■■GGGGG■";
				strmap2[7] = "■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■";


				String[] strmap3 = new String[8];

				strmap3[0] = "■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■";
				strmap3[1] = "■GG    ■     ■       ■     ■     ■          ■           ■         ■             $ ■";
				strmap3[2] = "■GG      ■ ■       ■   ■      ■       ■            ■         ■                    ■";
				strmap3[3] = "■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■";
				strmap3[4] = "■GG                                                                   ****        ■";
				strmap3[5] = "■GG                                                                 ********      ■";
				strmap3[6] = "■GG                                                                   *  *        ■";
				strmap3[7] = "■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■";








				String change = new String();

				for (int i = 0; i < strmap3.length; i++) {
					String[] array_word = strmap3[i].split("");
					for (int j = 0; j < 83; j++) {
						Action.map2[i][j] = array_word[j];

					}
				}

			}

			String x = new String();
			String man1 = "*";
			String wal = "■";
			String c, c2, c3;
			int count = 0;


			@Override
			public void run() {
				
				do{
					
					map();
					while(count < 65 && Action.continu) {

						for (int i = 0; i < 8; i++) {
							for (int j = 0; j < 83; j++) {
								c = Action.map2[i][j];
								if (c.equals(man1)) {

									c2 = Action.map2[i][j+onekan];
									c3 = Action.map2[i][j-onekan];
									Action.map2[i][j] = " ";//Action.map2[i][j+onekan];
									Action.map2[i][j-onekan] = "*";
								}
							}
						}
						System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
						for (int i = 0; i < 8; i++) {
							for (int j = 0; j < 83; j++) {
								System.out.print(Action.map2[i][j]);		//출력하기
							}
							System.out.println();					//줄바꿈
						}
						System.out.println("w:위, s:아래, a:왼쪽, d:오른쪽     GG까지 도착하세요!");
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						count++;
						//System.out.println(count);
					}
				}while(Action.continu);
			}




		}
