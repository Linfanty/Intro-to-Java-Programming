package finalexam;

public class Test1127 {
	public static void main(String[] args){
		/*
		Object fruit = new Fruit();
		Object apple  = new Apple();
		if( apple instanceof Fruit) {
			apple =  (Apple)fruit;
		} 
		*/
		Object fruit = new Fruit();
		Object apple = fruit;
	}
	
}

class Apple extends Fruit{
	
}

class Fruit{
	
}