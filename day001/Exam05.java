package day01;

public class Exam05 {

	public static void main(String[] args) {
	
		int a =49;
		if(a%2 == 0) {
			System.out.println(a+" : ¦��");
		}else{
			System.out.println(a+" : Ȧ��");
		}
		
		//���� if
		int b = 252;
		if(b<0) {
			System.out.println("0�̸�");
		}else if(b<100) {
			System.out.println("0���� 99���� ��");
		}else if(b<200) {
			System.out.println("100���� 199���� �� ");
		}else if(b<300) {
			System.out.println("200���� 299 ���� ��");
		}else {
			System.out.println("300 �̻� ��");
		}
		
		int c =  5;
		if(c < 0) {
			System.out.println("0�̸�");
		}
		 if(c>=0 && c<100) { //c�� 0���� ũ�� 100���� �۴� c>0 && c< 100
			System.out.println("0���� 99 ���̼� ");
		}
		 if(c>=100&&c<200 ) {
			 System.out.println("100���� 199 ���� ��");
		 }
		 if(c>=200&&c<300) {
			 System.out.println("200���� 299 ���� ��");
		 }
		 if(c>=300) {
			 System.out.println("300 �̻��� ��");
		 }
		
		int su = 51;
		if(su>0&&su%2==0) {
			System.out.println("su�� 0���� ũ�� ¦��");
		}else if(su==0) {
			System.out.println("su�� 0�̴�");
		}else if (su>0&&su%2==1) {// !0������� 
			System.out.println("su�� 0���� ũ�� Ȧ��");
		}
		 
		}
}
