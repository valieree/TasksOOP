package vsu.course2.task12atta3;

public abstract class Passenger {
    protected String name;
    protected String passportNumber;

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
    public abstract void print();
}