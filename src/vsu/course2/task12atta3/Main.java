package vsu.course2.task12atta3;

import vsu.course2.task12atta3.Adapter.NormalPassengerInterface;
import vsu.course2.task12atta3.Adapter.PassengerWithPetAdapter;
import vsu.course2.task12atta3.FactoryMethod.NormalPassengerFactory;
import vsu.course2.task12atta3.FactoryMethod.PassengerFactory;
import vsu.course2.task12atta3.FactoryMethod.PassengerType;
import vsu.course2.task12atta3.FactoryMethod.PassengerWithPetFactory;



public class Main {
    public static void main(String[] args) {
        Train train = new Train(1);

        // Factory Method
        System.out.println("factory method:");

        PassengerFactory passengerFactory = PassengerCreator.createPassengerByType(PassengerType.WITH_PET);
        Passenger passenger = passengerFactory.createPassenger("Иванов", "123456");
        passenger.print();
        train.addPassenger(1,1,2,passenger);
        PassengerFactory passengerFactory1 = PassengerCreator.createPassengerByType(PassengerType.WITHOUT_PET);
        Passenger passenger1 = passengerFactory1.createPassenger("Антонов", "123456");
        passenger1.print();

        train.addPassenger(1,2,6,passenger1);



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

    public class PassengerCreator {
        public static PassengerFactory createPassengerByType(PassengerType passengerType) {
            switch (passengerType) {
                case WITH_PET:
                    return new PassengerWithPetFactory();
                case WITHOUT_PET:
                    return new NormalPassengerFactory();
                default:
                    throw new RuntimeException("Некорректный тип пассажира");
            }
        }
    }
     static void printTicket(NormalPassengerInterface normalPassenger) {
        normalPassenger.print();
    }
}