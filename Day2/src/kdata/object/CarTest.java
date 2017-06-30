package kdata.object;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수 선언
		Car c;
		int i;
		
		c=new Car();
		c.num = 1;		
		c.color="Red";		//new String으로 해야되는데 많이 쓰니까 문자열만 기본형으로 가능
		c.print();
		System.out.println(c.color);
		
		Car c2= new Car();		
		c2.num= 2;		//  . 은 어느 소속인지 알려줌
		//System.out.println(c2.num);
				
		//c2.print();
		//c2.print2();
		
		System.out.println("--------------------");		
		c.setColor("Black");
		System.out.println(c.color);
		
		Car c3 = new Car();
		c3.num=3;
		c3.color="Pink";
		System.out.println(c3.color);
		
		c3.setColor("Blue");
		System.out.println(c3.color);
		
		String s;
		s = c3.getColor(); //메소드 호출, 매개변수 없어서 괄호안이 빈공간
		System.out.println(s);
		System.out.println(c3.getColor());	
			
		System.out.println("--------------------");
				
		c3.setNum(12);
		System.out.println(c3.num);
						

	}

}
