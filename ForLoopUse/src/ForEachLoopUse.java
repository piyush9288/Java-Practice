public class ForEachLoopUse {
    public static void main(String[] args) {
        String[] name = new String[]{
          "Ram" , "Shyam" , "Gita"
        };
        printArray(name);
    }
     public static void printArray(String[] array){
        for(String name : array){
            System.out.println(name);
        }
     }
}
