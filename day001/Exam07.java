package day01;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		System.out.println("������ �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		System.out.println("ĿƮ������ �Է��ϼ���");
		int pass = sc.nextInt();
		if(score >=pass ) {
			System.out.println("�հ��Դϴ�");
		}else {
			System.out.println("���հ� �Դϴ�");
		}
		if(score%3==0) {
			System.out.println(score +"���� 3�� ����Դϴ�");
		}else {
			System.out.println(score +"���� 3�� ����� �ƴմϴ�");
		}
	}

}
