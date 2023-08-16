package JavaPractice;

import java.util.HashMap;

public class Lec5hashmap {

	public static void main(String[] args) {
		//hashmap
		//we store pair value
		//store 4 state and city name
//Hashmap<datatype1,dataype2>variable name=Hashmap<datatype1,datatype2>();		

		HashMap<String,String>citystate=new HashMap<String,String>();

//Add value in hashmap


citystate.put("Dallas", "TX");
citystate.put("queens","NY");
citystate.put("orange","LA");
citystate.put("Tempa","FL");


//access item use get ()method

//citystate.get("Dallas");

//2 types of error
//1. compiled type error which is visible
//2.run time error- invisible

//remove the item

citystate.remove("queens");
//System.out.println(citystate);
//clear list

citystate.clear();
//System.out.println(citystate);

citystate.size();
//System.out.println(citystate.size());


//store 3 student id and school name

HashMap<Integer,String>student=new HashMap<Integer,String>();
student.put(1,"school1");
student.put(2, "school2");
student.put(3,"school3");
System.out.println(student);

student.get(1);
//System.out.println(student.get(1));


//for loop

//Print keys
for (Integer i : student.keySet()) {
//System.out.println(i);
}

//Print keys
for (String i : student.values()) {
//System.out.println(i);
}

//Print keys and values
for (Integer i : student.keySet()) {
//System.out.println("key: " + i + " value: " + student.get(i));

//for (Integer i:student.keySet()){
	
//}
//System.out.println(i+student.get());

}

	}

}
