package acm;
import java.math.*;
import java.util.*;

public class Shenyang {
	public static void main(String[] args)
	{
		BigInteger a1 = new BigInteger("4");
		BigInteger a2 = new BigInteger("14");
		BigInteger c = new BigInteger("4");
		
		List<BigInteger> list = new ArrayList<>();
		list.add(a1);
		list.add(a2);
		
		while(a2.compareTo(BigInteger.TEN.pow(30)) <= 0)
		{
			BigInteger last = c.multiply(a2).subtract(a1);
			list.add(last);
			a1 = a2;
			a2 = last;
		}
		Scanner cin = new Scanner(System.in);
		int t = cin.nextInt();
		while(t-->0)
		{
			BigInteger n = cin.nextBigInteger();
			for(BigInteger xx:list)
			{
				if(n.compareTo(xx) <= 0)
				{
					System.out.println(xx);
					break;
				}
			}
		}
	}
}
