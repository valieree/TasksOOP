package vsu.course2.task10atta3;
import java.util.*;

// Купе

public class Compartment {

    private Set<Passenger> passengers;
    private int compartmentNumber;

    private Map<Integer, Passenger> seats;



    public Compartment(int compartmentNumber) {
        this.seats = new HashMap<>();
        this.compartmentNumber = compartmentNumber;
        int firstSeatNumber = (compartmentNumber - 1) * 4;
        for (int i = 2; i >= 1; i--) {
            for (int j = 1; j <= 2; j++) {
                int seatNumber = firstSeatNumber + (i - 1) * 2 + j;
                seats.put(seatNumber, null);
            }
        }
    }





    public boolean isFull() {
        for (Passenger passenger : seats.values()) {
            if (passenger == null) {
                return false;
            }
        }
        return true;
    }

    public boolean isPartiallyFilled() {
        for (Passenger passenger : seats.values()) {
            if (passenger != null) {
                return true;
            }
        }
        return false;
    }

    public Set<Passenger> getPassengers() {
        return new HashSet<>(seats.values());
    }
    public void addPassenger(int seatNumber, Passenger passenger) {
        seats.put(seatNumber, passenger);
    }

    public void printCompartmentSchema() {
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 2; j++) {
                int seatNumber;
                if (i == 1) {
                    seatNumber = 2 * j + (compartmentNumber - 1) * 4;
                } else {
                    seatNumber = (2 * (j - 1) + 1) + (compartmentNumber - 1) * 4;
                }
                boolean isOccupied = seats.get(seatNumber) != null;
                System.out.print("| ");
                if (isOccupied) {
                    System.out.print("\033[31m" + seatNumber + "\033[0m");
                } else {
                    System.out.print("\033[32m" + seatNumber + "\033[0m");
                }
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }







}
