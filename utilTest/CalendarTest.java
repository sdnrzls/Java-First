package utilTest;

import java.util.Calendar;

public class CalendarTest {
	private static String yul;

	public static void printCalendar(String msg, Calendar cal) {
		//년,월,일
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println(year +"/" +month+"/"+day);
		//요일
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		int d = cal.get(Calendar.DAY_OF_WEEK);
		switch(d) {
		case Calendar.SUNDAY : yul="일"; break;
		case 2 : yul="월"; break;
		case 3 : yul="화"; break;
		case 4 : yul="수"; break;
		case 5 : yul="목"; break;
		case 6 : yul="금"; break;
		case 7 : yul="토"; break;
		}
		
		//배열
		String[]arr = {"일","월","화","수","목","금","토"};
		System.out.println("배열요일 : " + arr[cal.get(Calendar.DAY_OF_WEEK)]);
		System.out.println("switch 요일 : " + yul);
		System.out.println(Calendar.SATURDAY);
		System.out.println(yul+"요일" );
		
		System.out.println(Calendar.SUNDAY);
		int ampm = cal.get(Calendar.AM_PM);
		String ampmstr="";
		/*
		if(ampm==Calendar.AM) {
			ampmstr="오전";
		}else {
			ampmstr="오후";
		};
		*/
		ampmstr = (ampm==Calendar.AM)?"오전":"오후";
		int h = cal.get(Calendar.HOUR_OF_DAY);
		int m = cal.get(Calendar.MINUTE);
		int s = cal.get(Calendar.SECOND);
		System.out.println("현재시각 : "+ampmstr+h+":"+m+":"+s);
	}

	public static void main(String[] args) {
		Calendar now =Calendar.getInstance();//추상이라서 new 사용 불가능
		CalendarTest.printCalendar("Birthday", now);
		now.set(1993,6,5);
	
		
		
	}//main
}//class
