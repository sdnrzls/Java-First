package ioTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class TokenFileTest2 {

	public static void main(String[] args) {
			
			Scanner sfis = null;
			PrintStream ps = null;
			try {
				sfis = new Scanner(new File("src\\iotest\\input.txt"));
				ps = new PrintStream("src\\iotest\\input.txt");
				while(sfis.hasNext()) {
					String str = sfis.nextLine();
					System.out.println(Integer.toHexString(15));
					String[] tmp = str.split(":");
					
					for(int i=0; i<tmp.length; i++) {
						//	System.out.print(tmp[i]+"\t"); 16진수로 출력
						int v= Integer.parseInt(tmp[i]);
						//16진수로 영문자는 대문자로 출력
						System.out.println(Integer.toHexString(v).toUpperCase()+"\t");
						ps.print(Integer.toHexString(v)+"\t");
					}
				}
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}finally{
				sfis.close();
			}
			
		
			
	}//main
}//class
