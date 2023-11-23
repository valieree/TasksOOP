package vsu.course2.task8atta2.trycatch;

public class TryCatchFinally {

        public static void main(String[] args) {
            try {
                int result = 555 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Деление на ноль невозжно: " + e.getMessage());
            } finally {
                System.out.println("Этот блок будет выполнен в любом случае");
            }
        }

}
