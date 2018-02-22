package chapter2;


public class P18 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("a   b   pow(a,b)");
		for(int i=1;i<=5;i++)
		{
			long m = (int) Math.pow(i, i+1);
			System.out.printf("%d   %-4d%-4d\n",i,i+1,m);
		}
		
	}

}
