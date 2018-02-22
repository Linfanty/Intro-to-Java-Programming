package finalexam;

public class Test1120 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Integer[] list1 = {12,24};
		Double[] list2 = {1.1,2.1};
		Integer[] list3 = {1,2,3};
		printArray(list1);
		printArray(list2);
}

	private static void printArray(int[] list2) {
		for(Object o : list2)
			System.out.println(o + " ");
		
	}

	public static void printArray(Object[] list)
	{
		for(Object o : list)
			System.out.println(o + " ");
	}
	
}