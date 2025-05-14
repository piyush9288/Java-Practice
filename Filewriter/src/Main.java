import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String fileName = "example.exe";
        //try with resource (A resource is an object that must be closed after the program is finished with it)
        try(FileWriter writer = new FileWriter(fileName)){
                writer.write("this is best java practice");
                writer.flush();
            System.out.println("Successfully written to the java");
        } catch (IOException e) {
            System.out.println("An error occurred");
            throw new RuntimeException(e);
        }
    }
}