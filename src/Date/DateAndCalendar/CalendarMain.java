package Date.DateAndCalendar;

import java.util.Calendar;

/**
 * @author Liaohaibo
 * @date 2018/11/2 下午5:16
 */
public class CalendarMain {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar.YEAR);
        System.out.println(calendar.MONTH);
        System.out.println(calendar.DAY_OF_MONTH);
        System.out.println(calendar.DAY_OF_WEEK);


    }

}
