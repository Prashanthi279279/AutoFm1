package basehelper1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class Array {
	
	//@Test
	public void ex1 () {
		int[] arr= {1,2,3,4};
		int size= arr.length;
		
		for(int i=0;i<size;i++) {
		System.out.println(arr[i]);	
		}
	}
	//@Test
	public void arraylistexample1() {
		ArrayList<Integer>list= new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
	}
	//@Test
	public void arraylistexample2() {
		
		ArrayList<Integer>ss1=new ArrayList<>();
		
		for(int i=0;i<=10;i++) {
		ss1.add(i);
		
		}
		if(ss1.contains(2)) {
		System.out.println("it is found");
		
		}
		else {
			System.out.println("it is not found ");
			
		}
		System.out.println(ss1);
	}
	//array is fixed,arraylist is dynamic 
	
	//@Test
     public void repeat() {
    	 String sentence= "this is my world ";//O/ world my is this 
    	 String[]word = sentence.split(" ");
    	 System.out.println(" Sentence is ::"+ word);
    	 int size = word.length;
    	 for(int i=size-1;i>=0;i--) {
    		 System.out.println(word[i]);
    	 }
     }
	//@Test
	public void arrlist() {
		ArrayList<String>list=new ArrayList();
		list.add("Abhi");
		list.add("prashanthi");
		list.add("sai");
		list.add("Mohan");
		list.add("rajiv");
		list.add("Abhi");
		
		/*System.out.println("The list is ::"+list);
		
		// 2 is exists 
		System.out.println(list.contains("attend21"));
		
		//attend 4 remove from the list
		list.remove("Mohan");
		*/System.out.println("this list is ::"+list);
		System.out.println(list.get(3));
		
		//for(int i=0;i<list.size();i++) {
		//System.out.println(list.get(i));
		//}
		
		//at what position Sai is at in the list
		
		/*for(int i=0;i<=list.size();i++) {
		if(list.get(i).equalsIgnoreCase("sai")) {
		System.out.println("The position is ::"+i);	
		break;
		}
		}	
	*/}
	//@Test 
	// No duplicates and order not preseved
	public void setEx() {
	Set<String>set=new HashSet<>();
	set.add("Abhi");
	set.add("prashanti");
	set.add("sai");
	set.add("Mohan");
	set.add("rajiv");
	set.add("Abhi");
	
	System.out.println("Set is ::"+set);
		
	}
	
	//@Test
	// Alphabatecal order.no duplicates
	public void treeEX() {
	Set<String>tset=new TreeSet<>();
	tset.add("Abhi");
	tset.add("Prashanthi");	
	tset.add("sai");
	tset.add("Mohan");
	tset.add("rajiv");
	tset.add("Abhi");
	
	System.out.println("Treeset is ::"+tset);
	
	}
	
	@Test
	public void hashMapEx() {
	Map<Integer,String>hmap= new HashMap<>();
	
	hmap.put(11,"Abhi");
	hmap.put(12,"Mohan");
	hmap.put(13,"sai");
	hmap.put(13,"sai duplicate");
	hmap.put(14,"Abhi");
	
	System.out.println(hmap);

	 for (Map.Entry<Integer, String> entry : hmap.entrySet()) {
         Integer key = entry.getKey();
         String value = entry.getValue();
         System.out.println("value=" + value );
      
     }
			
	}	


  
	
		
}

