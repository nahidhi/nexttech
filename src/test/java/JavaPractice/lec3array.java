package JavaPractice;

public class lec3array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// array: store multiple data in single variable  if data is fixed then we can use array
		
				//datatype [] variablename = {"data1","data2","data3"};
				//String [] 
				
				//array: store multiple data in single variable. if data is fixed then we use array.array is fixed
				  //Datatype [] variablename={"data1","data2","data3"};
				  String [] fruits = {"Mango", "Watermelon", "Orange", "Apple"};


					// store 1 to 5 by using array
					
				
			   	int [] num= {1,2,3,4,5};
				
				System.out.println(num [0]);
				System.out.println(num [3]);
				
				// store 2 alpanumaric data by using array
			   	
			    String [] studentid= {"in022023in","in0202i1"," asajs78"};
			    
			    System.out.println(studentid [1]);
			    
			    // change data in array
				fruits[1]="jackfruit";
				System.out.println(fruits[1]);
		        fruits[2]="dates";
		        System.out.println(fruits[2]);
		        System.out.println(fruits.length);
	}

}
