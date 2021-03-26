
	public class Typeoftiffinbox extends tiffinbox{
		private  String friendly;
		Typeoftiffinbox(int size, String color, String material, String filledwith, String typeOfFood, String friendly ) {
			super(size, color, material, filledwith, typeOfFood );
		
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