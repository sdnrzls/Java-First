package stream.decorator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCipyTest {
	public static void main(String[] args) {
		long millisecond = 0;
		try {
			FileInputStream fis  = new FileInputStream("src\\gameLevel\\Player.java");
			FileOutputStream fos = new FileOutputStream("src\\output2.txt");
			millisecond = System.currentTimeMillis();
				int i;
				while((i=fis.read())!= -1) {
					fos.write(i);
				}
			millisecond = System.currentTimeMillis() - millisecond;
			} catch (IOException e) {
				e.printStackTrace();
			}
		System.out.println("������ ���� �ϴµ�" + millisecond + " milliseconds �ҿ�Ǿ����ϴ�.");
	
			
	
		
	}//main
}//class
