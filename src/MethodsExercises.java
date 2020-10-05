import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//    Basic Arithmetic
        System.out.println(add(2,3));
        System.out.println(sub(5,3));
        System.out.println(multi(2,3));
        System.out.println(dev(6,3));
        System.out.println(mod(7,3));
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

    public static int mod(int a, int b){
        return a % b;
    }

}

