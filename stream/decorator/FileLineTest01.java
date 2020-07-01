package stream.decorator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class FileLineTest01 {
	
	static Scanner sc =null;
	static PrintStream pr = null;
	public static void main(String[] args) throws IOException {
		try {
			 sc  = new Scanner(new File("src//output2.txt"));//���� �� �о��
			 pr = new PrintStream("Line.txt");//���پ� ǥ����
			 int num = 1; //���� �߰�
			while(sc.hasNext()) { //�о�� ����ŭ �ݺ�
				String str = sc.nextLine();
				pr.println( num + " : " + str+"\t"); //ǥ��
				num++;
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			sc.close();
			pr.close();
		}

	}

}
