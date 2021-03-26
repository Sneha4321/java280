
public class bottle extends containers{
	private int litersOfWater;
	private String temperatureMaintain;
	 
	bottle(int size, String color, String material, String filledwith, int litersOfWater, String temperatureMaintain) {
		super(size, color, material, filledwith);
		this.litersOfWater=litersOfWater;
		this.temperatureMaintain=temperatureMaintain;
		
	}

	public int getLitersOfWater() {
		return litersOfWater;
	}
	public String getTemperatureMaintain() {
	return temperatureMaintain ;
	}

	public void setLitersOfWater(int  litersOfWaters) {
		this. litersOfWater =  litersOfWaters;
	}
	public void setTemperatureMaintain(String temperatureMaintain) {
		this.temperatureMaintain = temperatureMaintain;
	}
	
	public String toString() {
		return "Bottle of size " + super.getSize() + ", has color " + super.getColor() + ", is made with " + super.getMaterial() + " and is filled with " + super.getFilledwith() + ". It's capacity " + getLitersOfWater()+ " liters of water." + " This bottle can maintain "+ temperatureMaintain+ " temperature.";
	}

	@Override
	public int price() {
		return 100;
		
	}


	}
	

