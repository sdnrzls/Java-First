package day07;

public class IPTV extends ColorTV {
	protected String address;
	public IPTV(String address,int inch, int color) {
		super(inch,color);
		this.address = address;	
	}
	
@Override
public void printProperty() {
	System.out.println("���� IPTV�� : "+address+"�ּ�" );
	super.printProperty();
}
		
		
	
}//class
