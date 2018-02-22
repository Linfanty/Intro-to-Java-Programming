package chapter6;
//import java.util.Scanner;

public class P9 {
	
	public static void main(String[] args)
	{
		System.out.println("Ó¢³ß         Ã×            Ã× 	     Ó¢³ß");
		System.out.println("------------------------");
		for( double i = 1; i< 11 ;i ++ )
		{
			System.out.printf("%.1f  	%.3f	%.1f	%.3f\n",i,footToMeter(i),15+5*i,meterToFoot(15+5*i));
		}
	} 
	
	public static double footToMeter( double foot)
	{
		return 0.305*foot;
	}
	public static double meterToFoot( double meter)
	{
		return 3.279*meter;
	}
	
}
