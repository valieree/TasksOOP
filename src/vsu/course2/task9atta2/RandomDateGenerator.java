package vsu.course2.task9atta2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class RandomDateGenerator {
    public static void main(String[] args) {

        String startDateString = "1900-01-01";
        String endDateString = "2023-01-01";

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date startDate = dateFormat.parse(startDateString);
            Date endDate = dateFormat.parse(endDateString);

            // Генерируем случайную дату в заданном диапазоне
            Date randomDate = generateRandomDate(startDate, endDate);

            // Выводим результат
            System.out.println("Случайная дата: " + dateFormat.format(randomDate));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static Date generateRandomDate(Date startDate, Date endDate) {
        long startMillis = startDate.getTime();
        long endMillis = endDate.getTime();

        Random random = new Random();
        long randomMillisSinceEpoch = startMillis + (long) (random.nextDouble() * (endMillis - startMillis));

        return new Date(randomMillisSinceEpoch);
    }
}

