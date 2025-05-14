package overriding;

public class Car extends Vehicle{
    @Override
    public void onOfWheel() {
        System.out.println("4");
    }
    @Override
    public void service(){
        super.service();
        System.out.println("this is car");
    }


}
