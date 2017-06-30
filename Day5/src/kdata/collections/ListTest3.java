package kdata.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class ListTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Vehicle> list = new ArrayList<>();
		
		list.add(new Car(1,"red",5));
		list.add(new Vehicle(3,"blue"));
			
		for(int i=0; i<list.size();i++){
			Vehicle v= list.get(i);		
			System.out.println(v instanceof Car);

			if(v instanceof Car==true){		//부모는 두개, 자식은 세개 그래서 부모가 자식의 door를 못가리킴
				Car c= (Car) v;
				c.getDoor();
				
			}
			
			
		}
		
		
		
		
		
		
				
				
	}

}
