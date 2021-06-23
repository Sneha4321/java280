
public class bottle extends Container{

	private String temperatureMaintain;
	 
	bottle(int size, String color, String material, String filledwith, Double filledamount, String temperatureMaintain) {
		super(size, color, material, filledwith, filledamount);
		this.temperatureMaintain=temperatureMaintain;
		
	}

	
	public String getTemperatureMaintain() {
	return temperatureMaintain ;
	}

	
	public void setTemperatureMaintain(String temperatureMaintain) {
		this.temperatureMaintain = temperatureMaintain;
	}
	@Override
	public int price() {
		return 100;
		
	}
	public boolean filled() {
		return true;
	}

	public String toString() {
		if (filled() == true && getFilledamount() != 0) {
		return "Bottle of size " + super.getSize() + ", has color " + super.getColor() + ", is made with " + super.getMaterial() + " and is filled  with " + super.getFilledamount() + " of " +  super.getFilledwith() + " This bottle can maintain "+ temperatureMaintain + " temperature."+" The price is "+ price()+".";
	}
		else {
			return "Bottle of size " + super.getSize() + ", has color " + super.getColor() + ", is made with " + super.getMaterial() + " and is filled  with nothing." +  " This bottle can maintain "+ temperatureMaintain + " temperature." +" The price is "+ (price()- 10)+"." ;
		}}}

	
	

