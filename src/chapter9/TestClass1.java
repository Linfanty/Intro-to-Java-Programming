package chapter9;

public class TestClass1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		A AA = new A(10);
		System.out.println(AA.d);
		System.out.println(AA.getA());
		//System.out.println(AA.setD(100))
	}

}


class A{
	double d;
	A()	{d = 1;}
	A(double newd) { d = newd; }
	
	double getA()	{return d * d * Math.PI; }
	double getP()	{return 2 * d * Math.PI; }
	
	void setD(double newd)	{d = newd;}
}