package day05;

import java.util.Scanner;

public class ScoreMain {
	static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) {
		
		Teacher t1 = new Teacher();
		while(true) {
			t1.showMenu();
			int num = sc.nextInt();
			switch(num){
				case 1 : t1.inputData();
				break;
				case 2 : t1.viewData();
				break;
				case 3 : System.out.println("����");
						System.exit(0);
				default : System.out.println("�Է¿���");
				}
		}
		

	}//main
}//class
