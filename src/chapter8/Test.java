package chapter8;
import java.util.Scanner;
import java.lang.System;
import java.util.Date;

public class Test {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		/*
		String mylist3 = "welcome";
		System.out.println(mylist3.charAt(1));
		System.out.println(mylist3.toUpperCase());
		String s1 = input.nextLine();
		System.out.println(s1.indexOf('3'));
		*/
		String s1 = "sss";
		s1 = "ss2s";
		System.out.println(s1.replaceAll(s1, "1134"));;
		
		
		
		/*
		double d = Double.MAX_VALUE;
		System.out.println(d);
		double d2 = Double.parseDouble(s1);
		System.out.println(d2);
		*/
		
		
		/*
		int[] mylist = {3, 4, y5};
		int[] mylist2 = {5,6,7,8};
		System.arraycopy(mylist, 0, mylist2, 0, mylist.length);
		
		for(int e : mylist2)
			System.out.println(e);
		
		
		  double[][] myfirst = new double[2][2];
		//System.out.println(myfirst[0].length);
		
		for(int i = 0; i < myfirst.length; i++)
			for(int j = 0; j < myfirst[i].length; j++)
				myfirst[i][j] = input.nextDouble();
		
		for(int i = 0; i < myfirst.length; i++)
			for(int j = 0; j < myfirst[i].length; j++)
				System.out.println(myfirst[i][j]);
		
		for(double e : myfirst[0])
			System.out.println(e);
		*/
		input.close();
	}
	
	
}
