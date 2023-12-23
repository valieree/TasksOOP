package vsu.course2.task10atta3;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Train {
    private List<Carriage> carriages;

    public Train(int numberOfWagons) {
        this.carriages = new ArrayList<>();
        for (int i = 0; i < numberOfWagons; i++) {
            carriages.add(new Carriage());
        }
    }


    public void addPassenger(int carriageNumber, int compartmentNumber, int seatNumber, Passenger passenger) {
        Carriage carriage = carriages.get(carriageNumber - 1);
        if (carriage != null) {
            carriage.addPassenger(compartmentNumber, seatNumber, passenger);
        }
    }

    public int getPassengerCountInTrain() {
        int count = 0;
        for (Carriage carriage : carriages) {
            count += carriage.getPassengerCountInWagon();
        }
        return count;
    }

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
                        if (passenger != null) {
                            System.out.println("    " + passenger.toString());
                        }
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


    public void printTrainSchema() {
        carriages.forEach(carriage -> {
            System.out.println("Вагон " + (carriages.indexOf(carriage) + 1) + ":");
            carriage.printWagonSchema();
            System.out.println();
        });
    }}