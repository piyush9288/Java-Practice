//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        System.out.println("before the loop");
//        for(int i = 0; i < 100; i++){
//            if(i==10){
//                break;
//            }
//            System.out.println(i);
//        }
//        System.out.println("After the loop");

        System.out.println("before the loop");
        for(int i = 0; i < 100; i++){
            if(i==10){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("After the loop");
    }
}