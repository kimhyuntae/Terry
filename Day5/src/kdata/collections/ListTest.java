package kdata.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();
		list.add("������");
		list.add("�̼ҿ�");
		list.add("������");
		list.add("���ʱ�");
		
		System.out.println(list);
		
		for(int i=0; i<list.size(); i++)
		System.out.print(list.get(i)+ ", ");
				
		System.out.println("  ");
		for(String s: list)
			System.out.print(s + ", ");
		
		
		Iterator<String> it = list.iterator();
		
		//it.hasNext();		//��ȯ�� boolean , ������ �𸣴� while���� ���
		//it.next();		//��ȯ�� String , ������ ��������� ��
		
		
		while(it.hasNext() == true){
			String s = it.next();
			System.out.println(s);
			
		}
		
		
		
		

		
		

	}

}


