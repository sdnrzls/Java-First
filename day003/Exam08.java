package day03;

import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("�ݾ� �Է�>>"); //65589
		int unit[] = {50000,10000,1000,500,100,50,1};
		int money = sc.nextInt(); 
		for(int i=0; i<unit.length; i++) {	
			if(money/unit[i]!=0) {	
		System.out.println(unit[i]+"�� ��" + " : " + money/unit[i]+" ��(��)");
			money = money%unit[i];
		}
		}	
		

	}//main
}//class
