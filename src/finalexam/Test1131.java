package finalexam;

import java.util.ArrayList;

public class Test1131 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ArrayList<String> list = new ArrayList<>();
		list.add("aaaaa");
		list.add("aaaaa");
		list.add("bbbbb");
		//list.add(new java.util.Date());
		list.add("aaaaa");
	
		
		for(int i = 0; i < list.size(); i++ )
		{
			if(list.get(i) == "aaaaa")
			{
				list.remove("aaaaa");
				i--;	
			}
		}
		for(int i = 0; i < list.size(); i++ )
			System.out.println(i + list.get(i) + " ");
	}

}
