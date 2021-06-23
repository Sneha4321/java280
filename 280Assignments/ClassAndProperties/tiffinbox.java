
public class tiffinbox extends Container {
	private String typeOfFood;
	 
	tiffinbox (int size, String color, String material, String filledwith, Double filledamount, String typeOfFood) {
		super(size, color, material, filledwith, filledamount);
		this.typeOfFood = typeOfFood;
	}

	public String getTypeOfFood() {
		return typeOfFood;
	}

	public void setTypeOfFood(String typeOfFood) {
		this.typeOfFood = typeOfFood;
	}
	@Override
	public int price() {
		return 50;
		
	}
	public boolean filled() {
		return true;
	}

	public String toString() {
		if (filled() == true && getFilledamount() != 0) {
			return "Tiffinbox of size " + super.getSize() + ", has color " + super.getColor() + ", is made with " + super.getMaterial() + ". and is filled with " + super.getFilledamount() + " " + super.getFilledwith() + ". It has " + getTypeOfFood()+ " food. The price is " + price() + ".";
		}
			else {
				return"Tiffinbox of size " + super.getSize() + ", has color " + super.getColor() + ", is made with " + super.getMaterial() + " and is filled with nothing. " + "The price is " + (price()-20) + ".";
			}


	
		
	}}

	
	


 
