package day04;

import java.util.Scanner;

public class TraingleMain {

	public static void main(String[] args) {
		
		Traingle tr = new Traingle(10.2,17.3);
		System.out.println("�ﰢ���� ���� : " +tr.getArea());
		tr.setBottom(7.5);
		tr.setHeight(11.2);
		System.out.println("�ﰢ���� ���� : " +tr.getArea());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�ﰢ���� �غ�");
		double b = sc.nextDouble();
		System.out.println("�ﰢ���� ����");
		double d = sc.nextDouble();
		
		Traingle tr1 = new Traingle(b,d);
		System.out.println("�Է� �ﰢ���� ���� : " +tr1.getArea());
	}

}
