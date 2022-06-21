package tryOuts.rect;

class RectangleFactory{
        public static Rectangle generateRectangle1(double length, double diagonal){
            return new Rectangle(length, Math.sqrt((Math.pow(diagonal,2)-Math.pow(length,2))));
        }
        public static Rectangle generateRectangle2(double length, double width){
            return new Rectangle(length, width);
        }
    }