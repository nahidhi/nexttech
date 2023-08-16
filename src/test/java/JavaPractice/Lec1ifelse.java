package JavaPractice;

public class Lec1ifelse {

	public static void main(String[] args) {
		
		/*
		 * increament by 1
		 * i++ or i=i+1
		 * 
		 * increment by 2
		 * i=i+2
		 * we can use anything instead of i
		 *  
		 */
	//	print the number between 0 to 9
		
		for (int i=0;i<=9;i++) {
			System.out.println(i);
		}
		
		//print odd number 1 to 25
		
		for (int i=1;i<=25;i=i+2) {
			System.out.println(i);
		}
		//print 1 to 20
		
		
		
		for (int a=1;a<=20;a++) {
			System.out.println(a);
		}
		
		/* x = 99
		 *  y = 69
		 *  if (x > y)
		 *  
		 */
		
		int x=50;
		int y=40;
		
		if(x<y) {
			System.out.println("good evening");
			
			
			
		}
		
		int q=50;
		int a=60;
		
		if(q>a) {
			System.out.println("good evening");
		} else {
			System.out.println("Hello");
		}
		
	/*syntax
	 * if (condition1) {
 // block of code to be executed if condition1 is true
} else if (condition2) {
 // block of code to be executed if the condition1 is false and condition2 is true
} else {
// block of code to be executed if the condition1 is false and condition2 is false
 * }

	 */
		
		
		int time=30;
		
		if (time<15){
			System.out.println("Good Morning");
		} else if (time<25) {
			System.out.println("Good noon");
		} else if (time<35) {
			System.out.println("Good afternoon");
		}else {
			System.out.println("Good Day ");
		}
		
		// assignment write A CODE THAT WILL show good afternoon
		
		
		
		
		/*int time = 20;
		 * if (time < 15) {
		 * System.out.println("Good noon.");
		 * } else {
		 * System.out.println("Good evening.");
		 * }	
		 * 
		 */
		
		int time1=20;
		if (time1<15) {
			System.out.println("good noon");
		}else {
			System.out.println("good evening");
		}
		
 int testscore = 90;
 char grade;
 if (testscore >= 90) {
 grade = 'A';
 } else if (testscore >= 80) {
 grade = 'B';
 } 
 else if (testscore >= 70) {
 grade = 'C';
 } else if (testscore >= 60) {
 grade = 'D';
 } else {
 grade = 'F';
 }
 System.out.println("Grade = " + grade);
 
 
	
	
		
		}
		
		
		
		}
			

	






