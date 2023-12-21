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

    private void printSeats(Set<Passenger> seats) {
        if (!seats.isEmpty()) {
            seats.forEach(passenger -> System.out.print(" " + passenger.getName().charAt(0) + " "));
        } else {
            System.out.print("    ");
        }
    }

    public void printFullCompartmentsInTrain(boolean upperSeats) {
        carriages.forEach(carriage -> {
            Map<Integer, Compartment> compartments = carriage.getCompartments();
            System.out.println("Вагон " + (carriages.indexOf(carriage) + 1) + ":");
            compartments.forEach((compartmentNumber, compartment) -> {
                System.out.print("  Купе " + compartmentNumber + ": | ");
                compartment.getPassengers().forEach(passenger -> {
                    IntStream.rangeClosed(1, 4)
                            .forEach(seatNumber -> {
                                boolean isUpperSeat = seatNumber <= 2;
                                if (passenger.isUpperSeat() == isUpperSeat) {
                                    String seatStatus = "З";
                                    String seatColor = "\u001B[31m";
                                    System.out.print(seatColor + seatStatus + " " + seatStatus + " | ");
                                }
                            });
                });

                if (compartment.getPassengers().stream().noneMatch(passenger -> passenger.isUpperSeat() == upperSeats)) {
                    IntStream.rangeClosed(1, 4)
                            .forEach(seatNumber -> System.out.print("    | "));
                }
            });
        });
    }

    public void printTrainSchema() {
        carriages.forEach(carriage -> {
            System.out.println("Вагон " + (carriages.indexOf(carriage) + 1) + ":");
            carriage.printWagonSchema();
        });
    }
}