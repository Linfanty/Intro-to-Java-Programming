package chapter3;
import java.util.Scanner;

public class P9 {

		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);
			int[] isbn;
			int i,j,k,sum=0;
			isbn=new int[11];
			System.out.print("ISBN :");
			for(i=1;i<=9;i++)
			{
				isbn[i]=input.nextInt();
			}
			for(j=1;j<=9;j++)
			{
				sum=sum+isbn[j]*j;
			}
			isbn[10]=sum%11;
			System.out.print("ISBN:");
			for(k=1;k<=9;k++)
			{
				System.out.print(isbn[k]);
			}
			if(isbn[10]==10)
				System.out.print("X");
			else
				System.out.print(isbn[10]);
			input.close();	
		}

	}
