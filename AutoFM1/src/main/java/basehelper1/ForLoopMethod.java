package basehelper1;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class ForLoopMethod {
	
	int size = 10;
	
	@Test
	public void forLoopMethodTest() {
		for(int i=0;i<=size;i++){
			if(i==3) {
			System.out.println("Happy birthday");
			System.out.println(i);
			
			}
		}
		
	}
	@Test
	public void ex2() {
		for(int i=size;i>=0;i++) {
			System.out.println(i);
		}
	}
	@Test
	public void  ex3() {
		for (int i= 1;i<size;i++) {
			System.out.println(i);
			i=i+1;
		}
	}
	
	@Test
	public void arrListEx() {
		List<String> list = new ArrayList<>();
		list.add("testng");
		list.add("jira");
		list.add("conflulence");
		System.out.println(list);
	}

}
