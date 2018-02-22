package practise;
import java.util.Scanner;
public class practise4point17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
        System.out.print("输入年份:");
        int year=input.nextInt();
        int run=0;
        Scanner iput=new Scanner(System.in);
        System.out.print("输入月份缩写，首字母大写:");
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
            System.out.println(year+" 一月有31天");
        }
        else if(ch1=='F'&&ch2=='e'&&ch3=='b'){
            if(run==1){
                System.out.println(year+" 二月有29天");
            }else
                System.out.println(year+" 二月有28天");
        }
        else if(ch1=='M'&&ch2=='a'&&ch3=='r'){
            System.out.println(year+" 三月有31天");
        }
        else if(ch1=='A'&&ch2=='p'&&ch3=='r'){
            System.out.println(year+" 四月有30天");
        }
        else if(ch1=='M'&&ch2=='a'&&ch3=='y'){
            System.out.println(year+" 五月有31天");
        }
        else if(ch1=='J'&&ch2=='u'&&ch3=='n'){
            System.out.println(year+" 六月有30天");
        }
        else if(ch1=='J'&&ch2=='u'&&ch3=='l'){
            System.out.println(year+" 七月有31天");
        }
        else if(ch1=='A'&&ch2=='u'&&ch3=='g'){
            System.out.println(year+" 八月有31天");
        }
        else if(ch1=='S'){
            System.out.println(year+" 九月有30天");
        }
        else if(ch1=='O'){
            System.out.println(year+" 十月有31天");
        }
        else if(ch1=='N'){
            System.out.println(year+" 十一月有30天");
        }
        else if(ch1=='D'){
            System.out.println(year+" 十二月有31天");
        }
		input.close();
		iput.close();
	}
}
