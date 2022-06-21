package tryOuts.rect;

public class Rectangle {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double computeArea(){
        return length*width;
    }
}
