package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(double aLength, double aWidth) {
        super(aLength, aWidth);
    }

    @Override
    public void setLength(double x) {
        this.length = x;
    }

    @Override
    public void setWidth(double x) {
        this.width = x;
    }

    @Override
    public double getPerimeter() {
        return (this.length * 2) + (this.width * 2);
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }


//    ----code from
//    protected double length;
//    protected double width;
//
//    public Rectangle(double userLength, double userWidth){
//        this.length = userLength;
//        this.width = userWidth;
//    }
//
//    public double getArea(){
//        return this.length * this.width;
//    }
//
//    public double getPerimeter(){
//        return (2 * this.length) + (2 * this.width);
//    }
}
