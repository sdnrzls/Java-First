package day02;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ������ �Է� �ϼ���");
		int kor = sc.nextInt();
		System.out.println("���� ������ �Է� �ϼ���");
		int eng = sc.nextInt();
		System.out.println("���� ������ �Է� �ϼ���");
		int math = sc.nextInt();
		
		int total = kor+eng+math;
		int ave = total/3;
		
		String grade= "";
		switch(ave/10) {
		case 10 :
		case 9 :
			grade ="A"; 
			break;
		case 8:
			grade ="B";
			break;
		case 7 :
			grade ="C"; 
			break;
		default  :
			grade ="F"; 
		}
		System.out.println("���� : " + total);
		System.out.println("��� : "+ ave);
		System.out.println("���� : "+ grade);
		
		
		}//main
	}//class
