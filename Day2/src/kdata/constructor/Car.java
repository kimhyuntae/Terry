package kdata.constructor;

public class Car {
	int num;
	String color;
	
	//������	-> �ʱ�ȭ
	Car(){
		System.out.println("Car() ������");
		this.num=0;
		this.color="black";
	}
	
	Car(String color){ //�����ε�: �Ű������� ���̸���		
		this.color=color;
	}
	
	Car(int num, String color){
		this.num=num;
		this.color=color;
	}
	
	Car(String color,int num){
		this(num, color);
	}
	
	
	
	
	//Car(String name, String color) �̷��� �ȵ�, �Ѵ� String�̶�
	
	
	
	
}

