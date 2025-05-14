package in.challenges;

public enum Week {
    Monday("WeeekDay"), Tuesday("WeeekDay"), Wednesday("WeeekDay"), Thursday("WeeekDay"), Friday("WeeekDay"), Saturday("Weeekend"), Sunday("Weeekend");

    private String days;
    Week(String days){
        this.days = days;
    }
    public String getDays(){
        return days;
    }
}
