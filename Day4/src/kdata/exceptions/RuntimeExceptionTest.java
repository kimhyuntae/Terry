package kdata.exceptions;

public class RuntimeExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0;
		
		try{
			
			String s=null;
									
			
			System.out.println("try ����");
			
			System.out.println(2/a);
			System.out.println(s.charAt(1));
			System.out.println("try ����");
			
		}catch(NullPointerException e){
			System.out.println("Null catch");
		}catch(ArithmeticException e){
			System.out.println("Arith catch");
		}finally{
			System.out.println("finally");
		}
		
		/*catch(RuntimeException e){	//�ѹ濡 ����
		 * e.printStackTrace(s);
		
			catch(ArithmeticException e){
			System.out.println("Arith catch");
		}
		
		}*/
		
		
	}

}
