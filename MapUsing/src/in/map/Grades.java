package in.map;

public enum Grades {
    A("Excellent"),B("Very Good"),C("Good"),D("Best Try"),E("Try Hard"),F("Better luck next time");

    private final String actions;

    Grades(String actions) {
        this.actions = actions;
    }
    public String getActions(){
        return this.actions;
    }
}
