package day07;

public class Father extends GrandFather{
	String str = "�ƹ���";
	public Father() {
		super();
		System.out.println(str + " ������ ");
	}
	
	public Father(String msg) {
		System.out.println(msg);
	}
	
	public void fatherPrint(){
		System.out.println( "father Print�޼ҵ�");
	}
	
	public void methodTest() {
		System.out.println("test method");
	}
	
	//�������̵�(�޼ҵ� �������̵�) : ��ӹ������� ����Ŭ������ �����ϴ°�
	public void grandPrint() {
		System.out.println("�Ҿƹ��� grandPrint �޼ҵ带 father�� ������");
	}
}//class
