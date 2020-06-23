package day07;

public class IPTV extends ColorTV {
	protected String address;
	public IPTV(String address,int inch, int color) {
		super(inch,color);
		this.address = address;	
	}
	
@Override
public void printProperty() {
	System.out.println("나의 IPTV는 : "+address+"주소" );
	super.printProperty();
}
		
		
	
}//class
