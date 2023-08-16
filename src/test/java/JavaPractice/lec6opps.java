package JavaPractice;

public class lec6opps {

	String name="Nahid";
	char A='N';
	int B=50;
	
	final int x=10;//if we write final then we cannot change the value ,it will b fixed 
	int s;// if we can not give the value then we can add anything.

	public static void main(String[] args) {
	
	//classname object_name=new classname();//HOW TO CREAT OBJECT

		lec6opps obj=new lec6opps();
		System.out.println(obj.name);
		System.out.println(obj.A);
		System.out.println(obj.B);
		
		lec6opps obj1=new lec6opps();
		//obj1.x=25;//
		System.out.println(obj1.x);
		
		lec6opps myobj=new lec6opps();
     		myobj.s=10;
     		myobj.s=25;
     		
     		
	}

}
