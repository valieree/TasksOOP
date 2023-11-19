package vsu.course2.task8atta2.uncheckedexception;

public class UncheckedExceptions {


    public static void main(String[] args) {
        exampleMethod(-5);
    }
    public static void exampleMethod(int value) {
        if (value < 0) {
            throw new MyUncheckedException("Отрицательное значение недопустимо");
        } else {
            System.out.println("Значение: " + value);
        }
    }

}
