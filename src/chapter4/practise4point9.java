package practise;
import java.util.Scanner;
public class practise4point9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print(" �����뵥���ַ�:");
		String character=input.nextLine();
		char ch=character.charAt(0);
		if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')){
			int interger=(int)ch;
			System.out.println(ch+" �ַ���UnicodeֵΪ"+interger);
		}else
			System.exit(1);
		input.close();
	}

}
