package kdata.iftest;

public class IfTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b;
		a=10;
		b=20;
		
		
		if(a>b)
			System.out.println("a�� b���� ũ��");
		else if (a==b)
			System.out.println("a�� b�� ����");
		else
			System.out.println("b�� �� ũ��");						
		
		
		switch(a % 2){
		case 0 :  
			System.out.println("¦");
			break;
		case 1 :
			System.out.println("Ȧ");
			break;			
		}
		
		
		
		a=34;
		
		switch(a/10){
		case 10 : System.out.println("A");			
		
		case 9 : System.out.println("A");
				break;
				
		case 8 : System.out.println("B");
				break;
				
		case 7 : System.out.println("C");
				break;
		
		case 6 : System.out.println("D");
				break;
		
		case 5 : System.out.println("F");
				break;
				
		default : System.out.println("F");
				
		}
		
		
		
		
	}
}