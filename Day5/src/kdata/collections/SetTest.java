package kdata.collections;

import java.util.*;

public class SetTest {

	public static void main(String[] args) {		
		
		HashSet<String> set = new HashSet<>();
		
		set.add("hello");
		set.add("hello");
		set.add("hello");
		set.add("hi");
		set.add("Hola");
		
		System.out.println(set);		//for¹® ºÒ°¡
		
		for(String s : set){
			System.out.println(s);
		}
		
		Iterator<String> s2 = set.iterator();
		while(s2.hasNext()){
			System.out.println(s2);
			
		}
		
		
		
		
		

	}

}
