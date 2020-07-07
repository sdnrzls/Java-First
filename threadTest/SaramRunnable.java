package threadTest;

public class SaramRunnable implements Runnable {
	private String name;
	public SaramRunnable(String name) {
		this.name= name;
	}
	public static void main(String[] args) {
	
		SaramRunnable s1 = new  SaramRunnable("ȫ�浿");
		SaramRunnable s2 = new SaramRunnable("�̼���");
		SaramRunnable s3 = new SaramRunnable("������");
		Thread th1 = new Thread(s1);
		Thread th2 = new Thread(s2);
		Thread th3 = new Thread(s3);
		th1.start();
		th2.start();
		th3.start();

	}
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(name +"�� ���Ѵ�.");
			try {
			Thread.sleep(3000);//1000ms = 1��
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}//main
}//class
