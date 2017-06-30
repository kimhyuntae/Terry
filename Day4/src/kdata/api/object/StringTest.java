package kdata.api.object;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = new String("a");		
		String s2 = new String("a");
		
		System.out.println(s1.hashCode());
		s1= s1+"!";
		System.out.println(s1.hashCode());
		
		String s3 = "a";
		String s4 = "a";
		
		System.out.println(s1 == s2);
		
		System.out.println(s3 == s4);		
		s3 = s3 + "!";
		System.out.println(s3 == s4);
		
		
	}

}
