package kdata.interfacetest;

//인터페이스
public interface Movable {	//class는 단일상속인데, interface는 다중상속
	
	//상수 private못씀, public만 씀, new 안됨
	int MAX_SPEED=100;	// 앞에 public static final 자동으로 붙어있음
		
	//추상 메소드 (추상메소드는 몸통이 없음)
	void move();	// 앞에 public abstract 자동으로 붙어있음
	
	//몸통 만들고 싶을땐 앞에 default
	//디폴트 메소드
	default void move2(){
		
	}
	

}
