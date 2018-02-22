package practise;
import java.util.Scanner;
public class practise4point5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		double s,l;
		int n;
		System.out.print("请输入边数与边长：");
		n=input.nextInt();
		l=input.nextDouble();
		s=(n*Math.pow(l, 2))/(4*Math.tan(Math.PI/n));
		System.out.print("面积为："+s);
		input.close();
	}

}
