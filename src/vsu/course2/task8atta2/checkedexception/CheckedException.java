package vsu.course2.task8atta2.checkedexception;

public class CheckedException {
    public static void main(String[] args) {
            try {
                exampleMethod(-5);
            } catch (MyCheckedException e) {
                System.out.println("Поймано исключение: " + e.getMessage());
            }

    }
    public static void exampleMethod(int value) throws MyCheckedException {
        if (value < 0) {
            throw new MyCheckedException("Отрицательное значение недопустимо");
        } else {
            System.out.println("Значение: " + value);
        }
    }
}
