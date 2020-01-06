package Main;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
//import java.net.URISyntaxException;

//import com.sun.tools.javac.Main;

import javazoom.jl.player.Player;

public class Music extends Thread {

	private Player player;		//�ڹ��ܿ��� �ٿ���� jar ����Ʈ�ؼ� ���
	private boolean isLoop;		//�ѹ�������Ǵ���?
	private File file;
	private FileInputStream fis;
	private BufferedInputStream bis;
	
	public Music(String name, boolean isLoop) { //�����ڿ��� �뷡�̸��� ���ѷ����� ������ ������ �Ǵܿ���
		this.isLoop = isLoop;
		try {
			file = new File(Action.class.getResource("../music/" + name).toURI());
			fis = new FileInputStream(file);	//���� ����ֱ�
			bis = new BufferedInputStream(fis); //�ش����� ���ۿ� �㿡�� �����Ű��
			player = new Player(bis);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public int getTime() {	//���ġ���� ����Ǵ��� �˱� ���� ���� 10000������ 10��
		if(player == null)		
			return 0 ;
		return player.getPosition();
	}
	
	public void close() { 	//���� 
		isLoop = false;
		player.close();
		this.interrupt();	//�� ����
	}
	
	@Override
	public void run() {
		try {
			do {
				player.play();
				fis = new FileInputStream(file);	//���� ����ֱ�
				bis = new BufferedInputStream(fis); //�ش����� ���ۿ� �㿡�� �����Ű��
				player = new Player(bis);
			}while(isLoop);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	//main���� �����Ҷ� Music ActionMusic = new Music("��������1", true);
	//������ �����ϱ�	   ActionMusic.start();
	
	
}
