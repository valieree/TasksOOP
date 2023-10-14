package vsu.course2.task5;


import java.util.Objects;

public class Passport {
    private String number;
    private String series;

    public Passport(String number, String series) {
        this.number = number;
        this.series = series;
    }

    public String getNumber() {
        return number;
    }

    public String getSeries() {
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
        if (this.getClass() != object.getClass()) {
            return false;
        }
        Passport passport = (Passport) object;
      //  return number == passport.number && series == passport.series;
        return Objects.equals(this.number, passport.number) && Objects.equals(this.series, passport.series);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, series);
    }


}
