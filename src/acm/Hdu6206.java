package acm;
	import java.math.BigDecimal;
	import java.util.Scanner;

public class Hdu6206 {
	//public class Main {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        BigDecimal x1, y1, x2, y2, x3, y3, x4, y4;
	        int _;
	        _ = sc.nextInt(); 
	        while(_-- != 0)
	        {
	            x1 = sc.nextBigDecimal();
	            y1 = sc.nextBigDecimal();
	            x2 = sc.nextBigDecimal();
	            y2 = sc.nextBigDecimal();
	            x3 = sc.nextBigDecimal();
	            y3 = sc.nextBigDecimal();
	            x4 = sc.nextBigDecimal();
	            y4 = sc.nextBigDecimal();
	            BigDecimal t;
	            if(y3.equals(y1))
	            {
	                t = y2;
	                y2 = y3;
	                y3 = t;

	                t = x2;
	                x2 = x3;
	                x3 = t;
	            }
	            BigDecimal t1 = (y3.subtract(y1)).multiply(y2.multiply(y2).subtract(y1.multiply(y1)));
	            BigDecimal t2 = (y3.subtract(y1)).multiply(x2.multiply(x2).subtract(x1.multiply(x1)));
	            BigDecimal t3 = (y1.subtract(y2)).multiply(y1.multiply(y1).subtract(y3.multiply(y3)));
	            BigDecimal t4 = (y1.subtract(y2)).multiply(x1.multiply(x1).subtract(x3.multiply(x3)));
	            BigDecimal t5 = BigDecimal.valueOf(2).multiply(y1.subtract(y2)).multiply(x3.subtract(x1));
	            BigDecimal t6 = BigDecimal.valueOf(2).multiply(y3.subtract(y1)).multiply(x1.subtract(x2));
	            BigDecimal x0 = (t1.add(t2).subtract(t3).subtract(t4)).divide(t5.subtract(t6));

	            BigDecimal v1 = y3.multiply(y3);
	            BigDecimal v2 = y1.multiply(y1);
	            BigDecimal v3 = BigDecimal.valueOf(2).multiply(x0).multiply(x3.subtract(x1));
	            BigDecimal v4 = x1.multiply(x1);
	            BigDecimal v5 = x3.multiply(x3);
	            BigDecimal v6 = BigDecimal.valueOf(2).multiply(y3.subtract(y1));
//	            System.out.println(v6);
	            BigDecimal y0 = (v1.subtract(v2).subtract(v3).subtract(v4).add(v5)).divide(v6);

	            BigDecimal z1 = (y0.subtract(y2)).multiply(y0.subtract(y2));
	            BigDecimal z2 = (x0.subtract(x2)).multiply(x0.subtract(x2));
	            BigDecimal r = z1.add(z2);

	            BigDecimal tmp1 = (x4.subtract(x0)).multiply(x4.subtract(x0));
	            BigDecimal tmp2 = (y4.subtract(y0)).multiply(y4.subtract(y0));
	            BigDecimal dis = tmp1.add(tmp2);
	            if(dis.compareTo(r) > 0)
	            {
	                System.out.println("Accepted");
	            }
	            else
	            {
	                System.out.println("Rejected");
	            }

	        }
	    }
	}
