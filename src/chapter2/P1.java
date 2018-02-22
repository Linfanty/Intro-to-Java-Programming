package chapter2;
import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.print("Enter a degree in Celsius:");
		Scanner input = new Scanner (System.in);
		double Ce = input.nextDouble();
		
		System.out.println(Ce + " Celsius is " + (Ce * (9.0/5.0) + 32) + " Fahreheit"  );
		input.close();
	}

}
