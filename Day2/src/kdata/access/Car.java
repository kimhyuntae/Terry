package kdata.access;

public class Car { //public , friendly �� ���� : public�� ���� 1���� 1���� ����
					//�ƹ� ��Ű������ ���� ����
	
	private int num;	//���� class������ ���� ����		
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

	@Override				//�θ� �ִ°Ŷ� �� ���ƾ���
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	//�ּҰ������� ���� ������
	
	
	

}

