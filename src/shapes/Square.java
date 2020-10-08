package shapes;

public class Square extends Rectangle{

    public Square(double side){
        super(side,side);
    }

    public double getPerimeter(){
        System.out.println("From square class-");
        //added sout to tell what method is being used
        return this.length * 4;
    }

    public double getArea(){
        System.out.println("From square class-");
        //added sout to tell what method is being used
        return Math.pow(this.length, 2);
    }


}
