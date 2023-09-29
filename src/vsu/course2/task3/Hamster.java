package vsu.course2.task3;

public class Hamster extends AnimalAbstract {
    private int age;

    public Hamster(int age) {
        this.age = age;
    }
    @Override
    public void sound() {
        System.out.println("Хомяк пищит!!");
    }
    @Override
    public void getAge() {
        System.out.println("Хомячку всего " + age + "!");
    }


}
