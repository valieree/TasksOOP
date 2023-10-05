package vsu.course2.task3;

public class Main {
    public static void main(String[] args) {
       Animal animal = new Animal("Лес", "Черный");
       Cat cat = new Cat("Дом", "Черный", "Сфинкс");
       Animal cat1 = new Cat("Дом", "Белый", "Мейн-Кун");
       Hamster hamster = new Hamster("Вася",1);
       animal.prettyPrint();
       animal.whereLives();
       animal.whatColor();

       System.out.println("---");

       cat.prettyPrint();
       cat.whereLives();
       cat.whatColor();
       cat.whatBreed();

       System.out.println("---");
       cat1.whatColor();
       cat1.whereLives();
       cat1.prettyPrint();

       System.out.println("---");

       hamster.getName();
       hamster.getAge();
       hamster.sound();
       System.out.println("---");
    }
}
