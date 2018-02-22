package finalexam;

public class Test1123 {
	public static void main(String[] args){
		new A();
		new B();
	}
}

class A{
	int i = 7;
	public A(){
		setI(20);
		System.out.println(i);
	}
	public void setI(int i) {
		this.i = 2 * i;
	}
}

class B extends A{
	public B()
	{
		System.out.println(i);
	}
	// fu gai 
	public void setI(int i) {
		this.i = 3 * i;
	}
}