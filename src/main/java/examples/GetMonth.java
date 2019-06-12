package examples;

import java.util.Calendar;
 
public class GetMonth
{
    public static void main(String[] args)
    {
        String[] months = {"January", "February",
            "March", "April", "May", "June", "July",
            "August", "September", "October", "November",
            "December"};
 
        Calendar cal = Calendar.getInstance(); 
        String month = months[cal.get(Calendar.MONTH)];
        System.out.println("Month name: " + month);
    }
}