package homework;

import java.util.*;

public class StudentManagerTest {

	public static void main(String[] args) {

		
		StudentManager sm = new StudentManager();

		for(int i=0; i<=5; i++){
		System.out.println("��ȣ �Է�  : ");
		Scanner sc = new Scanner(System.in);
		int student = sc.nextInt();
		switch(student){
		
		case 1 : 
			
			sm.add(sc);
			
		case 2 :
			System.out.println("�л�  ����Ʈ ��� ");
			sm.print();
			
			break;

		case 3 :
			System.out.println("END");
			break;
		
		}
		
		}
		
	
	}

}
