package vsu.course2.task7atta2;

enum DayOfWeek {
    MONDAY("Понедельник", "Monday", "Lundi", "Poniedziałek"),
    TUESDAY("Вторник", "Tuesday", "Mardi", "Wtorek"),
    WEDNESDAY("Среда", "Wednesday", "Mercredi", "Środa"),
    THURSDAY("Четверг", "Thursday", "Jeudi", "Czwartek"),
    FRIDAY("Пятница", "Friday", "Vendredi", "Piątek"),
    SATURDAY("Суббота", "Saturday", "Samedi", "Sobota"),
    SUNDAY("Воскресенье", "Sunday", "Dimanche", "Niedziela");

    private final String russianName;
    private final String englishName;
    private final String frenchName;
    private final String polishName;

    DayOfWeek(String russianName, String englishName, String frenchName, String polishName) {
        this.russianName = russianName;
        this.englishName = englishName;
        this.frenchName = frenchName;
        this.polishName = polishName;
    }

    public String getRussianName() {
        return russianName;
    }

    public String getEnglishName() {
        return englishName;
    }

    public String getFrenchName() {
        return frenchName;
    }

    public String getPolishName() {
        return polishName;
    }

    public String getName(Language language) {
        switch (language) {
            case RUSSIAN:
                return russianName;
            case ENGLISH:
                return englishName;
            case FRENCH:
                return frenchName;
            case POLISH:
                return polishName;
            default:
                return englishName;
        }
    }

    public enum Language {
        RUSSIAN, ENGLISH, FRENCH, POLISH
    }
}


