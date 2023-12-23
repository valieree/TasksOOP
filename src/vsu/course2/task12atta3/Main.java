package vsu.course2.task12atta3;

import vsu.course2.task12atta3.FactoryMethod.NormalPassengerFactory;
import vsu.course2.task12atta3.FactoryMethod.PassengerFactory;
import vsu.course2.task12atta3.FactoryMethod.PassengerWithPetFactory;

public class Main {
    public static void main(String[] args) {
        PassengerFactory passengerFactory = createPassengerByType("Да");
        Passenger passenger = passengerFactory.createPassenger("Иванов", "123456");
        passenger.print();
        Train train = new Train(1);
        train.addPassenger(1,1,1,passenger);

        train.printTrainSchema();

        System.out.println("Число пассажиров в поезде: " + train.getPassengerCountInTrain());
        System.out.println("Число заполненных купе: " + train.getFullFilledCompartmentsCountInTrain());
        System.out.println("Заполненные купе в поезде:");
        train.printFullCompartmentsInTrain();
        System.out.println("Число частично заполненных купе: " + train.getPartiallyFilledCompartmentsCountInTrain());
        System.out.println("Частично заполненные купе в поезде:");
        train.printPartiallyFilledCompartmentsInTrain();
    }

    static PassengerFactory createPassengerByType(String with_pet) {
        if (with_pet.equalsIgnoreCase("Да")) {
            return new PassengerWithPetFactory();
        } else if (with_pet.equalsIgnoreCase("Нет")) {
            return new NormalPassengerFactory();
        } else {
            throw new RuntimeException("Некорректный ввод");
        }
    }
}