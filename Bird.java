public class Bird implements Interfaces.Flyable,Interfaces.Animal{
	public void fly(int height) {
		System.out.println(height + "UP IN SKY");
	}
	public void hunt(String Name) {
		System.out.println("Bird Hunt " + Name);
	}
	public void drinkWater(float amount) {
		System.out.println("Average Amout of water dunk by Bird is " +amount);
	}
	public void helpNature() {
		System.out.println("Eat insects and Maintain Ecosystem");
	}
}