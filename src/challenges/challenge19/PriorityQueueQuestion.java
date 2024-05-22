package challenges.challenge19;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueQuestion {
    public static void main(String[] args) {
        Student student1 = new Student("Saurabh", 'A');
        Student student2 = new Student("Gaurav", 'B');
        Student student3 = new Student("Suman", 'A');
        Student student4 = new Student("Aman", 'A');

        Queue<Student> queue = new PriorityQueue<>();
        queue.add(student1);
        queue.add(student2);
        queue.add(student3);
        queue.add(student4);

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.poll());
    }

}
