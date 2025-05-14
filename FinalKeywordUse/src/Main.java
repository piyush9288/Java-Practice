//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    final double pi = Math.PI;
//
//    Main(double pi){
//        this.pi = pi; //not change pi value because i'm use final keyword then it is convert constant
//    }
    public static void main(String[] args) {
        //final keyword is used to defined constant value e.g: pi ,exponential etc.
        Main mn = new Main();
        System.out.println(mn.pi);

    }
}