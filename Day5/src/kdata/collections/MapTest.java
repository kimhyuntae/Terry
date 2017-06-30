package kdata.collections;

import java.util.*;
import java.util.Map.Entry;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String>map = new HashMap<>();
		map.put(10,  "A");
		map.put(20,  "B");
		map.put(30,  "C");
		
		System.out.println(map);
		
		map.get(10);
		
		System.out.println(map.get(10));
		
		//map.keySet();
		
		Set<Integer> keySet = map.keySet();		
		//System.out.println(map.keySet(i));
		
		
		for(Integer i : keySet){
			System.out.println(i);
		}
		
		System.out.println("");
		
		for(Integer i : keySet){
			System.out.println(map.get(i));
		}
		
		System.out.println("--");
		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
		
		for(Map.Entry<Integer, String> entry : entrySet){
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		System.out.println("-----Iterator----");
		Iterator<Entry<Integer,String>> it = entrySet.iterator();
		
		while(it.hasNext()){
			Entry<Integer, String> s =it.next();
			System.out.println(s.getKey());
			System.out.println(s.getValue());
		}
		
		/*Set<Integer> keySet = map.keySet();	// 한줄에 쓴것
		keySet.iterator();
		
		map.keySet().iterator();
		*/

		

	}

}
