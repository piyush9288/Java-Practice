import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employees {
    static class Employee {
        private String name;
        private double salary;

        // Constructor
        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        // Getters
        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }

        // toString for easy printing
        @Override
        public String toString() {
            return name + " - $" + salary;
        }
    }
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 75000),
                new Employee("Bob", 50000),
                new Employee("Charlie", 60000),
                new Employee("Diana", 85000)
        );
        Comparator<Employee> salary = Comparator.comparingDouble(Employee::getSalary);
        List<Employee> sortedList = employees.stream()
                .sorted(salary)
                .collect(Collectors.toList());
        sortedList.forEach(System.out::println);
    }
}
