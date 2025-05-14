package in.map;

public class TestingEnum {
    public static void main(String[] args) {
        //Grades grades = Grades.A;
        //Grades grade = Grades.valueOf("A");
        for(Grades str : Grades.values()){
            System.out.println(str + " "+ str.getActions());
        }
    }
}
