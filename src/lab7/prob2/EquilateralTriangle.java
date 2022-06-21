package lab7.prob2;

public class EquilateralTriangle implements Polygon{
	final private double side;
	
	EquilateralTriangle(double s){
		side=s;
	}

	@Override
	public double getSide() {		
		return side;
	}

	@Override
	public double getNoOfSides() {
		return 3;
	}
	
	

}
