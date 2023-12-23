package vsu.course2.task12atta3;


import java.util.*;
import java.util.stream.IntStream;

public class Compartment {
    private Map<Integer, Passenger> seats;
    private int compartmentNumber;

    public Compartment(int compartmentNumber) {
        this.seats = new HashMap<>();
        this.compartmentNumber = compartmentNumber;
        int firstSeatNumber = (compartmentNumber - 1) * 4;
        IntStream.rangeClosed(1, 2)
                .forEach(i -> IntStream.rangeClosed(1, 2)
                        .forEach(j -> {
                            int seatNumber = firstSeatNumber + (i - 1) * 2 + j;
                            seats.put(seatNumber, null);
                        }));
    }

    public boolean isFull() {
        return seats.values().stream().allMatch(Objects::nonNull);
    }

    public boolean isPartiallyFilled() {
        return seats.values().stream().anyMatch(Objects::nonNull);
    }

    public Set<Passenger> getPassengers() {
        return new HashSet<>(seats.values());
    }

    public void addPassenger(int seatNumber, Passenger passenger) {
        seats.put(seatNumber, passenger);
    }

    public void printCompartmentSchema() {
        IntStream.rangeClosed(1, 2).forEach(i -> {
            for (int j = 1; j <= 2; j++) {
                int seatNumber;
                if (i == 1) {
                    seatNumber = 2 * j + (compartmentNumber - 1) * 4;
                } else {
                    seatNumber = (2 * (j - 1) + 1) + (compartmentNumber - 1) * 4;
                }
                boolean isOccupied = seats.get(seatNumber) != null;

                System.out.print("| ");
                System.out.print(isOccupied ? "\033[31m" + seatNumber + "\033[0m" : "\033[32m" + seatNumber + "\033[0m");
                System.out.print(" ");
            }
            System.out.println("|");
        });
    }

}