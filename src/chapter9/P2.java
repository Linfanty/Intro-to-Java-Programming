package chapter9;

public class P2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Stock stock = new Stock("ORCL","Oracle Corporation",34.5,34.35);
		
		 System.out.println(stock.getPreviousClosingPrice());
		 System.out.println(stock.getCurrentPrice());
		 System.out.println(stock.getChangePercent() * 100 + "%");

	}
}

class Stock
{
	String sysbol;
	String name;
	double previousClosingPrice;
	double currentPrice;
	
	public Stock(){
	}

	public Stock(String sysbol, String name, double previousClosingPrice, double currentPrice) {
		super();
		this.sysbol = sysbol;
		this.name = name;
		this.previousClosingPrice = previousClosingPrice;
		this.currentPrice = currentPrice;
	}

	public double getPreviousClosingPrice() {
		return previousClosingPrice;
	}

	public void setPreviousClosingPrice(double previousClosingPrice) {
		this.previousClosingPrice = previousClosingPrice;
	}

	public double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}
	
	
	public double getChangePercent() {
		return (currentPrice - previousClosingPrice) /
			      previousClosingPrice;
	}

	
	
	
	
}