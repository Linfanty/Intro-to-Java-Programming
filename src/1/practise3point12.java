package practise;
import java.util.Scanner;
public class practise3point12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int num,a,b,c;
		System.out.print("������һ����λ��:");
		num=input.nextInt();
		c=num%10;
		b=num%100-c;
		a=num/100;
		if(a==c)
			System.out.print(num+"�ǻ�����:");
		else
			System.out.print(num+"���ǻ�����:");
		input.close();
	}

}