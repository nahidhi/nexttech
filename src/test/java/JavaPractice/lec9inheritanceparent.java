package JavaPractice;

public class lec9inheritanceparent {
//inheritance=is concept of parent and child relationship
	
public int num1=10; //public access modifier
	
	int number2=12;//default
	
	private String flower="rose";//private am
	
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

		lec9inheritanceparent obj=new lec9inheritanceparent();
		System.out.println(obj.num1);
		System.out.println(obj.number2);
		obj.method1();
		obj.method2();
		obj.method3();
		
		
		
		
	}

}
