package review;

import java.util.Scanner;

public class TestArray {
	Scanner sc =new Scanner(System.in);
	int [][] arr = new int [50][7];
	int row = 0;
	public void showMenu() {
		System.out.println("�����ϼ���");
		System.out.println("1.������ �Է�");
		System.out.println("2.��ü���� / ����");
		System.out.print("���� >>");
	}
	
	public void inputData() { //���� �Է�
		System.out.println("���� �Է�");
		System.out.println("�й� �Է� >>");
		int years = sc.nextInt();
		System.out.println("���� ���� �Է� >>");
		int kor = sc.nextInt();
		System.out.print("���� >>");
		int eng = sc.nextInt();
		System.out.print("���� >>");
		int math = sc.nextInt();
		arr[row][0] = years;
		arr[row][1] = kor;
		arr[row][2] = eng;
		arr[row][3] = math;
		
	}
	
}//class
