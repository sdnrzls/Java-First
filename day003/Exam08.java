package day03;

import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("금액 입력>>"); //65589
		int unit[] = {50000,10000,1000,500,100,50,1};
		int money = sc.nextInt(); 
		for(int i=0; i<unit.length; i++) {	
			if(money/unit[i]!=0) {	
		System.out.println(unit[i]+"원 권" + " : " + money/unit[i]+" 장(개)");
			money = money%unit[i];
		}
		}	
		

	}//main
}//class
