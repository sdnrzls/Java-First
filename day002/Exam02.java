package day02;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.print("�ݾ� �Է� : ");
		int money = sc.nextInt(); //52850
		int num1 = money/10000; //5
		System.out.println("���� : " + num1);
		money = money%10000; //2850
		num1 = money/1000;
		System.out.println("õ�� : "+ num1);
	

	} // main
} // class
