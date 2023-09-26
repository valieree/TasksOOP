package vsu.course2.task2;

public class Pizza extends Food {
    static {
        System.out.println("Статический конструктор Pizza (extends Food).");
    }
    {
        System.out.println("Анонимный конструктор Pizza(extends Food)");
    }
    public Pizza() {

        System.out.println("Конструктор Pizza (extends Food)");
    }

}
