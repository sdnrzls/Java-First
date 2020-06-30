package review;

public class review02 {

	public static void main(String[] args) {
		//备备窜 技肺
		for(int a=3; a<=7; a++) {
			if(a%2==1) {
			for(int b=1; b<=9; b++) {
				System.out.println(a+"*"+b+"="+a*b);
			}
			}
			System.out.println();
		}	
		System.out.println("===========");
		//备备窜 
		for(int c=1; c<=9; c++) {
			for(int d=3; d<=7; d++) {
				if(d%2==1) {
					System.out.print(d+"*"+c+"="+d*c+ " \t");
			}
			}
			System.out.println();
		}
		System.out.println("===========");
		//123456789
		//1234567
		//12345
		//.
		for(int q =9; q>0; q--) {
			for(int w=1; w<=q; w++) {
				System.out.print(w);
			}
		System.out.println();
		}
		
	}//main
}//class
