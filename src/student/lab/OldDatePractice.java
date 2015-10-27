package student.lab;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author jwardell
 */
public class OldDatePractice {
    public static void main(String[] args) {
        Calendar aDate = Calendar.getInstance();
        aDate.add(Calendar.YEAR, 5);
        SimpleDateFormat sdf =
                new SimpleDateFormat("M.d.yyyy h:m a");
        Date date = aDate.getTime();
        String s = sdf.format(date);
        System.out.println("Adjusted Date is : " + s);
        
        
//        Calendar startDate = Calendar.getInstance();
//         Calendar endDate = Calendar.getInstance();
//         endDate.set(2015, Calendar.OCTOBER, 23);
//        long startTime = startDate.getTimeInMillis();
//        long endTime = endDate.getTimeInMillis();
//        long diffInHrs = (endTime - startTime)/1000/60/60;
//        System.out.println("Difference in hours " + diffInHrs);
        
        
//        Date date1 = new Date();
//        System.out.println("Default format: " +  date1);
//        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy hh:mm a");
//        String myFormat = sdf.format(date1);
//        System.out.println("My Format: " + myFormat);
//        
//        Calendar date2 = Calendar.getInstance();
//        String s = sdf.format(date2.getTime());
//        System.out.println(s);
    }
}
