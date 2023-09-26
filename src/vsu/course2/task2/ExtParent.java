package vsu.course2.task2;

public class ExtParent extends Parent {
    static {
        System.out.println("Стататический конструктор ExtParent.");
    }

    {
        System.out.println("Анонимный конструктор ExtParent");
    }

    public ExtParent() {

        System.out.println("Конструктор класса ExtParent");
    }

}
