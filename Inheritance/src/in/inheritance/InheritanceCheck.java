package in.inheritance;

public class InheritanceCheck {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.commits();
        System.out.printf("Number of tiers: %d\n" , vehicle.numberOfTiers);
        System.out.println(vehicle.toString());
        System.out.println(vehicle.hashCode());
        System.out.println(vehicle.getClass());
        //System.out.println(vehicle.);

        TwoWheeler twoWheeler = new TwoWheeler();
        twoWheeler.commits();
        System.out.printf("Number of tiers: %d\n" , twoWheeler.numberOfTiers);
        System.out.println(twoWheeler.toString());
        System.out.println(twoWheeler.hashCode());
        System.out.println(twoWheeler.getClass());
        twoWheeler.balance();
    }
}
