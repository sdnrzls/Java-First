package day01;

import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {
		
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("�ΰ��� ���� �Է� �Ͻÿ�");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a>b) {
			System.out.println("ū���� �� : " + a );
			System.out.println("�������� �� : "+b );
			System.out.println("�μ��� �� : " + (a-b) );
		}else if(b>a){
			System.out.println("ū���� �� : " + b);
			System.out.println("�������� �� : "+a );
			System.out.println("�μ��� �� : " + (b-a) );
		}else {
			System.out.println("���� �����մϴ�");
			System.out.println("�μ��� �� : "  + (a-b));
		}
	*/
			Scanner sc = new Scanner(System.in);
			System.out.println("ù��° �� �Է� >>");
			int max = sc.nextInt();
			System.out.println("�ι�° �� �Է� >>");
			int min = sc.nextInt();
			if(min> max) {
				int tmp = max; 	// int tmp = min
				max = min;			// min = max
				min = tmp;			// max = tmp
			}
			System.out.println("ū���� �� : " + max);
			System.out.println("�������� �� : "+ min);
			System.out.println("�μ��� �� : " + (max-min) );
			
	}

}
