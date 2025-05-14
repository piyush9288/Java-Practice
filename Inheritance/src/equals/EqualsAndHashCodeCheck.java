package equals;

import java.util.Objects;

public class EqualsAndHashCodeCheck {
    public static void main(String[] args) {
        Person person1 = new Person("ram","123",23);
        Person person2 = new Person("ram","123",23);

        if(person1.equals(person2)){
            System.out.println("equals");
        }else{
            System.out.println("not equals");
        }
    }
}
