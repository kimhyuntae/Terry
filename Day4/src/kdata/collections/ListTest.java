package kdata.collections;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	
	public static void main(String[] args){
		
		//ArrayList<String> list = new ArrayList<String>();
		List<String> list = new ArrayList<>();	// ���� String�ۿ� ���� , Integer �ϸ� ������ ��

		//list.add(2);
		list.add("2");		//������ �־ ���� -> ������ string�� ����
		list.add("Hello");	//�ߺ� ���
		list.add("Hello");
		list.add("It's me");		
		
		//System.out.println(list);		//�������̵� �Ȱ�,		
		
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
		
		System.out.println("--------------");		//for�� ���Ծ��� , �÷���, �迭���� ���
		// for(Ÿ�� : Ŭ�����̸�)
		for(String s : list)
		System.out.println(s);
		
		
		
	}	

}
