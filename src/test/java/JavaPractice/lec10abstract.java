package JavaPractice;

abstract class lec10abstract {

	/*
	 * 1.abstract method hide the code 
	 * 2. in abstract we use abstract key word before class name.
	 * 3. Abstract class allowed both abstract method and regular method.
	 * 4.we have to declare abstract keyword for abstract method
	 * 5. to implement unimplemented abstract method we use extends key word
	 * 
	 * java implements:
	 * 1. Interface is not a class but abstract class and interface methode hide the code
	 * 2.to declare interface have to use interface keyword
	 * 3. interface allows only interface method 
	 * 4.to write interface method we do not need to declare interface key word 
	 * 5.to implement unimplememted interface method we use implement key word
	 */
	public abstract void method1();
	
	public void method2() {
		System.out.println("nexttech");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
