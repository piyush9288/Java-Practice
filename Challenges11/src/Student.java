public class Student {

    String name;
    int age ;

    Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student {" +
                "name = '" + name + '\'' +
                ", age = " + age +
                '}';
    }

    public static void main(String[] args) {
        //Define a Student class with fields like name and age, and use
        //toString to print student details.
        Student student = new Student("Ram" , 50);
        System.out.println(student.toString());


    }
}