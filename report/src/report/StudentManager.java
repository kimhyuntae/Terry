package report;
import java.util.*;

public class StudentManager {
			
	private static List<Student> list = new ArrayList<Student>();	

	public StudentManager(){
		
	}
	
	public void add(Scanner sc){
		System.out.print("학번 입력 : ");
		int num = sc.nextInt();
		System.out.print("학생 이름 : ");
		String name = sc.next();
		
		list.add(new Student(num,name));
		
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
			   System.out.println(student.toString());
			  }
		
	}
	
	public void exit(){
		System.exit(0);
	}

}