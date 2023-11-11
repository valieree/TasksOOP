package vsu.course2.task7atta2;


public class Main {
    public static void main(String[] args) {
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println("Russian Name: " + day.getRussianName());
            System.out.println("English Name: " + day.getEnglishName());
            System.out.println("French Name: " + day.getFrenchName());
            System.out.println("Polish Name: " + day.getPolishName());


            System.out.println("Name in French: " + day.getName(DayOfWeek.Language.FRENCH));

            System.out.println("----------");
        }
        System.out.println(DayOfWeek.FRIDAY.getRussianName());
    }
}