package vsu.course2.task2;

public class Food {


    static {
        System.out.println("Статический конструктор Food.");
    }


    {
        System.out.println("Анонимный конструктор Food");
    }

    public Food() {
        System.out.println("Конструктор класса Food");
    }
}
