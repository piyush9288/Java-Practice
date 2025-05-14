package in.challenges;

public class Testing {
    public static void main(String[] args) {
        for(Week week: Week.values()){
            System.out.println(week + " " + week.getDays());
        }
    }
}
