package Date.LocalDateTime;

/**
 * @author Liaohaibo
 * @date 2018/11/2 下午9:33
 */

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *  java.time提供了新的API:
 *  LocalDate / LocalTime / LocalDateTime : 本地日期/本地时间/本地日期时间
 *  ZonedDateTime / ZoneId
 *  Instant
 *  Formatter
 *
 *  java.time 新API特点
 *  1. 严格区分日期时间
 *  2. 不变类
 *  3. Month：1~12
 *  4. Week: 1~7
 *
 */


public class LocalDateTimeLearn {

    public static void main(String[] args) {

        LocalDate d = LocalDate.now();
        LocalTime t = LocalTime.now();
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(d);
        System.out.println(t);
        System.out.println(dt);

        LocalDate d2 = LocalDate.of(2018,11,02);
        LocalTime t2 = LocalTime.of(10,26,00);
        LocalDateTime dt2 = LocalDateTime.of(2018, 11, 04, 21,05,00);
        LocalDateTime dt3 = LocalDateTime.of(d2,t2);
        System.out.println(d2);
        System.out.println(t2);
        System.out.println(dt2);
        System.out.println(dt3);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(dtf.format(LocalDateTime.now()));



    }

}
