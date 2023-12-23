package vsu.course2.task12atta3;

public class NormalPassenger extends Passenger {
    public NormalPassenger(String name, String passportNumber) {
        super(name, passportNumber);
    }

    @Override
    public void print() {
        System.out.println("Обычный пассажир получил билет");
    }
}
