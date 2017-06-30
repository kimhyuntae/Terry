package kdata.collections;

public class Car extends Vehicle {
	private int door;
	
	public Car(int num, String color, int door){
		super(num, color);
		this.door=door;
	}

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {		
		this.door = door;
		
	}
	

}
