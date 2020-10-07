package shapes;

import util.Input;

public class CircleTest {
    public static void main(String[] args){
        Input input = new Input();
        double rad = input.getDouble(0,1000);
        Circle pokerChip = new Circle(rad);
        System.out.println("pokerChip.gitCircumference() = " + pokerChip.getCircumference());
            System.out.println("pokerChip.getArea() = " + pokerChip.getArea());
    }
}
