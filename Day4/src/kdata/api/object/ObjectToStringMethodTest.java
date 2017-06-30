package kdata.api.object;

public class ObjectToStringMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object o = new Object();
		o.toString();		
		System.out.println(o.toString());
		System.out.println(o);
		
		Object o2 = new Object();
		System.out.println(o2.toString());
		System.out.println(o2);
		
		
		System.out.println(o.getClass());
		
		//Car c= new Car();
		//Car c2= new Car(1,"Car");
		/*System.out.println(c.toString());
		System.out.println(c);
		System.out.println(c.getClass());
		System.out.println(c.hashCode());		
		System.out.println("--------------------");
		*/
		String s = new String("hello");
		System.out.println(s.toString());	//string 클래스에서 toString을 오버라이드
		System.out.println(s);	//override
		
		Car c2= new Car(1,"Car");
		System.out.println(c2.toString());
		System.out.println(c2);


	}

}







