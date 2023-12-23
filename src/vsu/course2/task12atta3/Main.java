package vsu.course2.task12atta3;

import vsu.course2.task12atta3.Adapter.NormalPassengerInterface;
import vsu.course2.task12atta3.Adapter.PassengerWithPetAdapter;
import vsu.course2.task12atta3.FactoryMethod.NormalPassengerFactory;
import vsu.course2.task12atta3.FactoryMethod.PassengerFactory;
import vsu.course2.task12atta3.FactoryMethod.PassengerWithPetFactory;

public class Main {
    public static void main(String[] args) {


        // Factory Method
        System.out.println("factory method:");
        PassengerFactory passengerFactory = createPassengerByType("Да");
        Passenger passenger = passengerFactory.createPassenger("Иванов", "123456");
        passenger.print();
        Train train = new Train(1);
        train.addPassenger(1,1,1,passenger);


        // Adapter
        System.out.println("adapter:");
        NormalPassengerInterface normalPassenger = new NormalPassenger("Некошкин", "23456");
        normalPassenger.print();
        PassengerWithPet passengerWithPet = new PassengerWithPet("Кошкин", "789012");
        NormalPassenger petPassenger= new PassengerWithPetAdapter(passengerWithPet);
        printTicket(petPassenger);

        train.addPassenger(1,2,8, petPassenger);

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
     static void printTicket(NormalPassengerInterface normalPassenger) {
        normalPassenger.print();
    }
}