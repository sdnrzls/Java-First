package interfaceTest;

import java.util.Scanner;

public abstract class Converter {
	abstract public double convert(double src);
	abstract String srcString();
	abstract String destString();
	protected double ratio;
	Scanner scanner = new Scanner(System.in);
	
	
	public void run() {
		System.out.println(srcString()+"을 "+destString()+"로 바꿉니다.");
		System.out.println(srcString()+"을 입력 하세요>>>");
		double src = scanner.nextDouble();
		double res = convert(src);
		System.out.println("변환 결과:"+res+destString()+"입니다");
	}
}
