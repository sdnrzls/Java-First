package day04;

public class car {
	String carKind;
	String carColor;
	 int speed;
	 
	 //������
	 
	 //����Ʈ ������ => �������������� �ٸ� �����ڰ� �������� ���� �Ұ���
	 //�����ε�
	 public car() {
		 System.out.println("����Ʈ������");
	 }
	 
	 public  car(String carColor, String carKind) {
		 this.carColor = carColor;
		 this.carKind = carKind;
		 System.out.println("�����ִ� ������");
	 }
	
	public  void speedUp(int s) {
		speed += s;
	}
	public  void speeddown(int s) {
		this.speed -= s;
	}
	public  void stop() {
		speed=0;
	}
	public static void main(String[] args) {
		car mycar =new car();
		mycar.carKind ="�ҳ�Ÿ";
		mycar.carColor ="���";
		mycar.speedUp(100);
		System.out.println(mycar.carKind+" �ӵ� : "+mycar.speed);
		System.out.println(mycar.carKind+" color : "+mycar.carColor );
		mycar.stop();
		System.out.println(mycar.carKind+" �ӵ� : "+mycar.speed);
	
		/*c1 ��ü�� ����
		������ ��ī ��� ���� ����� 
		speed Up(80), �ӵ����
		speed Down(50), �ӵ����
		 */
		
	car c1 =new car();
	c1.carColor = "������";
	c1.carKind  = "��ī";
	c1.speedUp(80);
	System.out.println( c1.carKind +" �ӵ� : " + c1.speed);
	c1.speeddown(50);
	System.out.println(c1.carKind+" �ӵ� : "+ c1.speed);
	System.out.println(c1);
	System.out.println(mycar);
	
	//������ -> ��� ���� �ʱ�ȭ
	
	car c2 = new car("��ȫ��","����");
	System.out.println(c2.carColor);
	
	}//main
}//class
