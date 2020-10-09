package shapes;

public class Square extends Quadrilateral{
    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getPerimeter(){
        return this.length * 4;

    }

    @Override
    public double getArea(){
        return Math.pow(this.length, 2);
    }

    @Override
    public void setLength(double x){
        this.length = x;
    }

    @Override
    public void setWidth(double x){
        this.width = x;
    }

//    public Square(double side){
//        super(side,side);
//    }
//
//    public double getPerimeter(){
//        System.out.println("From square class-");
//        //added sout to tell what method is being used
//        return this.length * 4;
//    }
//
//    public double getArea(){
//        System.out.println("From square class-");
//        //added sout to tell what method is being used
//        return Math.pow(this.length, 2);
//    }


}
