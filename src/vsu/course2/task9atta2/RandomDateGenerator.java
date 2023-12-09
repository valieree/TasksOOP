package vsu.course2.task9atta2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class RandomDateGenerator {
    public static void main(String[] args) {
        String startDateString = "1900-01-01";
        String endDateString = "2023-01-01";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try {
            LocalDate startDate = LocalDate.parse(startDateString, formatter);
            LocalDate endDate = LocalDate.parse(endDateString, formatter);

            LocalDate randomDate = generateRandomDate(startDate, endDate);

            System.out.println("Случайная дата: " + formatter.format(randomDate));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static LocalDate generateRandomDate(LocalDate startDate, LocalDate endDate) {
        long startEpochDay = startDate.toEpochDay();
        long endEpochDay = endDate.toEpochDay();

        Random random = new Random();
        long randomEpochDay = startEpochDay + (long) (random.nextDouble() * (endEpochDay - startEpochDay));

        return LocalDate.ofEpochDay(randomEpochDay);
    }
}
