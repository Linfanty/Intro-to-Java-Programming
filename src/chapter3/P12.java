package chapter3;
import java.util.Scanner;
public class P12 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num,a,c;
		System.out.print("请输入一个三位数:");
		num=input.nextInt();
		c=num%10;
		a=num/100;
		if(a==c)
			System.out.print(num+"是回文数:");
		else
			System.out.print(num+"不是回文数:");
		input.close();
	}

}
