package charpter12;

public class P10 {
	 public static void main(String[] args) { 
	    try {
	      int[] list = new int[2000000000];
	    }
	    catch (Error ex) {
	      //ex.printStackTrace();
	      System.out.println("You are running out of memory.");
	    }
	  }
}
