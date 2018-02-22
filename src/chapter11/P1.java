package chapter11;
import java.util.Date;
import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
	    Scanner input = new Scanner(System.in);
	    double side1 = input.nextDouble();
	    double side2 = input.nextDouble();
	    double side3 = input.nextDouble();
	    
	    Triangle triangle = new Triangle(side1, side2, side3);
	    System.out.print("Enter the color: ");
	    String color = input.nextLine();
	    triangle.setColor(color);
	    
	    System.out.print("Enter a boolean value for filled: ");
	    boolean filled = input.nextBoolean();
	    triangle.setFilled(filled);

	    System.out.println("The area is " + triangle.getArea());
	    System.out.println("The perimeter is "+ triangle.getPerimeter());
	    System.out.println(triangle);
	    
	}

}

class Triangle extends GeometricObject {
	  private double side1 = 1.0, side2 = 1.0, side3 = 1.0;

	  public Triangle() {
	  }

	  public Triangle(double side1, double side2, double side3) {
	    this.side1 = side1;
	    this.side2 = side2;
	    this.side3 = side3;
	  }
	  
	  public double getSide1() {
	    return side1;
	  }

	  public double getSide2() {
	    return side2;
	  }
	  
	  public double getSide3() {
	    return side3;
	  }
	  
	  public double getArea() {
		    double s = (side1 + side2 + side3) / 2;
		    return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		  }
	  
	  public double getPerimeter() {
		    return side1 + side2 + side3;
		  }

	  public String toString() {
		    return "Triangle: side1 = " + side1 + " side2 = " + side2 +
		      " side3 = " + side3;
		  }

}


class GeometricObject {
	private String color = "white";
    private boolean filled;
    Date dateCreated;
    
    protected GeometricObject() {
        dateCreated = new Date();
    }
    
    protected GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public boolean isFilled() {
        return filled;
    }
    
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    public Date getDateCreated() {
        return dateCreated;
    }
    
    public String toString() {
        return "Created on " + dateCreated + "\ncolor " + color +
                " and filled" + filled;
    }

}
