import java.util.Objects;

public class Course {
    // • Instance variables: courseName, enrolledStudents.
    // • Static variable: maxCapacity, the maximum number of students for any
    //course.
    // • Instance methods: enrollStudent(String studentName), unenrollStudent(String studentName).
    // • Static method: setMaxCapacity(int capacity), to set the maximum
    //capacity for courses

    String courseName;
    int enrolledStudents;
    String studentName1;
    static int maxCapacity;

    static{
        maxCapacity = 100;
    }
    {
        enrolledStudents++;
    }
    Course(String courseName,int enrolledStudents){
        this.courseName = courseName;
        this.enrolledStudents = enrolledStudents;
    }

    Course(int enrolledStudents){
        this("courseName",enrolledStudents);
    }

    static void setMaxCapacity(int capacity){
        Course.maxCapacity = capacity;
        System.out.println("Max Capacity: " + maxCapacity);
    }

    void enrollStudent(String studentName){
        if(!Objects.equals(studentName1,studentName)){
            studentName1 = studentName;
            System.out.println("The Enrolled Student Name Is : " + studentName);
            System.out.println("Total Enrolled this course are: " + enrolledStudents);
        }
        else{
            System.out.println("Already Enrolled");
            System.out.println("Total Enrolled this course are: " + enrolledStudents);
        }
    }

    void unEnrollStudent(String studentName){
        if(Objects.equals(studentName1,studentName)){
            System.out.println("Already Enrolled");
            System.out.println("Total Enrolled this course are: " + enrolledStudents);
        }
        else{
            studentName1=studentName;
            System.out.println("Please, Enrolled Now");
            System.out.println("Total Enrolled this course are: " + enrolledStudents);
        }
    }
}