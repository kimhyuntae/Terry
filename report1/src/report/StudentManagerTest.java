package report;

import java.util.*;

public class StudentManagerTest {

	public static void main(String[] args) {
		
		StudentManager sm = new StudentManager();

		for(int i=0; i<=20; i++){
		System.out.println("��ȣ �Է�  : ");
		Scanner sc = new Scanner(System.in);
		int menu = sc.nextInt();
		switch(menu){
		
		case 1 : 
			
			sm.add(sc);
			break;
			
		case 2 :
			System.out.println("�л�  ����Ʈ ��� ");
			sm.print();
			
			break;
			
		case 3 :
			System.out.println("�˻��� �л� �̸� : ");
			sm.search(sc);
			
			break;
			
		case 4 :
			System.out.println("������ �л� �̸� : ");
			sm.remove(sc);
			
			break;
			
		case 5 :
			//System.out.println("��ü ���� : ");
			sm.sum();
			
			break;
			
		case 6 :
			System.out.println("������ �л� �̸� : ");
			sm.remove(sc);
			
			break;
			
		case 7 :
			System.out.println("������ �л� �̸� : ");
			sm.remove(sc);
			
			break;
			

		case 8 :
			System.out.println("END");
			sm.exit();
			break;
		
		}
		
		}	
	}

}