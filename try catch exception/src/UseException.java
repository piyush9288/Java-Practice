public class UseException {
    static void checkAge(int age) throws ArithmeticException{
        if(age<18){
            throw new ArithmeticException("Access denied - you must be at least 18 Year old");
        }else {
            System.out.println("Access grant - you are old enough");
        }
    }

    public static void main(String[] args) {
        checkAge(8);
    }
}
