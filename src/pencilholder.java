
public class pencilholder extends containers {
	private int numcompartments;
	private int numOfPencils;
	 
	pencilholder(int size, String color, String material, String filledwith,int numcompartments,int numOfPencils) {
		super(size,color,material,filledwith);
		this.numcompartments=numcompartments;
		this.numOfPencils=numOfPencils;
		
	}

	public int getNumcompartments() {
		return numcompartments;
	}
	public int getnumOfPencils() {
		return numOfPencils;
	}

	public void setNumcompartments(int numcompartments) {
		this.numcompartments = numcompartments;
	}
	public void setNumOfPencils(int numOfPencils) {
		this.numOfPencils = numOfPencils;
	}
	
	public String toString() {
		return "Pencilholder of size " + super.getSize() + ", has color " + super.getColor() + ", is made with " + super.getMaterial() + " and is filled with " + super.getFilledwith() + ". It has " + getNumcompartments()+ " Compartments. " +"This holder consists of "+ numOfPencils + " Pencils.";
	}

	@Override
	public int price() {
		return 200;
	}
}
