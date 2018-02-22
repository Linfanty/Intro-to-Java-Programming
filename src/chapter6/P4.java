package chapter6;
import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		int n =  input.nextInt();
		System.out.println(reverse(n));
		input.close();
	}

	public static int reverse (int number)
	{
		int sum = 0;
		while( number!=0 )
		{
			sum =  sum *10 + ( number % 10 );
			number = number /10 ;
		}
		return sum ;
	}
}
