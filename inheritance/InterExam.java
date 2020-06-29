package inheritance;
interface InterTest{
	public void test();
}//interface InterTest

interface InterShap{
	public  void draw();
	public  void move();
	public  void print();
}//interface InterShap

class InterCircle implements InterShap,InterTest{
	public void draw() {
	}
	public void move() {
	}
	public void print() {
	}
	public void test() {
	}	
}//InterCircle class

class Inter{
	public void interTest() {
		
	}
}//Inter class

class InterRectangle extends Inter implements  InterShap{
	@Override
	public void draw() {
	}
	@Override
	public void move() {
	}
	@Override
	public void print() {		
	}
	
}//InterRectangle extends Inter implements  InterShap class

public class InterExam {

}//InterExam class
