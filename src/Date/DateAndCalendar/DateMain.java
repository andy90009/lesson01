package Date.DateAndCalendar;

/**
 * @author Liaohaibo
 * @date 2018/11/2 下午4:13
 */

/**
 *  日期的展示方式：
 *  1. 2016-11-20 8:15:01 GMT+08:00
 *  2. 2016-11-20 0:15:01 GMT+08:00
 *  3. 11/19/2016 19:15:10 America/New_York
 *
 *  计算机中日期的存储方式：
 *  Epoch Time: 从1970年1月1日零点（格林威治时区/GMT+00:00）到现在经历的秒数，例如：
 *  北京 2016-11-20 8:15:01 = 1479600901
 *  伦敦 2016-11-20 0:15:01 = 1479600901
 *
 *  或者毫秒数：
 *  北京 2016-11-20 8:15:01.123 = 1479600901123
 *
 *  或者浮点数：
 *  北京 2016-11-20 8:15:01.123 = 1479600901.123
 *
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *  Java如何存储时间
 *  long t = 1479600901123L;     // long表示的毫秒数
 *  上述又叫 Epoch Time 或 Timestamp : 时间戳
 *
 *  Java中时间API
 *  1. java.util.Date; java.util.Calendar
 *  2. java.time(JDK>=1.8)
 *     LocalDate/LocalTime/ZonedDateTime/Instant
 */

public class DateMain {

    public static void main(String[] args) {

        // 获取当前系统的时间戳
        System.out.println(System.currentTimeMillis());
        // 获取当前时间
        Date now = new Date();
        System.out.println(now);
        // 获取当前时间的时间戳
        System.out.println(now.getTime());
        // 把当前时间的时间戳转换为时间
        System.out.println(new Date(now.getTime()));

    }

}
