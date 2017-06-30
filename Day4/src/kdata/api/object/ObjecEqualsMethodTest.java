package kdata.api.object;

public class ObjecEqualsMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object o1 = new Object();
		Object o2 = new Object();
		
		System.out.println(o1 == o2);	//주소 값을 비교
		
		Object o3 = o1;
		System.out.println(o1 == o3);
		
		System.out.println(o1.equals(o2));
		System.out.println(o1.equals(o3));
		System.out.println("");
		
		String s1 = new String("Hello");
		String s2 = new String("Hello");			
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));	//위에 Object 객체와 다른 결과가 나오는것은  Override 되있음
		System.out.println("");
		
		Car c1 = new Car(1,"red");
		Car c2 = new Car(1,"red");
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));	// 둘다 false로 나옴, hash code가 다르기 때문 -> car 클래스가서 오버라이드해줘야함
	}

}







