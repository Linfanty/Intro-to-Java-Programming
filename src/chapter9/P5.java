package chapter9;
import java.util.GregorianCalendar;

public class P5 {

	  public static void main(String[] args) {
	    GregorianCalendar calendar = new GregorianCalendar();
	    System.out.println("Year is " + calendar.get(GregorianCalendar.YEAR));
	    System.out.println("Month is " + (calendar.get(GregorianCalendar.MONTH)+1));
	    System.out.println("Date is " + calendar.get(GregorianCalendar.DATE));

	    calendar.setTimeInMillis(1234567898765L);
	    System.out.println("Year is " + calendar.get(GregorianCalendar.YEAR));
	    System.out.println("Month is " + calendar.get(GregorianCalendar.MONTH));
	    System.out.println("Date is " + calendar.get(GregorianCalendar.DATE));
	  }
	}
