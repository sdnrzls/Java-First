package interfaceTest;

public class Won2Dollar extends Converter {
	
	public Won2Dollar(double don) {
		super.ratio = don;
	}

	@Override
	public double convert(double src) {
		return src/ratio;
	}

	@Override
	String srcString() {
		return "¿ø";
	}

	@Override
	String destString() {
		return "´Þ·¯";
	}

}
