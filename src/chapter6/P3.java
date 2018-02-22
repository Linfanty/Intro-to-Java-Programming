package chapter6;

import java.util.*;
public class P3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		int n =  input.nextInt();
		//int m= reverse(n);
		//System.out.println(m);
		if(isPalindrome(n) == true)
			System.out.println("Yes");
		else System.out.println("No");
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
	
	public static boolean isPalindrome (int number)
	{
		if(number == reverse(number))
			return true;
		else return false;
	}

}
