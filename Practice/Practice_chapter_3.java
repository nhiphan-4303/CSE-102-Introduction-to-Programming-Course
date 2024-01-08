import java.util.Calendar;

public class Practice_chapter_3 {

    public static void main(String[] args) {
        // Create an instance of Calendar
        Calendar calendar = Calendar.getInstance();
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        
        String day = ""; // This will hold the name of the day
        
        // Assign the day of the week as a string to 'day'
        switch (dayOfWeek) {
          case Calendar.SUNDAY:
            day = "Sunday";
            break;
          case Calendar.MONDAY:
            day = "Monday";
            break;
          case Calendar.TUESDAY:
             day = "Tuesday";
            break;
          case Calendar.WEDNESDAY:
            day = "Wednesday";
            break;
          case Calendar.THURSDAY:
            day = "Thursday";
            break;
          case Calendar.FRIDAY:
            day = "Friday";
            break;
          case Calendar.SATURDAY:
            day = "Saturday";
            break;
        }

        // Print out the current day
        System.out.println(day);
    }
}
