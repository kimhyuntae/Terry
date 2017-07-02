package homework;

import java.util.*;

public class StudentManager {
			
	private List<Student> list = new ArrayList<Student>();
	

	public StudentManager(){
		
	}
	
	public void add(Scanner sc){
		System.out.print("�й� �Է� : ");
		int num = sc.nextInt();
		System.out.print("�̸� �Է� : ");
		String name = sc.next();
		  
		Student stu = new Student();
		stu.setNum(num);  
		stu.setName(name);		 
		  list.add(stu);
	}
		
	public void print(){
		Collections.sort(list, new Comparator<Student>(){			
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}			
			});
		
		for (Student student : list) {
			   System.out.println(student.toString());
			  }
		System.out.println(list);
	}

}
