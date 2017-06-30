package kdata.exceptions;

public class CompileTimeExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();	// 어떤 이유로 에러난지 알 수 있음
			System.out.println("catchme ");
		}
		

	}

}
