package kdata.manager;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ManagerTest {

	public static void main(String[] args) throws SQLException {

		String snum = null, sname = null, sgender = null;		
		StudentManager sm = new StudentManager();		
		Scanner sc = new Scanner(System.in);	
		SugangManager sgm = new SugangManager();
		String subcode=null;
		int grade=0;

	 int a, b, c;
	
		System.out.println("번호 입력  : 1.학생정보 추가  2.모든 이름 출력 3.검색할 이름 검색"
				+ "4.수강신청 5.수강신청 취소 6.수강신청 리스트 7.성적 입력");
		int menu = sc.nextInt();
		
		switch (menu) {
		case 1:
			while(true){
			System.out.println("학생  정보 추가 ");
			
				System.out.println("학번을 입력하세요");			
				
				 snum = sc.next();
		         a = snum.length();
		         
		         if (a < 5) {
		             System.out.println("다시 입력하세요");
		             continue;			             
		          }

				System.out.println("이름을 입력하세요");
				 sname = sc.next();
				  b = sname.length();
			         if (b < 3) {
			            System.out.println("다시 입력하세요");
			            continue;
			         }
			         
				System.out.println("성별을 입력하세요");
				 sgender = sc.next();
				 c = sgender.length();
		         if (c < 1) {
		            System.out.println("다시 입력하세요");
		            continue;
		         }			         
		         
		        Student s = new Student(snum, sname, sgender);
				sm.insert(s);
				break;
			}
				
				break;					
			    
		 case 2:
               System.out.println("이름 출력");
               try {
                   List<Student> list= sm.selectAll();
                   for(int i =0;i<list.size();i++)
                     System.out.println(list.get(i));
                } catch (SQLException e) {
                   e.printStackTrace();
                }
               	            
              break;
              
          case 3:
             try {
               System.out.println("검색할 이름을 출력하세요");
               String sn =sc.next();
               Student s = sm.selectByName(sn);
               System.out.println(s);
            
            } catch (SQLException e) {
               e.printStackTrace();
            }
             break;				    
	             
      case 4:
    	  while(true){
			System.out.println("수강신청");
			
			System.out.println("학번을 입력하세요");	  					
				snum = sc.next();	  			         
			System.out.println("수강번호을 입력하세요");
			 	subcode = sc.next();
			System.out.println("점수을 입력하세요");
				grade = sc.nextInt();			    
		        		         
		  Sugang sg = new Sugang(snum, subcode,0, null);
    	  SugangManager.insert(sg);

				break;
	  			}		break;
    	  
    	  
	case 5:        
        System.out.println("학번을 입력하세요");
        snum = sc.next();
        SugangManager.delete(snum);
        System.out.println("삭제완료");
        break;
        
     case 6:
    	 
    	// Sugang sg = new Sugang(snum, subcode,0, null);
        //System.out.println(sg.selectAll());    	 
    	 
    	 System.out.println("수강신청 리스트");
         try {
             List<Sugang> list= sgm.selectAll();
             for(int i =0;i<list.size();i++)
               System.out.println(list.get(i));
          } catch (SQLException e) {
             e.printStackTrace();
          }
      
        break;
        
        
     case 7:
        while (true) {           
           System.out.println("학번을 입력하세요");
           snum = sc.next();
           System.out.println("과목번호를 입력하세요");
           subcode = sc.next();
           System.out.println("학점을 입력하세요");
           grade = sc.nextInt();
           SugangManager.grade(grade, snum, subcode);

           break;
        }
        System.exit(0);
        break;
        
     case 8:
         while (true) {           
            System.out.println("과목별 평균 출력");            
            SugangManager.grade(grade, snum, subcode);

            break;
         }
         
         
     case 9:
        System.exit(0);
        break;

}
}
}