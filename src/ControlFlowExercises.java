public class ControlFlowExercises {
    public static void main(String[] args) {
//  1 a.
        //while loop count 5 to 15

        int i = 5;
        while (i <= 15) {
            System.out.println("while loop- i: " + i);
            i++;
        }

//    b.
        //while loop count by 2s 0 to 100

        int counter = 0;
        do{
            System.out.println(counter);
            counter += 2;
        } while (counter <= 100);
        //while loop count backwards by 5s 100 to -10

        int count = 100;
        do{
            System.out.println(count);
            count -= 5;
        } while (count >= -10);

//    c.
        //for loop count 5 to 15
        for (int a = 5; a <= 15; a += 1) {
            System.out.println("for loop- a:" + a);
        }

        //for loop count by 2s 0 to 100
        for (int b = 2; b <= 100; b++) {
            if (b % 2 == 1) {
                continue;
            }
            System.out.println("b = " + b);
        }

        //for loop count backwards by 5s 100 to -10
        for (int c = 100; c >= -10; c -= 5) {
            if (c % 5 == 1) {
                continue;
            }
            System.out.println("c =" + c);
        }
//2.
        //FizzBuzz
        for (int z = 1; z <= 100; z++)
        {
            if (((z % 5) == 0) && ((z % 7) == 0))
                System.out.println("fizzbuzz");
            else if ((z % 5) == 0)
                System.out.println("fizz");
            else if ((z % 7) == 0)
                System.out.println("buzz");
            else
                System.out.println(z);
        }

//2.
        //Table of Powers

    }
}