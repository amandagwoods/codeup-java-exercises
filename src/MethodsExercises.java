import java.sql.SQLOutput;
import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//  Basic Arithmetic
        System.out.println(add(2,3));
        System.out.println(sub(5,3));
        System.out.println(multi(2,3));
        System.out.println(dev(6,2));
        System.out.println(mod(7,3));

//  Create a method that validates that user input
//  is in a certain range
        System.out.println(getInteger(1,10));

//Calculate the factorial of a number.
        while (true){
            System.out.println("factorial() = " + factorial());
            System.out.println("Do you want to continue? y/n");
            String answer = sc.nextLine();
            if(answer.equalsIgnoreCase("n")){
                System.out.println("Well sure, bye.");
                break;
            }

        }

    }

    //    Basic Arithmetic
    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b){
        return a - b;
    }

    public static int multi(int a, int b){
        return a * b;
    }

    public static int dev(int a, int b){
        return a / b;
    }

    public static int mod(int a, int b) {
        return a % b;
  }
//  What happens if we try to divide by zero?
//  --creates a break point "/ by zero", Exception in thread
//
//  Create a method that validates that user input is in a certain range

    public static int getInteger(int min, int max) {
        System.out.printf("What's a number between %d and %d\n", min, max);
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();

        if ((userInput < min) || (userInput > max)) {
            System.out.println("Oh no! Try again.");
            return getInteger(min, max);
        }
        return userInput;
    }
//Calculate the factorial of a number.

        public static long factorial(){
            int userInput = getInteger(1, 10);
            long output = 1;
            for (int counter = 1; counter <= userInput; counter++){
                output *= counter;
            }
            return output;
        }

    }
