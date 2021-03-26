
public abstract class containers {
	private int size;
	private String color;
	private String material;
	private String filledwith;
	
	containers(int size, String color, String material, String filledwith) {
		this.size = size;
		this.color= color;
		this.material = material;
		this.filledwith = filledwith;
		}

	public int getSize() {
		return size;

	}
	public String getColor() {
		return color;
	}
	
	public String getMaterial() {
		return material;
	}
	public String getFilledwith() {
		return filledwith;
	}
	public String toString() {
		return ""+ size;
	}
	
	public abstract int price();
}
	




