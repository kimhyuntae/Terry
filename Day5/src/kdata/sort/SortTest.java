package kdata.sort;

import java.util.*;

public class SortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> list = Arrays.asList(1,3,8,5,4);	//몇 개를 넣어도 됨
		//List<Integer> list = Arrays.asList("5");		//이것도 가능
		// Collections.sort;
		
		System.out.println(list);
		//System.out.println("-----------------");
		
		Collections.sort(list);		//오름차순됨
		System.out.println(list);
		
		//Collections.sort(list,new MyComparator());
		System.out.println(list);
		
		
		Collections.sort(list, new Comparator<Integer>(){
		
		
		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
			return o2-o1;
			
		}
		
		});
		System.out.println(list);
		
		
		
	}

}
