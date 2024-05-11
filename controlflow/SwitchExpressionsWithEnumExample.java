enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

void main() {
    System.out.println("Inicio");
    Day day = Day.MONDAY;

    // switch expression
    switch (day) {
        case MONDAY -> System.out.println("It's Monday!");
        case TUESDAY -> System.out.println("It's Tuesday!");
        case WEDNESDAY -> System.out.println("It's Wednesday!");
        case THURSDAY -> System.out.println("It's Thursday!");
        case FRIDAY -> System.out.println("It's Friday!");
        case SATURDAY -> System.out.println("It's Saturday!");
        case SUNDAY -> System.out.println("It's Sunday!");
        default -> System.out.println("Invalid day!");
    }

    switch (day) {
        case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
            -> System.out.println("It's Weekday!");
        case SATURDAY, SUNDAY
            -> System.out.println("It's Weekend!");
    }

    String dayString = switch (day) {
        case MONDAY -> "Monday";
        case TUESDAY -> "Tuesday";
        case WEDNESDAY -> "Wednesday";
        case THURSDAY -> "Thursday";
        case FRIDAY -> "Friday";
        case SATURDAY -> "Saturday";
        case SUNDAY -> "Sunday";
    };
    System.out.println("Day: " + dayString);
    System.out.println("Fin");
}
