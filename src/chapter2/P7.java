package chapter2;
import java.util.*;

public class P7 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.print("Enter the number of minutes:");
		Scanner input = new Scanner(System.in);
		int minutes = input.nextInt();
		int year = minutes / 365 / 24 / 60 ;
		int days =( minutes - year * 365 * 24 * 60);
		
		System.out.println( minutes + " minutes is approximately " + year + " years and " + days/24/60	 + " days");
		input.close();
	}

}
