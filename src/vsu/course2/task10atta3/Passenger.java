package vsu.course2.task10atta3;
public class Passenger {

    private String name;
    private String passportNumber;

    public boolean isUpperSeat() {
        return isUpperSeat;
    }

    private boolean isUpperSeat;

    public Passenger(String name, String passportNumber) {
        this.name = name;
        this.passportNumber = passportNumber;
    }

    public boolean isOccupied() {
        return passportNumber != null && !passportNumber.isEmpty();
    }
    public String getName() {
        return name;
    }

    public String getPassportNumber() {
        return passportNumber;
    }
    @Override
    public String toString() {
        return "Пассажир: " + name + ". " + "Паспорт: " + passportNumber;
    }
}
