package vsu.course2.task3;

public class Cat extends Animal {
    private String breed;

    public Cat(String habitat, String color,String breed) {
        super(habitat, color);
        this.breed = breed;
    }

    @Override
    public void whereLives() {
        System.out.println("Котик живет дома!!");
    }
    @Override
    public void prettyPrint() {
        super.prettyPrint();
        System.out.println("Котик!!!");
    }
    @Override
    public void whatColor() {
        System.out.println("Цвет котика: " + getColor());
    }


    public void whatBreed() {
        System.out.println("Порода котика: " + breed);
    }
}
