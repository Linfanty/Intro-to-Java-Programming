package chapter3;
import java.util.Scanner;
public class P30 {
	public static void main(String[] args) {
		// Obtain the total milliseconds since midnight, Jan 1, 1970
		int move;
		Scanner input=new Scanner(System.in);
		System.out.print("ÇëÊäÈëÆ«ÒÆÁ¿£º");
		move=input.nextInt();
		long totalMilliseconds = System.currentTimeMillis();

		// Obtain the total seconds since midnight, Jan 1, 1970
		long totalSeconds = totalMilliseconds / 1000;

		// Compute the current second in the minute in the hour
		long currentSecond = totalSeconds % 60;

		// Obtain the total minutes
		long totalMinutes = totalSeconds / 60;

		// Compute the current minute in the hour
		long currentMinute = totalMinutes % 60;

		// Obtain the total hours
		long totalHours = totalMinutes / 60;

		// Compute the current hour
		long currentHour = totalHours % 24;
		currentHour=currentHour+move;
		// Display results
		if(currentHour>=12)
		{
			currentHour=currentHour-12;
		    System.out.println("Current time is " + currentHour + ":"
				+ currentMinute + ":" + currentSecond + " GMT"+"  AM");
		}
		else
			System.out.println("Current time is " + currentHour + ":"
					+ currentMinute + ":" + currentSecond + " GMT");
		input.close();
	}
}

