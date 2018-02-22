package practise;
import java.util.Scanner;
public class practise4point13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
        System.out.print("输入一个字符:");
        String string=input.nextLine();
        char c=string.charAt(0);
        if(c=='A'||c=='a'){
            System.out.println(c+" 是元音");
        }
        else if(c=='E'||c=='e'){
            System.out.println(c+" 是元音");
        }
        else if(c=='I'||c=='i'){
            System.out.println(c+" 是元音");
        }
        else if(c=='O'||c=='o'){
            System.out.println(c+" 是元音");
        }
        else if(c=='U'||c=='u'){
            System.out.println(c+"是元音");
        }
        else
            System.out.println(c+" 是辅音");
        input.close();
	}

}
