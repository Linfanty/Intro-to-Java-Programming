package finalexam;

public class Test1223 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		try {
			method();
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	
	static void method() throws Exception{
	try{
		System.out.println("1");
		String s = "abc";
		System.out.print(s.charAt(3));
		System.out.println("3");
	}
	catch (RuntimeException ex)
	{
		//System.out.println("4");
		throw ex;
	}
	catch (Exception ex)
	{
		//System.out.println("5");
	}
	finally{
		System.out.println("4");
	}
	System.out.println("5");
}
}
 