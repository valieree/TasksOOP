package vsu.course2.task5;


import java.util.Objects;

public class Passport {
    private int number;
    private int series;

    public Passport(int number, int series) {
        this.number = number;
        this.series = series;
    }

    public int getNumber() {
        return number;
    }

    public int getSeries() {
        return series;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object== null) {
            return false;
        }
        if(this.getClass() != object.getClass()) {
            return false;
        }
        Passport passport = (Passport) object;
        return number == passport.number && series == passport.series;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, series);
    }
}
