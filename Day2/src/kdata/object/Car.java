package kdata.object;

//Car 클래스 정의
public class Car { //필드, 메소드로 구성됨 
	//클래스당 메인이 한개여도 됨
	
	//필드선언
	int num;
	String color;
	
	//메소드 정의
	void print(){
		System.out.println("자동차 클래스 출력");
		System.out.println(this.num); //this는 현재 실행중인 것
		System.out.println(this.color);
		
	}	
	
	void print2(){
		System.out.println("자동차 클래스 출력");
		this.print();
	}
	
	void setColor(String color){ //시작은 소문자, 두 문자면 그다음부턴 대문자로 시작
		//매개변수의 컬러를 필드에 대입
		this.color=color;		
	}
	
	String getColor(){	//반환값이 있음 (return이 있어야함) 
		return this.color; //String과 color가 일치해야함
	}
	
	void setNum(int num){
		this.num=num;
	}
	
	int getNum(int num){
		return this.num;		
	}
	
	
	
}














