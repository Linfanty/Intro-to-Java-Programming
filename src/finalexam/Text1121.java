package finalexam;

public class Text1121 {

	public static void main(String[] args)
	{
		new Person().printPerson();
		new Student().printPerson();
	}
}

class Student extends Person{
	//@Override
	@SuppressWarnings("unused")
	private String getInfo(){
		return "Student";
	}
}

class Person{
	private String getInfo()
	{
		return "Person"; 
	}
	public void printPerson(){
		System.out.println(getInfo());
	}
}
