package day02;

public class Exam08 {

	public static void main(String[] args) {
		//1���� 10���� Ȧ���� ���� ���Ͻÿ�
		int sum = 0;
		for(int i=1; i<11; i++) {
			if(i%2==1) {
			sum += i;
		}
		}
		System.out.println("��� : " + sum);
		System.out.println("========");
		int hap = 0;
		for(int i=1; i<11; i++) {
			if(i%2!=1) continue; //������ ������� �ѹ��� �ݺ�
			hap+=i;
		}
		System.out.println("continue ��� :" + hap);
		System.out.println("========");
		int h = 0;
		for(int i=1; i<11; i++) {
			if(i%2!=1) break; //������ ������� �ݺ��� ��
			h+=i;
			System.out.println("break ��� :" + h);
			System.out.println("========");
		}
		
		
	}//main
}//class
