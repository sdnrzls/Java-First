package review;

public class review06 {

	public static void main(String[] args) {
	
		/*���� for ��� �Ͽ�
		1���� 10������ ��
		11���� 20������ ��
		21���� 30������ ��
		.
		.
		91���� 100������ ��
	*/
		
		for(int i=1; i<101; i+=10) {
			int sum =0;
			int j;
			for(j=i; j<i+10; j++) {
				sum+=j;
			}
			System.out.println(i+"����"+(j-1)+"������ ����"+sum+"�Դϴ�");
		}

	}

}
