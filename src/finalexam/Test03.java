package finalexam;

public class Test03 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		try{
			method();
			System.out.println("after");
		}
		catch (RuntimeException ex)
		{
			System.out.println("runtime");
		}
		catch(Exception ex)
		{
			System.out.println("sssss");
		}
		finally
		{
			System.out.println("aaaa");
		}
		System.out.println("bbbbb");
	}
	
	static void method() throws Exception{
		try{
			String s = "abc";
			System.out.print(s.charAt(3));
		}
		catch (RuntimeException ex)
		{
			System.out.println("runtime");
			//throw ex;
			
		}
		catch (Exception ex)
		{
			System.out.println("exce");
		}
	}
}


