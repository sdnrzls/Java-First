package day05;

public class CircleBeanMain {

	public static void main(String[] args) {
		//�������� 1,2,3,4,5 �� 5���� CircleBean ��ü�� �����
		//�� CircleBean �� ���̸� ����ϰ�
		//�� ������ ����Ͻÿ�
		/*
		CircleBean c1 = new CircleBean(1);
		CircleBean c2 = new CircleBean(2);
		CircleBean c3 = new CircleBean(3);
		CircleBean c4 = new CircleBean(4);
		CircleBean c5 = new CircleBean(5);
		
		System.out.println(c1.getArea());
		System.out.println(c2.getArea());
		System.out.println(c3.getArea());
		System.out.println(c4.getArea());
		System.out.println(c5.getArea());
		double sum = c1.getArea()+c2.getArea()+c3.getArea()+c4.getArea()+c5.getArea();
		
		System.out.println(sum);
		*/
		//�迭�� ����,����,�ʱ�ȭ
		CircleBean[] arr =new CircleBean[5]; //���� & ����
		for(int i=0; i<arr.length;i++) {
			arr[i] = new CircleBean(i+1); //�ʱ�ȭ
		}
		double sum = 0;
		for (int i =0; i<arr.length; i++) {
			System.out.println(arr[i].getArea());
			sum +=arr[i].getArea();
		}
		System.out.println("�Ѹ��� : "+sum);
	}//main
}//class
