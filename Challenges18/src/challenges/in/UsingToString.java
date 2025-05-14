package challenges.in;

public class UsingToString {
    // Write a method concatenate Strings that takes variable arguments
    //of String type and concatenates them into a single string.
    public static String concatenation(String... str){
        StringBuilder sb = new StringBuilder();
        for(String ele : str){
            sb.append(ele);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = concatenation("ram ","is ","good ","boy ");
        System.out.println(str);
    }
}
