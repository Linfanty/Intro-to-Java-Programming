package chapter6;

public class P13 {

	public static void main(String[] args) {
		
		System.out.println("i      m(i)");
		System.out.println("___________");
		
		for(int i =1 ; i <= 20 ; i++)
			System.out.printf("%d    %.4f\n",i,mi(i));
	}	
	
	public static double mi(int n)
  	{	
		double sum = 0 ;
		for(int i = 1; i <= n ;i++ )
		{
			sum += (double)i /(i+1);
		}
		return(sum);
  	}
}