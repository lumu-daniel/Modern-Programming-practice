package lab7.prob2;

public class Ellipse implements ClosedCurve {
	
	final private double a;
	final private double e;
	
	public Ellipse(double a, double e) {
		this.a=a;
		this.e=e;
	}

	@Override
	public double computePerimeter() {
		return 4*a*e;
	}
	
}
