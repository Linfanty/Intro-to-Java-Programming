package practise;
import java.util.Scanner;
public class practise3point1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		double a,b,c,r1,r2,delta;
		System.out.println("������a,b,c:");
		a=input.nextDouble();
		b=input.nextDouble();
		c=input.nextDouble();
		delta=Math.pow(b, 2)-4*a*c;
		if(delta>=0)
		{
			r1=((-b)+Math.pow(delta, 0.5))/2*a;
			r2=((-b)-Math.pow(delta, 0.5))/2*a;
			System.out.println("���̵ĸ�Ϊr1="+r1+"r2="+r2);
		}
		else
		{
			if(delta==0)
			{
				r1=-(b/2*a);
				System.out.println("���̵ĸ�Ϊr="+r1);
			}
			else
			{
				System.out.println("������ʵ��");
			}
		}
		input.close();
	}
}
