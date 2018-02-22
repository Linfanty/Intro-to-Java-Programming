package chapter6;
import java.util.Scanner;
public class P2 {


	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new  Scanner(System.in);  
		long n = input.nextLong();
		System.out.println( sumDigits(n) );
		input.close();
	}
	
	public static int sumDigits(long n)
	{
		int sum = 0;
		while( n!= 0  )
		{
			sum += n%10 ;
			n = n/10;
	//		System.out.println(sum);
		}
		return sum;
	}
	

}
