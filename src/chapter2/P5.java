package chapter2;
import java.util.*;

public class P5 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.print("Enter the subtotal and a gratuity rate:");
		Scanner input = new Scanner(System.in );
		double free = input.nextDouble();
		double free2 = input.nextDouble();
		System.out.println("The gratuity is $" + free * 0.01 * free2 + " and total is $" + (free * free2 * 0.01 + free) );
		input.close();
	}

}
