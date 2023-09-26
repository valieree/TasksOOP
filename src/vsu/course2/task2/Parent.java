package vsu.course2.task2;

public class Parent {

    static {
        System.out.println("Стататический конструктор Parent.");
    }


    {
        System.out.println("Анонимный конструктор Parent");
    }

    public Parent() {
        System.out.println("Конструктор класса Parent");
    }
    private Food food = new Food();

}
