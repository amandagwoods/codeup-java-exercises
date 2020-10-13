package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;

    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName(){
        return this.name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        int average = 0;
        for(int i = 0; i < grades.size(); i++){
            average += grades.get(i);
        }
        return average / grades.size();
    }

    public static void main(String[] args){
        Student s1 = new Student("Amanda");
        s1.addGrade(100);
        s1.addGrade(90);
        System.out.println(s1.getGradeAverage());

    }
}
