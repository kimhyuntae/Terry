package kdata.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class ListTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Vehicle> list = new ArrayList<>();
		
		Vehicle v = new Vehicle(1,"red");	//�̸��� �ʿ��Ҷ�
		list.add(v);	
		
		list.add(new Vehicle(2,"blue")); 	//�̸� �ʿ� ���� �� �̷��� �ڵ�
		System.out.println(list);
		
		System.out.println("---------for �ݺ���---------");
		
		for(int i=0; i<list.size(); i++){
			Vehicle v2 = list.get(i);
			
			System.out.println(v2.getNum());
			System.out.println(v2.getColor());
			
		}		
			//System.out.print(list.get(i));		
		System.out.println("--------Ȯ�� for �ݺ���---------");
		
		for(Vehicle v3 : list){
			System.out.println(v3.getNum());
			System.out.println(v3.getColor());
			}
		
		Iterator<Vehicle> it = list.iterator();
		
		System.out.println("-----------while��---------");
		while(it.hasNext()==true){
			Vehicle v4 = it.next();
			System.out.println(v4.getNum());
			System.out.println(v4.getColor());
			System.out.println(v4);
			
		}	
	
			
			

	}

}
