package vsu.course2.task5;

import java.util.Objects;

public class Student {
    private int course;
    private String name;

    public Student(int course, String name) {
        this.course = course;
        this.name = name;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object== null) {
            return false;

        }
        if( this. getClass() != object.getClass())  {
            return false;
        }
        Student student = (Student) object;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
