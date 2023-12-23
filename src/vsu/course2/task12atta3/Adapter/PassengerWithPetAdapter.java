package vsu.course2.task12atta3.Adapter;

import vsu.course2.task12atta3.NormalPassenger;
import vsu.course2.task12atta3.Passenger;
import vsu.course2.task12atta3.PassengerWithPet;

public class PassengerWithPetAdapter extends NormalPassenger implements NormalPassengerInterface {
    private PassengerWithPet passengerWithPet;

    public PassengerWithPetAdapter(PassengerWithPet passengerWithPet) {
        super(passengerWithPet.getName(), passengerWithPet.getPassportNumber());
        this.passengerWithPet = passengerWithPet;
    }

    @Override
    public void print() {
        passengerWithPet.print();
    }
}