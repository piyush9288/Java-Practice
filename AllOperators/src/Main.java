public class Main {
    public static void main(String[] args) {
        //Assignment operator ( = ) : right hand operand ->left hand operand
        int myNumber = 9;
        System.out.println( myNumber);
        int number = myNumber;
        System.out.println( number);
        //9 = number;//this is wrong method

        // Arithmetic operator(+,-,*,/,%)
        int sum = myNumber + number;
        System.out.println("sum : " + sum);
        int subtraction = myNumber - number;
        System.out.println("subtraction : " + subtraction);
        int multiplication = myNumber * number;
        System.out.println("multiplication : " + multiplication);
        int division = myNumber/number;
        System.out.println("division : " + division);
        int modulus = myNumber%number;
        System.out.println("modulus : " + modulus);

        // order of operator
        System.out.print("BODMAS: ");

        System.out.println(8-2/2-2);

        //shorthand operator
        int x = 1;
        x += myNumber;
        System.out.println(x);
        x -= myNumber;
        System.out.println(x);
        x *= myNumber;
        System.out.println(x);
        x /= myNumber;
        System.out.println(x);
        x %= myNumber;
        System.out.println(x);

        //unary operator
        System.out.println("unary operator:");
        //convert positive to negative and negative to positive...
        int y = 1;
        int z = -y;
        System.out.println(z);
        int p = 5;
        //post increment
        System.out.println(p++);
        //post decrement
        System.out.println(p--);
        //pre increment
        System.out.println(++p);
        //pre decrement
        System.out.println(--p);

    }
}