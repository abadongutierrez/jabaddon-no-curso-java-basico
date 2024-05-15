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

    // switch statement
    switch (day) {
        case MONDAY:
            System.out.println("It's Monday!");
            break;
        case TUESDAY:
            System.out.println("It's Tuesday!");
            break;
        case WEDNESDAY:
            System.out.println("It's Wednesday!");
            break;
        case THURSDAY:
            System.out.println("It's Thursday!");
            break;
        case FRIDAY:
            System.out.println("It's Friday!");
            break;
        case SATURDAY:
            System.out.println("It's Saturday!");
            break;
        case SUNDAY:
            System.out.println("It's Sunday!");
            break;
        default:
            System.out.println("Invalid day!");
            break;
    }


    switch (day) {
        case MONDAY:
        case TUESDAY:
        case WEDNESDAY:
        case THURSDAY:
        case FRIDAY:
            System.out.println("It's Weekday!");
            break;
        case SATURDAY:
        case SUNDAY:
            System.out.println("It's Weekend!");
            break;
        default:
            System.out.println("Invalid day!");
            break;
    }

    System.out.println("Fin");
}
