package kdata.exceptions;

public class MyRunTimeExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyRunTimeException r1 = new MyRunTimeException();		
		MyRunTimeException r2 = new MyRunTimeException("2 예외");
		MyRunTimeException r3 = new MyRunTimeException("3 예외");
		
		try{
		throw r1;
		}catch(MyRunTimeException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		//throw r1;
		//throw r2;
		
		//throw new MyRunTimeException();

		
		
		
		
		// System.out.println(r1.getMessage());

	}

}
