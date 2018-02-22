package practise;
import java.util.Scanner;
public class practise3point21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("请依次输入几日，几月，年份：");
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
		System.out.print("该日为星期");
		switch(h)
		{
		case 0:System.out.println("六");break;
		case 1:System.out.println("日");break;
		case 2:System.out.println("一");break;
		case 3:System.out.println("二");break;
		case 4:System.out.println("三");break;
		case 5:System.out.println("四");break;
		case 6:System.out.println("五");break;
		}
		input.close();
	}

}
