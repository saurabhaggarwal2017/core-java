package challenges.challenge13;

public class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Student(String name) {
        this(name, 0);
    }

    @Override
    public String toString() {
        return "Student {name = " + this.name + ", age = " + this.age + "}";
    }

    public static void main(String[] args) {
        Student std = new Student("saurabh", 23);
        System.out.println(std);
    }
}
