package kdata.exceptions;

public class MyExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//MyException m1 = new MyException("");
		
		
		
		try{
			throw new MyException("aa");
			
		}catch(Exception e){
			 e.printStackTrace();
		}		
		
		//throw new MyException("aa");
	}

}
