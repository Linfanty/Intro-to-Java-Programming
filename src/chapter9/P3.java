package chapter9;

import java.util.Date;

public class P3 {
  public static void main(String[] args) {
    Date date = new Date();
    
    int count = 1;
    long time = 10000;
    
    while (count <= 8) {
      date.setTime(time);
      System.out.println(date.toString());   
      count++;
      time *= 10;
    }
  }
}
