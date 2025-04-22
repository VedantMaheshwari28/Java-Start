public class Airplane implements Interfaces.Flyable,Interfaces.Trading,Interfaces.Transpotation{
	public void fly(int heightinkilometer) {
		System.out.println(heightinkilometer+"k Feets Above");
	}
	public void goodTransfer(int amount,String ImportExport) {
		System.out.println(amount + "Goods transfered");
		System.out.println("Goods are "+ ImportExport);
	}
	public void travelTo(String n) {
		System.out.println("Traveling to "+n);
	}
}