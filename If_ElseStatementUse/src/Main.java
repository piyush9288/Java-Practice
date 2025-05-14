public class Main {
    public static void main(String[] args) {
        // single if-else use
        boolean isMan = true;
        String name = "Bob";
        if(isMan){
            System.out.println("Mr." + name);
        }else{
            System.out.println("Ms." + name);
        }
        //multiple if-else use

        boolean isStudent = false;
        boolean isGirl = false;
        if(isStudent){
            System.out.println("Hello Student");
        }else{
            if(isGirl){
                System.out.println("Hello Girl");
            }
            else{
                System.out.println("Hello Boy");
            }
        }

        // if-else ladder

        boolean isTeacher = false;
        boolean isWoman = false;
        if(isTeacher){
            System.out.println("Good Morning Teacher");
        }else if(isWoman){
                System.out.println("hello ma'am");
        }
        else{
            System.out.println("Hello sir");
        }
    }
}