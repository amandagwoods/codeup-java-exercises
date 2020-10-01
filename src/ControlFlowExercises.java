import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//  1 a.
        //while loop count 5 to 15

//        int i = 5;
//        while (i <= 15) {
//            System.out.println("while loop- i: " + i);
//            i++;
//        }

//    b.
        //do while loop count by 2s 0 to 100

//        int counter = 0;
//        do{
//            System.out.println(counter);
//            counter += 2;
//        } while (counter <= 100);
//
//        //do while loop count backwards by 5s 100 to -10
//
//        int count = 100;
//        do{
//            System.out.println(count);
//            count -= 5;
//        } while (count >= -10);
//
//        //do while loop starts at 2 squared less than 1 mill
//        long m = 2;
//        do{
//            System.out.println(m);
//            m *= m;
////            m = m * m;
//        }while (m < 1000000L);


//    c.
        //for loop count 5 to 15
//        for (int a = 5; a <= 15; a += 1) {
//            System.out.println("for loop- a:" + a);
//        }

        //for loop count by 2s 0 to 100
//        for (int b = 2; b <= 100; b++) {
//            if (b % 2 == 1) {
//                continue;
//            }
//            System.out.println("b = " + b);
//        }

        //for loop count backwards by 5s 100 to -10
//        for (int c = 100; c >= -10; c -= 5) {
//            if (c % 5 == 1) {
//                continue;
//            }
//            System.out.println("c =" + c);
//        }

        //for loop starts at 2 squared less than 1 mill

//        for (long dog =2; dog < 1000000; dog *= dog){
//            System.out.println(dog);
//        }
//2.
        //FizzBuzz
//        for (int z = 1; z <= 100; z++) {
////          if(i % 15 == 0)
//            if (((z % 3) == 0) && ((z % 5) == 0))
//                System.out.println("fizzbuzz");
//            else if ((z % 3) == 0)
//                System.out.println("fizz");
//            else if ((z % 5) == 0)
//                System.out.println("buzz");
//            else
//                System.out.println(z);
//        }

//3.
        //Table of Powers
        Scanner scanner = new Scanner(System.in);
        boolean userContinues = true;

        do{
            System.out.println("What number would you like to go up to?");
            int userInt = scanner.nextInt();
            System.out.println("Here is your table!");
            System.out.println("");
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");
            for(int i = 1; 1 <= userInt; i++){
                System.out.printf("%-6d", i); //makes a column that is 6 spaces wide
                System.out.print(" | ");
                System.out.printf("%-7d", i * i);
                System.out.print(" | ");
                System.out.print(i * i * i);
                System.out.println();
            }
            System.out.println("Would you like to enter another number? (y/n");
            String userResponse = scanner.next();
            if(!userResponse.equalsIgnoreCase("y")){
                userContinues = false;
            }
        } while (userContinues);
    }
}