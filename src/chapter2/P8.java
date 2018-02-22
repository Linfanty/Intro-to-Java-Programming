package chapter2;
import java.util.*;

public class P8 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.print("Enter the time zone offset to GMT:");
		Scanner input = new Scanner(System.in);
		int gmt = input.nextInt();
		
		long total = System.currentTimeMillis();
		long totalSecond = total / 1000;
		long currentSecond = totalSecond % 60;
		long totalMinutes = totalSecond / 60;
		long currentMinutes = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		long currentHours = totalSecond % 24;
		
		System.out.println("The current time is " + (currentHours -5) +":"+  currentMinutes + ":" +currentSecond );
		 
		input.close(); 
	}

}
