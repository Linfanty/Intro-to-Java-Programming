package practise;
import java.util.Scanner;
public class practise4point11 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
	        System.out.print("����һ������(0 to 15) :");
	        int number=input.nextInt();
	        if(number>=0&&number<=9){
	            System.out.println("16������Ϊ"+number);
	        }
	        else if(number>=10&&number<=15)
	        {
	         switch(number)
	         {
	         case 10:System.out.println("16������Ϊ A");break;
	         case 11:System.out.println("16������Ϊ B");break;
	         case 12:System.out.println("16������Ϊ C");break;
	         case 13:System.out.println("16������Ϊ D");break;
	         case 14:System.out.println("16������Ϊ E");break;
	         case 15:System.out.println("16������Ϊ F");break;
	         }
	         input.close();
	        }
	}

}
