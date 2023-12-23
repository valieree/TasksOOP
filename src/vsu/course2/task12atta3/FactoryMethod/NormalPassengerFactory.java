package vsu.course2.task12atta3.FactoryMethod;

import vsu.course2.task12atta3.NormalPassenger;
import vsu.course2.task12atta3.Passenger;

public class NormalPassengerFactory implements PassengerFactory {
    @Override
    public Passenger createPassenger(String name, String passportNumber) {
        return new NormalPassenger(name, passportNumber);
    }
}