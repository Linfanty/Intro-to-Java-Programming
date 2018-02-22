package practise;
import java.util.Scanner;
public class practise3point17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("请输入指令：1.剪刀 2.石头 3.布 ");
		int user=input.nextInt();
		int computer=(int)(Math.random()*2+0.5);
		switch(user)
		{
		case 1:if(computer==2)
			System.out.println("电脑出石头，你输了，gg ");
		else
		{
			if(computer==1)
				System.out.println("电脑出剪刀，平手，简直了 ");
			else
				System.out.println("电脑出布，你赢了，厉害喔 ");
		}break;
		case 2:if(computer==1)
			System.out.println("电脑出剪刀，你赢了，厉害喔 ");
		else
		{
			if(computer==2)
				System.out.println("电脑出石头，平手，简直了 ");
			else
				System.out.println("电脑出布，你输了，gg ");
		}break;
		case 3:if(computer==1)
			System.out.println("电脑出剪刀，你输了，gg ");
		else
		{
			if(computer==2)
				System.out.println("电脑出石头，你赢了，厉害喔 ");
			else
				System.out.println("电脑出布，平手，简直了 ");
		}break;
		}
		input.close();
	}
}
