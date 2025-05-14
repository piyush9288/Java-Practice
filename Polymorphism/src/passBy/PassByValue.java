package passBy;

public class PassByValue {
    public static void main(String[] args) {
        int x=5;
        int y=10;
        System.out.println(sum(x,y));
        System.out.println(x);

    }
    public static int sum(int a,int b){
        //a+=b;
        a = 15;
        return a;
    }
}
