package kdata.api.object;

public class StringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder();
		sb.append("Hello");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		sb.append("!");
		System.out.println(sb.hashCode());		//메모리를 한개쓰면서 추가하고 싶으면 이렇게 append를 사용한다
		
		
		//StringBuilder sb = new StringBuilder(16);
		//StringBuilder sb = new StringBuilder("stringbuffer");
		
		
		
	}

}
