package day02;

public class Exam04 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<101; i++) {
			sum +=i; //sum = sum+i;
			if(i%10==0) {
			System.out.println("1부터" +i+"까지의 합은"+sum+"입니다");
			}
		}
	System.out.println("=====================");
		int sum2 = 0;
		for(int i =1; i<11; i++) {
			sum2 +=i;
			if(i!=10) {
			System.out.println(i+"+");
		}else {
			System.out.println(i+"="+sum2);
			}
		}
	System.out.println("=====================");
	int h = 0;
	for(int i =1; i<11; i++) {
		h +=i;
		if(i==1) {
			System.out.println(i);
		}else {
			System.out.println("+"+i);
		}
	}
	System.out.println("="+h);
	} //main
}//class
