package practise;
import java.util.Scanner;
public class practise3point17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("������ָ�1.���� 2.ʯͷ 3.�� ");
		int user=input.nextInt();
		int computer=(int)(Math.random()*2+0.5);
		switch(user)
		{
		case 1:if(computer==2)
			System.out.println("���Գ�ʯͷ�������ˣ�gg ");
		else
		{
			if(computer==1)
				System.out.println("���Գ�������ƽ�֣���ֱ�� ");
			else
				System.out.println("���Գ�������Ӯ�ˣ������ ");
		}break;
		case 2:if(computer==1)
			System.out.println("���Գ���������Ӯ�ˣ������ ");
		else
		{
			if(computer==2)
				System.out.println("���Գ�ʯͷ��ƽ�֣���ֱ�� ");
			else
				System.out.println("���Գ����������ˣ�gg ");
		}break;
		case 3:if(computer==1)
			System.out.println("���Գ������������ˣ�gg ");
		else
		{
			if(computer==2)
				System.out.println("���Գ�ʯͷ����Ӯ�ˣ������ ");
			else
				System.out.println("���Գ�����ƽ�֣���ֱ�� ");
		}break;
		}
		input.close();
	}
}
