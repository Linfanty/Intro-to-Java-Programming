package chapter7;
import java.util.Scanner;

public class P7 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		int[] num = new int[110];
		int[] sum = new int[110];
		int cnt = 0;
		
		for(int i = 1 ; i<= 100;i++)
		{
			num[i] = (int)(Math.random()*10) ;
			sum[ num[i] ]  ++;
			if( sum[num[i]] != 0 )
				cnt ++ ;
		}
		
		System.out.println(cnt);
		for( int i = 0 ; i<= 10; i++){
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
