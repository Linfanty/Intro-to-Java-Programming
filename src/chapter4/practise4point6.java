package practise;
public class practise4point6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=40;
		double a,b,c,x1,y1,x2,y2,x3,y3,l1,l2,l3,angle1,angle2,angle3;
		a=Math.random()*(2*Math.PI);
		b=Math.random()*(2*Math.PI);
		c=Math.random()*(2*Math.PI);
		x1=r*Math.cos(a);
		y1=r*Math.sin(a);
		x2=r*Math.cos(b);
		y2=r*Math.sin(b);
		x3=r*Math.cos(c);
		y3=r*Math.sin(c);
		l1=Math.pow(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2), 0.5);
		l2=Math.pow(Math.pow(x2-x3, 2)+Math.pow(y2-y3, 2), 0.5);
		l3=Math.pow(Math.pow(x3-x1, 2)+Math.pow(y3-y1, 2), 0.5);
		angle1=Math.acos((Math.pow(l3, 2)+Math.pow(l1, 2)-Math.pow(l2, 2))/2*l1*l3);
		angle2=Math.acos((Math.pow(l1, 2)+Math.pow(l2, 2)-Math.pow(l3, 2))/2*l1*l2);
		angle3=Math.acos((Math.pow(l2, 2)+Math.pow(l3, 2)-Math.pow(l1, 2))/2*l2*l3);
		System.out.print("¸÷½Ç½Ç¶ÈÎª"+angle1+","+angle2+","+angle3);
	}

}
