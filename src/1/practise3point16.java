package practise;

public class practise3point16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length = (int)(Math.random()*100);
		int width = (int)(Math.random()*50);
		int symbol1=(int)(Math.random()+0.5);
		int symbol2=(int)(Math.random()+0.5);
		if(symbol1==1)
			symbol1=1;
		else
			symbol1=-1;
		if(symbol2==1)
			symbol2=1;
		else
			symbol2=-1;
		length=length*symbol1;
		width=width*symbol2;
		System.out.print("×ø±êÎª£¨"+width+"£¬"+length+"£©");
	}

}
