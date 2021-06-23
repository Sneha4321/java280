public abstract class Container {


	private int size;
	private String color;
	private String material;
	private String filledwith;
	private Double filledamount;
	
	
	Container(int size, String color, String material, String filledwith, Double filledamount) {
		this.size = size;
		this.color= color;
		this.material = material;
		this.filledwith = filledwith;
		this.filledamount = filledamount;
		
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
	public Double getFilledamount() {
		return filledamount;
	}
	
	public abstract int price();
	
	public abstract boolean filled();
	
	public String toString() {
		return ""+ size;
	}
}
	






