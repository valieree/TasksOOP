package vsu.course2.task12atta3.FactoryMethod;

import vsu.course2.task12atta3.Passenger;
import vsu.course2.task12atta3.PassengerWithPet;

public class PassengerWithPetFactory implements PassengerFactory {
    @Override
    public Passenger createPassenger(String name, String passportNumber) {
        return new PassengerWithPet(name, passportNumber);
    }
}