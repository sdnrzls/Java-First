package day01;

import java.util.Scanner;

public class Exam13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ���� �Է��Ͻÿ�");
		int a = sc.nextInt();
		System.out.println("�ι�° ���� �Է��Ͻÿ�");
		int b = sc.nextInt();
		System.out.println("�����ڸ� �Է��Ͻÿ�");
		String c = sc.next();
		
		if(c.equals("+")) {  //���ڿ� ���� ����: equals()���
			System.out.println("������� : " + (a+b)); 
			}else if(c.equals ("-")) {
			System.out.println("������� : " + (a-b));
			}else if(c.equals("*")) {
			System.out.println("������� : " + (a*b));
			}else if(c.equals ("/")) {
				System.out.println("��������� : " + (a/b));
			}else if(c.equals ("%")) {
				System.out.println("��������� : " + (a%b));
			}else {
				 System.out.println("������ ����");
			}
		
		/*
		switch(c) {
		case "+" : System.out.println("������� : " + (a+b));
		break;
		case "-" : System.out.println("������� : " + (a-b)); 
		break;
		case "*" : System.out.println("������� : " + (a*b));
		break;
		case "/" : System.out.println("��������� : " + (a/b));
		break;
		case "%" : System.out.println("��������� : "+ (a%b) );
		break;
		default : System.out.println("������ ����");
		}
		*/
				
	} //main
}//class
