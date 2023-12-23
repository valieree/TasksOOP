package vsu.course2.task11atta3;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Train {
    private List<Carriage> carriages;

    public Train(int numberOfWagons) {
        this.carriages = IntStream.range(0, numberOfWagons)
                .mapToObj(i -> new Carriage())
                .collect(Collectors.toList());
    }

    public void addPassenger(int carriageNumber, int compartmentNumber, int seatNumber, Passenger passenger) {
        carriages.get(carriageNumber - 1).addPassenger(compartmentNumber, seatNumber, passenger);
    }

    public int getPassengerCountInTrain() {
        return carriages.stream()
                .mapToInt(Carriage::getPassengerCountInWagon)
                .sum();
    }

    public void printFullCompartmentsInTrain() {
        carriages.forEach(carriage -> {
            List<Integer> fullCompartments = carriage.getFullyOccupiedCompartments();
            if (!fullCompartments.isEmpty()) {
                System.out.println("Вагон " + (carriages.indexOf(carriage) + 1) + ":");
                fullCompartments.forEach(compartmentNumber -> {
                    Compartment compartment = carriage.getCompartment(compartmentNumber);
                    System.out.println("  Купе " + compartmentNumber + ":");
                    compartment.getPassengers().forEach(passenger -> System.out.println("    " + passenger.toString()));
                });
            }
        });
    }

    public void printPartiallyFilledCompartmentsInTrain() {
        carriages.forEach(carriage -> {
            List<Integer> partiallyFilledCompartments = carriage.getCompartments().entrySet().stream()
                    .filter(entry -> entry.getValue().isPartiallyFilled())
                    .map(Map.Entry::getKey)
                    .collect(Collectors.toList());

            if (!partiallyFilledCompartments.isEmpty()) {
                System.out.println("Вагон " + (carriages.indexOf(carriage) + 1) + ":");
                partiallyFilledCompartments.forEach(compartmentNumber -> {
                    Compartment compartment = carriage.getCompartment(compartmentNumber);
                    System.out.println("  Купе " + compartmentNumber + ":");
                    compartment.getPassengers().forEach(passenger -> {
                        if (passenger != null) {
                            System.out.println("    " + passenger.toString());
                        }
                    });
                });
            }
        });
    }

    public long getPartiallyFilledCompartmentsCountInTrain() {
        return carriages.stream()
                .mapToLong(Carriage::getPartiallyFilledCompartmentsCount)
                .sum();
    }

    public long getFullFilledCompartmentsCountInTrain() {
        return carriages.stream()
                .mapToLong(Carriage::getFullFilledCompartmentsCount)
                .sum();
    }


    public void printTrainSchema() {
        carriages.forEach(carriage -> {
            System.out.println("Вагон " + (carriages.indexOf(carriage) + 1) + ":");
            carriage.printWagonSchema();
        });
    }
}