package day02;

public class Exam07 {

	public static void main(String [] args) {
		//1���� 5���� ���
		for(int i=1; i<6; i++) {
			System.out.println( i +" " );
		}
		System.out.println();
		System.out.println("=======");
		//1���� 5���� ��� while
		int b = 10;
		while(b<6) {
			System.out.println(b+" ");
			b++;
		}
		System.out.println();
		System.out.println("=======");
		//1���� 5���� ��� do~while
		int m = 10;
		do {
			System.out.println(m+"");
			m++;
		}while(m<6);
	}//main
}//class
