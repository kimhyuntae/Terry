package report;
public class Student implements Comparable<Student> {
	
	int num;
	String name;
	int callnum;
	String address;
	private int kor;
	private int eng;
	private int math;	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + callnum;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + num;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (callnum != other.callnum)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (num != other.num)
			return false;
		return true;
	}

	public int getCallnum() {
		return callnum;
	}

	public void setCallnum(int callnum) {
		this.callnum = callnum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Student(int num, String name, int callnum, String address, int kor, int eng, int math) {
		this.num=num;
		this.name=name;
		this.callnum=callnum;
		this.address=address;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}

	public Student(int kor, int eng, int math) {
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}

	@Override
	public String toString() {
		return "학번 : " + num + ", 학생 이름 : " + name + 
				", 전화번호 : "+ callnum+ ", 주소 : "+address+
				", 국어 : "+ kor+", 영어 : "+ eng+
				", 수학 : "+ math				;
	}
	
	public int getTotal(){	
		return this.kor + this.eng+ this.math;		
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