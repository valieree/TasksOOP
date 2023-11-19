package vsu.course2.task8atta2.throwexception;

public class ThrowException {

        public static void main(String[] args) {
            try {
                throw new RuntimeException("Это исключение выброшено вручную");
            } catch (RuntimeException e) {
                System.out.println("Перехвачено исключение: " + e.getMessage());
            }
        }

}
