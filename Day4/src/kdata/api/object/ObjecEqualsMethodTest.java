package kdata.api.object;

public class ObjecEqualsMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object o1 = new Object();
		Object o2 = new Object();
		
		System.out.println(o1 == o2);	//�ּ� ���� ��
		
		Object o3 = o1;
		System.out.println(o1 == o3);
		
		System.out.println(o1.equals(o2));
		System.out.println(o1.equals(o3));
		System.out.println("");
		
		String s1 = new String("Hello");
		String s2 = new String("Hello");			
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));	//���� Object ��ü�� �ٸ� ����� �����°���  Override ������
		System.out.println("");
		
		Car c1 = new Car(1,"red");
		Car c2 = new Car(1,"red");
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));	// �Ѵ� false�� ����, hash code�� �ٸ��� ���� -> car Ŭ�������� �������̵��������
	}

}







