package homework;

public class Student {
	
	int num;
	String name;
	
	public Student() {
		
	}

	@Override
	public String toString() {
		return "�й� : " + num + ", �̸� : " + name ;
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
