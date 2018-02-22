package practise;
import java.util.Scanner;
public class practise4point11 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
	        System.out.print("输入一个数字(0 to 15) :");
	        int number=input.nextInt();
	        if(number>=0&&number<=9){
	            System.out.println("16进制数为"+number);
	        }
	        else if(number>=10&&number<=15)
	        {
	         switch(number)
	         {
	         case 10:System.out.println("16进制数为 A");break;
	         case 11:System.out.println("16进制数为 B");break;
	         case 12:System.out.println("16进制数为 C");break;
	         case 13:System.out.println("16进制数为 D");break;
	         case 14:System.out.println("16进制数为 E");break;
	         case 15:System.out.println("16进制数为 F");break;
	         }
	         input.close();
	        }
	}

}
