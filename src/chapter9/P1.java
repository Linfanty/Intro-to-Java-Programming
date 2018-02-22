package chapter9;

public class P1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		Rectangle my = new Rectangle(4,40);
System.out.println(my.width + " "
		+my.height + ' ' 
		+my.getArea()+' '
		+my.getPerimeter());


		Rectangle my2 = new Rectangle(3.5, 35.9);
		
System.out.println(my2.width + " "+ 
				my2.height + ' ' +	
				my2.getArea()+' '+
				my2.getPerimeter());

	}

}

class Rectangle
{
	double width = 1;
	double height = 1;
	
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public Rectangle() {
		
	}
	//*****////
	public double getArea() {
		return width * height;
	}


	public double getPerimeter() {
		return 2 * (height + width);
	}

	
}