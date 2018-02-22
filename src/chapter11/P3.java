package chapter11;

public class P3 {
	 public static void main(String[] args){

	 }
	
}
	
class Checkings extends Account {
	protected int overdraftLimit = 5000;

	@Override
	public String toString() {
		return "Checkings";
	}
}

class Saving extends Account {
	protected int overdraftLimit = 5000;

	public String toString() {
	return "Saving";
	}
}

class Account {
    private String id;
    private String userName;
    private String password;
    private String date;

    public String getId(){
            return id;
    }
    
     public void setId(String id){
             this.id = id;
    }

}