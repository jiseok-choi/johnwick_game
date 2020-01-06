package Main;

import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class IMAGE implements Runnable {
	
	int playlist = 0;
	
	public IMAGE(int num) {
		this.playlist = num;
	}
	
	@Override
	public void run() {
		try {
			
		
		switch(playlist) {
		case 1:
			부기맨침입();
			break;
		case 2:
			전투준비();
			break;
		case 3:
			System.out.println("\n\n\n\n\n\n\n\n\n보스가 자동차를 타도 도망간다 추격하자!");
			Thread.sleep(1000);
			System.out.println("\n\n\n\n\n\n\n\n\n3");
			Thread.sleep(1000);
			System.out.println("\n\n\n\n\n\n\n\n\n2");
			Thread.sleep(1000);
			System.out.println("\n\n\n\n\n\n\n\n\n1");
			Thread.sleep(1000);
			System.out.println("\n\n\n\n\n\n\n\n\nGo!!!");
			Thread.sleep(500);
			자동차도망();
			break;
		case 4:
			자동차잡음();
			break;
		case 5:
			폭파성공();
			break;
		case 6:
			강아지선택();
			break;
		case 7:
			복수의시작();
			break;
		}
		
		} catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	//1 부기맨침입
	//2 전투준비
	//3 자동차도망
	//4 자동차잡음
	//5 폭파성공
	//6 강아지선택
	
	public void 부기맨침입() throws InterruptedException {
		JFrame frame = new JFrame("부기맨침입");	//프레임사용한다하고
		
		ImageIcon 부기맨 = new ImageIcon(".\\이미지\\gif\\부기맨침입.gif");
		Image 부기맨침입 = 부기맨.getImage();
		
		JLabel jlabel = new JLabel();
		jlabel.setIcon(new ImageIcon(부기맨침입)); //라벨에다 담는게 답이다..
		
		frame.add(jlabel);
		frame.setSize(600, 270);
		frame.setLocationRelativeTo(null); //null 값을 입력하면 가운데에 출력한다

		frame.setVisible(true);//보여주게 하기 메서드
		frame.setAlwaysOnTop(true);//jframe 최상단 위치 메서드
		
		Thread.sleep(6000);
		frame.setVisible(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void 전투준비() throws InterruptedException {
		JFrame frame = new JFrame("전투준비");	//프레임사용한다하고
		
		ImageIcon 강아지 = new ImageIcon(".\\이미지\\gif\\전투준비.gif");
		Image 강아지선택 = 강아지.getImage();
		
		JLabel jlabel = new JLabel();
		jlabel.setIcon(new ImageIcon(강아지선택)); //라벨에다 담는게 답이다..
		
		frame.add(jlabel);
		frame.setSize(600, 270);
		frame.setLocationRelativeTo(null); //null 값을 입력하면 가운데에 출력한다

		frame.setVisible(true);//보여주게 하기 메서드
		frame.setAlwaysOnTop(true);//jframe 최상단 위치 메서드
		
		Thread.sleep(5000);
		frame.setVisible(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void 자동차도망() throws InterruptedException {
		JFrame frame = new JFrame("자동차도망");	//프레임사용한다하고
		
		ImageIcon 도망 = new ImageIcon(".\\이미지\\gif\\자동차도망.gif");
		Image 자동차도망 = 도망.getImage();
		
		JLabel jlabel = new JLabel();
		jlabel.setIcon(new ImageIcon(자동차도망)); //라벨에다 담는게 답이다..
		
		frame.add(jlabel);
		frame.setSize(600, 270);
		frame.setLocationRelativeTo(null); //null 값을 입력하면 가운데에 출력한다

		frame.setVisible(true);//보여주게 하기 메서드
		frame.setAlwaysOnTop(true);//jframe 최상단 위치 메서드
		
		Thread.sleep(5000);
		frame.setVisible(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void 자동차잡음() throws InterruptedException {
		JFrame frame = new JFrame("자동차잡음");	//프레임사용한다하고
		
		ImageIcon 자동차 = new ImageIcon(".\\이미지\\gif\\자동차잡음.gif");
		Image 자동차잡음 = 자동차.getImage();
		
		JLabel jlabel = new JLabel();
		jlabel.setIcon(new ImageIcon(자동차잡음)); //라벨에다 담는게 답이다..
		JPanel panel = new JPanel();
		
		frame.add(jlabel);
		frame.setSize(600, 270);
		frame.setLocationRelativeTo(null); //null 값을 입력하면 가운데에 출력한다

		frame.setVisible(true);//보여주게 하기 메서드
		frame.setAlwaysOnTop(true);//jframe 최상단 위치 메서드
		
		Thread.sleep(13000);
		frame.setVisible(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void 폭파성공() throws InterruptedException {
		JFrame frame = new JFrame("폭파성공");	//프레임사용한다하고
		
		ImageIcon 폭파 = new ImageIcon(".\\이미지\\gif\\폭파성공.gif");
		Image 폭파성공 = 폭파.getImage();
		
		JLabel jlabel = new JLabel();
		jlabel.setIcon(new ImageIcon(폭파성공)); //라벨에다 담는게 답이다..
		
		frame.add(jlabel);
		frame.setSize(600, 270);
		frame.setLocationRelativeTo(null); //null 값을 입력하면 가운데에 출력한다

		frame.setVisible(true);//보여주게 하기 메서드
		frame.setAlwaysOnTop(true);//jframe 최상단 위치 메서드
		
		Thread.sleep(8000);
		frame.setVisible(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void 강아지선택() throws InterruptedException {
		JFrame frame = new JFrame("강아지 선택");	//프레임사용한다하고
		
		ImageIcon 강아지 = new ImageIcon(".\\이미지\\gif\\강아지선택.gif");
		Image 강아지선택 = 강아지.getImage();
		
		JLabel jlabel = new JLabel();
		jlabel.setIcon(new ImageIcon(강아지선택)); //라벨에다 담는게 답이다..
		
		frame.add(jlabel);
		frame.setSize(600, 270);
		frame.setLocationRelativeTo(null); //null 값을 입력하면 가운데에 출력한다

		frame.setVisible(true);//보여주게 하기 메서드
		frame.setAlwaysOnTop(true);//jframe 최상단 위치 메서드
		
		Thread.sleep(29000);
		frame.setVisible(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void 폭파성공2() {
		JFrame frame = new JFrame("폭파성공");	//프레임사용한다하고
		
		ImageIcon 폭파 = new ImageIcon("C:\\Users\\chjs9\\폭파성공.gif");
		Image 폭파성공 = 폭파.getImage();
		
		JLabel jlabel = new JLabel();
		jlabel.setIcon(new ImageIcon(폭파성공)); //라벨에다 담는게 답이다..
		
		frame.add(jlabel);
		frame.setSize(600, 270);
		frame.setLocationRelativeTo(null); //null 값을 입력하면 가운데에 출력한다

		frame.setVisible(true);//보여주게 하기 메서드
		frame.setAlwaysOnTop(true);//jframe 최상단 위치 메서드
		
	}
	public void 복수의시작() throws InterruptedException {
		JFrame frame = new JFrame("복수의시작");	//프레임사용한다하고
		
		ImageIcon 복수 = new ImageIcon(".\\이미지\\gif\\복수의시작.gif");
		Image 복수의시작 = 복수.getImage();
		
		JLabel jlabel = new JLabel();
		jlabel.setIcon(new ImageIcon(복수의시작)); //라벨에다 담는게 답이다..
		
		frame.add(jlabel);
		frame.setSize(600, 270);
		frame.setLocationRelativeTo(null); //null 값을 입력하면 가운데에 출력한다

		frame.setVisible(true);//보여주게 하기 메서드
		frame.setAlwaysOnTop(true);//jframe 최상단 위치 메서드
		
		Thread.sleep(20000);
		frame.setVisible(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
