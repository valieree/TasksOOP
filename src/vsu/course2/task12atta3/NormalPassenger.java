package vsu.course2.task12atta3;

import vsu.course2.task12atta3.Adapter.NormalPassengerInterface;

public class NormalPassenger extends Passenger implements NormalPassengerInterface {
    public NormalPassenger(String name, String passportNumber) {
        super(name, passportNumber);
    }

    @Override
    public void print() {
        System.out.println("Обычный пассажир " + this.name + " получил билет");
    }
}
