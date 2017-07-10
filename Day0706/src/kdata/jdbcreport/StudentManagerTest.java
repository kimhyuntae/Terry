package kdata.jdbcreport;
import java.sql.SQLException;
import java.util.*;

public class StudentManagerTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		
		StudentManager sm = new StudentManager();
		
		for(int i=0; i<=20; i++){
			System.out.println("번호 입력  : ");
			Scanner sc = new Scanner(System.in);
			int menu = sc.nextInt();
		switch(menu){
		
		case 1:
			System.out.println("학생  정보 추가 ");			
			sm.StudentManager();
			try {
				sm.insert();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			break;
			
		case 2:
			
			sm.StudentManager();	
			sm.selectAll();
			break;
			
		case 3:
			sm.StudentManager();
			System.out.println("학생  이름 검색 : ");
			sm.selectByName();
			break;
			
		}
		
		
		
		

	}

}
}