package Main;
import Charactor.*;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Sound implements Runnable{

	int playlist = 0;
	int Gun = 0;
	int Btn = 0;

	Wick wick;

	public Sound(Boss boss) {
		playlist = 3;
	}
	
	
	
	public Sound(Wick wick){		//���� ȿ����
		if(wick.Gun == 1) {
			playlist = 1;
			Gun = wick.Gun;
		}
		else if(wick.Gun == 2) {
			playlist = 1;
			Gun = wick.Gun;
		}
		else if(wick.Gun == 3) {
			playlist = 1;
			Gun = wick.Gun;
		}
		else if(wick.Gun == 4) {
			playlist = 1;
			Gun = wick.Gun;
		}
		else {
			playlist = 1;
			Gun = wick.Gun;
		}
	}
	public Sound(String str, int btn) {
		if(str.equals("��ź")) {
			playlist = 2;
			Btn = btn;
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		switch (playlist) {
		case 1:
			Wick_Shot(Gun);
			break;
		
		case 2:
			Bomb(Btn);
			break;
			
		case 3:
			�����´¼Ҹ�();
			break;
			
		default:
			break;
		}
	}


	public void Wick_Shot(int Gun) {	//������ �ѼҸ� ���� ȿ����
		if(Gun == 1) {
			try
			{
				AudioInputStream ais = AudioSystem.getAudioInputStream(new File(".\\����\\����1.wav"));
				Clip clip = AudioSystem.getClip();
				clip.open(ais);
				clip.start();
			}
			catch (Exception ex)
			{
				System.out.println("�� ���� ����");
			}
		}
		else if(Gun == 2) {
			try
			{
				AudioInputStream ais = AudioSystem.getAudioInputStream(new File(".\\����\\�����1.wav"));
				Clip clip = AudioSystem.getClip();
				clip.open(ais);
				clip.start();
			}
			catch (Exception ex)
			{
				System.out.println("�� ���� ����");
			}
		}
		else if(Gun == 3) {
			try
			{
				AudioInputStream ais = AudioSystem.getAudioInputStream(new File(".\\����\\������1.wav"));
				Clip clip = AudioSystem.getClip();
				clip.open(ais);
				clip.start();
			}
			catch (Exception ex)
			{
				System.out.println("�� ���� ����");
			}
		}
		
		else if(Gun == 0){
			try
			{
				AudioInputStream ais = AudioSystem.getAudioInputStream(new File(".\\����\\�Ѿ˾���1.wav"));
				Clip clip = AudioSystem.getClip();
				clip.open(ais);
				clip.start();
			}
			catch (Exception ex)
			{
				System.out.println("�� ���� ����");
			}
		}
		else if(Gun == 4){
			try
			{
				AudioInputStream ais = AudioSystem.getAudioInputStream(new File(".\\����\\�����¼Ҹ�.wav"));
				Clip clip = AudioSystem.getClip();
				clip.open(ais);
				clip.start();
			}
			catch (Exception ex)
			{
				System.out.println("�� ���� ����");
			}
		}
	}

	public void Bomb(int num) {
		if(Btn == 1) {
			try
			{
				AudioInputStream ais = AudioSystem.getAudioInputStream(new File(".\\����\\���Ҹ�.wav"));
				Clip clip = AudioSystem.getClip();
				clip.open(ais);
				clip.start();
			}
			catch (Exception ex)
			{
				System.out.println("��ź���������");
			}
		}else if(Btn == 2) {
			try
			{
				AudioInputStream ais = AudioSystem.getAudioInputStream(new File(".\\����\\������.wav"));
				Clip clip = AudioSystem.getClip();
				clip.open(ais);
				clip.start();
			}
			catch (Exception ex)
			{
				System.out.println("��ź���������");
			}
		}else if(Btn == 3) {
			try
			{
				AudioInputStream ais = AudioSystem.getAudioInputStream(new File(".\\����\\��ź1.wav"));
				Clip clip = AudioSystem.getClip();
				clip.open(ais);
				clip.start();
			}
			catch (Exception ex)
			{
				System.out.println("��ź���������");
			}
		}
	}
	
	public void �����´¼Ҹ�() {
		try
		{
			AudioInputStream ais = AudioSystem.getAudioInputStream(new File(".\\����\\�´¼Ҹ�.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(ais);
			clip.start();
		}
		catch (Exception ex)
		{
			System.out.println("�´¼Ҹ����");
		}
	}
	
}
