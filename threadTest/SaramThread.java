package threadTest;

public class SaramThread extends Thread{
	private String name;
	
	public SaramThread(String name) {
		this.name=name;
	}
	
	@Override
	public void run() {
		for(int i =0; i<5; i++) {
			System.out.println(name+"�� �� �Ѵ�");
		}
	}

	public static void main(String[]args) {
		 SaramThread s1 = new  SaramThread("ȫ�浿");
		 SaramThread s2 = new  SaramThread("�̼���");
		 SaramThread s3 = new  SaramThread("������");
		 s1.start();
		 s2.start();
		 s3.start();
		
		
		
		
	}//main

	
}//class
