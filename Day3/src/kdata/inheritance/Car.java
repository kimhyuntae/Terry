package kdata.inheritance;

public class Car extends Vehicle {
	String name;
	
	//기본생성자
	/*Car(){
		super();
	}
	*/
	
	/*Car(int door){
		super(door); //어디나 이게 생략되잇음 , 부모호출
		
	}*/
	
	/*Car(){
		super(1); //가장 첫줄에 써야함
		System.out.println("Car()");
	}*/
	
	@Override
	void move(){

		System.out.println("Car move()");
		super.move();// 이거 없으면 자식꺼만 부름
	}
	
	


}
