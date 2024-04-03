package exceptions.date;

public class DateDemo {
    public static void main(String[] argv) {
        try {
         DateFormatChecker.checkDate();
         System.out.println("mesaj 1");
         System.out.println("mesaj 2");
        } catch (WrongDayException e) {
            System.out.println(e.getMessage());
        }

    }
}
