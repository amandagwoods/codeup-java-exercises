package shapes;

public class ShapesTest {

    public static void main(String[] args){
        Rectangle box1 = new Rectangle(4,5);
        Rectangle box2 = new Square (5);

        System.out.println("Box 1 perimeter =" + box1.getPerimeter());
        System.out.println("Box 1 area =" + box1.getArea());
        System.out.println("Box 2 perimeter =" + box2.getPerimeter());
        System.out.println("Box 2 area =" + box2.getArea());
    }
}