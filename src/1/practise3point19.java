package practise;
import java.util.Scanner;
public class practise3point19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("���������������߱߳� ");
		double a=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
		double d=a+b+c,judge;
		if((a+b)<=c||(a+c)<=b||(b+c)<=a)
			judge=1;
		else
			judge=0;
		if(judge==0)
			System.out.println("�������ܳ�Ϊ "+d);
		else
			System.out.println("�����β�����");
		input.close();
	}

}
