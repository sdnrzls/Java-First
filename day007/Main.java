package day07;

public class Main {

	public static void main(String[] args) {
		
		Father f1 =new Father();
		//f1.fatherPrint();
		Child c1= new Child();
		//c1.childPrint();0	
		//f1.methodTest();
		//c1.methodTest();
		GrandFather g1 = new GrandFather(); //���� & ����
		c1.grandPrint();
		f1.grandPrint();
		
		System.out.println("=============");
		
		GrandFather g2;//����
		Father f2 =new Father();
		g2=f2; //GrandFather = Father
		//f2 =g2; ������ ���� �߻�
		//g2.fatherPrint(); // fatherPrint()�� Father �޼ҵ�
		//GrandFather �޼ҵ尡 ��� ��, �������̵� �� �޼ҵ��
		// �������̵� �� �޼ҵ尡 ����ȴ�
		g2.grandPrint(); 
		
		GrandFather g3 =new Father();
		// GrandFather g3
		// Father f3 = new Father();
		// g3 = f3;
	}//main
}//class