package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();

        if (input.yesNo())
            System.out.println("This returned true");
        else
            System.out.println("Nope, that's false");

        System.out.println(input.getInt(1, 200));
    }
}

