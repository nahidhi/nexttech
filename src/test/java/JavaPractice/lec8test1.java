package JavaPractice;

public class lec8test1 {

	//access modifier attribute 
	// syntax : access modifier datatype variable=value;
	
	public int num1=10; //public access modifier
	
	int number2=12;//default
	
	private String flower="rose";//private am
	
	//method 
	//syntax: access_modifyier return_type method_name(){//block of code}
	
	public void method1() {
		System.out.println("nexttechitc");
	}
	
	void method2() {
		System.out.println("nexttechitdbd");
	}
	
	private void method3() {
		System.out.println("loanstar us");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		lec8test1 obj=new lec8test1();
		System.out.println(obj.flower);
		obj.method1();
		obj.method2();
		obj.method3();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
