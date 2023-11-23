package vsu.course2.task8atta2.multiplecatchexception;

public class MultipleInCatch {
    public static void main(String[] args) {
        try {
            exampleOperations();
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Исключение: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Исключение: " + e.getMessage());
        }
    }
    public static void exampleOperations() {
        int result = 555/0;
        int[] arr = new int[] {1,2,3};
        System.out.println(arr[4]);

    }
}
