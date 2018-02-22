package practise;

public class practise4point25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch1=(char) (65+Math.random()*26);
	    char ch2=(char) (65+Math.random()*26);
	    char ch3=(char) (65+Math.random()*26);
	    String str1=String.valueOf(ch1);
	    String str2=String.valueOf(ch2);
	    String str3=String.valueOf(ch3);
	    int  number1=(int) (Math.random()*10);
	    int  number2=(int) (Math.random()*10);
	    int  number3=(int) (Math.random()*10);
	    int  number4=(int) (Math.random()*10);
	//  String str=str1+str2+str3;
	    System.out.println(str1+str2+str3+" "+number1+number2+number3+number4);
	}

}
