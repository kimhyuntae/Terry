package kdata.collections;

public class Vehicle {
	
	private int num;
	private String color;
	
	public Vehicle(int num, String color){
		super();
		this.num=num;
		this.color=color;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + num;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (num != other.num)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Vehicle [num=" + num + ", color=" + color + "]";
	}

}
