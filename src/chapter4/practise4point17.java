package practise;
import java.util.Scanner;
public class practise4point17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
        System.out.print("�������:");
        int year=input.nextInt();
        int run=0;
        Scanner iput=new Scanner(System.in);
        System.out.print("�����·���д������ĸ��д:");
        String month=iput.nextLine();
        char ch1=month.charAt(0);
        char ch2=month.charAt(1);
        char ch3=month.charAt(2);
		if(year%100!=0&&year%4==0)
			run=1;
		if(year%100!=0&&year%4!=0)
			run=0;
		if(year%100==0&&year%400==0)
			run=1;
		if(year%100==0&&year%400!=0)
			run=0;
		if(year%3200==0&&year%172800==0)
			run=1;
		if(ch1=='J'&&ch2=='a'&&ch3=='n'){
            System.out.println(year+" һ����31��");
        }
        else if(ch1=='F'&&ch2=='e'&&ch3=='b'){
            if(run==1){
                System.out.println(year+" ������29��");
            }else
                System.out.println(year+" ������28��");
        }
        else if(ch1=='M'&&ch2=='a'&&ch3=='r'){
            System.out.println(year+" ������31��");
        }
        else if(ch1=='A'&&ch2=='p'&&ch3=='r'){
            System.out.println(year+" ������30��");
        }
        else if(ch1=='M'&&ch2=='a'&&ch3=='y'){
            System.out.println(year+" ������31��");
        }
        else if(ch1=='J'&&ch2=='u'&&ch3=='n'){
            System.out.println(year+" ������30��");
        }
        else if(ch1=='J'&&ch2=='u'&&ch3=='l'){
            System.out.println(year+" ������31��");
        }
        else if(ch1=='A'&&ch2=='u'&&ch3=='g'){
            System.out.println(year+" ������31��");
        }
        else if(ch1=='S'){
            System.out.println(year+" ������30��");
        }
        else if(ch1=='O'){
            System.out.println(year+" ʮ����31��");
        }
        else if(ch1=='N'){
            System.out.println(year+" ʮһ����30��");
        }
        else if(ch1=='D'){
            System.out.println(year+" ʮ������31��");
        }
		input.close();
		iput.close();
	}
}
