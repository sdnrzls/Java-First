package threadTest;

public class SaramTalk {
	private String name;
	
	public SaramTalk(String name) {
		this.name = name;
	}
	private void speak() {
		for(int i =0; i<5; i++) {
			System.out.println(name+"�� �� �Ѵ�");
		}
	}
	public static void main(String[] args) {
		
		 SaramTalk s1 = new  SaramTalk("ȫ�浿");
		 SaramTalk s2 = new  SaramTalk("�̼���");
		 SaramTalk s3 = new  SaramTalk ("������");
		 s1.speak();
		 s2.speak();
		 s3.speak();
		 	

	}



}
