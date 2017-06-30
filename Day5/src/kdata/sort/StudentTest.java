package kdata.sort;
import java.util.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Student s1 = new Student(num, name);
		
		List<Student> list = Arrays.asList(new Student(2011, "김현태"), new Student(2017,"정다은"), new Student(2013,"이소연"));
		
		/*Collections.sort(list, new Comparator<Student>(){

			@Override
			public int compare(Student o1, Student o2) {

				return o1.getNum()-o2.getNum();
			}								
			});		
		System.out.println(list);
		
		Collections.sort(list, new Comparator<Student>(){			

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}			
			});
		
		System.out.println(list);
		
		*/
		Collections.sort(list);
		System.out.println(list);

	}

}
