public class Student {
    public static void main(String[] args) {
        Course.setMaxCapacity(6);
        Course eStudentName = new Course("Java",6);
        Course est = new Course(7);
        eStudentName.enrollStudent("Ram");
        est.enrollStudent("Ram");
        eStudentName.unEnrollStudent("Sita");
    }
}
