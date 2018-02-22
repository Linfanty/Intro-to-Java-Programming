package finalexam;
import java.math.BigInteger;  
import java.util.Scanner;


public class Test {
	public static void main(String[] arguments){
		

		int ans[] = new int[10006];
		for(int i = 1; i < 1005; i++)
		{
			BigInteger bi = new BigInteger("2");
			bi = bi.pow(i);
			//for(int j = 1; j <= i; j ++)
			//   bi =  bi.add(bi);
			
			 //System.out.println(bi);
			 int cnt = 0;
			 BigInteger b2 = new BigInteger("10");
			 BigInteger b3 = new BigInteger("0");
			 while( !bi.equals(BigInteger.ZERO))
			 {
				 cnt++;
				 bi = bi.divide(b2) ;
				 //System.out.println(bi);
			 }
			 ans[i] = cnt-1; 
		}
		
		int m, w = 1;
		Scanner cin = new Scanner(System.in);
		while( cin.hasNext() )
		{
			 m = cin.nextInt();

			 System.out.print("Case #");
			 System.out.print(w);
			 System.out.print(": ");
			 System.out.println(ans[m]);
			 ++w;
		}
		
	}
}


