package day02;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		
		int sum = 0;
		for(int i=1; i<101; i++) {
			sum +=i;  //sum = sum+i;
			if(i%10==0) {
			System.out.println((i-9)+"����" +i+"������ ����"+sum+"�Դϴ�");
			sum = 0;
			}
		}
		System.out.println("==============");
		
		//�л����� ���ٿ� ���� �л� ���� �Է¹޾� ����Ͻÿ�
		Scanner sc = new Scanner(System.in);
		System.out.println("�л����� �Է�>>");
		int st = sc.nextInt();
		System.out.println("���� �ο�>>");
		int line = sc.nextInt();
		for(int i=1; i<=st; i++) {
		System.out.print(i+" ");
		if(i%line==0) {
			System.out.println();
		}
		}
		int a = st/line + st%line;
		System.out.println();
		System.out.println("�� : "+a+"��");
		// �� �������� ���
		int raw = 0;
		if(st%line==0) {
			raw = st/line;
		}else {
			raw = (st/line)+1;
		}
		System.out.println("�� : "+raw+"��");
		//���� ������(���ǿ�����)
		int r = (st%line==0)? st/line : (st/line)+1;
		System.out.println("�� : "+r+"��");
	} //main
} //class
