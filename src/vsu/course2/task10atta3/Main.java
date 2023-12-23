package vsu.course2.task10atta3;
public class Main {
    public static void main(String[] args) {
        Train train = new Train(3);

        train.
                addPassenger(1, 1, 1, new Passenger("Иванов", "123456"));
        train.addPassenger(1, 1, 2, new Passenger("Петров", "789012"));
        train.addPassenger(1, 1, 3, new Passenger("Сидоров", "345678"));
        train.addPassenger(1, 1, 4, new Passenger("Козлов", "901234"));
        train.addPassenger(1, 3, 11, new Passenger("Антонов", "589299"));
        train.addPassenger(3, 8, 29, new Passenger("Васильев", "582419299"));
        train.printTrainSchema();

        System.out.println("Число пассажиров в поезде: " + train.getPassengerCountInTrain());
        System.out.println("Число заполненных купе: " + train.getFullFilledCompartmentsCountInTrain());
        System.out.println("Заполненные купе в поезде:");
        train.printFullCompartmentsInTrain();
        System.out.println("Число частично заполненных купе: " + train.getPartiallyFilledCompartmentsCountInTrain());
        System.out.println("Частично заполненные купе в поезде:");
        train.printPartiallyFilledCompartmentsInTrain();

    }
}
