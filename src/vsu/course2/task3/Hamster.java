package vsu.course2.task3;

public class Hamster extends AnimalAbstract {
    private int age;
    private String name;

    public Hamster(String name, int age) {
        this.age = age;
        this.name = name;
    }
    @Override
    public void sound() {
        System.out.println("Хомяк пищит!!!");
    }
    @Override
    public void getAge() {
        System.out.println("Хомячку всего " + age + "!");
    }
    @Override
    public void getName() {
        System.out.println("Хомячка зовут " + name + "!");
    }


}
