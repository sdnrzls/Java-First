package day06_objectArray;

import java.util.Scanner;

public class BookMain {
	static Scanner sc =new Scanner(System.in);
	BookBean[] arr = new BookBean[50];
	int cnt ;
	public void showMenu() {
		System.out.println("�����ϼ���");
		System.out.println("1.������ �Է�");
		System.out.println("2.��ü����");
		System.out.println("3. ����");
		System.out.print("���� :");
	}
	public void bookInsert() {
		System.out.println("�����͸� �Է��ϼ���");
		System.out.println("å ���� :  " );
		String title = sc.nextLine();
		System.out.println("å ���� : " );
		String writer = sc.nextLine();
		arr[cnt] = new BookBean(title,writer);
		cnt++;
	}
	
	public void bookList() {
		System.out.println("å ����Ʈ......");
		for(int i= 0; i<cnt; i++) { 
			System.out.println("å ���� : "+arr[i].title+"\t"+"å ���� : "+arr[i].writer);
		}
	}
	
	public static void main(String[] args) {
		BookMain bm = new BookMain();
		while(true) {
			bm.showMenu();
			int choie = sc.nextInt();
			BookMain.sc.nextLine();
			switch(choie) {
			case 1 : bm.bookInsert();
			break;
			case 2 : bm.bookList();
			break;
			case 3 : System.out.println("����");
						System.exit(0);
			default : System.out.println("�Է¿���");
			}
		}

	
	
	}//main
}//class
