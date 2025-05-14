package in.inheritance;

public class TwoWheeler extends Vehicle{

//    TwoWheeler(int num ){
//        numberOfTiers=num;
//    }
    TwoWheeler(){
        numberOfTiers=2;
    }

    public void balance() {
        System.out.println("there are two tiers");
    }
}
