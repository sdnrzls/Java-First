package day01;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		System.out.println("���̸� �Է��ϼ��� >>");
	Scanner sc =new Scanner(System.in);
	int su = sc.nextInt();
	if(su>=20) {
		System.out.println(su+"�� �̽ʴϴ� ���� ���� �մϴ�");
	}else if(su>=15){
		System.out.println(su+"�� �̽ʴϴ� �θ�԰� ���� ���� ���� �մϴ�");
	}else {
		System.out.println(su+"�� �̽ʴϴ� ���� �Ұ��� �մϴ�");
	}
	}
	

}
