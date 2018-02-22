package chapter11;
import java.util.ArrayList;

public class P7 {
	  public static void main(String[] args) {
		  ArrayList<Integer> zhengshu = new ArrayList<>() ;
		  zhengshu.add(1);
		  zhengshu.add(2);
		  zhengshu.add(3);
		  zhengshu.add(4);
		  zhengshu.add(5);
		  zhengshu.add(6);
		  zhengshu.add(7);
		  shuffle(zhengshu);
		  
		 for (int i = 0; i < zhengshu.size(); i++) 
			      System.out.print(zhengshu.get(i) + " ");
}


public static void shuffle( ArrayList<Integer> list){
	for (int i = 0; i < list.size(); i++)
	{
		int index = (int)(Math.random() * list.size());
		int temp = list.get(index);
		
		list.set(index, list.get(i));
		list.set(i, temp);
	} 
	
}
}