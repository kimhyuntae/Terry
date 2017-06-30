package kdata.exceptions;

public class RuntimeExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0;
		
		try{
			
			String s=null;
									
			
			System.out.println("try 시작");
			
			System.out.println(2/a);
			System.out.println(s.charAt(1));
			System.out.println("try 종료");
			
		}catch(NullPointerException e){
			System.out.println("Null catch");
		}catch(ArithmeticException e){
			System.out.println("Arith catch");
		}finally{
			System.out.println("finally");
		}
		
		/*catch(RuntimeException e){	//한방에 쓸때
		 * e.printStackTrace(s);
		
			catch(ArithmeticException e){
			System.out.println("Arith catch");
		}
		
		}*/
		
		
	}

}
