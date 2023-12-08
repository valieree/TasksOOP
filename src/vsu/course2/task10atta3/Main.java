package vsu.course2.task10atta3;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Train train = new Train(5); // Создаем поезд с 5 вагонами

        train.addPassenger(2, 1,new Passenger("Анна", "123456"));
        train.addPassenger(3, 2,new Passenger("Елена", "1903298"));

        train.addPassenger(5, 3, new Passenger("Дарья", "345678"));
        train.addPassenger(5, 3, new Passenger("Алексей", "1413678"));
        train.addPassenger(5, 3, new Passenger("Антон", "214124"));
        train.addPassenger(5, 3, new Passenger("Мария", "789211"));

        System.out.println("Число пассажиров в поезде: " + train.getPassengerCountInTrain());
        System.out.println("Число заполненных купе: " + train.getFullFilledCompartmentsCountInTrain());
        System.out.println("Заполненные купе в поезде:");
        train.printFullCompartmentsInTrain();
        System.out.println("Число частично заполненных купе: " + train.getPartiallyFilledCompartmentsCountInTrain());
        System.out.println("Частично заполненные купе в поезде:");
        train.printPartiallyFilledCompartmentsInTrain();
    }
}
