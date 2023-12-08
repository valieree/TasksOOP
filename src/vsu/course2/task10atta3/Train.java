package vsu.course2.task10atta3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Train {
    private List<Carriage> carriages;

    public Train(int numberOfWagons) {
        this.carriages = new ArrayList<>();
        for (int i = 0; i < numberOfWagons; i++) {
            carriages.add(new Carriage());
        }
    }

    public void addPassenger(int carriageNumber, int compartmentNumber, Passenger passenger) {
        Carriage carriage = carriages.get(carriageNumber - 1);
        if (carriage != null) {
            carriage.addPassenger(compartmentNumber, passenger);
        }
    }

    public int getPassengerCountInTrain() {
        int count = 0;
        for (Carriage carriage : carriages) {
            count += carriage.getPassengerCountInWagon();
        }
        return count;
    }

//    public void printFullCompartmentsInTrain() {
//        for (Carriage carriage : carriages) {
//            carriage.printFullCompartments();
//        }
//    }
public void printFullCompartmentsInTrain() {

    for (int i = 0; i < carriages.size(); i++) {
        Carriage carriage = carriages.get(i);
        List<Integer> fullCompartments = carriage.getFullyOccupiedCompartments();

        if (!fullCompartments.isEmpty()) {
            System.out.println("Вагон " + (i + 1) + ":");
            for (Integer compartmentNumber : fullCompartments) {
                Compartment compartment = carriage.getCompartment(compartmentNumber);

                System.out.println("  Купе " + compartmentNumber + ":");
                Set<Passenger> passengers = compartment.getPassengers();
                for (Passenger passenger : passengers) {
                    System.out.println("    " + passenger.toString());
                }
            }
        }
    }
}

    public int getPartiallyFilledCompartmentsCountInTrain() {
        int count = 0;
        for (Carriage carriage : carriages) {
            count += carriage.getPartiallyFilledCompartmentsCount();
        }
        return count;
    }
    public int getFullFilledCompartmentsCountInTrain() {
        int count = 0;
        for (Carriage carriage : carriages) {
            count += carriage.getFullFilledCompartmentsCount();
        }
        return count;
    }

    public void printPartiallyFilledCompartmentsInTrain() {
        for (int i = 0; i < carriages.size(); i++) {
            Carriage carriage = carriages.get(i);
            List<Integer> partiallyFilledCompartments = new ArrayList<>();

            for (Compartment compartment : carriage.getCompartments().values()) {
                if (compartment.isPartiallyFilled()) {
                    partiallyFilledCompartments.add(carriage.getCompartmentNumber(compartment));
                }
            }

            if (!partiallyFilledCompartments.isEmpty()) {
                System.out.println("Вагон " + (i + 1) + ":");

                for (Integer compartmentNumber : partiallyFilledCompartments) {
                    Compartment compartment = carriage.getCompartment(compartmentNumber);

                    System.out.println("  Купе " + compartmentNumber + ":");
                    Set<Passenger> passengers = compartment.getPassengers();
                    for (Passenger passenger : passengers) {
                        System.out.println("    " + passenger.toString());
                    }
                }
            }
        }
    }
//public void printPartiallyFilledCompartmentsInTrain() {
//    for (int i = 0; i < carriages.size(); i++) {
//        Carriage carriage = carriages.get(i);
//        int partiallyFilledCount = carriage.getPartiallyFilledCompartmentsCount();
//
//        if (partiallyFilledCount > 0) {
//            System.out.println("Вагон " + (i + 1) + ": Частично заполненные купе");
//
//            for (Compartment compartment : carriage.getCompartments().values()) {
//                if (compartment.isPartiallyFilled()) {
//                    System.out.println("  Купе: " + + compartment.getPassengers().size() + " человека");
//                }
//            }
//        }
//    }
//}

}
