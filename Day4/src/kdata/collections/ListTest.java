package kdata.collections;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	
	public static void main(String[] args){
		
		//ArrayList<String> list = new ArrayList<String>();
		List<String> list = new ArrayList<>();	// 지금 String밖에 못들어감 , Integer 하면 정수만 들어감

		//list.add(2);
		list.add("2");		//무엇을 넣어도 가능 -> 지금은 string만 가능
		list.add("Hello");	//중복 허용
		list.add("Hello");
		list.add("It's me");		
		
		//System.out.println(list);		//오버라이딩 된것,		
		
		/*Object o = list.get(0);
		Integer i = (Integer)0;
		
		Object o2= list.get(0);
		String s = (String) o2;
		System.out.println(list.size());
		*/
		
		for(int i=0; i<list.size();i++){
			System.out.println(list.get(i));
			//System.out.println(list.get(i).charAt(0));
			
		}
		
		System.out.println("--------------");		//for문 쉽게쓰기 , 컬렉션, 배열에서 사용
		// for(타입 : 클래스이름)
		for(String s : list)
		System.out.println(s);
		
		
		
	}	

}
