package day04;

public class personmain {

	public static void main(String[] args) {
		/*person ��ü p1�����
		 * p1�̸� - ȫ�浿
		 * p1�ּ� - �λ�
		 * ȫ�浿 �����Ѵ�
		 */
		person p1 =new person();
		p1.name = "ȫ�浿";
		p1.ad = "�λ�";
		p1.study();
		
		Bank b= new Bank("���ڹ�",5000);
		b.getmoney();
		
		Baby baby = new Baby();
		baby.name = "�ֱ�";
		baby.cry();
		Baby baby1 = new Baby("��ֱ�");
		baby1.cry();
		
		//������ 10�� ���
		Gugudan gugudan = new Gugudan(10);
		gugudan.viewData();
	
	}//main
}//class
