package kdata.inheritance;

public class Car extends Vehicle {
	String name;
	
	//�⺻������
	/*Car(){
		super();
	}
	*/
	
	/*Car(int door){
		super(door); //��� �̰� ���������� , �θ�ȣ��
		
	}*/
	
	/*Car(){
		super(1); //���� ù�ٿ� �����
		System.out.println("Car()");
	}*/
	
	@Override
	void move(){

		System.out.println("Car move()");
		super.move();// �̰� ������ �ڽĲ��� �θ�
	}
	
	


}
