import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number of students: ");
        int student = input.nextInt();
        System.out.print("Number of subjectsNumber: ");
        int subjectNumber = input.nextInt();
        //System.out.print("Subjects Names: ");
        String[] subjectsName = new String[subjectNumber];
        //System.out.print("Student Name: ");
        String[] studentName = new String[student];
        int[][] arr = new int[student][subjectNumber];
        for(int i = 0; i < student; i++){
            System.out.print("Enter student name: ");
            studentName[i] = input.next();
            for(int j = 0; j < subjectNumber; j++){
                System.out.print("Enter subject name: ");
                subjectsName[j] = input.next();
                System.out.print(subjectsName[j] + " Enter marks: ");
                arr[i][j] = input.nextInt();
            }
        }
        for(int i = 0; i < student; i++){
            System.out.print(studentName[i] + "-> ");
            for(int j = 0; j < subjectNumber; j++){
                System.out.print(subjectsName[j] + ":" + arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}