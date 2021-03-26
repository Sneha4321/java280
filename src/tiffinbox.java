
public class tiffinbox extends containers {
	private String typeOfFood;
	 
	tiffinbox (int size, String color, String material, String filledwith, String typeOfFood) {
		super(size,color,material,filledwith);
		this.typeOfFood = typeOfFood;
	}

	public String getTypeOfFood() {
		return typeOfFood;
	}

	public void setTypeOfFood(String typeOfFood) {
		this.typeOfFood = typeOfFood;
	}
	
	public String toString() {
		return "Tiffinbox of size " + super.getSize() + ", has color " + super.getColor() + ", is made with " + super.getMaterial() + " and is filled with " + super.getFilledwith() + ". It has " + getTypeOfFood()+ " food.";
	}

	@Override
	public int price() {
		return 50;
		
	}
}

	
	


 
