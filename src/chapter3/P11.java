package chapter3;
import java.util.Scanner;

public class P11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int year,month;
		System.out.print("������������:");
		year=input.nextInt();
		month=input.nextInt();
		if(month!=2)
		{
			if(month/2==0&&month<=7)
				System.out.println(year+"��"+month+"����30��.");
			if(month/2!=0&&month<=7)
				System.out.println(year+"��"+month+"����31��.");
			if(month/2==0&&month>=8)
				System.out.println(year+"��"+month+"����31��.");
			if(month/2!=0&&month>=8)
				System.out.println(year+"��"+month+"����30��.");
		}
		else
		{
			if(year%100!=0&&year%4==0)
				System.out.println(year+"��"+month+"����29��.");
			if(year%100!=0&&year%4!=0)
				System.out.println(year+"��"+month+"����28��.");
			if(year%100==0&&year%400==0)
				System.out.println(year+"��"+month+"����29��.");
			if(year%100==0&&year%400!=0)
				System.out.println(year+"��"+month+"����28��.");
			if(year%3200==0&&year%172800==0)
				System.out.println(year+"��"+month+"����29��.");
		}
		input.close();
	}

}
