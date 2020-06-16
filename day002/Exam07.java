package day02;

public class Exam07 {

	public static void main(String [] args) {
		//1부터 5까지 출력
		for(int i=1; i<6; i++) {
			System.out.println( i +" " );
		}
		System.out.println();
		System.out.println("=======");
		//1부터 5까지 출력 while
		int b = 10;
		while(b<6) {
			System.out.println(b+" ");
			b++;
		}
		System.out.println();
		System.out.println("=======");
		//1부터 5까지 출력 do~while
		int m = 10;
		do {
			System.out.println(m+"");
			m++;
		}while(m<6);
	}//main
}//class
