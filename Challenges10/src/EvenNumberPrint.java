public class EvenNumberPrint {
    public static void main(String[] args) {
        int num = Main.input();
        for(int i =1;i<num;i++){
            if(i%2!=0){
                continue;
            }
            System.out.println(i);
        }
    }
}
