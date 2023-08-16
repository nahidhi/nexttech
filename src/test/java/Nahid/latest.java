package Nahid;

import java.util.ArrayList;
import java.util.Arrays;

public class latest {

	public static void main(String[] args) {

		
		/*syntax: Datatype variablename=value;
		 * int a=2; Integer (whole number) 
		 * double b=2.4; Floating point number 
		 * char c= ‘a’; // Character
		 * String x= “NextTech” //String value
		 * 
		 */

		int a=25;
		double b = 5.5;
		char c = 'a';
		String d = "Nahid";
		
	/*Arithmatic
	 * 	
	 */
		double e=a+b;
		System.out.println(e);
		
		double f=a-b;
		System.out.println(f);
		
		
		double g=a*b;
		System.out.println(g);
		
		double h=a/b;
		System.out.println(h);
//equal to
		
		System.out.println(a==b);
//Not equal to
		
		System.out.println(a!=b);
		
//Greater then
		System.out.println(a>b);
		
//Smaller then
		
	   System.out.println(a<b);
	   
//greater then or equal to
	   
	   System.out.println(a>=b);
	   
//less then or equal to
	   
	   System.out.println(a<=b);
		
//&& returns true if both statements are  true

	   System.out.println(a>10 && a<30);
		
// || 	one statement is true	
		
		
	   System.out.println(a>10 || a>30);
		
/*
 *  if 99 is greater than 69. If the 
 *   condition is true, print some text
 *    if (condition) { // block of code to be executed if the condition is true }
 */


		if (99>69) {
			System.out.println("99 is greater then 69");
		}
	//we can use test variable also	
		if (a>b) {
			System.out.println("A is bigger then B");
		}
		
	/*
	 * Syntax
if (condition1) {
 // block of code to be executed if condition1 is true
} else if (condition2) {
 // block of code to be executed if the condition1 is false and condition2 is true
} else {
// block of code to be executed if the condition1 is false and condition2 is false

	 */
		
		int time=20;
		
		if (time<=12) {
			System.out.println("Good Morning");
		} else if (time<13) {
			System.out.println("Good Noon");
		} else {
			System.out.println("Good Night");
		}
		
	
		
// testscore 
		
		int ts= 40;
		
		if (ts>=90) {
			System.out.println("Grade A");
		}else if (ts>=80) {
			System.out.println("Grade B");	
		}else if (ts>=70) {
			System.out.println("Grade C");
		}else if (ts>=60) {
			System.out.println("Grade D");
		}else System.out.println("Fail");
		
		
		// array: store multiple data in single variable  if data is fixed then we can use array
		
				//datatype [] variablename = {"data1","data2","data3"};
				//String [] 
				
				//array: store multiple data in single variable. if data is fixed then we use array.array is fixed
				  //Datatype [] variablename={"data1","data2","data3"}
		
		String[] fruit= {"mango","apple","banana","Orange"};
		System.out.println(fruit[1]);
		
		// change an array element
		fruit[1]="cherry";
		System.out.println(fruit[1]);		
		
		// store data 1 to 5 using array
		
		int [] num5= {1,2,3,4,5};
		System.out.println(num5[1]);
		//store 2 alphanumeric value using array
		
		String[] num4= {"02java","03java","04java","05java"};
		System.out.println(num4 [1]);
	
		//import java.util.ArrayList;
		
		ArrayList<String> sportscars = new ArrayList<String>();
		
		ArrayList<String> car=new ArrayList<String>();
		
		//array length
		System.out.println(fruit.length);
		
		
		/*
		 * import java.util.ArrayList; // import the ArrayList class
ArrayList<Integer> cars = new ArrayList<Integer>(); // Create an ArrayList object
ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
		 */
	//add motor name
		
		ArrayList<String>motor=new ArrayList<String>();
		
		motor.add("toyota");
		motor.add("bmw");
		motor.add("vw");
		motor.add("honda");
		
		System.out.println(motor);
		
		
		//access an item
		
		motor.get(1);
		System.out.println(motor.get(1));
		
		//change an item
		
		motor.set(2,"lexas");
		System.out.println(motor.set(2,"lexas"));
		
		// remove an item
		
		motor.remove(0);
		System.out.println(motor.remove(0));
		
		//arraylist size or length
		
		motor.size();
		System.out.println(motor.size());
		
		//Loop Through an ArrayList
		ArrayList<String>flower=new ArrayList<String>();
		flower.add("rose");
		flower.add("lily");
		flower.add("merigold");
		flower.add("tulip");
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
