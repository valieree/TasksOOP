package vsu.course2.task10atta3;

import java.util.*;

// Купе
public class Compartment {
    private Set<Passenger> passengers;

    public Compartment() {
        this.passengers = new HashSet<>();
    }


    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }

    public boolean isFull() {
        return passengers.size() == 4; // Предполагаем, что в купе 4 места
    }

    public boolean isPartiallyFilled() {
        return passengers.size() > 0 && passengers.size() < 4;
    }

    public Set<Passenger> getPassengers() {
        return Collections.unmodifiableSet(passengers);
    }

}
