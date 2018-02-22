package charpter12;
import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double x, y, z = 0;
		char ch;
		String s;
		int flag = 0;
		
		x = input.nextDouble();
		s = input.next();
		ch = s.charAt(0);
		y = input.nextDouble();
		
		//System.out.println(x + " " + ch +  " " + y + " = " + z );
		try{
			
		}
		catch(NumberFormatException ex){
			System.out.println(" aaa ");
		}
		
		if( ch == '-')
			z = x - y;
		else if(ch == '+')
			z = x + y; 
		else if( ch == '*')
			z = x * y;
		else if( ch == '/')
		{
			if( y == 0 )
				flag = 1;
			else z = x / y;
		}
		
		if(flag == 1)
			System.out.println(" no / 0 ");
		else System.out.println(x + " " + ch + " " + y + " = " + z );
		
		
		
		
		input.close();
		
	}

}
