package day07;

public class ColorTV extends TV{
	protected int color;
	public ColorTV(int inch, int color) {
		super(inch);
		this.color = color;
	}

	public void printProperty() {
	System.out.println(inch +"인치 " +color+ "컬러");
	}

}
