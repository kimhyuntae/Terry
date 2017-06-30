package kdata.iftest;

public class IfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 11;	
		
		
		if(a>0)
			System.out.println(a + "는 양수");
		else if(a == 0)
			System.out.println(a + "는 0");
		else 
			System.out.println(a + "는 음수");
		
		
		
		if(a%2 == 0)
			System.out.println(a + "는 짝수");
		else			
			System.out.println(a + "는 홀수");
				

	}

}
