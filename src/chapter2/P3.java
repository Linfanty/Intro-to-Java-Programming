package chapter2;
import java.util.*;

public class P3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.print("Enter a value for feet:");
		Scanner input = new Scanner(System.in);
		double feet = input.nextDouble();
		System.out.println(feet + " feet is " + feet*0.305 + " meters");
		input.close();
	}

}
