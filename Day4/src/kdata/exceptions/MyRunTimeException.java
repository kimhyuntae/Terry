package kdata.exceptions;

public class MyRunTimeException extends RuntimeException{

	public MyRunTimeException(){
		super("MyRuntimeException ������#1");
		//System.out.println("1");
	}
	
	public MyRunTimeException(String msg){
		super(msg);
		//System.out.println("2");
		
	}
	
	
	
	
}
