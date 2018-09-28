package CalendarTest;

import java.time.*;

public class CalendarTest {
    public static void main (String[] args)
    {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        date = date.minusDays(today - 1);  //set to start of month
        DayOfWeek weekday = date.getDayOfWeek();
        int value =  weekday.getValue();  //  1=Monday ^^^^ 7= Sunday

        System.out.println("  Mon  Tue  Wed  Thu  Fri  Sat  Sun");
        for (int i = 1;i < value ;i ++)
        {
            System.out.print("     ");

        }
        while (date.getMonthValue() == month)
        {
            System.out.printf("%4d",date.getDayOfMonth());
            if (date.getDayOfMonth() == today)
                System.out.printf("*");
            else
                System.out.printf(" ");
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1)  System.out.println();

        }
        if (date.getDayOfWeek().getValue() != 1)  System.out.println();
    }
}
