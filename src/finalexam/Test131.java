package finalexam;

abstract class Test131 {
	 
	public void a1();  // false
	
	public void a2() {
	}
		
	 protected void b1();  // false
	 
	 protected void b2(){
	 }
	 
	 private void c1(); // false
	 private void c2(){ 
		 
	 }
	 
	 abstract int unfinshied();
	 
	 abstract void unfinshie(){  // false
		 
	 }
}
