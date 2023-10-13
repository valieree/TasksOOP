package vsu.course2.task5;


import java.util.Objects;

public class StudentWithPassport {
    Passport passport;
    private int course;

    public StudentWithPassport(Passport passport, int course) {
        this.passport = passport;
        this.course = course;
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
        StudentWithPassport that = (StudentWithPassport) object;
        return course == that.course && Objects.equals(passport, that.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport, course);
    }
}
