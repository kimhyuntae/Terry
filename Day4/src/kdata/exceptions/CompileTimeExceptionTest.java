package kdata.exceptions;

public class CompileTimeExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();	// � ������ �������� �� �� ����
			System.out.println("catchme ");
		}
		

	}

}
