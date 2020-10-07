import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] persons = new Person[3];

        persons[0] = new Person ("Amanda");
        persons[1] = new Person ("Trey");
        persons[2] = new Person ("Michael");

       Person[] copyOfPersons = Arrays.copyOf(persons, persons.length+1);

       System.out.println("copyOfPerson =" + copyOfPersons.length);
       copyOfPersons[3] = new Person ("Phoenix");
       System.out.println("Arrays.toString(copyOfPersons) =" + Arrays.toString(copyOfPersons));

       for(Person p: persons){
           System.out.println(p.getName());
       }
    }
}
