package interfaceTest;

import java.util.Scanner;

public abstract class Converter {
	abstract public double convert(double src);
	abstract String srcString();
	abstract String destString();
	protected double ratio;
	Scanner scanner = new Scanner(System.in);
	
	
	public void run() {
		System.out.println(srcString()+"�� "+destString()+"�� �ٲߴϴ�.");
		System.out.println(srcString()+"�� �Է� �ϼ���>>>");
		double src = scanner.nextDouble();
		double res = convert(src);
		System.out.println("��ȯ ���:"+res+destString()+"�Դϴ�");
	}
}
