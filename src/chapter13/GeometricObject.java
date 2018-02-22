package chapter13;

public abstract class GeometricObject {

	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	protected GeometricObject(){
		setDateCreated(new java.util.Date());
	}
	
	protected GeometricObject(String color, boolean filled)
	{
		setDateCreated(new java.util.Date());
		this.setColor(color);
		this.setFilled(filled);
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

	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(java.util.Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	@Override
	public String toString()
	{
		return "created on " + dateCreated + "\ncolor" + color + " and filled: " + filled;
	}
	
	
	//public  abstract void g1();
	public  abstract double getArea();
	public  abstract double getPerimeter();
}




