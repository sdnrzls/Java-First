package day04;

public class Traingle {
	double Bottom;
	double Height;
	
	public Traingle(double Bottom, double Height) {
		this.Bottom = Bottom;
		this.Height = Height;
	}
	public void  setBottom(double Bottom) {
		this.Bottom = Bottom;
	}
	public void setHeight(double Height) {
		this.Height  = Height;
	}
	public double getArea() {
			return (Bottom*Height)/2;
	}
	
}//class
