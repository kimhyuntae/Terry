package kdata.constructor;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c = new Car();
		
		System.out.println(c.num);
		System.out.println(c.color);
		
		Car c2 = new Car("pink");
		System.out.println(c2.color);
		
		Car c3 = new Car(1,"white");
		System.out.println(c3.num + " , " + c3.color);
		
		
	}

}
