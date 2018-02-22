package chapter10;
import java.util.*;
public class P14 {
	  public static void main(String[] args) {
	    MyDate date = new MyDate();
	    System.out.println("year: " + date.getYear());
	    System.out.println("month: " + date.getMonth());
	    System.out.println("day: " + date.getDay());
	    
	    date = new MyDate(561555550000L);
	    System.out.println("year: " + date.getYear());
	    System.out.println("month: " + date.getMonth());
	    System.out.println("day: " + date.getDay());
	  }
	}

	class MyDate {
	  private int year;
	  private int month;
	  private int day;
	  
	  MyDate() {    
	    GregorianCalendar date = new GregorianCalendar();
	    year = date.get(Calendar.YEAR);
	    month = date.get(Calendar.MONTH);
	    day = date.get(Calendar.DAY_OF_MONTH);
	  }
	  
	  MyDate(long elapsedTime) {   
	    GregorianCalendar date = new GregorianCalendar();
	    date.setTimeInMillis(elapsedTime);
	    year = date.get(Calendar.YEAR);
	    month = date.get(Calendar.MONTH);
	    day = date.get(Calendar.DAY_OF_MONTH);
	  }
	    
	  MyDate(int year, int month, int day) {
	    this.year = year;
	    this.month = month;
	    this.day = day;
	  }
	  
	  public int getYear() {
	    return year;
	  }

	  public int getMonth() {
	    return month;
	  }
	  
	  public int getDay() {
	    return day;
	  }
	  
	  public void setYear(int year) {
	    this.year = year;
	  }
	  
	  public void setMonth(int month) {
	    this.month = month;
	  }
	  
	  public void setDay(int day) {
	    this.day = day;
	  }  
	}
