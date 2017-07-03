package report;

import java.util.*;

public class StudentManagerTest {

	public static void main(String[] args) {
		
		StudentManager sm = new StudentManager();

		for(int i=0; i<=5; i++){
		System.out.println("번호 입력  : ");
		Scanner sc = new Scanner(System.in);
		int menu = sc.nextInt();
		switch(menu){
		
		case 1 : 
			
			sm.add(sc);
			break;
			
		case 2 :
			System.out.println("학생  리스트 출력 ");
			sm.print();
			
			break;

		case 3 :
			System.out.println("END");
			sm.exit();
			break;
		
		}
		
		}	
	}

}