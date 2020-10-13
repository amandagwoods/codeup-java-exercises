package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args){

        HashMap<String,Student> students = new HashMap<>();
        Student s1 = new Student ("Amanda");
        s1.addGrade(100);
        s1.addGrade(95);
        s1.addGrade(87);
        Student s2 = new Student ("Trey");
        s2.addGrade(85);
        s2.addGrade(76);
        s2.addGrade(81);
        Student s3 = new Student("Michael");
        s3.addGrade(99);
        s3.addGrade(88);
        s3.addGrade(98);
        Student s4 = new Student("Averie");
        s4.addGrade(55);
        s4.addGrade(62);
        s4.addGrade(32);

        students.put("amanda1987", s1);
        students.put("trey1990", s2);
        students.put("michael1994", s3);
        students.put("averie2014", s4);

        System.out.println("Welcome!\n\n" +
            "Here are the GitHub usernames of our students\n\n"
            );

        searchUser(students);
    }
       public static void searchUser(HashMap<String,Student> students){

            Scanner sc = new Scanner(System.in);
            System.out.println("\nWhat student would you like more information on?\n");

            String searchedUser = sc.nextLine();

            if(students.containsKey(searchedUser)){
                System.out.println("\nName: " + students.get(searchedUser).getName()
                + "\nCurrent Average: " + students.get(searchedUser).getGradeAverage() + "\n");
            }else
                System.out.println("\nSorry, no student was found with the Github " +
                        "username of \"" + searchedUser + "\".\n");
            System.out.println("Would you like to see another student?\n");

            String input = sc.next();

            if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")){
            searchUser(students);
            } else {
            System.out.println("\nGoodbye, and have a wonderful day!");
            }
    }
}
