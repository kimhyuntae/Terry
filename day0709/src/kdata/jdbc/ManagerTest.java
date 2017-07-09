package kdata.jdbc;
import java.sql.SQLException;
import java.util.*;

public class ManagerTest {

	public static void main(String[] args) throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		String snum = null;
		String sname =null;
		String sgender=null;
		String subcode=null;
		
	    System.out.println("1.학생추가 2.학생목록 3. 학생검색  4. 수강신청 5. 수강취소 6. 수강신청 리스트 7.성적입력   8.종료");
	    StudentManager sm= new StudentManager();
	    SugangManager sgm = new SugangManager();
	    
	    int menu = sc.nextInt();
	    
	    switch(menu){	    
	    
	    case 1:
	    	while(true){
	    		System.out.println("학번 입력 :");
	    		snum=sc.next();
	    		if(snum.length() != 5){
	    			System.out.println("학번은 5자리 입니다. 다시 입력하세요");
	    			continue;
	    		}
	    		
	    		System.out.println("이름 입력 : ");
	    		sname=sc.next();
	    		
	    		System.out.println("성별 입력 : ");
	    		sgender=sc.next();
	    	
	    		Student s = new Student(snum, sname, sgender);
		    	StudentManager.insert(s);
		    	break;
	    	}
	    	break;
	    	
	    case 2:
	         System.out.println("학생목록 출력");
	         
	    	try {
	               List<Student> list= sm.selectAll();
	               for(int i =0;i<list.size();i++)
	                 System.out.println(list.get(i));
	            } catch (SQLException e) {
	               e.printStackTrace();
	            }
	    	break;
	    	
	    case 3:
	         System.out.println("학생이름을 입력하세요");
	         sname = sc.next();
	         System.out.println(sm.selectByName(sname));
	         break;
	    	
	    case 4:
	    	 while (true) {
	             System.out.println("학번을 입력하세요");
	             sname = sc.next();

	             System.out.println("과목번호를 입력하세요");
	             subcode = sc.next();

	             Sugang sg = new Sugang(snum, sname, 0, null);
	             SugangManager.insert(sg);
	             break;
	          }
	    	 
	    case 5:
	    	System.out.println("학번을 입력하세요");
	    	snum=sc.next();
	    	SugangManager.delete(snum);
	    	break;
	    	
	    case 6:
	    	System.out.println("수강 신청 리스트 출력");
	    	System.out.println(sgm.selectAll());      
	    break;
	    
	    case 7:
	    	while(true){
	    		int grade;
		    	System.out.println("학번을 입력하세요");
		    	sname=sc.next();
		    	
		    	System.out.println("과목번호를 입력하세요");
		    	subcode=sc.next();
		    	System.out.println("학점을 입력하세요");
		    	grade=sc.nextInt();
		    	
		    	SugangManager.grade(grade, snum, subcode);
		    	break;	
	    	}
	    	break;
	    case 8:
            System.exit(0);
            break;

	         
	         
	         
	         
	    }
	    
	    
	    
	    

	}

}









