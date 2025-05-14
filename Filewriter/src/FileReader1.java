import java.io.*;

public class FileReader1 {
    public static void main(String[] args) {
        String fileName = "example.exe";

        try(FileReader reader = new FileReader(fileName)){
            int read = 0;
            do{
                read = reader.read();
                System.out.print((char)read);
            }while(read != -1);
        }catch (FileNotFoundException exception){
            System.out.printf("FileNotFoundException : %s",exception.getMessage());
        }  catch (IOException e){
            System.out.printf("Exception occurred : %s",e.getMessage());
            throw new RuntimeException(e);
        }
//        catch (Throwable th){
//            System.out.println("i");
//            throw th;
//        }
    }
}
