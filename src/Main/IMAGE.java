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
			�α��ħ��();
			break;
		case 2:
			�����غ�();
			break;
		case 3:
			System.out.println("\n\n\n\n\n\n\n\n\n������ �ڵ����� Ÿ�� �������� �߰�����!");
			Thread.sleep(1000);
			System.out.println("\n\n\n\n\n\n\n\n\n3");
			Thread.sleep(1000);
			System.out.println("\n\n\n\n\n\n\n\n\n2");
			Thread.sleep(1000);
			System.out.println("\n\n\n\n\n\n\n\n\n1");
			Thread.sleep(1000);
			System.out.println("\n\n\n\n\n\n\n\n\nGo!!!");
			Thread.sleep(500);
			�ڵ�������();
			break;
		case 4:
			�ڵ�������();
			break;
		case 5:
			���ļ���();
			break;
		case 6:
			����������();
			break;
		case 7:
			�����ǽ���();
			break;
		}
		
		} catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	//1 �α��ħ��
	//2 �����غ�
	//3 �ڵ�������
	//4 �ڵ�������
	//5 ���ļ���
	//6 ����������
	
	public void �α��ħ��() throws InterruptedException {
		JFrame frame = new JFrame("�α��ħ��");	//�����ӻ���Ѵ��ϰ�
		
		ImageIcon �α�� = new ImageIcon(".\\�̹���\\gif\\�α��ħ��.gif");
		Image �α��ħ�� = �α��.getImage();
		
		JLabel jlabel = new JLabel();
		jlabel.setIcon(new ImageIcon(�α��ħ��)); //�󺧿��� ��°� ���̴�..
		
		frame.add(jlabel);
		frame.setSize(600, 270);
		frame.setLocationRelativeTo(null); //null ���� �Է��ϸ� ����� ����Ѵ�

		frame.setVisible(true);//�����ְ� �ϱ� �޼���
		frame.setAlwaysOnTop(true);//jframe �ֻ�� ��ġ �޼���
		
		Thread.sleep(6000);
		frame.setVisible(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void �����غ�() throws InterruptedException {
		JFrame frame = new JFrame("�����غ�");	//�����ӻ���Ѵ��ϰ�
		
		ImageIcon ������ = new ImageIcon(".\\�̹���\\gif\\�����غ�.gif");
		Image ���������� = ������.getImage();
		
		JLabel jlabel = new JLabel();
		jlabel.setIcon(new ImageIcon(����������)); //�󺧿��� ��°� ���̴�..
		
		frame.add(jlabel);
		frame.setSize(600, 270);
		frame.setLocationRelativeTo(null); //null ���� �Է��ϸ� ����� ����Ѵ�

		frame.setVisible(true);//�����ְ� �ϱ� �޼���
		frame.setAlwaysOnTop(true);//jframe �ֻ�� ��ġ �޼���
		
		Thread.sleep(5000);
		frame.setVisible(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void �ڵ�������() throws InterruptedException {
		JFrame frame = new JFrame("�ڵ�������");	//�����ӻ���Ѵ��ϰ�
		
		ImageIcon ���� = new ImageIcon(".\\�̹���\\gif\\�ڵ�������.gif");
		Image �ڵ������� = ����.getImage();
		
		JLabel jlabel = new JLabel();
		jlabel.setIcon(new ImageIcon(�ڵ�������)); //�󺧿��� ��°� ���̴�..
		
		frame.add(jlabel);
		frame.setSize(600, 270);
		frame.setLocationRelativeTo(null); //null ���� �Է��ϸ� ����� ����Ѵ�

		frame.setVisible(true);//�����ְ� �ϱ� �޼���
		frame.setAlwaysOnTop(true);//jframe �ֻ�� ��ġ �޼���
		
		Thread.sleep(5000);
		frame.setVisible(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void �ڵ�������() throws InterruptedException {
		JFrame frame = new JFrame("�ڵ�������");	//�����ӻ���Ѵ��ϰ�
		
		ImageIcon �ڵ��� = new ImageIcon(".\\�̹���\\gif\\�ڵ�������.gif");
		Image �ڵ������� = �ڵ���.getImage();
		
		JLabel jlabel = new JLabel();
		jlabel.setIcon(new ImageIcon(�ڵ�������)); //�󺧿��� ��°� ���̴�..
		JPanel panel = new JPanel();
		
		frame.add(jlabel);
		frame.setSize(600, 270);
		frame.setLocationRelativeTo(null); //null ���� �Է��ϸ� ����� ����Ѵ�

		frame.setVisible(true);//�����ְ� �ϱ� �޼���
		frame.setAlwaysOnTop(true);//jframe �ֻ�� ��ġ �޼���
		
		Thread.sleep(13000);
		frame.setVisible(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void ���ļ���() throws InterruptedException {
		JFrame frame = new JFrame("���ļ���");	//�����ӻ���Ѵ��ϰ�
		
		ImageIcon ���� = new ImageIcon(".\\�̹���\\gif\\���ļ���.gif");
		Image ���ļ��� = ����.getImage();
		
		JLabel jlabel = new JLabel();
		jlabel.setIcon(new ImageIcon(���ļ���)); //�󺧿��� ��°� ���̴�..
		
		frame.add(jlabel);
		frame.setSize(600, 270);
		frame.setLocationRelativeTo(null); //null ���� �Է��ϸ� ����� ����Ѵ�

		frame.setVisible(true);//�����ְ� �ϱ� �޼���
		frame.setAlwaysOnTop(true);//jframe �ֻ�� ��ġ �޼���
		
		Thread.sleep(8000);
		frame.setVisible(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void ����������() throws InterruptedException {
		JFrame frame = new JFrame("������ ����");	//�����ӻ���Ѵ��ϰ�
		
		ImageIcon ������ = new ImageIcon(".\\�̹���\\gif\\����������.gif");
		Image ���������� = ������.getImage();
		
		JLabel jlabel = new JLabel();
		jlabel.setIcon(new ImageIcon(����������)); //�󺧿��� ��°� ���̴�..
		
		frame.add(jlabel);
		frame.setSize(600, 270);
		frame.setLocationRelativeTo(null); //null ���� �Է��ϸ� ����� ����Ѵ�

		frame.setVisible(true);//�����ְ� �ϱ� �޼���
		frame.setAlwaysOnTop(true);//jframe �ֻ�� ��ġ �޼���
		
		Thread.sleep(29000);
		frame.setVisible(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void ���ļ���2() {
		JFrame frame = new JFrame("���ļ���");	//�����ӻ���Ѵ��ϰ�
		
		ImageIcon ���� = new ImageIcon("C:\\Users\\chjs9\\���ļ���.gif");
		Image ���ļ��� = ����.getImage();
		
		JLabel jlabel = new JLabel();
		jlabel.setIcon(new ImageIcon(���ļ���)); //�󺧿��� ��°� ���̴�..
		
		frame.add(jlabel);
		frame.setSize(600, 270);
		frame.setLocationRelativeTo(null); //null ���� �Է��ϸ� ����� ����Ѵ�

		frame.setVisible(true);//�����ְ� �ϱ� �޼���
		frame.setAlwaysOnTop(true);//jframe �ֻ�� ��ġ �޼���
		
	}
	public void �����ǽ���() throws InterruptedException {
		JFrame frame = new JFrame("�����ǽ���");	//�����ӻ���Ѵ��ϰ�
		
		ImageIcon ���� = new ImageIcon(".\\�̹���\\gif\\�����ǽ���.gif");
		Image �����ǽ��� = ����.getImage();
		
		JLabel jlabel = new JLabel();
		jlabel.setIcon(new ImageIcon(�����ǽ���)); //�󺧿��� ��°� ���̴�..
		
		frame.add(jlabel);
		frame.setSize(600, 270);
		frame.setLocationRelativeTo(null); //null ���� �Է��ϸ� ����� ����Ѵ�

		frame.setVisible(true);//�����ְ� �ϱ� �޼���
		frame.setAlwaysOnTop(true);//jframe �ֻ�� ��ġ �޼���
		
		Thread.sleep(20000);
		frame.setVisible(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
