package day04;

public class Bank  {
	String name;//�̸� ������� (��������)
	int money;//�ܾ�
	public Bank() {
		
	}
	public Bank(String name, int money) {
		this.name = name;
		this.money = money;
	}
	//�Ա�
	public void inputmoney(int don) {//don ��������
		money+=don; //money=money+don;
	}
	//���
	public void outputmoney(int don) {
		if(money>=don) {
			money -=don; //money= money-don;
		}else {
			System.out.println(name+"���� �ܾ��� �����մϴ�");
		}
	}
	//�ܾ�Ȯ��
	public void getmoney() {
			System.out.println(name+"���� �ܾ� " +money+"�� �Դϴ�");
	}
	public static void main (String[]args) {
		//Bank ��ü b1�� �����
		//b1 �� �̸��� ȫ�浿
		//ȫ�浿�� 5000���� �Ա��ϰ� �ܾ��� Ȯ�� ��
		//ȫ�浿���� �ܾ��� 5000�� �Դϴ�.
		//ȫ�浿�� 3000�� ����ϰ� �ܾ�Ȯ��
		//ȫ�浿���� �ܾ��� 2000�� �Դϴ�
		//b2�� �̸� �̼���
		//�̼��� ���� 10000�� �Ա�
		//�ܾ� Ȯ��
		//�̼��� ���� 20000�� ���
		//�ܾ�Ȯ��
		//�ܾ� ������ �ܾ� ����
		Bank b1 = new Bank();
		b1.name = "ȫ�浿";
		b1.inputmoney(5000);
		b1.getmoney();
		b1.outputmoney(3000);
		b1.getmoney();
		
		Bank b2 = new Bank();
		b2.name = "�̼���";
		b2.inputmoney(10000);
		b2.getmoney();
		b2.outputmoney(20000);
		b2.getmoney();
		
		Bank b3 =new Bank("������",20000);
		b3.getmoney();
	}//main	
}//class
