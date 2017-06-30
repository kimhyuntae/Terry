package kdata.statictest;

public class StaticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//인스턴스 멤버 테스트
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		
		//m1.hp=100;
		
		//System.out.println(m1.hp);
		//System.out.println(m2.hp);
		
		//클래스 멤버 테스트
		//m1.level=10;
		Marine.level=10;
				
		System.out.println(m1.level);
		System.out.println(m2.level);
		
		Marine.setLevel();
		
		

	}

}
