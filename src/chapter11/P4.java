package chapter11;
import java.util.ArrayList;
import java.util.Scanner;

public class P4 {

	  public static void main(String[] args) {
	    ArrayList<Integer> list = new ArrayList<Integer>();

	    
		Scanner input = new Scanner(System.in);   
	    System.out.print("Enter integers (input ends with 0): ");
	    int value;
	    
	    do {
	      value = input.nextInt(); 
	      
	      if (value != 0) 
	        list.add(value); 
	    } while (value != 0);

	    System.out.print("The maximum number is " + max(list));
	  }
	  
	  public static Integer max(ArrayList<Integer> list) {
	    if (list == null || list.size() == 0)
	      return null;
	    
	    int result = list.get(0);
	    for (int i = 1; i < list.size(); i++)
	      if (result < list.get(i))
	        result = list.get(i);
	    
	    return result;
	  }
	}
