package practise;
import java.util.Scanner;
public class practise3point22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("�����������");
		double x=input.nextInt();
		double y=input.nextInt();
		double l=Math.pow(Math.pow(x, 2)+Math.pow(y, 2), 0.5);
		if(l<=10)
			System.out.println("�õ���Բ��");
		else
			System.out.println("�õ㲻��Բ��");
		input.close();
	}

}
