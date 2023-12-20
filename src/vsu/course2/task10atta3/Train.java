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
//    public void printTrainLayout() {
//        for (int i = 0; i < carriages.size(); i++) {
//            Carriage carriage = carriages.get(i);
//            System.out.println("Вагон " + (i + 1) + ":");
//
//            for (int compartmentNumber = 1; compartmentNumber <= 10; compartmentNumber++) {
//                Compartment compartment = carriage.getCompartment(compartmentNumber);
//
//                System.out.print("|");
//
//                // Вывод верхних мест
//                Set<Passenger> upperSeats = compartment.getUpperSeats();
//                if (!upperSeats.isEmpty()) {
//                    for (Passenger passenger : upperSeats) {
//                        System.out.print("У ");
//                    }
//                } else {
//                    System.out.print("   ");
//                }
//
//                // Вывод нижних мест
//                Set<Passenger> lowerSeats = compartment.getLowerSeats();
//                if (!lowerSeats.isEmpty()) {
//                    for (Passenger passenger : lowerSeats) {
//                        System.out.print("Н ");
//                    }
//                } else {
//                    System.out.print("   ");
//                }
//
//                System.out.print("| ");
//            }
//
//            System.out.println(); // Переход на новую строку между вагонами
//        }
//    }
//public void printTrainLayout() {
//    for (int i = 0; i < carriages.size(); i++) {
//        Carriage carriage = carriages.get(i);
//        System.out.println("Вагон " + (i + 1) + ":");
//
//        for (int compartmentNumber = 1; compartmentNumber <= 10; compartmentNumber++) {
//            Compartment compartment = carriage.getCompartment(compartmentNumber);
//
//            // Вывод верхних мест
//            Set<Passenger> upperSeats = compartment.getUpperSeats();
//            System.out.print("| ");
//            printSeats(upperSeats);
//
//            System.out.print(" | ");
//
//            // Вывод нижних мест
//            Set<Passenger> lowerSeats = compartment.getLowerSeats();
//            printSeats(lowerSeats);
//
//            System.out.print(" | ");
//        }
//
//        System.out.println(); // Переход на новую строку между вагонами
//    }
//}

    private void printSeats(Set<Passenger> seats) {
        if (!seats.isEmpty()) {
            for (Passenger passenger : seats) {
                System.out.print(" " + passenger.getName().charAt(0) + " ");
            }
        } else {
            System.out.print("    ");
        }
    }
    public void printFullCompartmentsInTrain(boolean upperSeats) {
        for (int i = 0; i < carriages.size(); i++) {
            Carriage carriage = carriages.get(i);
            Map<Integer, Compartment> compartments = carriage.getCompartments();

            System.out.println("Вагон " + (i + 1) + ":");

            for (Map.Entry<Integer, Compartment> entry : compartments.entrySet()) {
                int compartmentNumber = entry.getKey();
                Compartment compartment = entry.getValue();

                System.out.print("  Купе " + compartmentNumber + ": | ");

                Set<Passenger> passengers = compartment.getPassengers();
                for (int seatNumber = 1; seatNumber <= 4; seatNumber++) {
                    boolean isUpperSeat = seatNumber <= 2;

                    for (Passenger passenger : passengers) {
                        if (passenger.isUpperSeat() == isUpperSeat) {
                            String seatStatus = "З";
                            String seatColor = "\u001B[31m";

                            System.out.print(seatColor + seatStatus + " " + seatStatus + " | ");
                            break;
                        }
                    }

                    if (!passengers.stream().anyMatch(p -> p.isUpperSeat() == isUpperSeat)) {
                        System.out.print("    | ");
                    }
                }

            }
        } }
    public void printTrainSchema() {
        for (int i = 0; i < carriages.size(); i++) {
            Carriage carriage = carriages.get(i);
            System.out.println("Вагон " + (i + 1) + ":");
            carriage.printWagonSchema();
        }
    }}