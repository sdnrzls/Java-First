package day07;

public class AbsShapeMain {

	public static void main(String[] args) {
		
		AbsCircle ac = new AbsCircle();
		ac.draw();
		ac.move();
		
		AbsSquare as = new AbsSquare();
		as.draw();
		as.move();
		
		AbsShape ah = new AbsCircle();

	}

}
