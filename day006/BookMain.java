package day06_objectArray;

import java.util.Scanner;

public class BookMain {
	static Scanner sc =new Scanner(System.in);
	BookBean[] arr = new BookBean[50];
	int cnt ;
	public void showMenu() {
		System.out.println("선택하세요");
		System.out.println("1.데이터 입력");
		System.out.println("2.전체보기");
		System.out.println("3. 종료");
		System.out.print("선택 :");
	}
	public void bookInsert() {
		System.out.println("데이터를 입력하세요");
		System.out.println("책 제목 :  " );
		String title = sc.nextLine();
		System.out.println("책 저자 : " );
		String writer = sc.nextLine();
		arr[cnt] = new BookBean(title,writer);
		cnt++;
	}
	
	public void bookList() {
		System.out.println("책 리스트......");
		for(int i= 0; i<cnt; i++) { 
			System.out.println("책 제목 : "+arr[i].title+"\t"+"책 저자 : "+arr[i].writer);
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
			case 3 : System.out.println("종료");
						System.exit(0);
			default : System.out.println("입력오류");
			}
		}

	
	
	}//main
}//class
