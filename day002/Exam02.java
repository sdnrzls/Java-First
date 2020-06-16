package day02;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.print("금액 입력 : ");
		int money = sc.nextInt(); //52850
		int num1 = money/10000; //5
		System.out.println("만원 : " + num1);
		money = money%10000; //2850
		num1 = money/1000;
		System.out.println("천원 : "+ num1);
	

	} // main
} // class
