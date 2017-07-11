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
	
		System.out.println("��ȣ �Է�  : 1.�л����� �߰�  2.��� �̸� ��� 3.�˻��� �̸� �˻�"
				+ "4.������û 5.������û ��� 6.������û ����Ʈ 7.���� �Է�");
		int menu = sc.nextInt();
		
		switch (menu) {
		case 1:
			while(true){
			System.out.println("�л�  ���� �߰� ");
			
				System.out.println("�й��� �Է��ϼ���");			
				
				 snum = sc.next();
		         a = snum.length();
		         
		         if (a < 5) {
		             System.out.println("�ٽ� �Է��ϼ���");
		             continue;			             
		          }

				System.out.println("�̸��� �Է��ϼ���");
				 sname = sc.next();
				  b = sname.length();
			         if (b < 3) {
			            System.out.println("�ٽ� �Է��ϼ���");
			            continue;
			         }
			         
				System.out.println("������ �Է��ϼ���");
				 sgender = sc.next();
				 c = sgender.length();
		         if (c < 1) {
		            System.out.println("�ٽ� �Է��ϼ���");
		            continue;
		         }			         
		         
		        Student s = new Student(snum, sname, sgender);
				sm.insert(s);
				break;
			}
				
				break;					
			    
		 case 2:
               System.out.println("�̸� ���");
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
               System.out.println("�˻��� �̸��� ����ϼ���");
               String sn =sc.next();
               Student s = sm.selectByName(sn);
               System.out.println(s);
            
            } catch (SQLException e) {
               e.printStackTrace();
            }
             break;				    
	             
      case 4:
    	  while(true){
			System.out.println("������û");
			
			System.out.println("�й��� �Է��ϼ���");	  					
				snum = sc.next();	  			         
			System.out.println("������ȣ�� �Է��ϼ���");
			 	subcode = sc.next();
			System.out.println("������ �Է��ϼ���");
				grade = sc.nextInt();			    
		        		         
		  Sugang sg = new Sugang(snum, subcode,0, null);
    	  SugangManager.insert(sg);

				break;
	  			}		break;
    	  
    	  
	case 5:        
        System.out.println("�й��� �Է��ϼ���");
        snum = sc.next();
        SugangManager.delete(snum);
        System.out.println("�����Ϸ�");
        break;
        
     case 6:
    	 
    	// Sugang sg = new Sugang(snum, subcode,0, null);
        //System.out.println(sg.selectAll());    	 
    	 
    	 System.out.println("������û ����Ʈ");
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
           System.out.println("�й��� �Է��ϼ���");
           snum = sc.next();
           System.out.println("�����ȣ�� �Է��ϼ���");
           subcode = sc.next();
           System.out.println("������ �Է��ϼ���");
           grade = sc.nextInt();
           SugangManager.grade(grade, snum, subcode);

           break;
        }
        System.exit(0);
        break;
        
     case 8:
         while (true) {           
            System.out.println("���� ��� ���");            
            SugangManager.grade(grade, snum, subcode);

            break;
         }
         
         
     case 9:
        System.exit(0);
        break;

}
}
}