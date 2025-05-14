//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int marks = 456894464;
        String name = "Piyush";
        //it's use more space in memory (avoid every time when multiple uses)
        System.out.println("Hello " + name + " Your marks is: " + marks);
        //this is used to less the memory(not use concatenation
        System.out.printf("Hello %s (printf specifier) Your marks is: %d", name, marks);

        //printf flag use

        System.out.printf("Hello %s Your marks is: %5d \n", name, marks);
        System.out.printf("Hello %10s Your marks is: %-10d \n", name, marks);
        System.out.printf("Hello %S Your marks is: %-+5d \n", name, marks);
        System.out.printf("Hello %-5s Your marks is: %+d \n", name, marks);
        System.out.printf("Hello %s Your marks is: %,5d \n", name, marks);
        System.out.printf("Hello %s Your marks is: %0,5d \n", name, marks);
        System.out.printf("Hello %s Your marks is: % d \n", name, marks);
    }
}