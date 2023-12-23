package vsu.course2.task12atta3.FactoryMethod;

import vsu.course2.task12atta3.Passenger;

public interface PassengerFactory {
        Passenger createPassenger(String name, String passportNumber);

}
