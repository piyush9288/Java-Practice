package challenges.in.Grade;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueIn {
    public static void main(String[] args) {
        //Create a PriorityQueue of a custom class Student with attributes
        //name and grade. Use a comparator to order by grade.
        Comparator<Student> gradecomparator = (s1,s2) -> Integer.compare(s1.grade,s2.grade);
        PriorityQueue<Student> pq = new PriorityQueue<>(gradecomparator);
        pq.add(new Student("Aman",85));
        pq.add(new Student("Sita",35));
        pq.add(new Student("Gita",56));
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
