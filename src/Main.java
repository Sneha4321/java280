import junit.framework.TestCase;

public class Main  extends TestCase{

	public static void main(String[] args) {
		pencilholder variable = new pencilholder(25, "blue", "plastic","pencils", 3, 10);
		bottle variable1 = new bottle(50, "red", "steel","water", 1, "hot and cold");
		tiffinbox variable2 = new tiffinbox(35, "transparent", "glass","burger","vegetarian");
		Typeoftiffinbox variable3 = new Typeoftiffinbox(35, "transparent", "glass","burger","vegetarian","microwave");
		
		
		
		
		
		System.out.println(variable.toString());
		
		System.out.println(variable1.toString());
		
		System.out.println(variable2.toString());
		
		System.out.println(variable3.toString());
	}
	
	public void testBottle() {
		bottle btlObj = new bottle(50, "red", "steel","water", 1, "hot and cold");
		assertEquals(100,btlObj.price());
		
	}
	
	public void testTiffin() {
		tiffinbox tiffin =new tiffinbox(35, "transparent", "glass","burger","vegetarian");
		assertEquals(50,tiffin.price());
		
	}
}