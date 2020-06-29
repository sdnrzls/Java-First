package interfaceTest;

public class Km2Mile extends Converter {
	public Km2Mile(double ratio) {
		super.ratio = ratio;
	}

	@Override
	public double convert(double src) {
		
		return src/ratio;
	}

	@Override
	String srcString() {
		return "Km";
	}

	@Override
	String destString() {
		return "mile";
	}
}
