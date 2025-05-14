package challenges.in.Grade;

public class Student {
    String name;
    int grade;
    Student(String name,int grade){
        this.name = name;
        this.grade = grade;
    }
    public String toString(){
        return "Name: " + name+" " + "Grade: " + grade;
    }
}
