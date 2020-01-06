package Main;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
//import java.net.URISyntaxException;

//import com.sun.tools.javac.Main;

import javazoom.jl.player.Player;

public class Music extends Thread {

	private Player player;		//자바줌에서 다운받은 jar 임포트해서 사용
	private boolean isLoop;		//한번만재생되는지?
	private File file;
	private FileInputStream fis;
	private BufferedInputStream bis;
	
	public Music(String name, boolean isLoop) { //생성자에서 노래이름과 무한루프를 실행할 것인지 판단여부
		this.isLoop = isLoop;
		try {
			file = new File(Action.class.getResource("../music/" + name).toURI());
			fis = new FileInputStream(file);	//파일 담아주기
			bis = new BufferedInputStream(fis); //해당파일 버퍼에 담에서 실행시키기
			player = new Player(bis);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public int getTime() {	//어떤위치에서 실행되는지 알기 위해 만듬 10000단위당 10초
		if(player == null)		
			return 0 ;
		return player.getPosition();
	}
	
	public void close() { 	//종료 
		isLoop = false;
		player.close();
		this.interrupt();	//곡 종료
	}
	
	@Override
	public void run() {
		try {
			do {
				player.play();
				fis = new FileInputStream(file);	//파일 담아주기
				bis = new BufferedInputStream(fis); //해당파일 버퍼에 담에서 실행시키기
				player = new Player(bis);
			}while(isLoop);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	//main에서 실행할때 Music ActionMusic = new Music("전투음악1", true);
	//쓰레드 실행하기	   ActionMusic.start();
	
	
}
