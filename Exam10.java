package day02;

public class Exam10 {

	public static void main(String[] args) {
		
		for(int k=4; k<=6; k++) { // ÀÌÁß for¹®
			for(int i=1; i<=9; i++) {
				System.out.println(k+"*"+i+"="+k*i);
			}
			System.out.println();
		}
		
		System.out.println("==========");
		
		for(int i =1; i<10; i++) {
			for(int d=4; d<=6; d++) {
				System.out.print(d+"*"+i+"="+d*i+"\t");
			} 
			System.out.println();
		}
		
		System.out.println("==========");
		
		
	for(int i=9; i>0; i-=2) {
		for(int j=1; j<=i; j++) {
			System.out.print(j);
		}
		System.out.println();
	}
		
	
	}//main
}//class
