package util;

import java.util.Scanner;

public class Input {
    private Scanner sc = new Scanner (System.in);

    public String getString(){
        String userString = sc.nextLine();
        return userString;
    }
    public boolean yesNo(){
        System.out.println("Yes or No?");
        String userString = sc.nextLine();
        if(userString.equalsIgnoreCase("y")
                || userString.equalsIgnoreCase("yes")){
            return true;
        }else{
            return false;
        }

    public int getInt (int min, int max){
            System.out.println("What's a number between %d and %d?\n", min, max);
            Scanner sc = new Scanner(System.in);
            int userInput = sc.nextInt();

            if((userInput < min) || (userInput > max)){
                System.out.println("");
            }
        }
    }
}
