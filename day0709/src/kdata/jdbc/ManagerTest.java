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
		
	    System.out.println("1.�л��߰� 2.�л���� 3. �л��˻�  4. ������û 5. ������� 6. ������û ����Ʈ 7.�����Է�   8.����");
	    StudentManager sm= new StudentManager();
	    SugangManager sgm = new SugangManager();
	    
	    int menu = sc.nextInt();
	    
	    switch(menu){	    
	    
	    case 1:
	    	while(true){
	    		System.out.println("�й� �Է� :");
	    		snum=sc.next();
	    		if(snum.length() != 5){
	    			System.out.println("�й��� 5�ڸ� �Դϴ�. �ٽ� �Է��ϼ���");
	    			continue;
	    		}
	    		
	    		System.out.println("�̸� �Է� : ");
	    		sname=sc.next();
	    		
	    		System.out.println("���� �Է� : ");
	    		sgender=sc.next();
	    	
	    		Student s = new Student(snum, sname, sgender);
		    	StudentManager.insert(s);
		    	break;
	    	}
	    	break;
	    	
	    case 2:
	         System.out.println("�л���� ���");
	         
	    	try {
	               List<Student> list= sm.selectAll();
	               for(int i =0;i<list.size();i++)
	                 System.out.println(list.get(i));
	            } catch (SQLException e) {
	               e.printStackTrace();
	            }
	    	break;
	    	
	    case 3:
	         System.out.println("�л��̸��� �Է��ϼ���");
	         sname = sc.next();
	         System.out.println(sm.selectByName(sname));
	         break;
	    	
	    case 4:
	    	 while (true) {
	             System.out.println("�й��� �Է��ϼ���");
	             sname = sc.next();

	             System.out.println("�����ȣ�� �Է��ϼ���");
	             subcode = sc.next();

	             Sugang sg = new Sugang(snum, sname, 0, null);
	             SugangManager.insert(sg);
	             break;
	          }
	    	 
	    case 5:
	    	System.out.println("�й��� �Է��ϼ���");
	    	snum=sc.next();
	    	SugangManager.delete(snum);
	    	break;
	    	
	    case 6:
	    	System.out.println("���� ��û ����Ʈ ���");
	    	System.out.println(sgm.selectAll());      
	    break;
	    
	    case 7:
	    	while(true){
	    		int grade;
		    	System.out.println("�й��� �Է��ϼ���");
		    	sname=sc.next();
		    	
		    	System.out.println("�����ȣ�� �Է��ϼ���");
		    	subcode=sc.next();
		    	System.out.println("������ �Է��ϼ���");
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









