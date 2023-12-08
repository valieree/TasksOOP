package vsu.course2.task10atta3;

import java.util.*;

// Вагон
public class Carriage {
    private Map<Integer, Compartment> compartments;

    public Carriage() {
        this.compartments = new HashMap<>();
        for (int i = 1; i <= 10; i++) { // Предполагаем, что в вагоне 10 купе
            compartments.put(i, new Compartment());
        }
    }

    public void addPassenger(int compartmentNumber, Passenger passenger) {
        Compartment compartment = compartments.get(compartmentNumber);
        if (compartment != null && !compartment.isFull()) {
            compartment.addPassenger(passenger);
        }
    }

    public int getPassengerCountInWagon() {
        int count = 0;
        for (Compartment compartment : compartments.values()) {
            count += compartment.getPassengers().size();
        }
        return count;
    }


    public int getPartiallyFilledCompartmentsCount() {
        int count = 0;
        for (Compartment compartment : compartments.values()) {
            if (compartment.isPartiallyFilled()) {
                count++;
            }
        }
        return count;
    }  public int getFullFilledCompartmentsCount() {
        int count = 0;
        for (Compartment compartment : compartments.values()) {
            if (compartment.isFull()) {
                count++;
            }
        }
        return count;
    }
    public List<Integer> getFullyOccupiedCompartments() {
        List<Integer> fullyOccupiedCompartments = new ArrayList<>();
        for (Map.Entry<Integer, Compartment> entry : compartments.entrySet()) {
            if (entry.getValue().isFull()) {
                fullyOccupiedCompartments.add(entry.getKey());
            }
        }
        return fullyOccupiedCompartments;
    }
    public Compartment getCompartment(int compartmentNumber) {
        return compartments.get(compartmentNumber);
    }

    public Map<Integer, Compartment> getCompartments() {
        return compartments;
    }
    public int getCompartmentNumber(Compartment compartment) {
        for (Map.Entry<Integer, Compartment> entry : compartments.entrySet()) {
            if (entry.getValue() == compartment) {
                return entry.getKey();
            }
        }
        return 0; //если купе не найдено
    }
}
