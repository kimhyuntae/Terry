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

			if(v instanceof Car==true){		//�θ�� �ΰ�, �ڽ��� ���� �׷��� �θ� �ڽ��� door�� ������Ŵ
				Car c= (Car) v;
				c.getDoor();
				
			}
			
			
		}
		
		
		
		
		
		
				
				
	}

}
