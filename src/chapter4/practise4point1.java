package practise;
import java.util.Scanner;
public class practise4point1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		double s,l,r;
		System.out.print("请输入五边形中心到顶点的距离：");
		r=input.nextDouble();
		l=2*r*Math.sin(Math.PI/5);
		s=(5*Math.pow(l,2))/(4*Math.tan(Math.PI/5));
		System.out.print("五边形面积为："+s);
		input.close();
	}

}
