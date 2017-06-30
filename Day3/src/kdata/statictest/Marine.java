package kdata.statictest;

public class Marine {
	//인스턴스 필드
	private int hp;
	
	//클래스 필드
	//public static final 같이 사용하는 이유 :상수는 값이 안바뀌어서
	public static int level;
	//private 접근하려면 메소드 만들어야함
	
	//인스턴스 필드
	//클래스 메소드 -  여기서는 this 사용 불가
	void setHp(){
		this.level=10;
		hp=100;
	}
	
	static void setLevel(){ //static에서는 인스턴스에 접근불가, static이 먼저 생겨서
		//this.level=10;		//여기서는 static 멤버들만 접근가능
		//hp=100;
				
		level=10;
	}
	

}
