
public class Main {



	public static void main(String[] args) {
		pencilholder variable = new pencilholder(25, "blue", "plastic","pencils",10.0, 10);
		bottle variable1 = new bottle(50, "red", "steel","water", 1.0, "hot and cold");
		tiffinbox variable2 = new tiffinbox(35, "transparent", "glass","burger",0.5,"vegetarian");
		TypeOfTiffinbox variable3 = new TypeOfTiffinbox(35, "transparent", "glass","burger",0.5, "vegetarian","microwave");
		
		
		
		
		
		System.out.println(variable.toString());
		
		System.out.println(variable1.toString());
		
		System.out.println(variable2.toString());
		
		System.out.println(variable3.toString());
	}
	
}

