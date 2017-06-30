package kdata.access;

public class Car { //public , friendly 만 가능 : public은 파일 1개당 1개만 가능
					//아무 패키지에서 접근 가능
	
	private int num;	//같은 class에서만 접근 가능		
	String color;
	private double cc;
	
	
	private Car(int num){
		this.num=num;
	}
	
	String getColor(){
		return this.color;
	}
	
	void setColor(String color){
		this.color=color;
	}
	
	int getNum(){
		return this.num;
	}
	
	void setNum(int num){
		this.num=num;
	}
	
	Double getCc(){
		return this.cc;
	}
	
	void setCc(double cc){
		this.cc=cc;
	}
	
	public void test(){
		this.equals("");
	}
	
	public void test(int num){
		this.num=num;
	}

	@Override				//부모에 있는거랑 다 같아야함
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	//주소가같은지 값이 같은지
	
	
	

}

