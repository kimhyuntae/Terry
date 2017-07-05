package report;

import java.util.*;

public class StudentManagerTest {

	public static void main(String[] args) {
		
		StudentManager sm = new StudentManager();

		for(int i=0; i<=20; i++){
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
			System.out.println("검색할 학생 이름 : ");
			sm.search(sc);
			
			break;
			
		case 4 :
			System.out.println("삭제할 학생 이름 : ");
			sm.remove(sc);
			
			break;
			
		case 5 :
			//System.out.println("전체 총점 : ");
			sm.sum();
			
			break;
			
		case 6 :
			System.out.println("삭제할 학생 이름 : ");
			sm.remove(sc);
			
			break;
			
		case 7 :
			System.out.println("삭제할 학생 이름 : ");
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