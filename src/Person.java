public class Person {

//  Object basics
    private String name;

    public Person(String Name){
       name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String personName) {
        this.name = name;
    }


    public void sayHello() {
        System.out.printf("hello %s", this.name);
    }

    public static void main(String[] args) {
        Person bob = new Person("Bob");
        System.out.println("bob's name = " + bob.getName());
        bob.setName("amanda");
        bob.sayHello();


//  Understanding references

//
//    1 = true, they are both "John" 2= false, they are different objects
//    and have different numbers


//    Person person1 = new Person("John");
//    Person person2 = person1;
//    System.out.println(person1 == person2);
//  true, they are now the some since they are made equal

    Person person1 = new Person("John");
    Person person2 = person1;
    System.out.println(person1.getName());
    System.out.println(person2.getName());
    person2.setName("Jane");
    System.out.println(person1.getName());
    System.out.println(person2.getName());
//  first 2 souts are John, second set is Jane.
//  it cascades so the second person 2 resets the object
    }
}
