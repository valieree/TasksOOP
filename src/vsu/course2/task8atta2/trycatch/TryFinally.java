package vsu.course2.task8atta2.trycatch;

public class TryFinally {
    public static void main(String[] args) {
        try {
            int result = 555 / 0;
        }
        finally {
            System.out.println("Блок finally выполнен.");
        }
        //  Использование блока catch имеет смысл, если вам нужно выполнить определенные
        //  действия при возникновении определенного типа исключения,
        //  а также для логирования ошибок и предоставления более
        //  информативного вывода пользователю или для вашей собственной отладки.
        // благодаря блоку catch, программа продолжит выполнение после обработки исключения, а не прервется с ошибкой
    }
}