package ioTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenFileTest3 {
			//input.txt ������ �о
			//8������ ��ȯ�Ͽ� octal.txt ���Ϸ� ���
			//��,StringTokenizer Ŭ���� ����
	public static void main(String[] args) {
		Scanner sc =null;
		PrintStream pst =null;
			try {
				sc = new Scanner(new File("src\\ioTest\\input.txt"));
				pst = new PrintStream("src\\ioTest\\octal.txt");
				while(sc.hasNext()) {
					String str = sc.nextLine();
					StringTokenizer st =new StringTokenizer(str,":");
					
					while(st.hasMoreTokens()) {
						String tok = st.nextToken();
						//8������ ���
						int v = Integer.parseInt(tok);
						System.out.print(Integer.toOctalString(v)+"\t");
						pst.print(Integer.toOctalString(v)+"\t");
					}
				}
		
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		
	

	}//main
}//class
