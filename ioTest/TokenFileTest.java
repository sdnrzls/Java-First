package ioTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TokenFileTest {

	public static void main(String[] args) {
		try {
			FileInputStream fis 
			 = new FileInputStream("src\\iotest\\input.txt");
			//FileoutputStream fos = new FileputStream("src\\iotest\\input.txt"); //파일로 내보내기 fos.write(i);
			while(true) {
				int i  = fis.read();
				if(i==-1) break;
				System.out.print((char)i);
			
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
