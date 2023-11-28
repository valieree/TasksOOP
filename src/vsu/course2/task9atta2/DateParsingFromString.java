package vsu.course2.task9atta2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;

public class DateParsingFromString {

    public static LocalDate parseDate(String dateString, String pattern) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
            return LocalDate.parse(dateString, formatter);
        } catch (DateTimeParseException e) {
            System.out.println("Ошибка преобразования даты: " + e.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        String dateString = "2023-05-17";
        String pattern = "yyyy-MM-dd";
        LocalDate parsedDate = parseDate(dateString, pattern);
        if (parsedDate != null) {
            System.out.println("Ваша дата: " + parsedDate);
        } else {
            System.out.println("Не удалось распарсить дату.");
        }
    }
}