package student.lab;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author jwardell
 */
public class DateUtilities8 {

    /**
     * This is just a simple returning the current date and time.
     *
     * @return the current date and time.
     */
    public LocalDateTime getCurrentDateTime() {
        return LocalDateTime.now();
    }

    /**
     *
     * @return - It returns the current time hours/min/sec in a 24 hour clock
     * format.
     */
    public String get24HrTime() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        return sdf.format(cal.getTime());
    }

    /**
     *
     * @return - It returns the current time hours/min/sec in a 12 hour clock
     * format.
     */
    public String get12HrTime() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("h:mm:ss");
        return sdf.format(cal.getTime());
    }

    /**
     *
     * @param calendar a variable representing a date
     * @return It returns the date
     */
    public LocalDate getDate(LocalDate calendar) {
        if (calendar == null) {
            throw new IllegalArgumentException("Error: calendar argument cannot be null");
        }
        return (calendar);
    }

    /**
     *
     * @param calendar a variable representing a date and time
     * @return It returns the date and time.
     */
    public LocalDateTime getDateTime(LocalDateTime calendar) {
        if (calendar == null) {
            throw new IllegalArgumentException("Error: calendar argument cannot be null");
        }
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("MMM dd yyyy  hh:mm a");
        return (calendar);
    }

    /**
     *
     * @return - This returns how many hours until Friday.
     */
    public Long dateDiff() {
        LocalDateTime startDate = LocalDateTime.now();
        LocalDateTime endDate = startDate.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        Duration diff = Duration.between(startDate, endDate);
        return (diff.toHours());
    }

    /**
     * You enter in a variable integer and this will tell you what the date is
     * from current the date
     *
     * @param number This is an integer variable
     * @return This will return the current date plus the number of days you
     * give it.
     */
    public LocalDate addDate(int number) {
        LocalDate current = LocalDate.now();
        LocalDate newDate = current.plusDays(number);
        return newDate;
    }

    /**
     *
     * @param str a string variable for a date
     * @return This returns a date/time object from a string
     */
    public LocalDateTime toDateTimeObject(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Error: calendar argument cannot be null");
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dateTime = LocalDateTime.parse(str, formatter);
        return dateTime;
    }

    /**
     *
     * @param str a string variable for a date
     * @return This returns a date object from a string
     */
    public LocalDate toDateObject(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Error: calendar argument cannot be null");
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(str, formatter);
        return date;
    }

    /**
     * 
     * @param dateTime a dateTime object
     * @return takes the dateTime object and turns it into a String
     */
    public String toString(LocalDateTime dateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String formattedDateTime = dateTime.format(formatter);
        return formattedDateTime;
    }
    
        /**
     * 
     * @param date a date object
     * @return takes the date object and turns it into a String
     */
    public String toStringDate(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = date.format(formatter);
        return formattedDate;
    }

    public static void main(String[] args) {
        DateUtilities8 d8 = new DateUtilities8();
        LocalDate current = LocalDate.now();

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime dueDate = now.plusDays(15);

        System.out.println(d8.getDate(current));
        System.out.println(d8.getDateTime(dueDate));

        System.out.println(d8.addDate(5));
        System.out.println(d8.toDateTimeObject("1988-06-14 12:30"));
        System.out.println(d8.toDateObject("1988-06-14"));
        
        LocalDateTime dateTime = LocalDateTime.of(1988, Month.JUNE, 14, 12, 30);
        System.out.println(d8.toString(dateTime));
        
        LocalDate date = LocalDate.of(1988, Month.JUNE, 14);
        System.out.println(date);
    }
}
