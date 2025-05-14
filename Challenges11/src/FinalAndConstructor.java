public class FinalAndConstructor {
    //Create an object with final fields and a constructor to initialize
    //them.
    public final String name ;
    public final int primaryId;
    public FinalAndConstructor(String name,int primaryId){
        this.name = name;
        this.primaryId  = primaryId;
    }
    public String toString(){
        return "ID Card: {" +
                "Name: " + name + ","
                + "Primary ID: '" + primaryId + '\''
                + "}";
    }
    public static void main(String[] args) {
        FinalAndConstructor fac = new FinalAndConstructor("Ram", 1001);
        System.out.println(fac);
    }
}
