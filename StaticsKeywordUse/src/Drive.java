public class Drive {
    // why is use static in main method
    // because don't create an object of main{Drive Main = new Drive());  Main.main();} ny JVM
    static int highAge = 80;
    int age = 18;
    // static access to static.
    // static not access to Non-static Because of that an object will have to be created (therefor create an object)
    // static access to static
    public static void main(String[] args) {
        //static keyword : not create an object
        //Car swift = new Car(); ->not use,not create an object
        //direct access
        //not follow object-oriented. this is used to procedural process(c/c++)
        Car.drive();
        System.out.println(Drive.highAge); //static access to static instance values
        // System.out.println(Drive.age); not access because age is non-static then static don't access non-static directly , you are create an object then access.

    }
}
