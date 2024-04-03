package exceptions.date;

import java.util.Calendar;

public class DateFormatChecker {


    public static void checkDate() throws WrongDayException {
        Calendar calendar = Calendar.getInstance();
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        if (dayOfWeek != Calendar.WEDNESDAY)
            throw new WrongDayException("Day different from Monday");
        System.out.println("Did it");
    }
}
