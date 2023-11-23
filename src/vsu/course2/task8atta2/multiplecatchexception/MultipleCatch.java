package vsu.course2.task8atta2.multiplecatchexception;

public class MultipleCatch {
    public static void main(String[] args) {
        try {
          exampleOperations();
        }
        catch (ArithmeticException e) {
            System.out.println("Деление на ноль невозможно: " + e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Индекс элемента вне диапазона: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Общее исключение: " + e.getMessage());
        }
    }
    public static void exampleOperations() {
        int result = 555/0;
        int[] arr = new int[] {1,2,3};
        System.out.println(arr[4]);

    }
}
