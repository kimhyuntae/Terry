package kdata.api.object;

public class WrapperClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 10;
		Integer i2= new Integer(i);			//�ڽ�
		
		i2.intValue();		//��ڽ�
		
		Integer i3 = 10;		//������ �̷��� �⺻���ε�
				
		String s1 = new String("10");
		String s2 = new String("20");
		
		System.out.println(s1+s2);		//�������� �⺻������				
		
		int ss1 = Integer.parseInt(s1);
		int ss2 = Integer.parseInt(s2);
		
		System.out.println(ss1+ss2);
		
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
		
				
		
		
	}

}
