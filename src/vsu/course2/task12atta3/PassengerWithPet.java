package vsu.course2.task12atta3;



public class PassengerWithPet extends Passenger {
    private boolean pet;

    public PassengerWithPet(String name, String passportNumber) {
        super(name, passportNumber);

    }

    @Override
    public void print() {
        System.out.println("Пассажир " + this.name + " с питомцем получил билет");
    }
}
