package chapter3;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = (int) (Math.random() * 12 + 1);
		System.out.println("Mouth: "+month);
		switch (month) {
		case 1:
			System.out.println("һ��");break;
		case 2:
			System.out.println("����");break;
		case 3:
			System.out.println("����");break;
		case 4:
			System.out.println("����");break;
		case 5:
			System.out.println("����");break;
		case 6:
			System.out.println("����");break;
		case 7:
			System.out.println("����");break;
		case 8:
			System.out.println("����");break;
		case 9:
			System.out.println("����");break;
		case 10:
			System.out.println("ʮ��");break;
		case 11:
			System.out.println("ʮһ��");break;
		default:
			System.out.println("ʮ����");break;
		}

	}

}
