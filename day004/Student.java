package day04;

public class Student {

		int StudentID;//�й�
		String name;//�̸�
		int grade;//�г�
		String address;//�ּ�
		
		//�����ϴ� (����) =>�޼ҵ�(�Լ�)
		public void study() {
			System.out.println(name + "�����ϴ�");
		}
		public void play() {
			System.out.println(name +"��Ѵ�");
		}
		
		public static void main(String[] args) {
			Student s1 =new Student();
			s1.StudentID=100;
			s1.name="ȫ�浿";
			s1.grade=1;
			s1.address = "�λ�";
			System.out.println("s1 �̸� : "+s1.name);
			System.out.println("s1 �ּ� :"+s1.address);
			s1.study();
			s1.play();
			
			System.out.println("======================");
			
			Student s2 =new Student();
			s2.StudentID=200;
			s2.name="�̼���";
			s2.grade=4;
			s2.address = "����";
			System.out.println("s2 �̸� : "+s2.name);
			/* �̸��� ������ �̰� 3�г�,��õ�� ��� �л� s3�� �����ϰ�
			 * s3�� �̸��� �ּҸ� ����Ͻÿ�
			 */
			System.out.println("======================");
			Student s3 = new Student();
			s3.name = "������";
			s3.address ="��õ";
			System.out.println("s3 �̸� : "+s3.name+ " �ּ� : " + s3.address);
			s3.play();
		}
		

}//class
