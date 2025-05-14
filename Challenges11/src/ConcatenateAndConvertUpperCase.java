public class ConcatenateAndConvertUpperCase {
    String name ;
    String treeName;
    ConcatenateAndConvertUpperCase(String name,String treeName){
        this.name = name;
        this.treeName = treeName;
    }
    public static void main(String[] args) {
        // Concatenate and Convert: Take two strings, concatenate them,
        //and convert the result to uppercase
        ConcatenateAndConvertUpperCase con = new ConcatenateAndConvertUpperCase("Ram",
                "Banyan");
        //concatenation operator
        System.out.println("Name: " + con.name + " , " + "Tree Name: " +con.treeName);

        //convert the result to uppercase (%s -> %S)
        System.out.printf("Name: %S , Tree Name: %S",con.name,con.treeName);
    }
}
