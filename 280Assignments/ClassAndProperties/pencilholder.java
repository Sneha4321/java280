
public class pencilholder extends Container {
	private int numcompartments;
	
	 
	pencilholder(int size, String color, String material, String filledwith, Double filledamount,int numcompartments) {
		super(size, color, material, filledwith, filledamount);
		this.numcompartments=numcompartments;
		;
		
	}

	public int getNumcompartments() {
		return numcompartments;
	}
	

	public void setNumcompartments(int numcompartments) {
		this.numcompartments = numcompartments;
	}
	
	public int price() {
		return 30;
		
	}
	public boolean filled() {
		return true;
	}
	
	public String toString() {
		if (filled() == true && getFilledamount() != 0) {
			return "Pencilholder of size " + super.getSize() + ", has color " + super.getColor() + ", is made with " + super.getMaterial() +  " and is filled with " + super.getFilledamount() + " " + super.getFilledwith()+  ".  It has " + getNumcompartments()+ " Compartments. "  + " The price is "+ price()+".";
		}
			else {
				return"Pencilholder of size " + super.getSize() + ", has color " + super.getColor() + ", is made with " + super.getMaterial() + " and is filled  with nothing." +  ".  It has " + getNumcompartments()+ " Compartments. " + " The price is "+ (price()-25)+".";
			}
		}
	}
