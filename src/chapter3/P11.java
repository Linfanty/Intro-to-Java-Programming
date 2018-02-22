package chapter3;
import java.util.Scanner;

public class P11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int year,month;
		System.out.print("请输入年月数:");
		year=input.nextInt();
		month=input.nextInt();
		if(month!=2)
		{
			if(month/2==0&&month<=7)
				System.out.println(year+"年"+month+"月有30天.");
			if(month/2!=0&&month<=7)
				System.out.println(year+"年"+month+"月有31天.");
			if(month/2==0&&month>=8)
				System.out.println(year+"年"+month+"月有31天.");
			if(month/2!=0&&month>=8)
				System.out.println(year+"年"+month+"月有30天.");
		}
		else
		{
			if(year%100!=0&&year%4==0)
				System.out.println(year+"年"+month+"月有29天.");
			if(year%100!=0&&year%4!=0)
				System.out.println(year+"年"+month+"月有28天.");
			if(year%100==0&&year%400==0)
				System.out.println(year+"年"+month+"月有29天.");
			if(year%100==0&&year%400!=0)
				System.out.println(year+"年"+month+"月有28天.");
			if(year%3200==0&&year%172800==0)
				System.out.println(year+"年"+month+"月有29天.");
		}
		input.close();
	}

}
