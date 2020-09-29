import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f.", pi);

        Scanner sc = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = sc.nextInt();
        System.out.printf("You are %s years old.\n", age);

        //explore scanner class
        System.out.println("What are your 3 favorite colors?");
        String color1 = sc.next();
        String color2 = sc.next();
        String color3 = sc.next();
        System.out.printf("Your favorite colors are %s %s %s.\n", color1, color2, color3);
        sc.nextLine(); //tells the computer to look for the next enter key instead of moving to end.

        System.out.println("What are your 3 favorite colors?");
        String faveColors = sc.nextLine();
        System.out.printf("Wow! I really like %s too! They're great colors.\n", faveColors);

        //calculate area and perimeter of room
        System.out.println("What is the width of the room?");
        int length = Integer.parseInt(sc.nextLine());
        System.out.println("What is the length of the room?");
        int width = Integer.parseInt(sc.nextLine());
        int area = length * width;
        int perimeter = (2 * length) + (2 * width);

        System.out.printf("The area is: %d.\n", area);
        System.out.printf("The perimeter is: %d.\n", perimeter);

    }
}