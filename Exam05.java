package day02;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		//�Է��� ������ �Է¹޾�
		//�� ����ŭ ���� �Է¹޾� �� �������� �� ���ϱ�
		//��)5
		// 2 4 6 7 9
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է� ����>>");
		int num1 = sc.nextInt();
		System.out.println("������ �Է�>>");
		int sum = 0;
		for(int i=0; i<num1; i++) {
			int inputData = sc.nextInt();
			sum +=inputData;			
		}
		System.out.println("�հ� : "+sum);


	}//main
}//class
