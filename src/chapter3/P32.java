package chapter3;
import java.util.Scanner;
public class P32 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);    
	    System.out.print("����p0, p1 �� p2����:");  
	    double x0 = input.nextDouble();  
	    double y0 = input.nextDouble();  
	    double x1 = input.nextDouble();  
	    double y1 = input.nextDouble();  
	    double x2 = input.nextDouble();  
	    double y2 = input.nextDouble();  
	  
	    double result = (x1-x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);  
	    System.out.print("(" + x2 + ", " + y2 + ")" +   
	            " �� ");  
	    if (result > 0)   
	        System.out.println(" (" +  
	            x0 + ", " + y0 + ") - (" + x1 + ", " + y1 + ")�����");  
	    else 
	    	{
	    	if (result == 0)  
	        System.out.println(" (" +  
	            x0 + ", " + y0 + ") - (" + x1 + ", " + y1 + ")��");  
	    	
	         else  
	              System.out.println(" (" +  x0 + ", " + y0 + ") - (" + x1 + ", " + y1 + ")���Ҷ�");
	}
input.close();
}
}