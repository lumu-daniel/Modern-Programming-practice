package lab7.prob2;

public interface Polygon extends ClosedCurve{
	double getSide();
	double getNoOfSides();
	
    default double computePerimeter()
    {
    	double perimeter = getSide() * getNoOfSides();
        return perimeter;
    }
}
