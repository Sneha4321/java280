
	public class TypeOfTiffinbox extends tiffinbox{
		private  String friendly;
		TypeOfTiffinbox(int size, String color, String material, String filledwith, Double filledamount, String typeOfFood, String friendly ) {
			super(size, color, material, filledwith, filledamount, typeOfFood );
		
			this.friendly = friendly;
		}

		public String getFriendly() {
			return friendly;
		}

		public void setFriendly(String friendly) {
			this.friendly = friendly;
		}
		
		public String toString() {
			return "Tiffinbox is "  + getFriendly()+ " friendly.";
		}
	}

