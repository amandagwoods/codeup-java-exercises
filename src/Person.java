public class Person {

//  Object basics
    private String name;

    public Person(String personName){
        this.name = personName;
    }

    public String getName() {
        return name;
    }

    public void setName(String personName) {
        this.name = name;
    }

    public void sayHello() {
        System.out.printf("hello %s", this.name);


//  Understanding references

    Person person1 = new Person("John");
    Person person2 = new Person("John");
    System.out.println(person1.getName().equals(person2.getName()));
    System.out.println(person1 == person2);
    }

}
