package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    //    ------methods
    public String getString() {
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Yes or No?");
        String input = this.scanner.nextLine();
        return (input.trim().toLowerCase().startsWith("y") ||
                input.trim().toLowerCase().equals("yes"));
//        if (input.equalsIgnoreCase("y")
//                || input.equalsIgnoreCase("yes")) {
//            return true;
//        } else {
//            return false;
//        }
    }

    public int getInt(int min, int max) {
        System.out.printf("What's a number between %d and %d?\n", min, max);
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);
        if (num >= min && num <= max)
            return num;
        return num;
    }

    public double getDouble(int i, int i1) {
    }

//    public int getInt(){
//    }
//    public double getDouble(double min, double max){
//        while (true){
//            System.out.printf("Please ")
//        }
//    }
}



