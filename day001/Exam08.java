package day01;

import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���");
		String name = sc.next();
		System.out.println("���������� �Է��ϼ���");
		int K  = sc.nextInt();
		System.out.println("���������� �Է��ϼ���");
		int E  = sc.nextInt();
		System.out.println("���������� �Է��ϼ���");
		int M  = sc.nextInt();
	
		int T = K+E+M;
		int A = T/3;
		System.out.println("�̸� :  "+name+" ���� : "+T+" ��� : "+A);
		String grade= "";
		if(A>=90) {
			grade="A����";
		}else if(A>=80) {
			grade="B����";
		}else if(A>=70) {
			grade="C����";
		}else {
			grade="F����";
		}
		System.out.println(grade);

	}

}
