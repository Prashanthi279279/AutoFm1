package com.practicetests;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class ArrayPractice {
	
	@Test
	public void hashmapIteration() {
		
		Map<Integer,String>hmap= new HashMap<>();
		
		hmap.put(11, "abhi");
		hmap.put(12,"Mohan");
		hmap.put(13,"sai");
		hmap.put(14,"kiran");
		hmap.put(15,"ramya");
		
		System.out.println(hmap);
		
		for(Map.Entry<Integer,String> entry : hmap.entrySet()){
			Integer Key = entry.getKey();
			String Value = entry.getValue();
			System.out.println("value="+ Value);
		}
		
		
		
	}
	
	public void arrEx1 {
		
		//ArrayList<String> cars+
		
	}

}
