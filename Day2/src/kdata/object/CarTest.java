package kdata.object;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� ����
		Car c;
		int i;
		
		c=new Car();
		c.num = 1;		
		c.color="Red";		//new String���� �ؾߵǴµ� ���� ���ϱ� ���ڿ��� �⺻������ ����
		c.print();
		System.out.println(c.color);
		
		Car c2= new Car();		
		c2.num= 2;		//  . �� ��� �Ҽ����� �˷���
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
		s = c3.getColor(); //�޼ҵ� ȣ��, �Ű����� ��� ��ȣ���� �����
		System.out.println(s);
		System.out.println(c3.getColor());	
			
		System.out.println("--------------------");
				
		c3.setNum(12);
		System.out.println(c3.num);
						

	}

}
