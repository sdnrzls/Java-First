package guiTest;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.crypto.ExemptionMechanismException;

public class GuguTest {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
			System.out.println("���� �Է� �ϼ���");
			try {
				int num = sc.nextInt();
				for(int i=0; i<10; i++) {
					System.out.println(num+"x"+i+"="+num*i);
				}
			}catch(InputMismatchException n) {
				System.out.println("���ڸ� �Է��ϼ���"); 
			}
	}//main
}//class
