package chapter7;
import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		int[] num = new int[110];
		int[] sum = new int[110];
		int cnt = 0;
		
		for(int i = 1 ; i<= 10;i++)
		{
			num[i] = input.nextInt();
			sum[ num[i] ] ++;
			if( sum[num[i]] == 1)
				cnt ++ ;
		}
		
		System.out.println(cnt);
		int i;
		for( i = 1 ; i<= 105 ; i++)
		{
			if( sum[i] != 0 )
				System.out.print( i + " ");
		}
		
		input.close();
	}
	
}
