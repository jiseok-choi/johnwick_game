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
	
	
	
	public Sound(Wick wick){		//존윅 효과음
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
		if(str.equals("폭탄")) {
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
			존윅맞는소리();
			break;
			
		default:
			break;
		}
	}


	public void Wick_Shot(int Gun) {	//존윅의 총소리 종류 효과음
		if(Gun == 1) {
			try
			{
				AudioInputStream ais = AudioSystem.getAudioInputStream(new File(".\\사운드\\권총1.wav"));
				Clip clip = AudioSystem.getClip();
				clip.open(ais);
				clip.start();
			}
			catch (Exception ex)
			{
				System.out.println("총 종류 오류");
			}
		}
		else if(Gun == 2) {
			try
			{
				AudioInputStream ais = AudioSystem.getAudioInputStream(new File(".\\사운드\\기관총1.wav"));
				Clip clip = AudioSystem.getClip();
				clip.open(ais);
				clip.start();
			}
			catch (Exception ex)
			{
				System.out.println("총 종류 오류");
			}
		}
		else if(Gun == 3) {
			try
			{
				AudioInputStream ais = AudioSystem.getAudioInputStream(new File(".\\사운드\\저격총1.wav"));
				Clip clip = AudioSystem.getClip();
				clip.open(ais);
				clip.start();
			}
			catch (Exception ex)
			{
				System.out.println("총 종류 오류");
			}
		}
		
		else if(Gun == 0){
			try
			{
				AudioInputStream ais = AudioSystem.getAudioInputStream(new File(".\\사운드\\총알없음1.wav"));
				Clip clip = AudioSystem.getClip();
				clip.open(ais);
				clip.start();
			}
			catch (Exception ex)
			{
				System.out.println("총 종류 오류");
			}
		}
		else if(Gun == 4){
			try
			{
				AudioInputStream ais = AudioSystem.getAudioInputStream(new File(".\\사운드\\때리는소리.wav"));
				Clip clip = AudioSystem.getClip();
				clip.open(ais);
				clip.start();
			}
			catch (Exception ex)
			{
				System.out.println("총 종류 오류");
			}
		}
	}

	public void Bomb(int num) {
		if(Btn == 1) {
			try
			{
				AudioInputStream ais = AudioSystem.getAudioInputStream(new File(".\\사운드\\삑삑소리.wav"));
				Clip clip = AudioSystem.getClip();
				clip.open(ais);
				clip.start();
			}
			catch (Exception ex)
			{
				System.out.println("폭탄쓰레드오류");
			}
		}else if(Btn == 2) {
			try
			{
				AudioInputStream ais = AudioSystem.getAudioInputStream(new File(".\\사운드\\연결음.wav"));
				Clip clip = AudioSystem.getClip();
				clip.open(ais);
				clip.start();
			}
			catch (Exception ex)
			{
				System.out.println("폭탄쓰레드오류");
			}
		}else if(Btn == 3) {
			try
			{
				AudioInputStream ais = AudioSystem.getAudioInputStream(new File(".\\사운드\\폭탄1.wav"));
				Clip clip = AudioSystem.getClip();
				clip.open(ais);
				clip.start();
			}
			catch (Exception ex)
			{
				System.out.println("폭탄쓰레드오류");
			}
		}
	}
	
	public void 존윅맞는소리() {
		try
		{
			AudioInputStream ais = AudioSystem.getAudioInputStream(new File(".\\사운드\\맞는소리.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(ais);
			clip.start();
		}
		catch (Exception ex)
		{
			System.out.println("맞는소리요류");
		}
	}
	
}
