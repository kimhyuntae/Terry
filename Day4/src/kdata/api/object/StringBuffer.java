package kdata.api.object;

public class StringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder();
		sb.append("Hello");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		sb.append("!");
		System.out.println(sb.hashCode());		//�޸𸮸� �Ѱ����鼭 �߰��ϰ� ������ �̷��� append�� ����Ѵ�
		
		
		//StringBuilder sb = new StringBuilder(16);
		//StringBuilder sb = new StringBuilder("stringbuffer");
		
		
		
	}

}
