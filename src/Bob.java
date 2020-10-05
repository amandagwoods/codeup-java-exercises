import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Let's talk with Bob!");
        String input = sc.nextLine().trim();

        if(input.endsWith("?")){
            System.out.println("Sure.");
        }else if (input.endsWith("!")){
            System.out.println("Whoa, chill out!");
        }else if (input.endsWith(" ")){
            System.out.println("Fine. Be that way!");
        }else{
            System.out.println("Whatever.");
        }

    }
}
