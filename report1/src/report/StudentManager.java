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
		System.out.println("전체 총점 : ");		
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
		System.out.print("학번 입력 : ");
		int num = sc.nextInt();
		System.out.print("학생 이름 : ");
		String name = sc.next();
		System.out.print("전화번호 입력 : ");
		int callnum = sc.nextInt();
		System.out.print("주소 입력 : ");
		String address = sc.next();
		System.out.print("국어 점수 입력 : ");
		int kor = sc.nextInt();
		System.out.print("영어 점수 입력 : ");
		int eng = sc.nextInt();
		System.out.print("수학 점수 입력 : ");
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
			   System.out.println("내림차순 : " +student.toString());
			  }
		Collections.sort(list);
		System.out.println("내림차순 : " + list);
	}
	
	public void exit(){
		System.exit(0);
	}

}