package practise;
import java.util.Scanner;
public class practise3point22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("请输入点坐标");
		double x=input.nextInt();
		double y=input.nextInt();
		double l=Math.pow(Math.pow(x, 2)+Math.pow(y, 2), 0.5);
		if(l<=10)
			System.out.println("该点在圆内");
		else
			System.out.println("该点不在圆内");
		input.close();
	}

}
