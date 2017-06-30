package kdata.sort;
import java.util.*;

public class SortTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = Arrays.asList("김현태","정다은","이소연","나필금");
		System.out.println(list);
		
		
		Collections.sort(list, new Comparator<String>(){
			@Override
			public int compare(String o1, String o2) {
				
				return o2.compareTo(o1);
				
			}
			
			});
		
		System.out.println(list);

		
			

	}

}
