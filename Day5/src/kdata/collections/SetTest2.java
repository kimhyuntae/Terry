package kdata.collections;
import java.util.*;

public class SetTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Vehicle> set = new HashSet<>();
		
		set.add(new Vehicle(1,"red"));
		set.add(new Vehicle(1,"red"));
		set.add(new Vehicle(2,"blue"));

		
		System.out.println(set);
		
		
		
	}

}
