package kdata.abstracttest;

public class TypeCastTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����ȯ �׽�Ʈ
		// instanceof �׽�Ʈ
		
		Marine m = new Marine();
		Medic me = new Medic();
		
		//System.out.println(m instanceof Marine);
		//System.out.println(m instanceof Unit);
		//System.out.println(m instanceof Object);
		//System.out.println(m instanceof Medic);
		//System.out.println(me instanceof Marine);
		
		//�ڵ� ����ȯ -> ����ȯ ������ ���� ����
		//��ü�� �ڽ��� ���� �θ� ����Ŵ
		Unit u = new Marine();
		Unit u2= new Medic();
		u2.move();
		//u.attackPower; // �ڽĲ� �Ⱥ���
		//m.attackPower; 
		
		System.out.println(u instanceof Unit);
		System.out.println(u instanceof Marine);
		
		//u�� �������� �ٲ�(���� ����ȯ -> ����ȯ ������ ���� �Ұ�)		
		Marine m3 = (Marine) u;
		
		Object o = new Marine();  
		
		System.out.println(o instanceof Marine);
		System.out.println(o instanceof Object);
		
		
		Object o2 = new Object();
		System.out.println(o2 instanceof Marine);	//�θ𿡼� �ڽ����� �ٲٴ°� ����
		
		
		
		
		
		
	}

}
