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
			 sc  = new Scanner(new File("src//output2.txt"));//한줄 씩 읽어옴
			 pr = new PrintStream("Line.txt");//한줄씩 표출함
			 int num = 1; //변수 추가
			while(sc.hasNext()) { //읽어온 값만큼 반복
				String str = sc.nextLine();
				pr.println( num + " : " + str+"\t"); //표출
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
