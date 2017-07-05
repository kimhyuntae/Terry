package report;
import java.util.*;

public class StudentManager {
			
	private static List<Student> list = new ArrayList<Student>();
	private int kor;
	private int eng;
	private int math;

	public StudentManager(){
		
	}
	
	public void sum(){		
		System.out.println("��ü ���� : ");		
		//System.out.println(kor+eng+math);
		Student s2 = new Student(kor,eng,math);
		System.out.println(s2.getTotal());
	}
	
	public void search(Scanner sc){		
		String search = sc.next();		
		for (Student s : list) {
			if(s.getName().equals(search)){
				 System.out.println(search);
				 System.out.println(s.num +", "+ s.name + ", "+s.callnum + ", "+s.address);
			  }		
		}
	}
	
	public void remove(Scanner sc){		
		String remove = sc.next();				
		for (Student s : list) {
			if(s.getName().equals(remove)){
				 list.remove(s);
				 System.out.println(list);
			  }				
	}
	}
	
	public void add(Scanner sc){
		System.out.print("�й� �Է� : ");
		int num = sc.nextInt();
		System.out.print("�л� �̸� : ");
		String name = sc.next();
		System.out.print("��ȭ��ȣ �Է� : ");
		int callnum = sc.nextInt();
		System.out.print("�ּ� �Է� : ");
		String address = sc.next();
		System.out.print("���� ���� �Է� : ");
		int kor = sc.nextInt();
		System.out.print("���� ���� �Է� : ");
		int eng = sc.nextInt();
		System.out.print("���� ���� �Է� : ");
		int math = sc.nextInt();
		
		
		list.add(new Student(num,name,callnum,address,kor,eng,math));
		
		/*Student stu = new Student();
		stu.setNum(num);  
		stu.setName(name);	 
		list.add(stu);*/		  
	}
		
	public void print(){
		Collections.sort(list, new Comparator<Student>(){			
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}			
			});
		
		for (Student student : list) {
			   System.out.println("�������� : " +student.toString());
			  }
		Collections.sort(list);
		System.out.println("�������� : " + list);
	}
	
	public void exit(){
		System.exit(0);
	}

}