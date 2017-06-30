package kdata.anonymous;

public class AnonumousTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Movable(){	//�ѹ� ������ ����ϴ� anonymous
			
			@Override
			public void move(){
				System.out.println("Anonymous");
			}
		}.move();
		
		
		Movable m = new Movable(){
		
			public void move(){
				System.out.println("Anonymous");
			}
		};
		m.move();				
		
		//Movable m = () -> System.out.println("lambda");				
		//m.move();

	}

}
