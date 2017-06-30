package kdata.collections;

import java.util.*;
import java.util.Map.Entry;


public class MapTest2 {

	public static void main(String[] args) {
		
		Map<Vehicle, String> map = new HashMap<>();
		
		map.put(new Vehicle(1, "red"), "BMW");
		map.put(new Vehicle(1, "red"), "BMW");
		map.put(new Vehicle(2, "black"), "KIA");
		//map.put(new Vehicle(3, "white"), "HYUNDAI");
		
		System.out.println(map);
		
		
	}

}
