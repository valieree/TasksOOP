package vsu.course2.task11atta3;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Carriage {
    private Map<Integer, Compartment> compartments;

    public Carriage() {
        this.compartments = new HashMap<>();
        IntStream.rangeClosed(1, 10)
                .forEach(i -> compartments.put(i, new Compartment(i)));
    }

    public void addPassenger(int compartmentNumber, int seatNumber, Passenger passenger) {
        Compartment compartment = compartments.get(compartmentNumber);
        if (compartment != null && !compartment.isFull()) {
            compartment.addPassenger(seatNumber, passenger);
        }
    }

    public int getPassengerCountInWagon() {
        return compartments.values().stream()
                .mapToInt(compartment -> compartment.getPassengers().size())
                .sum();
    }

    public long getPartiallyFilledCompartmentsCount() {
        return compartments.values().stream()
                .filter(Compartment::isPartiallyFilled)  // .filter(compartment -> compartment.isPartiallyFilled())
                .count();
    }

    public long getFullFilledCompartmentsCount() {
        return compartments.values().stream()
                .filter(Compartment::isFull)
                .count();
    }

    public List<Integer> getFullyOccupiedCompartments() {
        return compartments.entrySet().stream()
                .filter(entry -> entry.getValue().isFull())
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    public Compartment getCompartment(int compartmentNumber) {
        return compartments.get(compartmentNumber);
    }

    public Map<Integer, Compartment> getCompartments() {
        return compartments;
    }

    public int getCompartmentNumber(Compartment compartment) {
        return compartments.entrySet().stream()
                .filter(entry -> entry.getValue() == compartment)
                .findFirst()
                .map(Map.Entry::getKey)
                .orElse(0);
    }

    public void printWagonSchema() {
        compartments.forEach((compartmentNumber, compartment) -> {
            System.out.println("Купе " + compartmentNumber + ":");
            compartment.printCompartmentSchema();
        });
    }
}
