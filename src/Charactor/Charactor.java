package Charactor;

public class Charactor {
	//멤버변수
	String name;
	public int HP = 0;				//체력
	public int Money = 0;			//소지금화
	public int Gun = 0;			//소지중인 총 0.없음, 1.권총, 2.기관총, 3.저격총
	public int Power = 0;
	
	String blank = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";
	//생성자 만들어주고
	public Charactor(){
		//System.out.println(HP);
	}
	//메소드
//	public int Shot(){		//총쏘는 행위
//		int damage = 0;
//		
//		switch(Gun){		//소지하고 있는 총의 종류에 따라 데미지값이 달라짐
//        case 1 : 
//            damage = 5; 
//            break;
//        case 2 : 
//        	damage = 10; 
//            break;
//        case 3 : 
//        	damage = 100; 
//            break;
//		}
//		
//		return damage;		//데미지 반환
//	}
	public void Hitme(int damage) {
		HP = HP - damage;
		if(HP <= 0) {
			if(name == "존윅") {
				System.out.println("\n\n        :$@@@*,                              ");
				System.out.println("      .@@@@@@@@;                            ");
				System.out.println("     $@@@@@@@@@@@@@@@@@@@@@@@@@@:           ");
				System.out.println("     -@@@@@@@@@@@@@@@@@@@@@@@@@@:           ");
				System.out.println("      :@@@@@@@@#;;#@@@;;;;;;;#@@:           ");
				System.out.println("       ,#@@@@@*   =@@@       *@@:           ");
				System.out.println("                  =@@@       *@@:           ");
				System.out.println("                  =@@@       *@@@@@@@@@@@   ");
				System.out.println("\n\n\n ##  ##    ####    ##  ##            ####     ######   ######              ##    \r\n" + 
						" ##  ##   ##  ##   ##  ##            ## ##      ##     ##                  ##    \r\n" + 
						"  ####    ##  ##   ##  ##            ##  ##     ##     #####               ##    \r\n" + 
						"   ##     ##  ##   ##  ##            ##  ##     ##     ##                  ##    \r\n" + 
						"   ##     ##  ##   ##  ##            ## ##      ##     ##                        \r\n" + 
						"   ##      ####    ######            ####     ######   ######              ##    \r\n" + 
						"");
				System.out.println("\n존윅이 죽었습니다\n복수를 완료하지 못했습니다");
				System.exit(0);
			}
			else if(name == "마피아두목") {
				System.out.println("최종 보스를 죽였습니다!!!");
				System.exit(0);
			}
			else {
				System.out.println(name+"이 죽었습니다");
			}
		}
		
	}

}
