package practise;
import java.util.Scanner;
public class practise3point21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("���������뼸�գ����£���ݣ�");
		int q=input.nextInt();
		int m=input.nextInt();
		int year=input.nextInt();
		int h;
		int j,k;
		if(m==1)
		{
			m=13;
			year=year-1;
		}
		if(m==2)
		{
			m=14;
			year=year-1;
		}
		j=year/100;
		k=year%100;
		h=(q+26*(m+1)/10+k+k/4+j/4+5*j)%7;
		System.out.print("����Ϊ����");
		switch(h)
		{
		case 0:System.out.println("��");break;
		case 1:System.out.println("��");break;
		case 2:System.out.println("һ");break;
		case 3:System.out.println("��");break;
		case 4:System.out.println("��");break;
		case 5:System.out.println("��");break;
		case 6:System.out.println("��");break;
		}
		input.close();
	}

}
