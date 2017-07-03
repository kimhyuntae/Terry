package report;
public class Student implements Comparable<Student> {
	
	int num;
	String name;
	
	public Student(int num, String name) {
		this.num=num;
		this.name=name;
	}

	@Override
	public String toString() {
		return "학번 : " + num + ", 학생 이름 : " + name ;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int compareTo(Student arg0) {		

		return arg0.getNum()-this.num;
	}
	
}