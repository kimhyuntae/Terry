package kdata.object;

//Car Ŭ���� ����
public class Car { //�ʵ�, �޼ҵ�� ������ 
	//Ŭ������ ������ �Ѱ����� ��
	
	//�ʵ弱��
	int num;
	String color;
	
	//�޼ҵ� ����
	void print(){
		System.out.println("�ڵ��� Ŭ���� ���");
		System.out.println(this.num); //this�� ���� �������� ��
		System.out.println(this.color);
		
	}	
	
	void print2(){
		System.out.println("�ڵ��� Ŭ���� ���");
		this.print();
	}
	
	void setColor(String color){ //������ �ҹ���, �� ���ڸ� �״������� �빮�ڷ� ����
		//�Ű������� �÷��� �ʵ忡 ����
		this.color=color;		
	}
	
	String getColor(){	//��ȯ���� ���� (return�� �־����) 
		return this.color; //String�� color�� ��ġ�ؾ���
	}
	
	void setNum(int num){
		this.num=num;
	}
	
	int getNum(int num){
		return this.num;		
	}
	
	
	
}














