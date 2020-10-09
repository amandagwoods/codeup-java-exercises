package shapes;

public class ShapesTest {

     public static void main(String[] args){
        Measurable myShape1 = new Rectangle(5,4);
        System.out.println("Shape 1 perimeter =" + myShape1.getPerimeter());
        System.out.println("Shape 1 area =" + myShape1.getArea());

        Measurable myShape2 = new Square(5);
        System.out.println("Shape 2 perimeter =" + myShape2.getPerimeter());
        System.out.println("Shape 2 area =" + myShape2.getArea());


//        Rectangle box1 = new Rectangle(4,5);
//        Rectangle box2 = new Square (5);
//
//
//        System.out.println("Box 1 perimeter =" + box1.getPerimeter());
//        System.out.println("Box 1 area =" + box1.getArea());
//        System.out.println("Box 2 perimeter =" + box2.getPerimeter());
//        System.out.println("Box 2 area =" + box2.getArea());
    }
}
