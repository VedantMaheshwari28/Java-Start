public class Interfaces{	
    interface Flyable{
		public void fly(int height);
		default void sky() {
			System.out.println("UP IN SKY");
		}
	}
	interface Transpotation{
		public void travel(String Name);
	}
	interface Trading{
		public void goodTransfer(int n,String ImportOrExprot);
	}
	interface Message{
		public void sendMessage(String Message);
	}
	interface Time{
		public void currectTime(String Country);
	}
	interface Tracking{
		public void locationOfMessage(int Parcleid);
		public void status(int ParcleId);
	}
	interface Animal{
		public void hunt(String Name);
		public void drinkWater(float Amount);
		public void helpNature();
	}
}