package review;

import java.util.Scanner;

public class review01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*System.out.println("���̸� �Է� �� �ּ���");
		int a = sc.nextInt();
		
		if(a>=20) {
			System.out.println(a+"�� �Դϴ� ���� ����");
		}else if(a>=15) {
			System.out.println(a+"�� �Դϴ� �θ�԰� ���� ����");
		}else {
			System.out.println("���� �Ұ��� �Դϴ�.");
		}
		*/
		
		System.out.println("�й��� �Է��� �ּ���");
		int num1 = sc.nextInt();
		int a = num1/10;
		int b = num1&10;
		System.out.println("�̸��� �Է��� �ּ���");
		String name = sc.next();
		System.out.println("�ڹ� ������ �Է��� �ּ���");
		int java = sc.nextInt();
		System.out.println("UI������ �Է��� �ּ���");
		int ui = sc.nextInt();
		System.out.println("���� ������ �Է��� �ּ���");
		int eng = sc.nextInt();
		int total = java+ui+eng;
		int aver = total/3;
		
		if(a==0) {
			System.out.println("1�г� : "+name);
			System.out.println("����: "+total+"��� : "+aver);
		}else{
			System.out.println("2�г� : "+name);
			System.out.println("����: "+total+"��� : "+aver);
		}
		
	}//main
}//class
