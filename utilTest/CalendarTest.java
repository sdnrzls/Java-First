package utilTest;

import java.util.Calendar;

public class CalendarTest {
	private static String yul;

	public static void printCalendar(String msg, Calendar cal) {
		//��,��,��
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println(year +"/" +month+"/"+day);
		//����
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		int d = cal.get(Calendar.DAY_OF_WEEK);
		switch(d) {
		case Calendar.SUNDAY : yul="��"; break;
		case 2 : yul="��"; break;
		case 3 : yul="ȭ"; break;
		case 4 : yul="��"; break;
		case 5 : yul="��"; break;
		case 6 : yul="��"; break;
		case 7 : yul="��"; break;
		}
		
		//�迭
		String[]arr = {"��","��","ȭ","��","��","��","��"};
		System.out.println("�迭���� : " + arr[cal.get(Calendar.DAY_OF_WEEK)]);
		System.out.println("switch ���� : " + yul);
		System.out.println(Calendar.SATURDAY);
		System.out.println(yul+"����" );
		
		System.out.println(Calendar.SUNDAY);
		int ampm = cal.get(Calendar.AM_PM);
		String ampmstr="";
		/*
		if(ampm==Calendar.AM) {
			ampmstr="����";
		}else {
			ampmstr="����";
		};
		*/
		ampmstr = (ampm==Calendar.AM)?"����":"����";
		int h = cal.get(Calendar.HOUR_OF_DAY);
		int m = cal.get(Calendar.MINUTE);
		int s = cal.get(Calendar.SECOND);
		System.out.println("����ð� : "+ampmstr+h+":"+m+":"+s);
	}

	public static void main(String[] args) {
		Calendar now =Calendar.getInstance();//�߻��̶� new ��� �Ұ���
		CalendarTest.printCalendar("Birthday", now);
		now.set(1993,6,5);
	
		
		
	}//main
}//class
