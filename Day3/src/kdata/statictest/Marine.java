package kdata.statictest;

public class Marine {
	//�ν��Ͻ� �ʵ�
	private int hp;
	
	//Ŭ���� �ʵ�
	//public static final ���� ����ϴ� ���� :����� ���� �ȹٲ�
	public static int level;
	//private �����Ϸ��� �޼ҵ� ��������
	
	//�ν��Ͻ� �ʵ�
	//Ŭ���� �޼ҵ� -  ���⼭�� this ��� �Ұ�
	void setHp(){
		this.level=10;
		hp=100;
	}
	
	static void setLevel(){ //static������ �ν��Ͻ��� ���ٺҰ�, static�� ���� ���ܼ�
		//this.level=10;		//���⼭�� static ����鸸 ���ٰ���
		//hp=100;
				
		level=10;
	}
	

}
