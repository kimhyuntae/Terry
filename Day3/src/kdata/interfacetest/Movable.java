package kdata.interfacetest;

//�������̽�
public interface Movable {	//class�� ���ϻ���ε�, interface�� ���߻��
	
	//��� private����, public�� ��, new �ȵ�
	int MAX_SPEED=100;	// �տ� public static final �ڵ����� �پ�����
		
	//�߻� �޼ҵ� (�߻�޼ҵ�� ������ ����)
	void move();	// �տ� public abstract �ڵ����� �پ�����
	
	//���� ����� ������ �տ� default
	//����Ʈ �޼ҵ�
	default void move2(){
		
	}
	

}
