package kdata.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();
		list.add("김현태");
		list.add("이소연");
		list.add("정다은");
		list.add("원필금");
		
		System.out.println(list);
		
		for(int i=0; i<list.size(); i++)
		System.out.print(list.get(i)+ ", ");
				
		System.out.println("  ");
		for(String s: list)
			System.out.print(s + ", ");
		
		
		Iterator<String> it = list.iterator();
		
		//it.hasNext();		//반환형 boolean , 개수를 모르니 while문을 사용
		//it.next();		//반환형 String , 다음것 꺼내오라는 말
		
		
		while(it.hasNext() == true){
			String s = it.next();
			System.out.println(s);
			
		}
		
		
		
		

		
		

	}

}


