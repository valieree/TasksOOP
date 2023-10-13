package vsu.course2.task5;

import java.util.List;
import java.util.Objects;

public class StudentChange {
    private int course;
    private String name;
    private List<Integer> marks;

    public StudentChange(int course, String name, List<Integer> marks) {

        this.course = course;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        StudentChange that = (StudentChange) object;
        return course == that.course && Objects.equals(name, that.name) && Objects.equals(marks, that.marks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(course, name);
    }
}
