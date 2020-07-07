package utilTest;

import java.util.Scanner;

public class StringTest04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문장을 입력 하세유");
		String line = sc.nextLine();
		
		for(int i=0;i<line.length(); i++) {
			//String first =line.substring(0,1);
			char first = line.charAt(0);
			String second = line.substring(1);
			line = second +first;
			System.out.println(line);
		}

	}

}
