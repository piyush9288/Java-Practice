//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("This is StringBuilder ");
        sb.append("it is use for single threading ");
        sb.append("this is mutable");
        //sb.toString(); // by default use toString();
        System.out.println(sb);
    }
}