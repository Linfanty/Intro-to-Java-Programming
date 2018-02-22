package chapter7;
import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] num = new int[205];
		int[] sum = new int[205];
		//int[] num ;
		//int[] sum  ;
		Scanner input = new Scanner(System.in);
		for( int i = 1 ; ; i++)
		{
			num[i] = input.nextInt();
			if(num[i] == 0)
				break;
			sum[num[i]]++;
		}
		
		for( int i = 1 ; i<= 100; i++){
			if(sum[i] != 0)
			{
				if( sum[i]==1 )
					System.out.println(i + " occurs "+ sum[i] + " time ");
				else
					System.out.println(i + " occurs "+ sum[i] + " times ");
				
			}
			
		}
		
		input.close();
		
	}

}
