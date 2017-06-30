package kdata.abstracttest;

public class TypeCastTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//형변환 테스트
		// instanceof 테스트
		
		Marine m = new Marine();
		Medic me = new Medic();
		
		//System.out.println(m instanceof Marine);
		//System.out.println(m instanceof Unit);
		//System.out.println(m instanceof Object);
		//System.out.println(m instanceof Medic);
		//System.out.println(me instanceof Marine);
		
		//자동 형변환 -> 형변환 연산자 생략 가능
		//객체를 자식이 만들어서 부모가 가르킴
		Unit u = new Marine();
		Unit u2= new Medic();
		u2.move();
		//u.attackPower; // 자식꺼 안보임
		//m.attackPower; 
		
		System.out.println(u instanceof Unit);
		System.out.println(u instanceof Marine);
		
		//u를 마린으로 바꿈(강제 형변환 -> 형변환 연산자 생략 불가)		
		Marine m3 = (Marine) u;
		
		Object o = new Marine();  
		
		System.out.println(o instanceof Marine);
		System.out.println(o instanceof Object);
		
		
		Object o2 = new Object();
		System.out.println(o2 instanceof Marine);	//부모에서 자식으로 바꾸는건 위험
		
		
		
		
		
		
	}

}
