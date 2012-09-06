//Enumについて


public class CoffeSize {

	public static final CoffeSize GRANDE = new CoffeSize(10);
	public static final CoffeSize TALL = new CoffeSize(5);
	public static final CoffeSize SHORT = new CoffeSize(8);
	public static final CoffeSize VENTI = new CoffeSize(20);
	
	private int ounce = 0;
	private CoffeSize(int once){
		this.ounce = ounce;
			
	}
	
}


/*
public enum CoffeSizee{
	public static final CoffeSizee GRANDE(10), TALL(5), SHORT(8), VENTI(20),
	private int ounce =0;
	private CoffeSizee(int once){
		this.ounce = ounce;
	}
}

*/