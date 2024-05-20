
//A switch works with the byte, short, char, and int primitive data types.
//It also works with enumerated types (discussed in Enum Types), the String class,
//and a few special classes that wrap certain primitive types: Character, Byte, Short,
//and Integer (discussed in Numbers and Strings).
/*
* Main class for switch case syntax and examples
* */
public class SwitchTestsMain {
    public static void main(String[] args) {
        printDayFullName(7);
        printDayFullName(6);
        printDayFullName(8);
        System.out.println();
        printDayFullName(1);
        printDayFullName(2);
        printDayFullName(3);

        System.out.println();
        checkMonthNumber("January");
        checkMonthNumber("March");
        checkMonthNumber("june");
        checkMonthNumber("December");
        checkMonthNumber("February");



        System.out.println();
        checkSeason("January");
        checkSeason("February");
        checkSeason("June");
        checkSeason("July");
        checkSeason("decemberrr");
        checkSeason("March");

        System.out.println();
        String weekDay1 = computeDay(1);
        System.out.println(weekDay1);
        String weekDay6 = computeDay(6);
        System.out.println(weekDay6);
        String weekDay9 = computeDay(9);
        if (weekDay9 == null){
            System.out.println("Day 9 it's not a valid day of the week");
        } else {
            System.out.println(weekDay9);
        }

        System.out.println();
        String day1 = computeDayWithLocalVariable(1);
        System.out.println(day1);
        String day6 = computeDayWithLocalVariable(6);
        System.out.println(day6);
        String day9 = computeDayWithLocalVariable(9);
        if (day9 == null){
            System.out.println("Day 9 it's not a valid day of the week");
        } else {
            System.out.println(day9);
        }
    }

    public static void printDayFullName(int dayNumber){
        switch (dayNumber) {
            case 1:
                for (int i=1; i <= dayNumber; i++){
                    System.out.println("Monday");
                }
                break; // if dayNumber==1, then the case was found, and we don't want to check anymore
            case 2:
                for (int i=1; i <= dayNumber; i++){
                    System.out.println("Tuesday");
                }
                break;
            case 3:
                for (int i=1; i <= dayNumber; i++){
                    System.out.println("Wednesday");
                }
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("This is not a valid dayNumber");
        }
    }

    public static void checkMonthNumber(String monthName){
        switch (monthName){
            case "January":
                System.out.println("Month 1");
                break;
            case "February":
                System.out.println("Month 2");
                break;
            case "March":
                System.out.println("Month 3");
                break;
            case "April":
                System.out.println("Month 4");
                break;
            case "May":
                System.out.println("Month 5");
                break;
            case "June":
                System.out.println("Month 6");
                break;
            default:
                System.out.println("Month is not in the first half of the year");
        }
    }

    public static void checkSeason(String monthName){
        switch (monthName){
            case "December":
            case "January":
            case "February":
                System.out.println("Winter");
                break;
            case "March":
            case "April":
            case "May":
                System.out.println("Spring");
                break;
            case "June":
            case "July":
            case "August":
                System.out.println("Summer");
                break;
            case "September":
            case "October":
            case "November":
                System.out.println("Autumn");
                break;
            default:
                System.out.println("It's not a valid month");
        }
    }

    public static String computeDay(int day){
        switch (day){
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return null;
        }
    }

    public static String computeDayWithLocalVariable(int day){
        String dayName;
        switch (day){
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = null;
                break;
        }
        return dayName;
    }

    //enhanced switch
    /*public static String computeDayWithLocalVariable(int day){
        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> null;
        };
        return dayName;
    }*/
}