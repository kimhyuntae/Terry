package kdata.constructor;

public class Car {
	int num;
	String color;
	
	//생성자	-> 초기화
	Car(){
		System.out.println("Car() 생성자");
		this.num=0;
		this.color="black";
	}
	
	Car(String color){ //오버로딩: 매개변수에 차이를줌		
		this.color=color;
	}
	
	Car(int num, String color){
		this.num=num;
		this.color=color;
	}
	
	Car(String color,int num){
		this(num, color);
	}
	
	
	
	
	//Car(String name, String color) 이런건 안됨, 둘다 String이라서
	
	
	
	
}

