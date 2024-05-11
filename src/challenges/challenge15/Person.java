package challenges.challenge15;

import javax.swing.*;
import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person(int age, String name) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;

        Person per = (Person) obj;
        return per.name.equals(this.name) && per.age == this.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
