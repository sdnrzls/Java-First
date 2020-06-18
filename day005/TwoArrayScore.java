package day05;

import java.util.Scanner;

import javax.swing.JOptionPane;


public class TwoArrayScore {
	static Scanner sc =new Scanner(System.in);
	int [][] arr = new int[50][7];
	int row = 0;
	
	public void showMenu() {
		System.out.println("�����ϼ���");
		System.out.println("1.������ �Է�");
		System.out.println("2.��ü���� / ����");
		System.out.print("���� >>");
	}
	public void inputData() { //���� �Է�
		System.out.println("���� �Է� ���� >>");
		System.out.print("�й� >>");
		int yearNum = sc.nextInt();
		System.out.print("���� >>");
		int kor = sc.nextInt();
		System.out.print("���� >>");
		int eng = sc.nextInt();
		System.out.print("���� >>");
		int math = sc.nextInt();
		arr[row][0] = yearNum; //�й�
		arr[row][1] = kor; // ����
		arr[row][2] = eng; // ����
		arr[row][3] = math; // ����
		arr[row][4] = kor+eng+math; // ����
		arr[row][5] = arr[row][4]/3; //���
		arr[row][6] = 1;//����
		row++;
	}
	private void rankMethod() {
	for(int i= 0; i<row-1; i++) {
		for(int j=i+1; j<row; j++) {
			if(arr[i][4]>arr[j][4]) {
				arr[j][6]++;
			}else {
				arr[i][6]++;
			}
		}//j	
		}//i
	}
	public void viewData() { // ��ü����
		rankMethod();
		System.out.println("----��������----");
		System.out.println("�й�\t����\t����\t����\t����\t���\t����");
		for(int i = 0; i<arr.length; i++) {// for(int i = 0; i<row; i++)
			if(arr[i][0]==0) break;
			for(int j=0; j<arr[i].length; j++) {
			System.out.print(arr[i][j]+"        \t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		TwoArrayScore manager = new TwoArrayScore();
		while(true) {
			manager.showMenu(); // �޴� �����ֱ�
			int num = sc.nextInt();
			switch(num) {
				case 1 : manager.inputData();//�����Է�
						break;
				case 2 : manager.viewData();//��ü����
							System.exit(0);
				default : System.out.println("�Է¿���");
			}
		}
		

	
	
	}//main
}//class
